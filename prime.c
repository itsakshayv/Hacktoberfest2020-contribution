
#include<stdio.h>
#include<conio.h>

main()

{ int x;

printf("Enter the number for checking\n");

scanf("%d",&x);

   if(x==2 || x==3|| x== 5 || x==7)
    printf(" Entered number is prime %d\n",x);


   if (x%2==0 || x%3==0 || x%5==0 || x%7==0)
   printf(" %d is not a prime ",x);
   
  else
  printf("  %d is a prime ",x);

}