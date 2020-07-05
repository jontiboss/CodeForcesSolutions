#include <iostream>
#include <cstdio>
#include <bits/stdc++.h> 
#include <math.h>
using namespace std;

int main() {
	//since we know that we need four unique colors and each color is labed as a number.
	//then its just to add all the distinct numbers into a set, and then you take 4-(the distinct numbers)
   unordered_set<int> intSet;
   int input;
   while(cin>>input)
   intSet.insert(input);
   cout<<(4-intSet.size());
}
	   
    
    


