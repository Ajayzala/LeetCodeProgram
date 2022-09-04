/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author hp
 */
public class ReshapeTheMatrix {
     public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length * mat[0].length)==(r*c)){
        int c1=0; int c2 =0;
            int res[][] = new int[r][c];
            for(int i=0; i<mat.length;i++){
                
                   for(int j=0; j<mat[i].length;j++){
                       if(c2!=c && c1 != r){
                       res[c1][c2] = mat[i][j];
                       c2++;
                       }
                       if(c2 == c){
                         c1++;
                         c2 = 0;
                        }
                    }
                   
            }
            
             mat = res;
        }
        return mat;
    }
     public static void main(String[] args) {
        int[][] foo = new int[][] {
        new int[] { 1, 2 },
        new int[] {3, 4}
    };

        
         System.out.println(Arrays.toString(ReshapeTheMatrix.matrixReshape(foo, 1, 4)));
        
    }
}
