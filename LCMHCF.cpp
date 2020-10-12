#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
int a,b,hcf,lcm,max,min,r;
cout<<“Enter two numbers:”;
cin>>a>>b;
if(a>b)
{
max=a;
min=b;
}
else
if(b>a)
{
max=b;
min=a;
}
if(a==b)
hcf=a;
else
{
do
{
r=max%min;
max=min;
min=r;
}while(r!=0);
hcf=max;
}
lcm=(a*b)/hcf;
cout<<“nLCM=”<<lcm<<“nHCF=”<<hcf;
getch();
}
