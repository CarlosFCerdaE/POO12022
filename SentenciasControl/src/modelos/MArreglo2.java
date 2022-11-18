/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author cfco5
 */
public class MArreglo2 {
    
    public int[][] multiplicarEscalar(int k){
    
        int[][] matrizA = {{10,15,20},
                            {-3,12,4},
                            {0,5,-4}};
        
        for(int i=0;i<3;i++){
        
            for(int j=0;j<3;j++){
            
                matrizA[i][j]*=k;
            }
        }
        
        return matrizA;
    }
    public int[][]sumarMatrices(){
    
        int[][] matrizA = {{10,15,20},
                            {-3,12,4},
                            {0,5,-4}};
        
        int[][] matrizB = {{25,-5,10},
                            {-10,21,54},
                            {10,-55,-25}};
        
        int[][]matrizC = new int[3][3];
        
         for(int i=0;i<3;i++){
        
            for(int j=0;j<3;j++){
            
                matrizC[i][j] = matrizA[i][j]+ matrizB[i][j];
            }
         }
         return matrizC;
    }
    
}
