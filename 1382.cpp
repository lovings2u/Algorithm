#include<iostream>
#include<cstring>
using namespace std;

int coin[101];
int kn[101];
int dp[101][10001];

int main()
{
	memset(coin, 0, sizeof(coin));
	memset(kn, 0, sizeof(kn));
	memset(dp, 0, sizeof(dp));
	int T, K, p;
	cin >> T;
	cin >> K;

	for (int i = 1; i <= K; i++)
	{
		cin >> coin[i] >> kn[i];
	}
	for (int i = 1; i <= K; i++)
	{
		for (int j = 0; j <= kn[i]; j++)
		{
			dp[i][coin[i]*j] = 1;
		}
	}
	
	for (int i = 1; i <= K; i++)
	{
		for (int j = 0; j <= kn[i]; j++)
		{
			if (T - (coin[i] * j) < 0) break;
			dp[i][T] += dp[i-1][T-coin[i] * j];
		}
	}
	for (int i = 1; i <= K; i++)
	{
		for (int j = 0; j <= T; j++)
		{
			cout << dp[i][j];
		}
		cout << endl;
	}

	
	return 0;
}