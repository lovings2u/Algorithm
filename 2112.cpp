#include<iostream>
#include<math.h>
#include<cstring>

using namespace std;
int dp[31];
int N;
void ThreeLayerTileCount()
{
	bool d = false;
	for (int i = 3; i <= N; i++)
	{
		if (i % 2 == 1)
		{
			dp[i] = 0;
		}
		else
		{
			if (d) { dp[i] = dp[i - 2] * dp[2]; d = false; }
			else { dp[i] = dp[i - 2] * dp[2] + 2; d = true; }
		
		}
	}
	
}
int main()
{
	
	cin >> N;
	memset(dp, 0, sizeof(dp));
	dp[1] = 0;
	dp[2] = 3;
	ThreeLayerTileCount();
	cout << dp[N] << endl;
	return 0;
}