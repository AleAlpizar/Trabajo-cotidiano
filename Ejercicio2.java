/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args){
        String data = JOptionPane.showInputDialog("Digite un numero");
        int number = Integer.parseInt(data);
        int tabla = 0;
        for (int i = 0;i < 11;i++){
            tabla +=1;
            int resultado = number*tabla;   
            System.out.print(number+"*"+tabla+"="+resultado+"\n");
        }   
    }
}