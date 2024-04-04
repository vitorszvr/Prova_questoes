import java.util.Scanner;

public class Num_02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	 String menu = "1 - Cadastrar eletrodomesticos\n" +
             "2 - Listar todos os eletrodomesticos cadastrados\n" +
             "3 - Digite quantidade de horas e mostrara o consumo\n" +
             "4 - Sair";

		int N = 20;
		int op;
		int[] consumos = new int[N];
		String[] nomes = new String[N];
		int count = 0;

		do {
			System.out.println(menu);
			op = sc.nextInt();

			if (op == 1) {
				if (count < N) {
					System.out.println("Nome do eletrodomestico:");
					nomes[count] = sc.next();
					System.out.println("Consumo em watts:");
					consumos[count] = sc.nextInt();
					count++;
				} else
					System.out.println("Memória Cheia, Limite de 20 eletrodomesticos.");
			}
			if (op == 2) {
				for (int i = 0; i < count; i++) {
					System.out.println("Nome: " + nomes[i] + ", Consumo: " + consumos[i] + " watts");
				}
			}
			if (op == 3) {
				System.out.println("Digite quantidade de horas:");
				int horas = sc.nextInt();
				int consumoTotal = 0;
				for (int i = 0; i < count; i++) {
					consumoTotal += consumos[i];
				}
				System.out.println("Consumos total de " + (consumoTotal * horas) + " watts em " + horas + " horas");
			}

		} while (op != 4);

		sc.close();
	}
}
