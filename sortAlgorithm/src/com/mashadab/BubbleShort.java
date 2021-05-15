package com.mashadab;

public class BubbleShort {

    public static void main(String strg[]){

        int numbArray[]={32,1,4,90,55,2,65};

        System.out.println("Numbers in array without Shorts are :- ");
        print(numbArray);

        //bubbleSort1(numbArray);
        //bubbleSort2(numbArray);
        bubbleSort3(numbArray);

        System.out.println("Numbers in array after Shorts are :- ");
        print(numbArray);
    }

    private static void print(int[] numbArray) {
        for (int i = 0; i < numbArray.length; i++) {
            System.out.print("\t" + numbArray[i]);
        }
        System.out.println("");
    }

    private static void bubbleSort1(int[] numbArray) {
        int arrayLength= numbArray.length;
        for(int i=0;i<arrayLength;i++){
            for(int j = 0; j< numbArray.length-1; j++){
                if(numbArray[j]> numbArray[j+1]){
                    int lessNo= numbArray[j+1];
                    //swap elements
                    numbArray[j+1]= numbArray[j];
                    numbArray[j]=lessNo;
                }
            }
            arrayLength--;
        }
    }

    private static void bubbleSort2(int[] numbArray) {
        int arrayLength = numbArray.length;
        int temp = 0;
        for(int i=0; i < arrayLength; i++){
            for(int j=1; j < (arrayLength-i); j++){
                if(numbArray[j-1] > numbArray[j]){
                    //swap elements
                    temp = numbArray[j-1];
                    numbArray[j-1] = numbArray[j];
                    numbArray[j] = temp;
                }

            }
        }

    }

    private static void bubbleSort3(int numbArray[]) {
        int arrayLength = numbArray.length;
        for (int i = 0; i < arrayLength-1; i++)
            for (int j = 0; j < arrayLength-i-1; j++)
                if (numbArray[j] > numbArray[j+1])
                {
                    //swap elements
                    int temp = numbArray[j];
                    numbArray[j] = numbArray[j+1];
                    numbArray[j+1] = temp;
                }
    }
}
