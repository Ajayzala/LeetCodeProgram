/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class CheckifNumberHasEqualDigitCountandDigitValue {
     public static boolean digitCount(String num) {
        boolean res = false;
         ArrayList<Boolean> resArray = new ArrayList<>();
         int count = 0;
        for(int i=0; i < num.length();i++){
            for(int j=0; j <num.length();j++){
                if(i == Integer.parseInt(String.valueOf(num.charAt(j)))){
                    count ++;
                }
            }
            if(count == Integer.parseInt(String.valueOf(num.charAt(i)))){
                resArray.add(true);
            }
            count =0;
        }
        if(resArray.size() == num.length()){
        res = true;
        }
    return res;
     }
     
     public static void main(String[] args) {
         System.out.println(CheckifNumberHasEqualDigitCountandDigitValue.digitCount("1210"));
    }
}
