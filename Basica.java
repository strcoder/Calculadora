/**
 * Basica
 */
import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "El resultado es: " + (this.a + this.b));
    }

    /*
    * Resta los valores de a y b
    */
    public void resta() {
        JOptionPane.showMessageDialog(null, "El resultado es: " + (this.a - this.b));
    }

    /*
    * Multiplica los valores de a y b
    */
    public void multiplicacion() {
        JOptionPane.showMessageDialog(null, "El resultado es: " + (this.a * this.b));
    }

    /*
    * Divide los valores de a y b
    */
    public void division() {
        JOptionPane.showMessageDialog(null, "El resultado es: " + ((float)this.a / (float)this.b));
    }
    
}