package listaSwitchCase01;

import java.util.Scanner;

public class Signo {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int d,m;
	
	System.out.println("Digite o dia:");
	d = ler.nextInt();
	System.out.println("Digite o mês:");
	m = ler.nextInt();
	switch (m) {
		case 1:
			if (d<=20) { 
				System.out.println("Seu signo é Capricórnio.");
				break;
			} else {
				System.out.println("Seu signo é Aquário");
				break;
			}
		case 2:
			if (d<=19) { 
				System.out.println("Seu signo é Aquário.");
				break;
			} else {
				System.out.println("Seu signo é Peixes");
				break;
			}
		case 3:
			if (d<=20) { 
				System.out.println("Seu signo é Peixes.");
				break;
			} else {
				System.out.println("Seu signo é Áries");
				break;
			}
		case 4:
			if (d<=20) { 
				System.out.println("Seu signo é Áries.");
				break;
			} else {
				System.out.println("Seu signo é Touro");
				break;
			}
		case 5:
			if (d<=20) { 
				System.out.println("Seu signo é Touro.");
				break;
			} else {
				System.out.println("Seu signo é Gêmeos");
				break;
			}
		case 6:
			if (d<=20) { 
				System.out.println("Seu signo é Gêmeos.");
				break;
			} else {
				System.out.println("Seu signo é Câncer");
				break;
			}
		case 7:
			if (d<=21) { 
				System.out.println("Seu signo é Câncer.");
				break;
			} else {
				System.out.println("Seu signo é Leão");
				break;
			}
		case 8:
			if (d<=22) { 
				System.out.println("Seu signo é Leão.");
				break;
			} else {
				System.out.println("Seu signo é Virgem");
				break;
			}
		case 9:
			if (d<=22) { 
				System.out.println("Seu signo é Virgem.");
				break;
			} else {
				System.out.println("Seu signo é Libra");
				break;
			}
		case 10:
			if (d<=22) { 
				System.out.println("Seu signo é Libra.");
				break;
			} else {
				System.out.println("Seu signo é Escorpião");
				break;
			}
		case 11:
			if (d<=21) { 
				System.out.println("Seu signo é Escorpião.");
				break;
			} else {
				System.out.println("Seu signo é Sagitário");
				break;
			}
		case 12:
			if (d<=21) { 
				System.out.println("Seu signo é Sagitário.");
				break;
			} else {
				System.out.println("Seu signo é Capricórnio");
				break;
			}
		default: System.out.println("Mês inválido");
				break;
	}			
	}

}
