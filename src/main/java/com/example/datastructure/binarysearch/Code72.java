package com.example.datastructure.binarysearch;

public class Code72 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n =  matrix[0].length;
        int high = 0;
        int low = m-1;

        if(n == 0) return false;
        while(high<=low){
            int mid  = (high+low)/2;
            if(target < matrix[mid][0]){
                low = mid-1;
            }else if(target > matrix[mid][0]){
                high  = mid + 1;
            }else{
                return true;
            }

            int left = 0;
            int right = n-1;

            while(left<=right){
                int mid2 = (left+right)/2;
                if(target < matrix[mid][mid2]){
                    right = mid2 - 1;
                }else if(target > matrix[mid][mid2]){
                    left  = mid2 + 1;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
