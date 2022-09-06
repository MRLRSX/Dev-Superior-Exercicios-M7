package ExercicioDois;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = entradaDados.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = entradaDados.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}

		media = soma / n;

		System.out.print("VALORES = ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}

		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);

		entradaDados.close();
	}
}
