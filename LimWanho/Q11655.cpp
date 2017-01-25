#include <iostream>
#include <string>

using namespace std;
string rot13(string);

int main(){
	string str;
	getline(cin, str);
	cout << rot13(str);
	
	return 0;
}

string rot13(string str){
	for (int i = 0; i < str.size(); i++){
		//대문자 처리
		if (str[i] >= 65 && str[i] <= 77){
			str[i] = str[i] + 13;
		}
		else if (str[i] >= 78 && str[i] <= 90){
			str[i] = str[i] - 13;
		}
		//소문자 처리
		if (str[i] >= 97 && str[i] <= 109){
			str[i] = str[i] + 13;
		}
		else if (str[i] >= 110 && str[i] <= 122){
			str[i] = str[i] - 13;
		}
	}
	return str;
}