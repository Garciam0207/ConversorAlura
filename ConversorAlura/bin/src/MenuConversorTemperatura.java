
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MenuConversorTemperatura extends JFrame implements ItemListener, ActionListener {

	private JComboBox<String> combo1;
	public JPanel panel;
	int opcion;
	double entrada;

	public MenuConversorTemperatura() {
		String inputSeleccion = JOptionPane.showInputDialog("Ingrase la temperatura a convertir");
		try {
			double seleccion = Double.parseDouble(inputSeleccion);
			System.out.println("Cantidad ingresada: " + seleccion);
			entrada = seleccion;
			setSize(400, 200);
			setLocationRelativeTo(null);
			setTitle("Conversor de Divisas Arura-One");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			combo1 = new JComboBox<String>();
			combo1.setBounds(20, 35, 225, 20);
			add(combo1);
			combo1.addItemListener(this);
			cargarconverciones();
			panel = new JPanel();
			add(panel);
			panel.setLayout(null);
			agregarBotones();
		} catch (NumberFormatException e) {
			// No habilita un valor no numérico (non-numeric or empty input)
			JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
		

	}
	private void convertir() {
		switch (opcion) {
		case 0:
			Conversor.celsiusaFahrenheit(entrada);			
			break;
		case 1:
			Conversor.celsiusaKelvin(entrada);			
			break;
		case 2:
			Conversor.fahrenheitaCelsius(entrada);			
			break;
		case 3:
			Conversor.fahrenheitaKelvin(entrada);			
			break;
		case 4:
			Conversor.kelvinaCelsius(entrada);			
			break;
		case 5:
			Conversor.kelvinaFahrenheit(entrada);			
			break;
		default:
			break;
		}
	}

	private void cargarconverciones() {
		combo1.setModel(new DefaultComboBoxModel<>(converciones));

	}

	private String[] converciones = { "De Celsius a  Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius",
			"De Fahrenheit a Kelvin", "De Kelivin a Celsius", "De Kelvin a Fahrenheit" };

	private void agregarBotones() {
		  JButton boton1 = new JButton("OK ");
	        boton1.setBounds(75, 100, 100, 25);
	        boton1.addActionListener(this); // Add action listener to button1
	        panel.add(boton1);

	        JButton boton2 = new JButton("Cancelar");
	        panel.add(boton2);
	        boton2.setBounds(195, 100, 100, 25);
	        boton2.addActionListener(new ActionListener() { // Add action listener to button2
	            public void actionPerformed(ActionEvent e) {
	                // Action to be performed when cancel button is clicked (in this case, close the JFrame)
	                dispose();
	            }
	        });
	}

	public static void main(String[] args) {

		MenuConversorTemperatura ventana = new MenuConversorTemperatura();
		ventana.setVisible(true);

	}

	public void itemStateChanged(ItemEvent e) {
		// Obtener el índice del elemento seleccionado en el JComboBox
		int selectedIndex = combo1.getSelectedIndex();
		opcion = selectedIndex;
		System.out.println("Índice del elemento seleccionado: " + selectedIndex);
	}
	 public void actionPerformed(ActionEvent e) {
	        // Action to be performed when OK button is clicked (in this case, call the convertir() method)
	        convertir();
	    }
}