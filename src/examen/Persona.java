package examen;
import javax.swing.JOptionPane;

public class Persona {

    /*El metodo getPersona solcita los datos Edad, Sexo, Peso, Altura, Nombre, ActFisica */
    public void getPersona() {
    int Edad;
    String Sexo;
    double Peso;
    double Altura;
    String Nombre;
    String ActFisica;
    
    /*Se introducen los datos por medio de una ventana de dialogo y se convierten en su tipo de dato correspondiente*/  
        Nombre = JOptionPane.showInputDialog(null,"Introduce tu Nombre: ");
        Edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce tu edad: "));
        Sexo = JOptionPane.showInputDialog(null,"Introduce tu sexo (M o F): ");                 
        Peso = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce tu peso en Kg: "));
        Altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce tu altura en metros: "));        
        ActFisica = JOptionPane.showInputDialog(null,"Introduce tu actividad fisica :\n' SEDENTARIA   MODERADA  ACTIVA ' ");            
    
    /*Se crea un objeto de la clase Calculadora llamado calcu con los parametros de Altura, Peso, Sexo, Edad */   
        Calculadora calcu = new Calculadora(Altura, Peso, Sexo, Edad);
    /*El objeto calcu utiliza el metodo Calcular_IMC */      
        calcu.Calcular_IMC();
    /*Se crea un objeto de la clase Calculadora llamado calorias con los parametros de Edad, Sexo, ActFisica */      
        Calculadora calorias= new Calculadora(Edad, Sexo, ActFisica);
    /*El objeto calorias utiliza el metodo CalcularCalorias */      
        calorias.CalcularCalorias(Edad, Sexo, ActFisica);     
    }
}
