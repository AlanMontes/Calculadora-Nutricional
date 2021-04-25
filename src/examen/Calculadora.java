package examen;
/*Se importa la libreria javax.swing.JOptionPane */ 
import javax.swing.JOptionPane;

/*Declaración de la clase*/ 
public class Calculadora {
//dahdbhbsddbaskdbkdbadbkabdkajbdbkjbdkj
/*Declaración de las variables globales */ 
    private double Altura;
    private double Peso;
    private String Sexo;
    private int Edad;
    private String ActFisica;

/*Se crea el metodo constructor de Calculadora con los parametros altura, peso, sexo y edad*/     
    public Calculadora(double altura, double peso, String sexo, int edad) {
      /*Se hace referencia a las variables globales*/ 
        this.Altura = altura;
        this.Peso = peso;
        this.Sexo = sexo;
        this.Edad = edad;
    }
/*Se crea el metodo constructor de Calculadora con los parametros edad, sexo, actfisica*/ 
    public Calculadora(int edad, String sexo, String actfisica) {
       /*Se hace referencia a las variables globales*/ 
        this.Edad = edad;
        this.Sexo = sexo;
        this.ActFisica = actfisica;
    }
/*El metodo constructor Calculadora utiliza sobrecargar */
    
/*Se incializa el metodo Calcular_IMC que retornara un valor de tipo double y tienes los parametros de altura y peso*/  
    public double Calcular_IMC(double altura, double peso) {
        double imc;
        imc = peso / (Math.pow(altura, 2));
        return imc;
    }

/*Se incializa el metodo Calcular_IMC pero sin parametros generando una sobrecarga de matodos*/  
    public void Calcular_IMC() {
    /*Sexo se iguala con el metodo toUpperCase que hara mayusculas las letras*/          
        Sexo = Sexo.toUpperCase();
    /*Se le asigna un valor tipo String al atributo evalueador*/    
        String evaluador = "";
    /*Se crea la variable imc y se iguala con el metodo Calcular_IMC */
        double imc = Calcular_IMC(Altura, Peso);
    /*Anidados condicionales que la asignan un valor a evaluador dependiendo del sexo, la edad y el IMC*/     
        if (Sexo.equals("M")) {
/*NIÑOS*/   if (Edad <= 10){ if(imc<=13.7){evaluador = "Bajo";}else if(imc<=16.4){evaluador = "Normal";}else if (imc<21.4){evaluador = "Alto";}else{evaluador = "Muy alto";}                
            }
            else if(Edad == 11){if(imc<=14.1){evaluador = "Bajo";}else if(imc<=16.9){evaluador = "Normal";}else if (imc<22.5){evaluador = "Alto";}else{evaluador = "Muy alto";}
            }
            else if(Edad == 12){if(imc<=14.5){evaluador = "Bajo";}else if(imc<=17.5){evaluador = "Normal";}else if (imc<23.6){evaluador = "Alto";}else{evaluador = "Muy alto";}
            }
            else if(Edad == 13){if(imc<=14.9){evaluador = "Bajo";}else if(imc<=18.2){evaluador = "Normal";}else if (imc<24.8){evaluador = "Alto";}else{evaluador = "Muy alto";}
            }
            else if(Edad == 14){if(imc<=15.5){evaluador = "Bajo";}else if(imc<=19){evaluador = "Normal";}else if (imc<25.9){evaluador = "Alto";}else{evaluador = "Muy alto";}
            }
            else if(Edad == 15){if(imc<=16){evaluador = "Bajo";}else if(imc<=19.8){evaluador = "Normal";}else if (imc<27){evaluador = "Alto";}else{evaluador = "Muy alto";}
            }
            else if(Edad == 16){if(imc<=16.5){evaluador = "Bajo";}else if(imc<=20.5){evaluador = "Normal";}else if (imc<27.9){evaluador = "Alto";}else{evaluador = "Muy alto";}
            }
            else if(Edad == 17){if(imc<=16.9){evaluador = "Bajo";}else if(imc<=21.1){evaluador = "Normal";}else if (imc<28.6){evaluador = "Alto";}else{evaluador = "Muy alto";}
            }
            else if(Edad == 18){if(imc<=17.3){evaluador = "Bajo";}else if(imc<=21.7){evaluador = "Normal";}else if (imc<29.2){evaluador = "Alto";}else{evaluador = "Muy alto";}
            }
/*ADULTOS*/ else if(Edad<=39){if (imc<8) {evaluador = "Bajo"; }else if (imc<21) {evaluador = "Normal";}else if (imc<=25) {evaluador = "Alto";}else  {evaluador = "Muy alto";}              
            }
            else if(Edad<=59){if (imc<11) {evaluador = "Bajo";}else if (imc<22) {evaluador = "Normal";}else if (imc<=27){evaluador = "Alto";}else{evaluador = "Muy alto";}                            
            }
            else if(Edad<=79){if (imc<13) {evaluador = "Bajo";}else if (imc<26) {evaluador = "Normal";}else if (imc<=30) {evaluador = "Alto";}else{evaluador = "Muy alto";}                               
            }
}else {/*Mujeres*/
/*Niñas*/       if (Edad <= 10){ if(imc<=13.5){evaluador = "Bajo";}else if(imc<=16.6){evaluador = "Normal";}else if (imc<22.6){evaluador = "Alto";}else{evaluador = "Muy alto";}                
                }
                else if(Edad == 11){if(imc<=13.9){evaluador = "Bajo";}else if(imc<=17.2){evaluador = "Normal";}else if (imc<23.7){evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
                else if(Edad == 12){if(imc<=14.4){evaluador = "Bajo";}else if(imc<=18){evaluador = "Normal";}else if (imc<25){evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
                else if(Edad == 13){if(imc<=14.9){evaluador = "Bajo";}else if(imc<=18.8){evaluador = "Normal";}else if (imc<26.2){evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
                else if(Edad == 14){if(imc<=15.4){evaluador = "Bajo";}else if(imc<=19.6){evaluador = "Normal";}else if (imc<27.3){evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
                else if(Edad == 15){if(imc<=15.9){evaluador = "Bajo";}else if(imc<=20.2){evaluador = "Normal";}else if (imc<28.2){evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
                else if(Edad == 16){if(imc<=16.2){evaluador = "Bajo";}else if(imc<=20.7){evaluador = "Normal";}else if (imc<28.9){evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
                else if(Edad == 17){if(imc<=16.4){evaluador = "Bajo";}else if(imc<=21){evaluador = "Normal";}else if (imc<29.3){evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
                else if(Edad == 18){if(imc<=16.4){evaluador = "Bajo";}else if(imc<=21.3){evaluador = "Normal";}else if (imc<29.5){evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
/*ADULTAS*/     else if(Edad<=39){if (imc<21){evaluador = "Bajo";}else if (imc<34){evaluador = "Normal";}else if (imc<=38) {evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
                else if(Edad<=59){if (imc<23) {evaluador = "Bajo";}else if (imc<35) {evaluador = "Normal";}else if (imc<=40){evaluador = "Alto";}else{evaluador = "Muy alto";}
                }
                else if(Edad<=79){if (imc<24){evaluador = "Bajo";}else if (imc<37){evaluador = "Normal";}else if (imc<=41) {evaluador = "Alto";}else {evaluador = "Muy alto";}
                }
 }
        /*Se muestra en una ventana el resultado del IMC y su clasificación*/ 
        JOptionPane.showMessageDialog(null, "Su Indice de Masa Corporal es: " + (int) imc + "\n y se considera: " + evaluador + ".");
    }
        /*Se crea el metodo CalcularCalorias*/ 
    public void CalcularCalorias(int edad, String sexo, String actfisica) {
        
        /*Los atributos AcrFisica y Sexo se igualan con el metodo toUpperCase que convertira las letras a mayusculas*/ 
        ActFisica = ActFisica.toUpperCase();
        Sexo = Sexo.toUpperCase();
        
        /*Anidados condicionales que dependen del sexo, la edad y la actfisica*/  
        if (edad >= 2 && edad <= 3) {
            if ("SEDENTARIA".equals(ActFisica)) {
                JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1000");
            } else if ("MODERADA".equals(ActFisica)) {
                JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1100");

            } else {
                JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1300");
            }
        } else if (edad >= 4 && edad <= 8) {
            if ("M".equals(Sexo)) {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1000");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1300");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1500");
                }
            } else {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1000");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1100");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1200");
                }

            }

        } else if (edad >= 9 && edad <= 13) {
            if ("M".equals(Sexo)) {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1600");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2300");
                }
            } else {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1400");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1800");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                }

            }

        } else if (edad >= 14 && edad <= 18) {
            if ("M".equals(Sexo)) {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1900");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2400");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2800");
                }
            } else {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1600");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2200");
                }

            }

        }
      else if (edad >= 19 && edad <= 30) {
            if ("M".equals(Sexo)) {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2100");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2700");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 3000");
                }
            } else {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1600");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2100");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2300");
                }

            }

        }
       else if (edad >= 31 && edad <= 60) {
            if ("M".equals(Sexo)) {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2500");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2800");
                }
            } else {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1500");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2200");
                }

            }

        } 
       else {
             if ("M".equals(Sexo)) {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2300");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2600");
                }
            } else {
                if ("SEDENTARIA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1400");
                } else if ("MODERADA".equals(ActFisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1800");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                }
            }      
       }
    }
}
