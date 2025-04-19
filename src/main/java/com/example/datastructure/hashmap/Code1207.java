package com.example.datastructure.hashmap;

import java.util.HashMap;
import java.util.List;

public class Code1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        return map.values().stream().distinct().count() == map.size();
    }
}
