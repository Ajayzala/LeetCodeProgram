/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class PascalTriangleTwo {
     public static List<Integer> getRow(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <=numRows; i++) {
            ArrayList<Integer> lst = new ArrayList<>();

            for (int j = 0; j <=i;) {
                if (j > 0 && j < i) {
                    List<Integer> tmp = res.get(i - 1);
                    for (int n = 0; n < tmp.size() - 1; n++) {
                        lst.add(tmp.get(n) + tmp.get(n + 1));
                        j++;
                    }

                } else {
                    lst.add(1);
                    j++;
                }
            }
            res.add(lst);
        }
        List<Integer> finalLIst = res.get(numRows);
        return finalLIst;
    }

    public static void main(String[] args) {

        System.out.println(PascalTriangleTwo.getRow(3));
    }


}
