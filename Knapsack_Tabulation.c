                           // 0/1 knapsack problem
#include <stdio.h>   
int max(int a, int b) { 
   if(a>b){   
   	return a;
	}
	else{	
		return b;
	}
} 
int knapSack(int W, int wt[], int val[], int n) { 
    int i, w; 
    int K[n + 1][W + 1];  
    for (i = 0; i <= n; i++) { 
        for (w = 0; w <= W; w++) { 
            if (i == 0 || w == 0) 
                K[i][w] = 0; 
            else if (wt[i - 1] <= w) {
				
                K[i][w] = max( val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]); 
          
            }
            else{
                K[i][w] = K[i - 1][w]; 
                
             }
             printf("%d\t",K[i][w]);
        } 
    } 
   
    return K[n][W]; 
} 
  
int main() 
{ 
   int n,value[n],weight[n];
   int i,W;
    printf("\nEnter the number of items: ");
            scanf("%d", &n);

printf("\nEnter the weight of item\n");
    for(i = 0; i < n; i++){
     scanf(" %d", &weight[i]);
      }
 printf("\nEnter the value of item\n");
     for(i = 0; i < n; i++){
     scanf(" %d", &value[i]);
      }
   printf("\nEnter the maximum capacity of the knapsack : ");
       scanf("%d", &W);
   printf("\nMaximum value is : %d\n", knapSack(W, weight, value, n));
return 0;
} 
