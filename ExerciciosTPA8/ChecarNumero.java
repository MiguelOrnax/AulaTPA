package prjListaAulaIfElse;
import java.util.Scanner;

public class ChecarNumero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n;
		
		System.out.println("Insira um n�mero:");
		n = ler.nextDouble();
		
		if(n > 0) {
			System.out.println("O n�mero � positivo.");
		}else if(n == 0) {
			System.out.println("O n�mero � neutro.");
		}else {
			System.out.println("O n�mero � negativo");
		}

	}
}