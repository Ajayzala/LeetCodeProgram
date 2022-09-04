/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringProgram;

/**
 *
 * @author hp
 */
public class DecodeTheMesssage {

    public static String decodeMessage(String key, String message) {
        String res = "";
        String keyClean1 = key.replaceAll("\\s", "");
        StringBuilder keyClean = new StringBuilder();
        for (int i = 0; i < keyClean1.length(); i++) {
            if (keyClean.indexOf(String.valueOf(keyClean1.charAt(i))) == -1 && String.valueOf(keyClean1.charAt(i)) != " ") {
                keyClean.append(String.valueOf(keyClean1.charAt(i)));
            }
        }
        char whiteSpace = ' ';
        String txtLatter = "abcdefghijklmnopqrstuvwxyz";
        int j = 0;
        while (j != message.length()) {
            if (message.charAt(j) == whiteSpace) {
                res += " ";
                j++;
            } else {
                res += String.valueOf(txtLatter.charAt(keyClean.indexOf(String.valueOf(message.charAt(j)))));
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(DecodeTheMesssage.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
