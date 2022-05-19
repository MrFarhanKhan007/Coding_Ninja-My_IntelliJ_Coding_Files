
// selection sort = search through an array and keep track of the minimum value during
//     each iteration. At the end of each iteration, we swap variables.

//     Quadratic time O(n^2)
//     small data set = okay
//     large data set = BAD


package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr= {9,1,5,4,6,2,7,3,8};
        selectionsort(arr);
        for (int i: arr){
            System.out.println(i);
        }
    }

    private static void selectionsort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[min] > arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
