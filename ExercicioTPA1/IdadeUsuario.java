package prjAula002;
import java.util.Scanner;

public class IdadeUsuario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite seu ano de nascimento:");
		anoNasc = ler.nextInt();
		
		System.out.println("Digite o ano atual");
		anoAtual = ler.nextInt();
		
		idade=anoAtual-anoNasc;
		
		System.out.println(idade);
		
		
	}
}
