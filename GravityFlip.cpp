#include <iostream>
#include <cstdio>
#include <bits/stdc++.h> 
#include <math.h>
using namespace std;

int main() {
	// Problem https://codeforces.com/contest/405/problem/A
    // For more solutions check https://github.com/jontiboss
    // the solution to the problem is just to sort the array in ascending order
	int  columns;
	cin>>columns;
	int box[columns];	
	for(int i =0;i<columns;i++){
		cin>>box[i];
	}
    sort(box,box+columns);
	for(int k =0;k<columns;k++){
	cout<<box[k]<< " ";
	}
}

	   
    
    


