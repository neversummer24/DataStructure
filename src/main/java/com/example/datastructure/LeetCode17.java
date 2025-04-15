package com.example.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LeetCode17 {

    //全局变量结果集
    List<String> res = new ArrayList<>();
    //初始化 mapping
    public final static HashMap digMap = new HashMap<>();
    static{
        digMap.put("2","abc");
        digMap.put("3","def");
        digMap.put("4","ghi");
        digMap.put("5","jkl");
        digMap.put("6","mno");
        digMap.put("7","pqrs");
        digMap.put("8","tuv");
        digMap.put("9","wxyz");
    }


    //主函数
    public List<String> letterCombinations(String digits) {
        //路径
        int length = digits.length();
        StringBuilder path = new StringBuilder();
        backtrack(digits, path, digMap, length);
        System.out.println("final res:" +res);
        return res;
    }

    //递归函数
    void backtrack(String digits, StringBuilder path, HashMap<String,String> digMap, int length){
        for(int i=0;i< digits.length();i++){
            String iStr = digits.substring(i,i+1);
            String digStr = digMap.get(iStr);

            //剩下的选择列表
            String remainDigits = digits.substring(i+1);
            for(int m =0;m<digStr.length();m++){
                String mStr = digStr.substring(m,m+1);
                path.append(mStr);
                System.out.println("path:"+path);
                System.out.println("path length:"+path.length() + ",length:"+ length);
                if(path.length() == length){
                    res.add(path.toString());
                    System.out.println("res:"+res.toString());
//                    return;   //不能加这个return，不然没办法遍历完
                }
                backtrack(remainDigits, path, digMap,length);
                path.deleteCharAt(path.length() - 1);
            }
        }
    }



    public static void main(String[] args) {
        LeetCode17 leetCode17 = new LeetCode17();
        leetCode17.letterCombinations("234");
    }


}
