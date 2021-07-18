import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String nome;

		while (true) {
			System.out.print("Escreva seu nome: ");
			nome = scanner.nextLine();
			if (nome.length() >= 2)
				break;
		}

		System.out.println("Olá, " + nome);

		scanner.close();
	}

}
