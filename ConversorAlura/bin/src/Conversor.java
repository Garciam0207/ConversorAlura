import javax.swing.JOptionPane;

public class Conversor {
	
	  // Método para convertir de Celsius a Fahrenheit
    public static void celsiusaFahrenheit(double celsius) {
        double salida = (celsius * 9 / 5) + 32;
        JOptionPane.showMessageDialog(null, celsius+"° Celsius equvalen a "+ salida+ "° Fahrenheit");
    }

    // Método para convertir de Celsius a Kelvin
    public static void celsiusaKelvin(double celsius) {
    	double salida = celsius + 273.15;
    	JOptionPane.showMessageDialog(null, celsius+"° Celsius equvalen a "+ salida+ "° Kelvin");
    }

    // Método para convertir de Fahrenheit a Celsius
    public static void fahrenheitaCelsius(double fahrenheit) {
    	double salida = (fahrenheit - 32) * 5 / 9;
    	JOptionPane.showMessageDialog(null, fahrenheit+"° Fahrenheit equvalen a "+ salida+ "° Celsius");
    }

    // Método para convertir de Fahrenheit a Kelvin
    public static void fahrenheitaKelvin(double fahrenheit) {
    	double salida = (fahrenheit + 459.67) * 5 / 9;
    	JOptionPane.showMessageDialog(null, fahrenheit+"° Fahrenheit equvalen a "+ salida+ "° Kelvin");
    }

    // Método para convertir de Kelvin a Celsius
    public static void kelvinaCelsius(double kelvin) {
    	double salida = kelvin - 273.15;
    	JOptionPane.showMessageDialog(null, kelvin+"° Kelvin equvalen a "+ salida+ "° Celsius");
    }

    // Método para convertir de Kelvin a Fahrenheit
    public static void kelvinaFahrenheit(double kelvin) {
    	double salida = (kelvin * 9 / 5) - 459.67;
    	JOptionPane.showMessageDialog(null, kelvin+"° Kelvin equvalen a "+ salida+ "° Fahrenheit");
    }

    
}
