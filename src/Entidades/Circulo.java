/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Oficina
 */
public class Circulo implements CalculosFormas{

   
   private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    

    @Override
    public Double calcularPerimetro() {
        
     return PI * radio;   
    }

    @Override
    public Double calcularArea() {
        return PI * (Math.pow(radio, 2));
    }
   

    
}
