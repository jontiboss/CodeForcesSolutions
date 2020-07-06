#include <iostream>
#include <cstdio>
#include <bits/stdc++.h> 
#include <math.h>
using namespace std;

int main() {
	// there will be n(n-1) games we have to check. If the host team has the same color as a guest team, 
	// a collision will occur. Count how many collision that is occuring.
	int  teams,collisions=0;
	cin>>teams;
	int homeUniforms[teams];
	int guestUniforms[teams];
	
	for(int i =0;i<teams;i++){
		cin>>homeUniforms[i]>>guestUniforms[i];
}
for(int k =0;k<teams;k++){
	for(int j =0;j<teams;j++){
		if(homeUniforms[k] == guestUniforms[j])collisions++;
	}
}

cout<<collisions;
}
	   
    
    


