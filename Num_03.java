import java.util.Scanner;

public class Num_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite tamanho dos vetores:");
		int tamanhoVetor = sc.nextInt();

		int[] vetorA = new int[tamanhoVetor];
		int[] vetorB = new int[tamanhoVetor];

		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite o valor do elemento " + (i + 1) + " do vetor A: ");
			vetorA[i] = sc.nextInt();
		}

		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite o valor do elemento " + (i + 1) + " do vetor B: ");
			vetorB[i] = sc.nextInt();
		}

		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Elemento " + (i + 1));

			System.out.println(" Soma: " + (vetorA[i] + vetorB[i]));
			System.out.println(" Subtracao: " + (vetorA[i] - vetorB[i]));
			System.out.println(" Multiplicacao: " + (vetorA[i] * vetorB[i]));
			if (vetorB[i] != 0) {
				System.out.println(" Divisao: " + ((double) vetorA[i] / vetorB[i]));
			} else {
				System.out.println("Nao é possivel dividir por zero");
			}

		}

		sc.close();
	}
}
