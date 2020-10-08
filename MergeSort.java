/**
 *
 * @author RUSHABH
 */
public class MergeSort {
    
    public static void merge(int arr[], int left, int mid, int right){
        int l1=mid-left+1;          //length of left array
        int l2=right-mid;           //length of right array
        
        int l[] = new int[l1];      //temp array to hold data of left array
        int r[] = new int[l2];      //temp array to hold data of right array
        
        for(int i=0; i<l1; i++){
            l[i] = arr[left+i];     //copying data of left array
        }
        for(int i=0; i<l2; i++){
            r[i] = arr[mid+1+i];    //copying data of right array
        }
        int i=0, j=0;
        int k=left;                 //changing values in arr from k=left to k=right.
        while(i<l1 && j<l2){
            if(l[i]<r[j]){
                arr[k++] = l[i++];
            }
            else{
                arr[k++] = r[j++];
            }
        }
        while(i<l1){
            arr[k++] = l[i++]; 
        }
        while(j<l2){
            arr[k++] = r[j++];
        }
    }
    
    public static void mergeSort(int arr[], int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);      //calling for 1st half
            mergeSort(arr, mid+1, right);   //calling for 2nd half
            
            merge(arr, left, mid, right);   //merging them.
        }
    }
    
    public static void main(String args[]){
        int arr[] = {4, 10, 3, 15, 1};
        //int arr[] = {6,5,4,3,2,1,0,-1};
        //int arr[] = {4,1,3,9,7};
        mergeSort(arr, 0, arr.length-1);
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
