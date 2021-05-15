package com.mashadab;
public class MissingNumbersApproach1 {

    public static int missingNumber(int array[],int size){
        int sum= (size + 1) * (size) / 2;
        for (int i = 0; i < size-1; i++){
            sum=sum-array[i];
        }
        return sum;
    }

    public static void main(String args[]){
        int [] array ={1,2,3,5};
       // missingNumber(array,5);
       System.out.println(missingNumber(array,5));
    }
}
