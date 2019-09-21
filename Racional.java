/**
 * Racional
 */
import javax.swing.JOptionPane;

public class Racional {
    private int numerador_a;
    private int denominador_a;
    private int numerador_b;
    private int denominador_b;
    private int numerador_c; // Guardar el resultado del numerador
    private int denominador_c; // Guardar el resultado del denominador

    /*
    * Metodo constructor
    */
    public Racional (int numerador_a, int denominador_a, int numerador_b, int denominador_b) {
        this.numerador_a = numerador_a;
        this.denominador_a = denominador_a;
        this.numerador_b = numerador_b;
        this.denominador_b = denominador_b;
    }

    /* 
    * Muestra los elementos en su forma racional
    */
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Los numeros son:\na: "
             + this.numerador_a + "/" + this.denominador_a +
             "\nb: " + this.numerador_b + "/" + this.denominador_b);
    }

    /*
    * Suma de los numeros racionales a y b
    */
    public void suma () {
        this.numerador_c = (this.numerador_a * this.denominador_b) + (this.denominador_a * this.numerador_b);
        this.denominador_c = this.denominador_a * this.denominador_b;
    }

    /*
    * Resta de los numeros racionales a y b
    */
    public void resta () {
        negativo('b');
        suma();
    }

    /*
    * Multiplicación de los numeros racionales a y b
    */
    public void multiplicacion () {
        this.numerador_c = this.numerador_a * this.numerador_b; 
        this.denominador_c = this.denominador_a * this.denominador_b; 
    }

    /*
    * Convertir determinado numero racional a negativo
    */
    public void negativo (char racional) {
        if (racional == 'a') {
            this.numerador_a = this.numerador_a * -1;
        } else if (racional == 'b') {
            this.numerador_b = this.numerador_b * -1;
        } else if (racional == 'c') {
            this.numerador_c = this.numerador_c * -1;
        } else {
            return;
        }
    }

    /*
    * Simplificar el numero racional a su maxima expresión
    */
    public void simplificacion (char racional) {
        int numerador = 0, denominador = 0;
        int aux = 0;
        if (racional == 'a') {
            numerador = this.numerador_a;
            denominador = this.denominador_a;
        } else if (racional == 'b') {
            numerador = this.numerador_b;
            denominador = this.denominador_b;
        } else if (racional == 'c') {
            numerador = this.numerador_c;
            denominador = this.denominador_c;
        } else {
            return;
        }

        while (denominador != 0) {
            aux = denominador;
            denominador = numerador % denominador;
            numerador = aux;
        }

        if (racional == 'a' && (this.denominador_a / numerador) != 1) {
            this.numerador_a /= numerador;
            this.denominador_a /= numerador;
        } else if (racional == 'b' && (this.denominador_b / numerador) != 1) {
            this.numerador_b /= numerador;
            this.denominador_b /= numerador;
        } else if (racional == 'c' && (this.denominador_c / numerador) != 1) {
            this.numerador_c /= numerador;
            this.denominador_c /= numerador;
        }
    }

    /*
    * Comparar si los numeros racionales a y b son equivalentes
    */
    public void comparar () {
        simplificacion('a');
        simplificacion('b');

        if ((this.numerador_a == this.numerador_b) && (this.denominador_a == this.denominador_b)) {
            JOptionPane.showMessageDialog(null, "Los numeros son equivalentes");
        } else {
            JOptionPane.showMessageDialog(null, "Los numeros no son diferentes");
        }
    }

    /*
    * Mostrar el resultado obtenido
    */
    public void resultado () {
        simplificacion('c');
        if (numerador_c == 0 || denominador_c == 0) {
            JOptionPane.showMessageDialog(null, "El resultado es: 0");
        } else if (numerador_c == denominador_c) {
            JOptionPane.showMessageDialog(null, "El resultado es: 1");
        } else {
            JOptionPane.showMessageDialog(null, "El resultado es: " + numerador_c + "/" + denominador_c);
        }
    }
}