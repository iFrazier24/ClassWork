import java.util.*;

public class QuickSort{
    int partition (int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++){
            if (arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    void sort(int arr[], int low, int high){
        if (low<high){
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void print(int[] arr, int size){
        for (int i = 0; i < size; i++)
            System.out.println(arr[i] + " ");
    }

    public static void main(String[] args){

        int[] arr = {4,3,5,1,2,8};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
        System.out.println("Sorted: ");
        print(arr, n);
    }
}