package com.collectionnotes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] myIntArray = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8};

        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();
        
        for (int num : myIntArray) {
            if (!uniqueSet.add(num)) {
                duplicateSet.add(num);
            }
        }

        System.out.println("Original Array: " + Arrays.toString(myIntArray));
        System.out.println("Duplicates: " + duplicateSet);

	}

}
