/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author monst
 */
public class MFor {
    
    public int De1aN (double n){
        int x=0;
        for(int i=1;i<=n;i++){
          x=x+i;
      }  
        return x;
    }
    
    public double DeAaB (double n, double m){
        double x=0;
        for(double i=n;i<=m;i++){
          x=x+i;
      }  
        return x;
    }
    
    public boolean esPrimo(double num1) {
        if (num1==0||num1==1||num1==4) {
        return false;
    }
         for (int i=2; i<num1/2; i++) {
            if (num1%i == 0)
         return false;
    }
    return true;
}
    
    public double promedio(double num1){
        
        int s=0,x;
        double p;
     
        System.out.println("Cantidad de elementos: "+num1);
        
        for(int i=1; i<=num1; i++)
        { 
         x=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la nota "+i,"Notas", JOptionPane.INFORMATION_MESSAGE));
         s=s+x;                
        }   
        p=s/num1;
        
       return p;                            
    
    }
    
    public int Pares100(){
       int suma=0;
        for(int i=1; i<=100; i++){
           if(i%2==0)
               suma = suma + i;
       } 
       return suma; 
    }
    
    public String Fibonacci(){
        int num1 = 0, num2 = 1, suma = 1;
        String resp="1";
         
        for (int i = 1; i < 6; i++) {
            System.out.println(suma);

            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            resp = resp +", "+ suma;
    }
        return resp;
}
}
