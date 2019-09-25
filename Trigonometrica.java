/**
 * Trigonometrica
 */
import javax.swing.JOptionPane;

public class Trigonometrica {
    private double numero;
    private double resultado;

    public Trigonometrica (double numero) {
        this.numero = numero;
        convertir_a_radianes();
    }

    /*
    * Convesion de grados a radianes
    */
    public void convertir_a_radianes () {
        this.numero = (double) (this.numero * Math.PI) / 180;
    }

    /*
    * Factorial de determinado numero
    */
    public double factorial (int numero) {
        double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    /*
    * Potencia de determinado numero 
    */
    public double potencia (double base, int exponente) {
        double potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia = potencia * base;
        }

        return potencia;
    }

    /*
    * Calculo del seno de un angulo
    */
    public void sen () {
        double aux1 = 0, aux2 = 0;
        for (int i = 0; i < 1000; i++) {
            aux1 = ((potencia(-1, i) / factorial((2 * i) + 1))) * potencia(this.numero, (2 * i) + 1);
            aux2 = aux2 + aux1;
        }

        this.resultado = aux2;
    }

    /*
    * Calculo del coseno de un angulo
    */
    public void cos () {
        double aux1 = 0, aux2 = 0;
        for (int i = 0; i < 1000; i++) {
            aux1 = (potencia(-1, i) / factorial((2 * i))) * potencia(this.numero, (2 * i));
            aux2 = aux2 + aux1; 
        }

        this.resultado = aux2;
    }

    /*
    * Calculo de la tangente de un angulo
    */
    public void tan () {
        sen();
        double seno = this.resultado;
        cos();
        double coseno = this.resultado;
        this.resultado = seno/coseno;
    }

    /*
    * Calculo de la secante de un angulo
    */
    public void sec () {
        cos();
        double cos = this.resultado;
        this.resultado = 1/cos;
    }

    /*
    * Calculo de la cosecante de un angulo
    */
    public void csc () {
        sen();
        double sen = this.resultado;
        this.resultado = 1/sen;
    }

    /*
    * Calculo de la cotangente de un angulo
    */
    public void cot () {
        sen();
        double sen = this.resultado;
        cos();
        double cos = this.resultado;
        this.resultado = 1/(sen/cos);
    }

    /*
    * Impresion del resultado
    */
    public void resultado () {
        JOptionPane.showMessageDialog(null, "Resultado: " + this.resultado);
    }
    
}