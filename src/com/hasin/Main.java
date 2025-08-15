package com.hasin;

import java.util.Arrays;

public class Main {
    public static void bubbleSort(int[] arr){
        boolean swapped;
        //runs the steps arr.length-1
        for(int i=0; i<arr.length-1;i++){
            swapped=false;
            //each step the max value  comes to end
            for(int j=1; j< arr.length-i;j++){
                //swap if the arr[j]<arr[j-1]
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            if(!swapped){
                return;
            }
        }
    }

    public static void selectionSort(int [] arr){
        //this steps runs the array.length-1
        for(int i=0; i<arr.length-1;i++){
            //find the maximum of the remaining  array and swap it with correct index
            int lastIndex = arr.length-i-1;
            int maximumIndex = getMaxIndex(arr,lastIndex);
            int temp = arr[maximumIndex];
            arr[maximumIndex]=arr[lastIndex];
            arr[lastIndex]=temp;


        }

    }

    public static int getMaxIndex(int [] arr, int lastIndex){
        int maxIndex=0;
        for(int i=0; i<=lastIndex; i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;

            }
        }
        return maxIndex;
    }

public static void insertionSort(int [] arr){
      for(int i=1;i< arr.length;i++){
          int currentValue=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>currentValue){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=currentValue;
      }

}

    public static void main(String[] args) {
       int [] arr = {3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
