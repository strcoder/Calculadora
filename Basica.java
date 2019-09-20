/**
 * Basica
 */
public class Basica {
    private int a;
    private int b;

    /*
    * Metodo constructor
    */
    public Basica (int a, int b) {
        this.a = a;
        this.b = b;
    }

    /*
    * Suma los valores de a y b
    */
    public void suma() {
        System.out.println("El resultado de la suma es: " + (this.a + this.b));
    }

    /*
    * Resta los valores de a y b
    */
    public void resta() {
        System.out.println("El resultado de la resta es: " + (this.a - this.b));
    }

    /*
    * Multiplica los valores de a y b
    */
    public void multiplicacion() {
        System.out.println("El resultado de la multiplicación es: " + (this.a * this.b));
    }

    /*
    * Divide los valores de a y b
    */
    public void division() {
        System.out.println("El resultado de la división es: " + ((float)this.a / (float)this.b));
    }
    
}