#include<iostream>
#include<cstring>
using namespace std;
int map[501][501];
int dp[501][501];
int M, N;
void DpCheck(int y,int x)
{
	if (x + 1 <= N )
	{
		if (map[y][x+1] < map[y][x])
		{
			dp[y][x+1] += dp[y][x];
			DpCheck(y, x + 1);
		}

	}

	if (y + 1 <= M)
	{
		if (map[y + 1][x] < map[x][y])
		{
			dp[y + 1][x] += dp[y][x];
			DpCheck(y+1, x);
		}
	}

	if (x - 1 >= 1)
	{
		if (map[y][x-1] < map[y][x])
		{
			dp[y][x-1] += dp[y][x];
			DpCheck(y, x-1);
		}
	}

	if (y - 1 >= 1)
	{
		if (map[y-1][x] < map[y][x])
		{
			dp[y-1][x] += dp[y][x];
			DpCheck(y-1,x);
		}
	}

}
void printdp()
{
	for (int i = 1; i <= M; i++)
	{
		for (int j = 1; j <= N; j++)
		{
			cout<< dp[i][j];
		}
		cout << endl;
	}
}
int main()
{

	memset(map, 0, sizeof(map));
	memset(dp, 0, sizeof(dp));

	cin >> M >> N;
	for (int i = 1; i <= M; i++)
	{
		for (int j = 1; j <= N; j++)
		{
			cin >> map[i][j];
		}
	}
	dp[1][1] = 1;
	DpCheck(1, 1);
	cout << dp[M][N];



	return 0;
}