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

public static void mergeSort(int [] arr){

        int inputLength = arr.length;
        if(inputLength<2){
            return;
        }

        int midIndex = inputLength/2;
        int leftHalf [] = new int[midIndex]; //creating left half array
        int rightHalf [] = new int[inputLength-midIndex]; //cretaing right half array

        for(int i=0; i<midIndex; i++){ //coping original array element to left half array
            leftHalf[i] = arr[i];
        }
        for(int i=midIndex; i<inputLength; i++){ //coping the original array element to right half array
            rightHalf[i-midIndex]=arr[i];
        }

        mergeSort(leftHalf); //recursive sort leftHalf array until single element
        mergeSort(rightHalf); //recursive sort rightHalf array until single element

        merge(arr,leftHalf,rightHalf);
}

private static void merge(int arr[], int leftHalf[], int rightHalf[]){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0, j=0, k=0; //creating iterator for leftHalf arr, rightHalf arr and original arr

        while(i<leftSize&&j<rightSize){ //merging logic
            if(leftHalf[i]<=rightHalf[j]){
                arr[k]=leftHalf[i];
                i++;
            }else{
                arr[k]=rightHalf[j];
                j++;
            }
            k++;
        }


        while(i<leftSize){  //copy to original array if leftHalf array is having remaining element
            arr[k]=leftHalf[i];
            i++;
            k++;
        }

        while(j<rightSize){ //copy to original array if rightHalf array is having remaining element
            arr[k]=rightHalf[j];
            j++;
            k++;
        }
}

    public static void main(String[] args) {
       int [] arr = {3,1,5,4,-2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
