package classesProjetos;

public class ValidadorCPF {
  private ValidadorCPF() {}

  public static boolean isCpfValido(String cpf) {
    if(cpf != "" && cpf != null && cpf.length() == 11) {
      String[] numeros = cpf.split("");
      int[] numerosInt = new int[numeros.length];

      for(int i = 0; i < numeros.length; i++){
        if(numeros[i].equals("0") || numeros[i].equals("1") || numeros[i].equals("2") || numeros[i].equals("3") || numeros[i].equals("4") || numeros[i].equals("5") || numeros[i].equals("6") || numeros[i].equals("7") || numeros[i].equals("8") || numeros[i].equals("9")){
          numerosInt[i] = Integer.parseInt(numeros[i]);
        }
        else {
          return false;
        }
      }
      int soma = 0;
      for(int i=0; i<9; i++) {
        soma += numerosInt[i] * (10 - i);
      }
      int digito1 = 11 - (soma % 11);
      if(digito1 == 10 || digito1 == 11) {
        digito1 = 0;
      }

      if(digito1 == numerosInt[9]) {

        soma = 0;
        for(int i=0; i<10; i++) {
          soma += numerosInt[i] * (11 - i);
        }

        int digito2 = 11 - (soma % 11);
        if(digito2 == 10 || digito2 == 11) {
          digito2 = 0;
        }

        if(digito2 == numerosInt[10]) {
          return true;
        }
      }
      return false;


    }else { 
      return false;
    }
  }
}
