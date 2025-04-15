package com.example.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Code1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num,1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            set.add(entry.getValue());
        }

        for (int num : set) {
            System.out.println(num);
        }
        if(set.size()!= map.size()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Code1207 code1207 = new Code1207();
        code1207.uniqueOccurrences(new int[]{1,2});
    }
}
