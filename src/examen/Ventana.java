package examen;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JFrame;

public class Ventana extends JFrame {
 private JLabel texto;           // etiqueta o texto no editable
    private JTextField caja;        // caja de texto, para insertar datos
    private JButton boton;          // boton con una determinada accion

    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Ejemplo de tabla de alimentos");                   // colocamos titulo a la ventana
        this.setSize(600, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(true);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        // configuramos los componentes
        texto.setText("\n\tCereales y Tubérculos\t\n\tarroz blanco cocido\t\t1/2 taza\t70kcal");    // colocamos un texto a la etiqueta
        texto.setBounds(0, 0, 600, 600);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
       caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
      /*   boton.setText("Mostrar Mensaje");   // colocamos un texto al boton
        boton.setBounds(50, 100, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
        
        this.add(caja);
        this.add(boton);
*/
      this.add(texto);
    }

    }


