package examen;
import javax.swing.JOptionPane;
public class Calculadora {
    double Altura;
    double Peso;
    String Sexo;
    int Edad;

    public Calculadora(double altura, double peso, String sexo, int edad) {
        this.Altura = altura;
        this.Peso = peso;
        this.Sexo = sexo;
        this.Edad = edad;
    }
    public void mostrarCalculadora(){
        Calcular_IMC();
        Calcular_Kcl();
    }

    public double Calcular_IMC(double altura, double peso) {
        double imc;
        imc = peso/(Math.pow(altura, 2));
        return imc;
    }
    public void Calcular_IMC() {
        Sexo = Sexo.toUpperCase();
        String evaluador="";
        double imc = Calcular_IMC(Altura,Peso); 
        if (Sexo.equals("M")) {
            if (Edad<=19){
                //EN CASO DE QUE PUEDAN CON NIÑOS, AQUI
            }
            else if(Edad<=39) {
                if (imc<8) {
                    evaluador = "Bajo";
                }
                else if (imc<21) {
                    evaluador = "Normal";
                }
                else if (imc<=25) {
                    evaluador = "Alto";
                }
                else  {
                    evaluador = "Muy alto";
                }
               
            }
            else if(Edad<=59){
                if (imc<11) {
                    evaluador = "Bajo";
                }
                else if (imc<22) {
                    evaluador = "Normal";
                }
                else if (imc<=27) {
                    evaluador = "Alto";
                }
                else {
                    evaluador = "Muy alto";
                }
               
                
            }
            else if(Edad<=79){
                     if (imc<13) {
                    evaluador = "Bajo";
                }
                else if (imc<26) {
                    evaluador = "Normal";
                }
                else if (imc<=30) {
                    evaluador = "Alto";
                }
                else{
                    evaluador = "Muy alto";
                }
               
                
            }
        }
        else {
            if (Edad<=19){
                //EN CASO DE QUE PUEDAN CON NIÑAS, AQUI
            }
            else if(Edad<=39) {
               if (imc<21) {
                    evaluador = "Bajo";
                }
                else if (imc<34) {
                    evaluador = "Normal";
                    
                }
                else if (imc<=38) {
                    evaluador = "Alto";
                }
                else {
                    evaluador = "Muy alto";
                }
            }
            else if(Edad<=59){
                  if (imc<23) {
                    evaluador = "Bajo";
                }
                else if (imc<35) {
                    evaluador = "Normal";
                }
                else if (imc<=40) {
                    evaluador = "Alto";
                }
                else {
                    evaluador = "Muy alto";
                }
            }
            else if(Edad<=79){
                   if (imc<24) {
                    evaluador = "Bajo";
                }
                else if (imc<37) {
                    evaluador = "Normal";
                }
                else if (imc<=41) {
                    evaluador = "Alto";
                }
                else {
                    evaluador = "Muy alto";
                }
            }
        }
        //La verdad no me quedó muy en claro donde vamos a mostrar estos datos, por eso los puse aquí
        
        JOptionPane.showMessageDialog(null,"Su Indice de Masa Corporal es: "+(int)imc+"\n y se considera: "+evaluador+"."); 
        System.out.println(Edad);
        System.out.println(Sexo);
        System.out.println(imc);
    }

    public void Calcular_Kcl() {
        
    }
}
