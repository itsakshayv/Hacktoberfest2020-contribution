//	package Lab14Question1;

//import java.util.Arrays;
//import java.util.Collections;

public class Question1 {
	public static void radixExchange(int[] array, int left, int right, int bit) {
		
		int tmp,i,j;
		
		if((right > left) && (bit >= 0)) {
			i=left;
			j=right;
			
			while( i != j ) {
				while(  ( (bits(array[i],bit,1))==0)  &&  (i<j)  ) {
					i++;
				}
				
				while(  ( (bits(array[j],bit,1)) !=0)  &&  (i<j)  ) {
					j--;
				}
				
				//swap
				tmp = array[i];
				array[i]=array[j];
				array[j]=tmp;
			}
			
			if( bits(array[right],bit,1)==0) j++;
			radixExchange(array,left,j-1,bit-1);
			radixExchange(array,j,right,bit-1);
		}
	}
	
	
	  public static int getMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
	  
	  public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  }
	  
	public static void straightRadix(int[] array, int size) {
		int[] temp = new int[size];
		int maxnum = getMax(array);
		int minnum = getMin(array);
		int range = maxnum - minnum +1;
		int[] count = new int[range];
		
		for(int i=0; i<range; i++) {
			count[i]=0;
		}
		
		for(int i=0; i<size; i++) {
			count[array[i]-minnum] ++;
			
		}
		
		count[0]--;
		
		for(int j=1; j<range; j++) {
			count[j] += count[j-1];
		}
		
		for(int i=size-1; i>=0 ; i--) {
			temp[count[array[i]-minnum]] = array[i];
			count[array[i]-minnum] --;
		}
		
		for(int i=0; i< size ; i++) {
			array[i]=temp[i];
		}
	}
	
	static int bits(int num, int bitFrom, int numBits) {
		return (int)((num/Math.pow(2,bitFrom))%Math.pow(2, numBits));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] array = {8,4,7,5,4,2,8,7,3,7,1,1,6,6,4,6,7,8,7,2,1};
//		int[] array = { 0b00010,0b00101,0b10000,0b00100,0b01010, 0b10111, 0b11111, 0b10010, 0b11010, 0b01111};
		int left=0;
		int right= array.length-1;
		radixExchange(array,left,right,4);
		

		
//		straightRadix(array, array.length);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		
	}
}
