package CalculadoraImc;



public class SetIMC {

    final private double peso;
    final private double altura;

    public SetIMC(double p, double a ){
        this.peso = p;
        this.altura = a;
    }


    private double calculaimc( double peso, double altura ){
        return (peso / (altura * altura));
    }

    private String estadoNutricional(double imc ){

        if (imc < 10) {  return "Desnutricao Grau V";  }
        else{
            if (imc < 12.9) {  return "Desnutricao Grau IV";  }
            else{
                if (imc < 15.9) {  return "Desnutricao Grau III";  }
                else{
                    if (imc < 16.9) {  return "Desnutricao Grau II";  }
                    else{
                        if (imc < 18.4) {  return "Desnutricao Grau I";  }
                        else{
                            if (imc < 24.9) {  return "Normal";  }
                            else{
                                if (imc < 29.9) {  return "Pre-obesidade";  }
                                else{
                                    if (imc < 34.5) {  return "Obesidade Grau I";  }
                                    else{
                                        if (imc < 39.9) {  return "Obesidade Grau II";  }
                                        else{
                                            return "Obesidade Grau III";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private String setindicemass(){
        double imc = calculaimc(this.peso, this.altura);
        return "IMC = "+ String.format("%.2f", imc) + "\n" + estadoNutricional(imc);
    }

    public String getIndiceMass(){
        return setindicemass();
    }

}
