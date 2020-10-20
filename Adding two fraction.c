#include<stdio.h>
int main()
{
    int a, b, c, d, sum, num, den;
    printf("Enter the value of a and b as a/b\n");
    scanf("%d%d",&a,&b);
    printf("Enter the value of c and d as c/d\n");
    scanf("%d%d",&c,&d);;
    if (b!=d)
    {
        num = (a*d)+(c*b);
        den = (b*d);
        printf("The sum is %d/%d",num,den);
    }
    else 
    {
        num = a+c;
        den = b;
        printf("The sum is %d/%d",num,den);
    }
}
