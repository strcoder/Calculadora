/**
 * Trigonometrica
 */
public class Trigonometrica {
    private double numero;
    private double resultado;

    public Trigonometrica (double numero) {
        this.numero = numero;
    }

    /*
    * Convesion de grados a radianes
    */
    public double convertir_a_radianes () {
        double radianes;
        radianes = (double) (this.numero * Math.PI) / 180;

        return radianes;
    }

    /*
    * Factorial de determinado numero
    */
    public double factorial (int numero) {
        double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
            if (i % 2 == 0) {
                factorial = factorial * -1;
            }
        }

        return factorial;
    }

    /*
    * Potencia de determinado numero 
    */
    public double potencia (double base, int exponente) {
        double potencia = 1;
        for (int i = 1; i < exponente; i++) {
            potencia = potencia * base;
        }

        return potencia;
    }

    /*
    * Calculo del seno de un angulo
    */
    public void sen () {
        double radianes = convertir_a_radianes();
        double aux1 = 0;
        int aux2 = 1;
        for (int i = 1; i < 1000; i++) {
            aux1 += potencia(radianes, i+1) / factorial(aux2);
            aux2 += 2;
        }

        this.resultado = aux1;
    }

    /*
    * Calculo del coseno de un angulo
    */
    public void cos () {
        double radianes = convertir_a_radianes();
        double aux1 = 0;
        int aux2 = 0;
        for (int i = 0; i < 1000; i++) {
            aux1 += potencia(radianes, i+1) / factorial(aux2);
            aux2 += 2;
        }

        this.resultado = aux1;
    }

    /*
    * Calculo de la tangente de un angulo
    */
    public void tan () {
        sen();
        double sen = this.resultado;
        cos();
        double cos = this.resultado;
        this.resultado = sen/cos;
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
        System.out.println("Resultado: " + this.resultado);
    }
    
}