package estruturaCondicional;
import java.util.Scanner;

public class Diasemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia;

		System.out.println("Infrome o número do dia da semana (1-7)");
		dia = ler.nextInt();

		if (dia == 1) {
			System.out.println("Hoje é domingo!");
		}
		else if (dia == 2) {
			System.out.println("Hoje é segunda!");
		}
		else if (dia == 3) {
			System.out.println("Hoje é terça!");
		}
		else if (dia == 4) {
			System.out.println("Hoje é quarta!");
		}
		else if (dia == 5) {
			System.out.println("Hoje é quinta!");
		}
		else if (dia == 6) {
			System.out.println("Hoje é sexta!");
		}
		else if (dia == 7) {
			System.out.println("Hoje é sábado!");
		}
		else {
			System.out.println("Número Inválido");
		}
		ler.close();
	}

}
