package prjAulabadass;

import java.util.Scanner;
public class Notausuario {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double nota1, nota2, nota3, nota4, mi, nm, exame;
		
		System.out.println ("Digite a nota 1:");
        nota1 = ler. nextDouble (); //leia(nota1)
        
        System.out.println ("Digite a nota 2:");
        nota2 = ler. nextDouble (); //leia(nota2)
        
        System.out.println ("Digite a nota 3:");
        nota3 = ler. nextDouble (); //leia(nota3)
        
        System.out.println ("Digite a nota 4:");
        nota4 = ler. nextDouble (); //leia(nota4)
        
        mi = (nota1 + nota2 + nota3 + nota4)/4;//cálculo da média
        System.out.println ("Sua média é: "+ mi);
        
        
       if (mi>=7) {
           System.out.println ("Aprovado");
       } else if (mi<5) {
    	   System.out.println ("Reprovado");
       } else {
    	   System.out.println ("Exame");
           
          exame = ler. nextDouble ();
          
          nm = (mi + exame)/2;
    	   
    	  if(nm>=7) {
    		  System.out.println ("Aprovado em exame");
    	  }else {
    		  System.out.println ("Reprovado em exame");
    	  }
    	   
       }
       ler.close();
	}
}
