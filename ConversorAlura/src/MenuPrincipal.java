import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuPrincipal extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JComboBox<String> combo1; 
    public JPanel panel;
    
    public MenuPrincipal() {
        setSize(400, 200);
        setTitle("Menu Principal");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        combo1 = new JComboBox<String>();
        combo1.setBounds(20, 35, 175, 20);
        add(combo1);
        combo1.addItem("conversor de divisas");
        combo1.addItem("conversor de temperatura");
        
        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        agregarBotones();
        
        
    }
    
    private void agregarBotones() {
        JButton boton1 = new JButton("OK ");
        boton1.setBounds(75, 100, 100, 25);
        panel.add(boton1);
        
        
        boton1.addActionListener(this);
        
        JButton boton2 = new JButton("Cancelar");
        panel.add(boton2);
        boton2.setBounds(195, 100, 100, 25);
     // Agregar ActionListener al botón "Cancelar"
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Deseleccionar cualquier opción seleccionada en el JComboBox
                combo1.setSelectedIndex(-1);
            }
        });

    }
    
    public static void main(String[] args) {
        MenuPrincipal ventana = new MenuPrincipal();
        ventana.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("OK ")) {
            String selectedItem = (String) combo1.getSelectedItem();
            if (selectedItem.equals("conversor de divisas")) {
                MenuConversorDivisas conversorDivisas = new MenuConversorDivisas();
                conversorDivisas.setVisible(true);
            } else if (selectedItem.equals("conversor de temperatura")) {
                MenuConversorTemperatura conversorTemperatura = new MenuConversorTemperatura();
                conversorTemperatura.setVisible(true);
            }
        }
    }
}
