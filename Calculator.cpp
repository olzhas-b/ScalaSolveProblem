    #include <bits/stdc++.h>
    using namespace std;
    #define all(x) (x).begin(),(x).end() 
    #define int long long
    #define vi vector<int>
    #define pii pair<int,int>
    #define F first
    #define S second
    #define pb push_back
    #define rep(i, a, b) for(int i = a; i < b; i++)
    #define repr(i, a, b) for(int i = a - 1; i >= b; i--)
    #define iter(m) for(auto it = m.begin(); it != m.end(); it++)
    #define iterr(m) for(auto it = m.rbegin(); it != m.rend(); it++)
    #define N 500500
    #define PI 3.14159265358979323846264338327950L
    #define speed ios_base :: sync_with_stdio(0);cin.tie(0);cout.tie(0);
    int calculate(int n1, int n2, char c) {
        switch(c) {
            case '+':
                return n1 + n2;
                break;
            case '-':
                return n1 - n2;
                break;
            case '*':
                return n1 * n2;
                break;
            case '/':
                return n1 / n2;
                break;
        }
        return 0;
    }
    signed main(){
        speed;
        vector<int> number = {4, 6, 7, 0, 6, 2};
        vector<char> operation = {'-', '+', '*', '-', '*'};
        stack<int> o, num;
        o.push('+');
        for(int i = 0; i < number.size(); i++) {
            if(num.empty()) {
                num.push(number[i]);
            } else {
                if(operation[i - 1] == '*' || operation[i - 1] == '/') {
                    int n1 = num.top();
                    num.pop();
                    num.push(calculate(n1, number[i], operation[i - 1]));
                } else {
                    num.push(number[i]);
                    o.push(operation[i - 1]);
                }
            }
        }
        int res = 0;
        while(!num.empty() && !o.empty()) {
            if(o.top() == '-') res += -num.top();
            else res += num.top();
            num.pop(), o.pop();
        }
        cout << res;
        return 0;
    }