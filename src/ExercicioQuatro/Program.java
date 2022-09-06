package ExercicioQuatro;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);

		int n, qtdpares;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = entradaDados.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entradaDados.nextInt();
		}

		System.out.println("\nNUMEROS PARES:");

		qtdpares = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d  ", vetor[i]);
				qtdpares++;
			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

		entradaDados.close();
	}
}
