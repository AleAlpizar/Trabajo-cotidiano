/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int valor = scanner.nextInt();
        String resultado = "";
        String simbolo = "*";
        for(int i = 0;i<valor;i++){
            resultado += simbolo;
            System.out.println(resultado);
        }
    }
}

