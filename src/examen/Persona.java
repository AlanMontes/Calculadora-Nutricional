package examen;
import javax.swing.JOptionPane;

public class Persona {

    

    public void getPersona() {
    int Edad;
    String Sexo;
    double Peso;
    double Altura;
    String Nombre;
    String ActFisica;
    
        Nombre = JOptionPane.showInputDialog(null,"Introduce tu Nombre: ");
        Edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce tu edad: "));
        Sexo = JOptionPane.showInputDialog(null,"Introduce tu sexo: ");                 
        Peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce tu peso: "));
        Altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce tu altura en metros: "));        
        ActFisica = JOptionPane.showInputDialog(null,"Introduce la  : ' SEDENTARIA   MODERADA  ACTIVA ' ");            
        Calculadora calcu = new Calculadora(Altura, Peso, Sexo, Edad);
        calcu.Calcular_IMC();
    }
    

    public void Get_Datos() {
        
    }
}
