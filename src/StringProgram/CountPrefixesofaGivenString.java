/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
public class CountPrefixesofaGivenString {
    public static int countPrefixes(String[] words, String s) {
       int count =0;
        
       for(int i=0;i<words.length;i++){
       if(words[i].charAt(0) == s.charAt(0)){
           count++;
       }
       } 
        
       return count;  
    }
 
    public static void main(String[] args) {    
        String word[] = {"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"};
        System.out.println(CountPrefixesofaGivenString.countPrefixes(word, "w"));
    }
}
