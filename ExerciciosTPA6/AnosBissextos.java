import java.util.Scanner;

public class AnosBissextos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int anoInicial, anoFinal, i,qtdAnobissexto;
        qtdAnobissexto = 0;
		
        anoInicial = ler.nextInt();
        anoFinal = ler.nextInt();
        i = anoInicial;
       
        while(i<=anoFinal) {
    	    if(i%4 == 0) {
    	    	System.out.println(i);
    	    	qtdAnobissexto++;
    	    }
    	    i++;
        }
     	System.out.println("quantidade de anos bissextos: "+qtdAnobissexto);
       
       
     	ler.close();	
     }
}
