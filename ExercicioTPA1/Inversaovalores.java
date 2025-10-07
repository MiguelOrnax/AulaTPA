package prjAula002;
import java.util.Scanner;

public class Inversaovalores {

public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	int valora,valorb,valorc;
	
	System.out.println("Valor de valora");
	valora= ler.nextInt();
	
	System.out.println("Valora de valorb");
	valorb= ler.nextInt();
	
	valorc=valora;
	valora=valorb;
	valorb=valorc;
	
	System.out.println("valor de a" +valora);
	
	System.out.println("valor de b" +valorb);
}

}
