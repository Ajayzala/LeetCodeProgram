/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
public class ReverseWord {
     public static String reverseWord(String str){
     String resArray[] = str.split(" ");
     String res = "";
     for(int i=resArray.length-1; i>=0;i--){
     res+=resArray[i]+" ";
     }  
     res = res.substring(0, res.length()-1);
     return res;
     }
    
    public static void main(String[] args) {
        System.out.println(ReverseWord.reverseWord("This Is A Darshan"));
    }
}
