package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 7, 4, 1, 6, 3, 8};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void insertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j] > temp){
               arr[j+1]=arr[j];
               j--;
            }
            arr[j+1]=temp;
        }
    }
}
