
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

public class MenuConversorDivisas extends JFrame implements ItemListener, ActionListener {

	private JComboBox<String> combo1;
	public JPanel panel;
	int opcion;
	double entrada;
	
	public MenuConversorDivisas() {
		String inputSeleccion = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir");
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
			// Handle invalid input (non-numeric or empty input)
			JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	

	}
	
	private void convertir() {
		switch (opcion) {
		case 0: 
			Conversor.cabioDivisas(entrada,0.041, " Dolares");						
			break;
		case 1:			
			Conversor.cabioDivisas(entrada,0.037, " Euros");
			break;
		case 2:			
		    Conversor.cabioDivisas(entrada,0.032, " Liras Esterlinas");
			break;
		case 3:
			Conversor.cabioDivisas(entrada,0.17, " Yenes Japoneses");
						
			break;
		case 4:
			Conversor.cabioDivisas(entrada, 52.30, " Wons Sur-coreanos");
						
			break;
		case 5:
			Conversor.cabioDivisas(entrada,24.62," Lempiras");		
			break;
		case 6:
			Conversor.cabioDivisas(entrada,27.36," Lempiras");			
			break;
		case 7:
			Conversor.cabioDivisas(entrada,31.61," Lempiras");			
			break;
		case 8:
			Conversor.cabioDivisas(entrada,5.76," Lempiras");			
			break;
		case 9:
			Conversor.cabioDivisas(entrada, 0.019," Lempiras");			
			break;
		default:
			break;
		}
	}
	private void cargarconverciones() {
		combo1.setModel(new DefaultComboBoxModel<>(converciones));
		
	}
	private String [] converciones = {"De Lempiras a Dólar",
			                          "De Lempiras a Euros",
			                          "De Lempiras a Libras Esterlinas",
			                          "De Lempiras a Yen Japonés",
			                          "De Lempiras a Won sur-coreano",
			                          "De Dólar a Lempiras",
			                          "De Euros a Lempiras",
			                          "De Libras Esterlinas a Lempiras",
			                          "De Yen Japonés a Lempiras",
			                          "DE Won sur-coreano a Lempiras"};	
			


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

		MenuConversorDivisas ventana = new MenuConversorDivisas();
		ventana.setVisible(true);

	}
	
	public void itemStateChanged(ItemEvent e) {
		// Obtener el índice del elemento seleccionado en el JComboBox
		int selectedIndex = combo1.getSelectedIndex();
		opcion = selectedIndex;
		System.out.println("Índice del elemento seleccionado: " + selectedIndex);
	}
	 public void actionPerformed(ActionEvent e) {
	        // Acción a realizar cuando se hace clic en el botón "OK" (en este caso, llamar al método "convertir()").
	        convertir();
	    }
	
}
