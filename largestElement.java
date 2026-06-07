import java.util.Arrays;
public class largestElement{
    public static void largestEle(int[] arr, int n){

        //BRUTE FORCE Method
        //SORT THE ARRAY AND THEN THE LARGEST WILL BE AT INDE X N-1
        // TC: O(NLOGN)

        //OPTIMAL METHOD
        int largest = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
public static int secondLargestEle(int[] arr, int n){

// without sorting see
//1. BRUTE FORCE: tc = o(nlogn + n)
// SORT KARHU ARRAY AND THEN 
// LARGEST = ARR[N-1]  && SECONDLARGEST = ARR[N-2]
// BUT REPEATED ELEMENT B REY SAKE SO ARR[N-2] NOT RIGHT
// SO 1. PELA  SORT KARYE 2.FIND LARGEST
// 3 TRAVERSE ARRAY FROM N-2 TO 0 AND FIND S_LARGEST BUT CHECK != LARGEST
// 3.
// 1.
 Arrays.sort(arr);
// 2.
 int largest = arr[n - 1];
// 3.
for(int i = n-2; i >= 0; i--){
if(arr[i] != largest){
    // secondLarg = arr[i]; or
    return arr[i];
}
}
return -1;



//optimal method

}
    public static void main(String[] args){
        int[] arr = { 3,2 ,1, 5, 2};
        int n = arr.length;
        // largestEle(arr, n);
        System.out.println(secondLargestEle(arr, n));
    }
}