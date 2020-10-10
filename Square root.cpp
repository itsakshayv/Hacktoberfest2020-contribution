// In this program I will write the code of how to find Square Root of a Number using Binary Search

#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    cout<<"Enter number whose square root has to be found: ";
    int n;
    cin>>n;
    if(n == 1)
    {
        cout<<"Square root is 1 ";
        
    }
    else 
    {
        // binary search to reduce time complexity...
        int l = 0, r = n-1;
        int ans ;
        int m = (l+r)/2;
        while(l<=r)
        {
            // int i = 0;
            
            if(m*m == n)
            {
                ans = m;
                break;
               
            }
            else if(m*m < n)
            {
                l = m + 1;
               ans = m;
                
            }
            else
            {
                r = m - 1;
                
            }
            m = (r+l)/2;
            
        
        // cout<<"Square root is "<<i;
        }
        cout<<"The approx answer of entered number is "<<ans;
    }
    return 0;
    
}
