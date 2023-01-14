package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}

		double media = 0;
		for (int i = 0; i < n; i++) {
			media += vetor[i];
		}

		double resultado = media / n;
		System.out.printf("AVAREGE HEIGHT: %.2f%n", resultado);

		sc.close();
	}

}
