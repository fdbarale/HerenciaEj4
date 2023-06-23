/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Oficina
 */
public class Cuadrado implements CalculosFormas {

    private Double lado1;
    private Double lado2;

    public Cuadrado() {
    }

    public Cuadrado(Double lado1, Double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }
    
    
    
    @Override
    public Double calcularPerimetro() {
        return (lado1 * 2) + (lado2 * 2);
    }

    @Override
    public Double calcularArea() {
        return lado1 * lado2;
    }
    
}
