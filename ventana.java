import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class ventana extends JFrame{
    
  
    // Constructor.
    public ventana(){
        
       JFrame ventana = new JFrame("Formulario de Empleados");
        setSize(0, 1000);
        
        iniciarcomponentes();
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
    }
    private void iniciarcomponentes(){
        JPanel panel = new JPanel(); // Creacion de Panel.
        panel.setBackground(Color.white); // Color del Panel.
        
        panel.setLayout(null);
        this.getContentPane().add(panel); // Se agrego el Panel a la Ventana.
        
        // CREACION DE ETIQUETAS.
        JLabel datospersonales = new JLabel ("Inf. Personal");
        datospersonales.setBounds(10, 1, 100, 30);
        panel.add(datospersonales);
        datospersonales.setForeground(Color.red);
        
        JLabel etiqueta1 = new JLabel ("Nombre"); 
        etiqueta1.setBounds(10, 30, 100, 30);              
        panel.add(etiqueta1); // Agregamos la Etiqueta al Panel.
        
        JLabel etiqueta2 = new JLabel ("Apellido");
        etiqueta2.setBounds(200, 30, 100, 30);
        panel.add(etiqueta2);
        
        JLabel etiqueta3 = new JLabel ("Identificacion");
        etiqueta3.setBounds(10, 90, 100, 30);
        panel.add(etiqueta3);
        
        JLabel etiqueta4 = new JLabel ("Direccion");
        etiqueta4.setBounds(200, 90, 100, 30);
        panel.add(etiqueta4);
        
        JLabel etiqueta5 = new JLabel ("E-mail");
        etiqueta5.setBounds(400, 30, 100, 30);
        panel.add(etiqueta5);
        
        JLabel etiqueta6 = new JLabel ("Telefono");
        etiqueta6.setBounds(400, 90, 100, 30);
        panel.add(etiqueta6);
        
        JLabel datoseducativos = new JLabel ("Datos Educativos");
        datoseducativos.setBounds(10, 150, 100, 30);
        panel.add(datoseducativos);
        datoseducativos.setForeground(Color.red);
        
        JLabel etiqueta7 = new JLabel ("Bachillerato");
        etiqueta7.setBounds(10, 200, 100, 30);
        panel.add(etiqueta7);
        
        JLabel etiqueta8 = new JLabel ("Año Finalizacion");
        etiqueta8.setBounds(200, 200, 100, 30);
        panel.add(etiqueta8);
        
        JLabel etiqueta9 = new JLabel ("Instituto");
        etiqueta9.setBounds(420, 200, 100, 30);
        panel.add(etiqueta9);
        
        JLabel etiqueta10 = new JLabel ("Universitarios");
        etiqueta10.setBounds(10, 250, 100, 30);
        panel.add(etiqueta10);
        
        JLabel etiqueta11 = new JLabel ("Año Finalizacion");
        etiqueta11.setBounds(210, 250, 100, 30);
        panel.add(etiqueta11);
        
        JLabel etiqueta12 = new JLabel ("Instituto");
        etiqueta12.setBounds(430, 250, 100, 30);
        panel.add(etiqueta12);
        
        JLabel referenciasfamiliares = new JLabel ("Ref. Familiares");
        referenciasfamiliares.setBounds(10, 300, 100, 30);
        panel.add(referenciasfamiliares);
        referenciasfamiliares.setForeground(Color.red);
        
        JLabel etiqueta14 = new JLabel ("Nombre");
        etiqueta14.setBounds(10, 350, 100, 30);
        panel.add(etiqueta14);
        
        JLabel etiqueta15 = new JLabel ("Parentesco");
        etiqueta15.setBounds(170, 350, 100, 30);
        panel.add(etiqueta15);
        
        JLabel etiqueta16 = new JLabel ("Telefono");
        etiqueta16.setBounds(370, 350, 100, 30);
        panel.add(etiqueta16);
        
        JLabel etiqueta17 = new JLabel ("Nombre");
        etiqueta17.setBounds(10, 400, 100, 30);
        panel.add(etiqueta17);
        
        JLabel etiqueta18 = new JLabel ("Parentesco");
        etiqueta18.setBounds(170, 400, 100, 30);
        panel.add(etiqueta18);
        
        JLabel etiqueta19 = new JLabel ("Telefono");
        etiqueta19.setBounds(370, 400, 100, 30);
        panel.add(etiqueta19);
        
        // CAJA DE TEXTO.
        JTextField texto1 = new JTextField();
        texto1.setBounds(60, 30, 100, 30);
        panel.add(texto1);
        
        JTextField texto2 = new JTextField();
        texto2.setBounds(250, 30, 100, 30);
        panel.add(texto2);
        
        JTextField texto3 = new JTextField();
        texto3.setBounds(90, 90, 100, 30);
        panel.add(texto3);
        
        JTextField texto4 = new JTextField();
        texto4.setBounds(260, 90, 100, 30);
        panel.add(texto4);
        
        JTextField texto5 = new JTextField();
        texto5.setBounds(450, 30, 100, 30);
        panel.add(texto5);
        
        JTextField texto6 = new JTextField();
        texto6.setBounds(460, 90, 100, 30);
        panel.add(texto6);
        
        JTextField texto7 = new JTextField();
        texto7.setBounds(80, 200, 100, 30);
        panel.add(texto7);
        
        Integer [] años = {1990,1991,1992,1993,1994,1995,1996,1997,1998,1999};
        JComboBox Listadesplegable = new JComboBox(años);
        Listadesplegable.setBounds(300, 200, 100, 30);
        panel.add(Listadesplegable);
        
        JTextField texto9 = new JTextField();
        texto9.setBounds(490, 200, 100, 30);
        panel.add(texto9);
        
        JTextField texto10 = new JTextField();
        texto10.setBounds(100, 250, 100, 30);
        panel.add(texto10);
        
        Integer [] años2 ={2000, 2001, 2002, 2003, 2004, 2005, 2006};
        JComboBox ListaDesplegable = new JComboBox(años2);
        ListaDesplegable.setBounds(310, 250, 100, 30);
        panel.add(ListaDesplegable);
        
        JTextField texto12 = new JTextField();
        texto12.setBounds(500, 250, 100, 30);
        panel.add(texto12);
        
        JTextField texto14 = new JTextField();
        texto14.setBounds(60, 350, 100, 30);
        panel.add(texto14);
        
        String [] parentesco = {"Esposo","Esposa","Padre","Madre","Hijo","Hermano"};
        JComboBox Desplegable = new JComboBox(parentesco);
        Desplegable.setBounds(250, 350, 100, 30);
        panel.add(Desplegable);
        
        JTextField texto16 = new JTextField();
        texto16.setBounds(430, 350, 100, 30);
        panel.add(texto16);
        
        JTextField texto17 = new JTextField();
        texto17.setBounds(60, 400, 100, 30);
        panel.add(texto17);
        
        String [] parentesco2 = {"Esposo","Esposa","Padre","Madre","Hijo","Hermano"};
        JComboBox Desplegable2 = new JComboBox(parentesco2);
        Desplegable2.setBounds(250, 400, 100, 30);
        panel.add(Desplegable2);
        
        JTextField texto19 = new JTextField();
        texto19.setBounds(430, 400, 100, 30);
        panel.add(texto19);
        
        // CREACION DE BOTONES.
        
        JButton boton1 = new JButton ("Guardar");
        boton1.setBounds(400, 500, 88, 30);                      
        panel.add(boton1);
        
        JButton boton2 = new JButton ("Agregar");
        boton2.setBounds(400, 450, 88, 30);                      
        panel.add(boton2);
        
        JButton boton3 = new JButton ("Salir");
        boton3.setBounds(490, 450, 88, 30);                      
        panel.add(boton3);
        
        JButton boton4 = new JButton ("Primero");
        boton4.setBounds(10, 450, 88, 30);                      
        panel.add(boton4);
        
        JButton boton5 = new JButton ("Anterior");
        boton5.setBounds(100, 450, 88, 30);                     
        panel.add(boton5);
        
        JButton boton6 = new JButton ("Siguiente");
        boton6.setBounds(190, 450, 88, 30);                      
        panel.add(boton6);
        
        JButton boton7 = new JButton ("Ultimo");
        boton7.setBounds(280, 450, 88, 30);                     
        panel.add(boton7);
    }
}