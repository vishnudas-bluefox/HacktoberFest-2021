public class Solution {  
    public static void sortZeroesAndOne(int[] arr) {
        int i =0; 
        int j = arr.length-1 ;
        while(i < j)
        {
            if(arr[i] == 0 && arr[j] == 1)
            {
                i++ ; j-- ; continue  ;
            }
            else{
            if(arr[i] == 0 && arr[j] == 0)
            {
                i++ ;  continue  ;
            }
           else if(arr[i] == 1 && arr[j] == 1)
            {
                j-- ; continue  ;
            }
          else if(arr[i] == 0 && arr[j] == 1)
            {
                i++ ; j-- ; continue  ;
            }
           else{
                
                int temp =arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
                i++ ; j-- ;
            }    
                
            }  
        }
    }
}
