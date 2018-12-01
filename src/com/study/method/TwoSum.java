package com.study.method;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * 双重遍历来从数组中找到两个数之和与所给参数相同
     * 此方法时间O(n^2) 空间O(1)
     * **/
    public int[] twoSum(int[]nums,int target){
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]==target-nums[i]){
                    return new  int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 通过建立hash表来从数组中找到两个数之和与所给参数相同
     * 此方法时间O(n) 空间O(n)
     * **/
    public int[] Twosum(int[]nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for (int j =0;j<nums.length;j++){
            int complement = target -nums[j];
            if (map.containsKey(complement)&&map.get(complement)!=j){
                return new int[]{j,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 通过建立hash表来从数组中找到两个数之和与所给参数相同
     * 一次遍历即可
     * 此方法时间O(n) 空间O(n)
     * **/
    public int[] TwoSum(int[]nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int j =0;j<nums.length;j++){
            int complement = target -nums[j];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),j};
            }
            map.put(nums[j],j);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
