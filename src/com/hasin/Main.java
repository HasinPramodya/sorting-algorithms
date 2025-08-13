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
    public static void main(String[] args) {
       int [] arr = {10,30,20,50,40,80,90,60};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
