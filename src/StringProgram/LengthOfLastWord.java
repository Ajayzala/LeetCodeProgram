/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
      String res[] = s.split(" ");
        String resString = res[res.length-1];
      return resString.length();
    }
    public static void main(String[] args) {
        System.out.println(LengthOfLastWord.lengthOfLastWord("This is Ajay"));
    }
}
