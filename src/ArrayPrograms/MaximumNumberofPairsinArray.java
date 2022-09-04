/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayPrograms;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class MaximumNumberofPairsinArray {
    public static int[] numberOfPairs(int[] nums) {
        int res[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        int pair =0;
        int left=0;
        for (Integer value : map.values()) {
            pair+=value/2;
            left+= value%2;
        }
        res[0]=pair;
        res[1]=left;
    return res;    
    }
    
    public static void main(String[] args) {
        int nums[] = {1,1};
        
        System.out.println(MaximumNumberofPairsinArray.numberOfPairs(nums));
    }
}
