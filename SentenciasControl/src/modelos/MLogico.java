/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


public class MLogico {
    /**
 *
 * Verifica si dos numeros son iguales
 * @param num1
 * @param num2
     * @return
 * @author monst
 */
    
    public boolean sonIguales(double num1, double num2){
        return num1 == num2;
    }
    
    public double numeroMayor (double num1, double num2){
        if (num1>num2)return num1;
        return num2;
    }
    
    public double numeroMenor (double num1, double num2){
        if (num1<num2)return num1;
        return num2;
}
}

    
