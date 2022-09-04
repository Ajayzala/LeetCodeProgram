/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
public class PercentageofLetterinString {

    public static int percentageLetter(String s, char letter) {
        int res = 0;
        if (s.indexOf(letter) >= 0) {
            int count=0;
            for(int i=0; i < s.length();i++){
                if(s.charAt(i)== letter){
                    count++;
                }
            }
            res = (count*100)/s.length();
        } else {
            return res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(PercentageofLetterinString.percentageLetter("sgawtb", 's'));
    }
}
