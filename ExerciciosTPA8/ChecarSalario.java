package prjListaAulaIfElse;
import java.util.Scanner;

public class ChecarSalario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario;
		
		System.out.println("Insira o seu sal�rio:");
		salario = ler.nextDouble();
		
		if(salario >= 1302) {
			System.out.println("Seu sal�rio est� acima do m�nimo!");
		}else {
			System.out.println("Seu sal�rio est� abaixo do m�nimo!");
		}

	}

}
