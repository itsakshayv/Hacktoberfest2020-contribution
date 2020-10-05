#include<iostream>
using namespace std;

char tower(int,char,char,char);
int main()
{
    int n;
    cout<<"enter the value of n:";
    cin>>n;

    if (n%2==0 || n==1)
    {
        tower(n, 'A', 'C', 'B');
    }
    else if(n%2!=0 )
    {
        tower(n, 'A', 'B', 'C');
    }
    return 0;
}

char tower(int n, char fr, char to, char aux)
{
    if (n == 1)
    {
        cout<<"\n Move disk 1 from rod "<<fr<<" to rod "<<to;
        return 0;
    }
    tower(n-1, fr, aux, to);
    cout<<"\n Move disk "<<n<<" from rod "<<fr<<" to rod "<<to;
    tower(n-1, aux, to, fr);
}
