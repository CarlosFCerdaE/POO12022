/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author tggtr
 */
public class MIfElse {

    public boolean mayorEdad(int edad) {
        if (edad >= 21) {
            return true;
        }
        return false;
    }

    public boolean notaValida(int nota) {
        if (nota >= 0 && nota <= 100) {
            return true;
        }
        return false;
    }

    public boolean validarNota(int nota) {
        if (nota >= 70) {
            return true;
        }
        return false;
    }

    public boolean validarAnio(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        }
        return true;

    }

    public int mayorNum(int num1, int num2, int num3, int num4) {

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            return num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            return num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            return num3;
        } else if (num4 > num1 && num4 > num2 && num4 > num3) {
            return num4;
        }
        return 0;

    }

    public int diaMes(int dia) {
        if (dia == 1 || dia == 3 || dia == 5 || dia == 7 || dia == 8 || dia == 10 || dia == 12) {
            return 31;
        } else if (dia == 2) {
            return 28;
        } else if (dia == 4 || dia == 6 || dia == 9 || dia == 11) {
            return 30;
        }
        return 0;
    }

    public String verNotas(int nota) { // E: 95-100 , MB: 85-90, B: 70-80, D: <=60

        if (nota > 100) {
            return "I";
        } else if (nota >= 95) {
            return "E";
        } else if (nota >= 85) {
            return "MB";
        } else if (nota >= 70) {
            return "B";
        } else if (nota >= 0 && nota <= 69) {
            return "D";
        }
        return "I";
    }

}
