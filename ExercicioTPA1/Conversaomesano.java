package prjAula002;
import java.util.Scanner;
public class Conversaomesano {
	
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	int dias, mes, ano;
	
	System.out.println("valor de dias");
	dias= ler.nextInt();
	
	
	
	mes=dias/30;
	ano=mes/12;
	ano=dias/365;
	
	System.out.println("valor de" +mes);
	
	System.out.println("valor de" +ano);
}

}
