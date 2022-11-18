/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author monst
 */
public class MAritmetico {
    
    public boolean sonMultiplos(double num1, double num2){
        if(num2 % num1==0){
            return true;
        } else return false;
    }
    
    public double expresion1(double num1, double num2, double num3, double num4, double num5){
        return num1+num2-num3*num4/num5;
    }
    
    public double expresion2(double num1, double num2, double num3, double num4, double num5){
        double res1 = num1 + num2;
        double res2 = num4 / num5;
        return res1 * num3 - res2;
    }
    
    public double expresion3(double num1, double num2){
        double resp = 1;
        if(num1 > 0 && num2==0){
            return resp;
        }
        else if(num1 == 0 && num2>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= num2; i++){
                resp = resp*num1;
            }
            return resp;
    }
        
        
        
    }
    public double expresion4(double num1, double num2, double num3){
        double resp = 1;
        if(num1 > 0 && num2==0){
            return resp*num2/num3;
        }
        else if(num1 == 0 && num2>=1){
            resp = 0;
            return resp*num2/num3;
        }
        else{
            for(int i = 1; i<= num2; i++){
                resp = resp*num1;
            }
            return resp*num2/num3;
    }
}

}