#include <iostream>
#include <string>
#include <cstring>
#include <algorithm>
#include <vector>
using namespace std;
int main() {
	string s;
	cin >> s;
	vector<int> a;
	int n = s.size();
	for (int i = 0; i<n; i++) a.push_back(i);
	sort(a.begin(), a.end(), [&s](int u, int v) {
		return strcmp(s.c_str() + u, s.c_str() + v) < 0;
	});
	for (auto x : a) {
		cout << s.substr(x) << '\n';
	}
	return 0;
}