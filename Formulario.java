import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
/**
 * Write a description of class Formulario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formulario
{
    
    public Formulario(String title)
    {
      // Crear la instancia de la ventana
        JFrame ventana1 = new JFrame(title);
        ventana1.setSize(500,500);
        
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setVisible(true);
        //Instanciar el Panel
        JPanel panel1 = new JPanel();
        
        panel1.setLayout(null);
        //Adicionamos el Panel 1 a la ventana
        ventana1.add(panel1);
        ventana1.setVisible(true);
        
        //Instanciar el Label para Nombre
        JLabel labelNombre = new JLabel("Nombre");
        labelNombre.setBounds(100,20,165,25); 
        panel1.add(labelNombre);
        
        JLabel labelApellido = new JLabel("Apellido");
        labelApellido.setBounds(100,40,165,25);
        panel1.add(labelApellido);
        
        //Crear una caja de Texto
        
        
    }

}

