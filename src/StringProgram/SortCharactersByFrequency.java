/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        String res="";
        HashMap<Character,Integer> frMap = new HashMap<>();
        for(int i=0; i<s.length();i++){
        if(frMap.containsKey(s.charAt(i))){
            frMap.put(s.charAt(i),frMap.get(s.charAt(i))+1);
        }else{
            frMap.put(s.charAt(i), 1);
        }
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(SortCharactersByFrequency.frequencySort("tree"));
        
    }
}
