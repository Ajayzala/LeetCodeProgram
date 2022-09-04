/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
public class Largest3SameDigitNumberinString {
   
    
    public static String largestGoodInteger(String num) {
       
      String max="";
     for(int i=0; i< num.length()-2;i++){
         if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
            String Tmax = num.substring(i,i+3);
             if(max.compareTo(Tmax)<0){
                 max = Tmax;
             }
         }
     }
      
      return max;
    }
    
    public static void main(String[] args) {
        System.out.println(Largest3SameDigitNumberinString.largestGoodInteger("2300019"));   
    }
}
