package estruturaCondicional;
import java.util.Scanner;

public class Comparandotexto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra1, palavra2;

		System.out.println("Infrome a primeira palavra: ");
		palavra1 = ler.next();
		System.out.println("Informe a segunda palavra: ");
		palavra2 = ler.next();

		if (palavra1.equals(palavra2)) {
			System.out.println("As palavras são iguais");
		}
		else {
			System.out.println("As palavras são diferentes");
		}
		ler.close();
	}

}
