import java.util.Scanner;

public class Num_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 2;
		int AlunasSistemas = 0;
		int TotalAlunosSistemas = 0;
		

		for (int i = 0; i < N; i++) {
			System.out.println("Sexo:");
            String sexos = sc.nextLine();
            System.out.println("Curso:");
            String cursos = sc.nextLine();

            if (sexos.equalsIgnoreCase("f") && cursos.equalsIgnoreCase("sistemas de informação")) {
                AlunasSistemas++;
            }
            if (cursos.equalsIgnoreCase("sistemas de informação")) {
				TotalAlunosSistemas++;
			}
        }
		
		double PercentualSI = (double) TotalAlunosSistemas/N *100;
		
		System.out.println("Alunas no curso de S.I. : " + AlunasSistemas);
		System.out.println("Percentual que cursam S.I. :" + PercentualSI + "%");

		
		

		sc.close();
	}
}
