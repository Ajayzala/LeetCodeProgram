/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
public class RemoveDigitFromNumbertoMaximizeResult {
 
    public static String removeDigit(String number, char digit) {
        
        
        String preFix = "";
        String postFix = "";
        ArrayList<String> lst = new ArrayList<>();
        int index=0;
        int max =0;
        while (index != number.lastIndexOf(digit)) {            
        preFix = number.substring(0,number.indexOf(digit,index));
        postFix = number.substring(index+1,number.length());    
        lst.add(preFix+postFix); 
        index += number.indexOf(digit, index+1);
       
        }
        lst.add(number.substring(0, number.lastIndexOf(digit))+number.substring(number.lastIndexOf(digit)+1, number.length()));
        for(int i=0; i< lst.size();i++){
        max = Math.max(max, Integer.parseInt(lst.get(i)));
        }
        
        return String.valueOf(max); 
    }
    public static void main(String[] args) {
        System.out.println(RemoveDigitFromNumbertoMaximizeResult.removeDigit("1231", '1')); 
    }
}
