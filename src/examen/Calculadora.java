package examen;

import javax.swing.JOptionPane;

public class Calculadora {

    double Altura;
    double Peso;
    String Sexo;
    int Edad;
    String ActFisica;

    public Calculadora(double altura, double peso, String sexo, int edad) {
        this.Altura = altura;
        this.Peso = peso;
        this.Sexo = sexo;
        this.Edad = edad;
    }

    public Calculadora(int edad, String sexo, String actfisica) {
        this.Edad = edad;
        this.Sexo = sexo;
        this.ActFisica = actfisica;

    }

    public double Calcular_IMC(double altura, double peso) {
        double imc;
        imc = peso / (Math.pow(altura, 2));
        return imc;
    }

    public void Calcular_IMC() {
        Sexo = Sexo.toUpperCase();
        String evaluador = "";
        double imc = Calcular_IMC(Altura, Peso);
        if (Sexo.equals("M")) {
            if (Edad <= 19) {
                //EN CASO DE QUE PUEDAN CON NIÑOS, AQUI
            } else if (Edad <= 39) {
                if (imc < 8) {
                    evaluador = "Bajo";
                } else if (imc < 21) {
                    evaluador = "Normal";
                } else if (imc <= 25) {
                    evaluador = "Alto";
                } else {
                    evaluador = "Muy alto";
                }

            } else if (Edad <= 59) {
                if (imc < 11) {
                    evaluador = "Bajo";
                } else if (imc < 22) {
                    evaluador = "Normal";
                } else if (imc <= 27) {
                    evaluador = "Alto";
                } else {
                    evaluador = "Muy alto";
                }

            } else if (Edad <= 79) {
                if (imc < 13) {
                    evaluador = "Bajo";
                } else if (imc < 26) {
                    evaluador = "Normal";
                } else if (imc <= 30) {
                    evaluador = "Alto";
                } else {
                    evaluador = "Muy alto";
                }

            }
        } else {
            if (Edad <= 19) {
                //EN CASO DE QUE PUEDAN CON NIÑAS, AQUI
            } else if (Edad <= 39) {
                if (imc < 21) {
                    evaluador = "Bajo";
                } else if (imc < 34) {
                    evaluador = "Normal";

                } else if (imc <= 38) {
                    evaluador = "Alto";
                } else {
                    evaluador = "Muy alto";
                }
            } else if (Edad <= 59) {
                if (imc < 23) {
                    evaluador = "Bajo";
                } else if (imc < 35) {
                    evaluador = "Normal";
                } else if (imc <= 40) {
                    evaluador = "Alto";
                } else {
                    evaluador = "Muy alto";
                }
            } else if (Edad <= 79) {
                if (imc < 24) {
                    evaluador = "Bajo";
                } else if (imc < 37) {
                    evaluador = "Normal";
                } else if (imc <= 41) {
                    evaluador = "Alto";
                } else {
                    evaluador = "Muy alto";
                }
            }
        }
        //La verdad no me quedó muy en claro donde vamos a mostrar estos datos, por eso los puse aquí

        JOptionPane.showMessageDialog(null, "Su Indice de Masa Corporal es: " + (int) imc + "\n y se considera: " + evaluador + ".");
    }

    public void CalcularCalorias(int edad, String sexo, String actfisica) {
        
        ActFisica = ActFisica.toUpperCase();
        System.out.println(ActFisica);        
        Sexo = Sexo.toUpperCase();
        System.out.println(Sexo);
        System.out.println(edad);
        if (edad >= 2 && edad <= 3) {
            if ("SEDENTARIA".equals(actfisica)) {
                System.out.println("aqui");
                JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1000");
            } else if ("MODERADA".equals(actfisica)) {
                JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1100");

            } else {
                JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1300");
            }
        } else if (edad >= 4 && edad <= 8) {
            if ("M".equals(sexo)) {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1000");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1300");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1500");
                }
            } else {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1000");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1100");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1200");
                }

            }

        } else if (edad >= 9 && edad <= 13) {
            if ("M".equals(sexo)) {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1600");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2300");
                }
            } else {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1400");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1800");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                }

            }

        } else if (edad >= 14 && edad <= 18) {
            if ("M".equals(sexo)) {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1900");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2400");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2800");
                }
            } else {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1600");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2200");
                }

            }

        }
      else if (edad >= 19 && edad <= 30) {
            if ("M".equals(sexo)) {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2100");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2700");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 3000");
                }
            } else {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1600");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2100");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2300");
                }

            }

        }
       else if (edad >= 31 && edad <= 60) {
            if ("M".equals(sexo)) {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2500");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2800");
                }
            } else {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1500");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2200");
                }

            }

        } 
       else {
             if ("M".equals(sexo)) {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2300");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2600");
                }
            } else {
                if ("SEDENTARIA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1400");
                } else if ("MODERADA".equals(actfisica)) {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 1800");
                } else {
                    JOptionPane.showMessageDialog(null, "Calorias que debes consumir de acuerdo a tus datos: 2000");
                }

            }
           
       }
    }

}
