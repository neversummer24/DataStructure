package com.example.datastructure.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Code2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int j : nums1) {
            set1.add(j);
        }
        for (int j : nums2) {
            set2.add(j);
        }

        List<Integer> list1 = set1.stream().filter(num -> !set2.contains(num)).toList();
        List<Integer> list2 = set2.stream().filter(num -> !set1.contains(num)).toList();

        res.add(list1);
        res.add(list2);
        return res;
    }


    public static void main(String[] args) {
        Code2215 code2215 = new Code2215();
        System.out.println(code2215.findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }
}
