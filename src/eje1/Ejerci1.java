/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje1;

/**
 *
 * @author NICOLAS
 */
public class Ejerci1 {
    
    
    
    
    //atributos
    private int base;
    private int altura;
    
    
    //constructor
    public Ejerci1 (int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    //calcular area
    //area = base * altura     es en m^2 ej: 12 m^2
    public void calcularArea(){
        int area;
        
        area = base * altura;
        
        System.out.println("Area: "+area+" m^2");
    }
    
    //calcular perimetro
    //perimetro = 2 * (base + altura)
    public void calcularPerimetro(){
        int perimetro;
        
        perimetro = 2 * (base + altura);
        
        System.out.println("Perimetro: "+perimetro);
    }
    
    
}
