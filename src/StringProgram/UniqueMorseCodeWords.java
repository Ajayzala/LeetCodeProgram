/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

import javax.swing.UIClientPropertyKey;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        String latter = "abcdefghijklmnopqrstuvwxyz";
        String pattern [] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String patStore = "";
        for(int i=0; i < words.length;i++){
            for(int j=0; j<words[i].length();j++){
                patStore+=pattern[latter.indexOf(words[i].charAt(j))];
            }
            if(!res.contains(patStore)){
                res.add(patStore);
            }
            patStore="";
        }
    return res.size();
    }
    
    
    public static void main(String[] args) {
        String tmp[] = {"gin","zen","gig","msg"};
        
        System.out.println(UniqueMorseCodeWords.uniqueMorseRepresentations(tmp));
    }
}
