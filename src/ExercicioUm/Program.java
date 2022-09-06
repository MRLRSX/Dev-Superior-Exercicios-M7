package ExercicioUm;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
	    n = entradaDados.nextInt();

	    int[] vetor = new int[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = entradaDados.nextInt();
	    }

	    System.out.println("NUMEROS NEGATIVOS:");

	    for (int i=0; i<n; i++) {
	        if (vetor[i] < 0) {
	        	System.out.printf("%d\n", vetor[i]);
	        }
	    }

		entradaDados.close();
	
	}
}
