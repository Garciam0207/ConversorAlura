import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor {
	
	
	 
	  // Método para convertir de Celsius a Fahrenheit
    public static void celsiusaFahrenheit(double celsius) {
        double salida = (celsius * 9 / 5) + 32;
        DecimalFormat df = new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null, celsius+"° Celsius equvalen a "+ df.format(salida) + "° Fahrenheit");
        Conversor.Mensaje();
    }

    // Método para convertir de Celsius a Kelvin
    public static void celsiusaKelvin(double celsius) {
    	double salida = celsius + 273.15;
    	DecimalFormat df = new DecimalFormat("##.##");
    	JOptionPane.showMessageDialog(null, celsius+"° Celsius equvalen a "+ df.format(salida) + "° Kelvin");
    	Conversor.Mensaje();
    }

    // Método para convertir de Fahrenheit a Celsius
    public static void fahrenheitaCelsius(double fahrenheit) {
    	double salida = (fahrenheit - 32) * 5 / 9;
    	DecimalFormat df = new DecimalFormat("##.##");
    	JOptionPane.showMessageDialog(null, fahrenheit+"° Fahrenheit equvalen a "+ df.format(salida) + "° Celsius");
    	Conversor.Mensaje();
    	
    }

    // Método para convertir de Fahrenheit a Kelvin
    public static void fahrenheitaKelvin(double fahrenheit) {
    	double salida = (fahrenheit + 459.67) * 5 / 9;
    	DecimalFormat df = new DecimalFormat("##.##");
    	JOptionPane.showMessageDialog(null, fahrenheit+"° Fahrenheit equvalen a "+ df.format(salida) + "° Kelvin");
    	Conversor.Mensaje();
    }

    // Método para convertir de Kelvin a Celsius
    public static void kelvinaCelsius(double kelvin) {
    	double salida = kelvin - 273.15;
    	DecimalFormat df = new DecimalFormat("##.##");
    	JOptionPane.showMessageDialog(null, kelvin+"° Kelvin equvalen a "+ df.format(salida) + "° Celsius");
    	Conversor.Mensaje();
    }

    // Método para convertir de Kelvin a Fahrenheit
    public static void kelvinaFahrenheit(double kelvin) {
    	double salida = (kelvin * 9 / 5) - 459.67;
    	DecimalFormat df = new DecimalFormat("##.##");
    	JOptionPane.showMessageDialog(null, kelvin+"° Kelvin equvalen a "+ df.format(salida) + "° Fahrenheit");
    	Conversor.Mensaje();
    }
    public static void cabioDivisas(double entrada, double tipoCambio, String moneda) {
    	double salida = entrada *tipoCambio;
    	DecimalFormat df = new DecimalFormat("##.##");
    	JOptionPane.showMessageDialog(null,"Tienes "+ df.format(salida) +" "+ moneda);
    	Conversor.Mensaje();
    }
    
    private static void Mensaje() {
        int option = JOptionPane.showConfirmDialog(null, "¿Quiere realizar otro cálculo?");
        if (option == JOptionPane.OK_OPTION) {
            // Llamar a la clase MenuPrincipal nuevamente 
            MenuPrincipal.main(null);
        } else {
            // Cerrar todas las ventanas y salir de la aplicación
            JOptionPane.getRootFrame().dispose();
            JOptionPane.showMessageDialog(null,"Programa terminado");            
            System.exit(0); // Terminar la aplicación Java
        }
    }
}
