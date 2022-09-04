/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
import java.util.ArrayList;

public class NumberofSegmentsinaString {

    public static int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberofSegmentsinaString.countSegments(", , , ,        a, eaefa"));
    }
}
