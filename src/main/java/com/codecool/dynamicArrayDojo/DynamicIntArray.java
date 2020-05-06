package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {
    int[] array;
    int count;
    int size;

    public DynamicIntArray(int length) {
        this.size = length;
        count = 0;
        array = new int[length];
    }

    public DynamicIntArray() {
        size = 1;
        count = 0;
        array = new int[1];
    }

    public void add(int data) {
        if (count == size) {
            growSize();
        }
        array[count] = data;
        count++;
    }

    public void growSize() {
        int[] temp = null;
        if (count == size) {
            temp = new int[size+1];
            for  (int i=0; i<size; i++)
                temp[i] = array[i];
        }
        array = temp;
        size = size+1;
    }

    public void remove(int number) {
        int[] finalArray = new int[array.length-1];
        for (int i=0; i<number; i++)
            finalArray[i] = array[i];
        for (int i=number; i<finalArray.length; i++)
            finalArray[i] = array[i+1];
        array = finalArray;
    }


    public void insert(int index, int data) {
        int[] finalArray = new int[array.length+1];
        if (index>array.length)
            index = array.length;
        for (int i=0; i<index;i++)
            finalArray[i] = array[i];
        finalArray[index] = data;
        for (int i=index; i<array.length; i++)
            finalArray[i+1] = array[i];
        array=finalArray;
    }

    @Override
    public String toString() {
        String arrayString = "";
        for (int i=0; i<array.length;i++) {
            arrayString += " " + array[i];
        }
        return arrayString;
    }
}
