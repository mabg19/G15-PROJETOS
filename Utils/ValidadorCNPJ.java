package classesProjetos;

public class ValidadorCNPJ {
  private ValidadorCNPJ() {}

  public static boolean isCnpjValido(String cnpj) {
    if(cnpj != "" && cnpj != null && cnpj.length() == 14) {
      String[] numeros = cnpj.split("");
      int[] numerosInt = new int[numeros.length];

      for(int i = 0; i < numeros.length; i++){
        if(numeros[i].equals("0") || numeros[i].equals("1") || numeros[i].equals("2") || numeros[i].equals("3") || numeros[i].equals("4") || numeros[i].equals("5") || numeros[i].equals("6") || numeros[i].equals("7") || numeros[i].equals("8") || numeros[i].equals("9")){
          numerosInt[i] = Integer.parseInt(numeros[i]);
        }
        else {
          return false;
        }
      }

      int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
      int soma = 0;
      for(int i = 0; i < 12; i++) {
        soma += numerosInt[i] * pesos1[i];
      }

      int digito1 = 11 - (soma % 11);
      if(digito1 == 10 || digito1 == 11) {
        digito1 = 0;
      }

      if(digito1 == numerosInt[12]) {

        int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        soma = 0;
        for(int i = 0; i < 13; i++) {
          soma += numerosInt[i] * pesos2[i];
        }

        int digito2 = 11 - (soma % 11);
        if(digito2 == 10 || digito2 == 11) {
          digito2 = 0;
        }

        if(digito2 == numerosInt[13]) {
          return true;
        }
      }
      return false;

    } else { 
      return false;
    }
  }
}
