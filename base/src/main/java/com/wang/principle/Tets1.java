package com.wang.principle;

public class Tets1 {
    /**
     * 插入排序
     */
    public static void insertSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {//从第2个数字开始
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {//将第一个视为有序，一次与前面的比较，找到后交换位置
                swap(arr, j, j + 1);
            }
        }
    }

    //main方法测试
    public static void main(String[] args) {
        int[] b = {49, 38, 65, 97, 76, 13, 27, 50};
        //int[] c = { 13, 38, 65, 97, 76, 13, 2, 50 };//稳定性判断
        insertSort(b);
        for (int i : b)
            System.out.print(i + " ");
    }

    public static void swap(int[] arr, int l, int r) {//保证l和r不同时可以使用异或交换
        arr[l] = arr[l] ^ arr[r];
        arr[r] = arr[l] ^ arr[r];
        arr[l] = arr[l] ^ arr[r];

    }
}
