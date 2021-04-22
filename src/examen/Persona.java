package examen;
import java.util.Scanner;

public class Persona {

    

    public void getPersona() {
    int Edad;
    String Sexo;
    double Peso;
    double Altura;
    String Nombre;
    String ActFisica;
    Scanner sc = new Scanner(System.in);
        System.out.println("edad");
        Edad = sc.nextInt();
        System.out.println("sexo");
        Sexo = sc.nextLine();
        sc.nextLine();
        System.out.println("peso");
        Peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("altura");
        Altura = sc.nextDouble();
        sc.nextLine();
        System.out.println("nombre");
        Nombre = sc.nextLine();
        System.out.println("actfisica");
        ActFisica = sc.nextLine();
        Calculadora calcu = new Calculadora(Altura, Peso, Sexo, Edad);
        calcu.Calcular_IMC();
    }
    

    public void Get_Datos() {
        
    }
}
