/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayPrograms;

/**
 *
 * @author hp
 */
import java.util.Arrays;
public class MaximumGap {
    public static int maximumGap(int[] nums) {
       int max =0; 
        Arrays.sort(nums);
        if(nums.length>1){
        for(int i=0; i< nums.length-1;i++){
            max = Math.max(max, Math.abs(nums[i]-nums[i+1]));
        }
        }
        
    return max;
    }
    public static void main(String[] args) {
        int temp[] = {1,999999};
        System.out.println( MaximumGap.maximumGap(temp)); 
    }
}

