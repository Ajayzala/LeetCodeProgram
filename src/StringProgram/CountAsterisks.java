/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
public class CountAsterisks {
    public static int countAsterisks(String s) {
      int res = 0;
      char match = '*';
      char unmatch = '|';
      for(int i=0;i<s.length();i++){
          if(s.charAt(i) == match){
          res++;
          }else{
              if(s.charAt(i) == unmatch){
                  i=s.indexOf(unmatch,i+1);
                  
              }
          }
      }
      return res;
    }
    public static void main(String[] args) {
        System.out.println(CountAsterisks.countAsterisks("yo|uar|e**|b|e***au|tifu|l"));   
    }
}
