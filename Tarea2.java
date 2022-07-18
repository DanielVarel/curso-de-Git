/*
Crear un programa que permita solicitar una sola línea. Por ejemplo: 
"3 + 2"

La idea es capturar esa cadena, separarla en valores y el operador. Según el operador decidir
la operación y finalmente mostrar el resultado.

*/
package tarea2;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        
        int num1, num2, total=0;
        
        System.out.print("Digite una cadena: ");
        cadena = entrada.nextLine();
        String signo;
        
        Scanner str = new Scanner(cadena);
        
        num1 = Integer.parseInt(str.next());
        signo = str.next();
        num2 =Integer.parseInt(str.next());
        
        switch(signo){
            case "+": 
                total = num1 + num2;
                break;
            case "-": 
                total = num1 - num2;
                break;
            case "*": 
                total = num1 * num2;
                break;
            case "/": 
                total = num1 / num2;
                break;
            default: 
                System.out.println("Error!!!!!");
                break;
        }
        
        System.out.println("El resultado es: "+total);
        
    }
    
}
