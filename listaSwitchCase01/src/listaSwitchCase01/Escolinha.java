package listaSwitchCase01;

import java.util.Scanner;

public class Escolinha {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int id;
	
	System.out.println("Digite a idade:");
	id = ler.nextInt();
	switch (id) {
	case 6:
		System.out.println("Categoria: Dente de leite");
		break;
	case 7:
		System.out.println("Categoria: Júnior");
		break;
	case 8:
		System.out.println("Categoria: Júnior Max");
		break;
	case 9:
		System.out.println("Categoria: Júnior Master");
		break;
	case 10:
		System.out.println("Categoria: Master");
		break;	
	default:
		System.out.println("Não aceitamos.");
		break;
	}
	

	}

}