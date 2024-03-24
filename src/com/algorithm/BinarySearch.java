package com.algorithm;

//Binary Search: Implement the binary search algorithm to find the index of a given element in 
//a sorted array. If the element is not present, return -1.

public class BinarySearch {
	
	
    public static int binarySearch(int arr[], int item) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;

        while (minIndex <= maxIndex) {
        	
            int midIndex=(minIndex+maxIndex)/2;

            if(item==arr[midIndex]) 
            {
                return midIndex;
                
            }else if(item<arr[midIndex])
            {
               maxIndex=midIndex-1;
               
            }else 
            {
              minIndex=midIndex+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,8,9,10,14,18,21,45,88};
        int item = 14;
        
        int index=binarySearch(arr, item);
        
        if (index != -1) 
        {
            System.out.println(item + " found at index " + index);
            
        } else 
        {
            System.out.println("value not found in the array.");
        }
    }
}

