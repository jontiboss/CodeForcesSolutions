#include <iostream>
#include <cstdio>
#include <bits/stdc++.h> 
#include <math.h>
using namespace std;

int main() {
	// Problem https://codeforces.com/contest/732/problem/A
    // For more solutions check https://github.com/jontiboss
    // We want to buy X shovels with a known price without any change in return.
    // We know the value of our one coin and we have unlimited amounts of y 10valued coins.
    // we also know that x*priceOfShovel= 10y  or x*priceOfShovel= 10y-coin
    // this could be rewritten as x*priceOfShovel mod 10 = 0 or x*priceOfShovel-coin mod 10
	int priceOfShovel, coin,x=1;
	cin>>priceOfShovel>>coin;
	while((x*priceOfShovel)%10!=0 && (x*priceOfShovel-coin)%10!=0)x++;
	cout<<x;
}

	   
    
    


