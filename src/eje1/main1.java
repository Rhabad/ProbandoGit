/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje1;

import java.util.Scanner;

/**
 *
 * @author NICOLAS
 */
public class main1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ejerci1 eje;
        
        int base, altura;
        
        System.out.print("Ingrese la base: ");
        base = entrada.nextInt();
        
        System.out.print("Ingrese la altura: ");
        altura = entrada.nextInt();
        
        
        eje = new Ejerci1(base, altura);
        
        eje.calcularArea();
        eje.calcularPerimetro();
        
        
    }
}
