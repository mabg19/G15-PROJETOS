package classesProjetos;

public class StringUtils {
	
	private StringUtils(){}
	
	public static boolean isVaziaOuNula(String valor) {
		if (valor == null || valor == "") {
			return true;
		}else {
			return false;
		}
	}
}
