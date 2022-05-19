package Recursion;
public class SampleSpace {
    public static void main(String[] args) {
        int []array={8, 2, 5, 3, 4, 7, 6, 1};
        Mergesort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void Mergesort(int array[]) {
        int length=array.length;
        if (length<=1){
            return; // base case
        }
        int middle= length/2;
        int []leftArray=new int[middle];
        int [] rightArray= new int[length-middle];

        int i=0;
        int j=0;

        for (i=0;i<length;i++){
            if (i<middle){
                leftArray[i]=array[i];
                i++;
            }
            else {
                rightArray[j]=array[i];
                j++;
            }
        }
        Mergesort(leftArray);
        Mergesort(rightArray);
        merge(leftArray,rightArray,array);
    }

    private static void merge(int[]leftArray,int[]rightArray,int[]array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i=0,r=0,l=0;

        while (l<leftSize && r<rightSize){
            if (leftArray[l]<rightArray[r]){
                array[i]=leftArray[l];
                i++;
                l++;
            }
            else {
                array[i]=rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
             array[i]=leftArray[l];
             i++;
             l++;
         }
        while(r < rightSize) {
             array[i]=rightArray[r];
             i++;
             r++;
         }

    }
}
