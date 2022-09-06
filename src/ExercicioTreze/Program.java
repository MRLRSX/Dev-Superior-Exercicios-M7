package ExercicioTreze;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner entradaDados = new Scanner(System.in);
	
	String[] vect = new String[] {"LUCAS ROCHA DOS SANTOS", "ANNA CLARA BERNARDINO ROCHA"};
	
	for(String nomes : vect) {
		System.out.println(nomes);
	}
	
	entradaDados.close();
}
}
