/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package herenciaej4;

import Entidades.Circulo;
import Entidades.Cuadrado;
import java.util.Scanner;

/**
 *
 * @author Oficina
 */
public class HerenciaEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Que desea calcular (Rectangulo o Circulo)");

        String elegir = leer.next();

        if (elegir.equalsIgnoreCase("rectangulo")) {
            Cuadrado rectangulo = new Cuadrado();
            System.out.println("Ingrese el primer lado: ");
            rectangulo.setLado1(leer.nextDouble());
            System.out.println("Ingrese el segundo Lado: ");
            rectangulo.setLado2(leer.nextDouble());
            System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro() + ". Y el Area es : " + rectangulo.calcularArea());
        }
        if (elegir.equalsIgnoreCase("circulo")) {
            Circulo circulo = new Circulo();
            System.out.println("Ingrese el radio del circulo: ");
            circulo.setRadio(leer.nextDouble());
            System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro() + ". Y el area es : " + circulo.calcularArea());

        }
    }

}
