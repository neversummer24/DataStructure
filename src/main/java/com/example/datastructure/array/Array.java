package com.example.datastructure.array;

public class Array {
    private int[] data;
    private int size;
    private int count;

    public Array(int size) {
        this.data = new int[size];
        this.size = size;
        this.count = 0;
    }

    public int find(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return data[index];
    }

    public boolean insert(int index, int value) {
        if(count == size) {
            return false;
        }
        if(index < 0 || index >= size) {
            return false;
        }
        for(int i = count; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        count++;
        this.printAll();
        return true;
    }

    public boolean remove(int index) {
        if(index < 0 || index >= count) {
            return false;
        }
        for(int i = index+1; i<count; i++) {
            data[i-1] = data[i];
        }
        count-- ;
        this.printAll();
        return true;
    }


    public void printAll(){
        for(int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Array array = new Array(4);

        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);

        array.remove(1);
//        array.insert(3, 10);
        //array.insert(3, 11);

    }

}
