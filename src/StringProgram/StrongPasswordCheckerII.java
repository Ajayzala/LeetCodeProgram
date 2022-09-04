/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
import java.util.regex.*;
public class StrongPasswordCheckerII {
     public static boolean strongPasswordCheckerII(String password) {
      boolean res = false;  
      if(Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,})", password)){
          res = true;
      }
      return res;
     }
    public static void main(String[] args) {
        System.out.println(StrongPasswordCheckerII.strongPasswordCheckerII("ascsa3@3"));  
    }
}
