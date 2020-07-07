#include <iostream>
#include <cstdio>
#include <bits/stdc++.h> 
#include <math.h>
using namespace std;

int main() {
	// Problem https://codeforces.com/contest/365/problem/A
    // For more solutions visit https://github.com/jontiboss
   int n,k,goodNumbers=0;
   cin>>n>>k;
   
	//iterate all trought all the numbers.
   for(int i =0;i<n;i++){
	   int p1=0;
	   string temp;
	   cin>>temp;
	   //check if a number has all the integers from 0-k
	   for(int j =0;j<=k;j++){
		    
		if(temp.find(to_string(j)) != string::npos ){
			p1++;
		}
		  if(p1==k+1){
			  goodNumbers++; 
		   }	
			
		  
	   }
   }
	   cout<<goodNumbers;
}
	   
    
    


