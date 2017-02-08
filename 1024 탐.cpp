#include<iostream>
#include<cstring>
using namespace std;
int M, N;
int map[501][501];
int cnt = 0;

void FindPath(int m, int n)
{
	if (m + 1 <= M && map[m + 1][n] < map[m][n]) FindPath(m + 1, n);
	if (m - 1 >= 1 && map[m - 1][n] < map[m][n]) FindPath(m - 1, n);
	if (n + 1 <= N && map[m][n + 1] < map[m][n]) FindPath(m, n + 1);
	if (n - 1 >= 1 && map[m][n - 1] < map[m][n]) FindPath(m, n - 1);

	if ((m == M) && (n == N))
	{
		cnt++;
		return;
	}
}



int main()
{
	memset(map, 0, sizeof(map));
	cin >> M >> N;
	for (int i = 1; i <= M; i++)
	{
		for (int j = 1; j <= N; j++)
		{
			cin >> map[i][j];
		}
	}
	FindPath(1, 1);
	cout << cnt;

}