/**
 * Calculadora
 */
import javax.swing.JOptionPane;

public class Calculadora {
    private Basica basica;
    private Racional racional;
    private Trigonometrica trigonometrica;

    /*
    * Metodo constructor
    */
    public Calculadora () {
        iniciarCalculadora();
    }

    /*
    * Menu principal de la calculadora
    */
    public void iniciarCalculadora() {
        String[] opciones = {"Basica", "Trigonometrica", "Racional"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Que calculadora desea ocupar:", 
            "Bienvenido", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        
        if (seleccion == null) {
            JOptionPane.showMessageDialog(null, "Cerrar calculadora");
            return;
        } else if (seleccion.equals(opciones[0])) {
            calculadoraBasica();
        } else if (seleccion.equals(opciones[1])) {
            calculadoraTrigonometrica();
        } else if (seleccion.equals(opciones[2])) {
            calculadoraRacional();
        }
    }

    /*
    * Menu calculadora basica
    */
    public void calculadoraBasica() {
        String numero_a, numero_b;
        numero_a = JOptionPane.showInputDialog("Digite el primer operando");
        numero_b = JOptionPane.showInputDialog("Digite el segundo operando");
        basica = new Basica(Integer.parseInt(numero_a), Integer.parseInt(numero_b));

        String[] opciones = {"Suma", "Resta", "Multiplicación", "División"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Que operación desea realizar:", 
            "Bienvenido", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        if (seleccion == null) {
            JOptionPane.showMessageDialog(null, "Cerrar calculadora");
        } else if (seleccion.equals(opciones[0])) {
            basica.suma();
        } else if (seleccion.equals(opciones[1])) {
            basica.resta();
        } else if (seleccion.equals(opciones[2])) {
            basica.multiplicacion();
        } else if (seleccion.equals(opciones[3])) {
            basica.division();
        }
    }

    /*
    * Menu calculadora Trigonometrica
    */
    public void calculadoraTrigonometrica() {
        String angulo;
        angulo = JOptionPane.showInputDialog("Digite el angulo");
        trigonometrica = new Trigonometrica(Double.parseDouble(angulo));

        String[] opciones = {"Seno", "Coseno", "Tangente", "Secante", "Cosecante", "Cotangente"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Que operación desea realizar:", 
            "Bienvenido", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        if (seleccion == null) {
            JOptionPane.showMessageDialog(null, "Cerrar calculadora");
        } else if (seleccion.equals(opciones[0])) {
            trigonometrica.sen();
            trigonometrica.resultado();
        } else if (seleccion.equals(opciones[1])) {
            trigonometrica.cos();
            trigonometrica.resultado();
        } else if (seleccion.equals(opciones[2])) {
            trigonometrica.tan();
            trigonometrica.resultado();
        } else if (seleccion.equals(opciones[3])) {
            trigonometrica.sec();
            trigonometrica.resultado();
        } else if (seleccion.equals(opciones[4])) {
            trigonometrica.csc();
            trigonometrica.resultado();
        } else if (seleccion.equals(opciones[5])) {
            trigonometrica.cot();
            trigonometrica.resultado();
        } 
    }

    /*
    * Menu calculadora racional
    */
    public void calculadoraRacional() {
        String numerador_a, denominador_a, numerador_b, denominador_b;
        numerador_a = JOptionPane.showInputDialog("Digite el primer numerador");
        denominador_a = JOptionPane.showInputDialog("Digite el primer denominador");
        numerador_b = JOptionPane.showInputDialog("Digite el primer numerador");
        denominador_b = JOptionPane.showInputDialog("Digite el segundo denominador");
        racional = new Racional(Integer.parseInt(numerador_a), 
            Integer.parseInt(denominador_a), 
            Integer.parseInt(numerador_b), 
            Integer.parseInt(denominador_b));

        String[] opciones = {"Mostrar fracciones", "Suma", "Resta", "Multiplicación", "Negación", "Simplificar", "Comparar"};
        String seleccion = (String) JOptionPane.showInputDialog(null, "Que operación desea realizar:", 
            "Bienvenido", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        if (seleccion == null) {
            JOptionPane.showMessageDialog(null, "Cerrar calculadora");
        } else if (seleccion.equals(opciones[0])) {
            racional.mostrar();
        } else if (seleccion.equals(opciones[1])) {
            racional.suma();
            racional.resultado();
        } else if (seleccion.equals(opciones[2])) {
            racional.resta();
            racional.resultado();
        } else if (seleccion.equals(opciones[3])) {
            racional.multiplicacion();
            racional.resultado();
        } else if (seleccion.equals(opciones[4])) {
            racional.negativo('a');
            racional.negativo('b');
            racional.mostrar();
        } else if (seleccion.equals(opciones[5])) {
            racional.simplificacion('a');
            racional.simplificacion('b');
            racional.mostrar();
        } else if (seleccion.equals(opciones[6])) {
            racional.comparar();
        }
    }
}