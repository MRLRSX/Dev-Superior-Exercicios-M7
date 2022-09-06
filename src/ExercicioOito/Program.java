package ExercicioOito;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);

		int n, somapares = 0, npares = 0;
		double mediapares;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = entradaDados.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entradaDados.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				somapares = somapares + vetor[i];
				npares++;
			}
		}

		if (npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediapares = (double) somapares / npares;

			System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
		}

		entradaDados.close();
	}
}
