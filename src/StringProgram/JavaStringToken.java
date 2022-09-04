/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
import java.io.*;
import java.util.*;
public class JavaStringToken {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.replaceAll("[?`,]+", " ");
        String str[] = s.split(" ");
        System.out.println(str.length);
        scan.close();
    }

}
