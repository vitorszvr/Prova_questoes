import java.util.Scanner;

public class Num_04 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        String menu = "1 - Cadastrar lista\n" +
	                "2 - Buscar por um produto e mostrar quantidade que precisar ser comprada\n" +
	                "3 - Listar todos os produtos que precisam ser compradas com mais de 10 unidades\n" +
	                "4 - Sair";

			int op;
			int N = 100;
			int[] quantidades = new int[N];
			String[] nomes = new String[N];
			int count = 0;

			do {
				System.out.println(menu);
				op = sc.nextInt();

				if (op == 1) {
					if (count < N) {
						System.out.println("Nome do Produto:");
						nomes[count] = sc.next();
						System.out.println("Quantidade a ser comprada:");
						quantidades[count] = sc.nextInt();
						count++;
					} else
						System.out.println("Memória Cheia");
				}

				if (op == 2) {
					System.out.println("Qual nome do produto?");
					String nomeBusca = sc.next();
					boolean encontrou = false;
					for (int i = 0; i < count; i++) {
						if (nomes[i].equalsIgnoreCase(nomeBusca)) {
							System.out.println("Nome: " + nomes[i] + ", Quantidade para comprar: " + quantidades[i]);
							encontrou = true;
						}
					}
					if (!encontrou)
						System.out.println("Nome não encontrado");
				}
				if (op == 3) {
					for (int i = 0; i < count; i++) {
						if (quantidades[i] > 10) {
							System.out.println("Nome: " + nomes[i] + ", Quantidade para comprar: " + quantidades[i]);
						}
					}

				}

			} while (op != 4);

			sc.close();
		}

	}
