import java.util.Locale;
import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
//Esse e um projeto com Quatro exemplos	
//de repeti��es		
		
		
		   

		
		 // 1� EXEMPLO E WHELI
		//REPETI�A� crescente/decr.
		//O comando e"x" ou "y" e espe�o depois o outro valor
		
		      
		       
		      
		        /*+++++++++++++++++++++++++++++++++++

		 int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		while(x != y) {
			if(x < y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrecente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		       
		       
		       
		      
+++++++++++++++++++++++++++++*/
		
		
		
		
		
		
		// 2� EXEMPLO DE REPETICAO
	//voc� vai digitando valores at�
//Digitar o zero,chegando no zero
//para e vem o resultado da soma.
		      
		
		
		      /*�����������������������
		
		int x = sc.nextInt();
		int soma = 0;
		
		 while( x != 0) {
			 soma = soma + x;
			 
			x =sc.nextInt();
		 }
		 
		 System.out.println(soma);
		       
		       
�������������������������*/
		       
		       
		
		
		
		//  3� Exemplo 
//Mostra o menor numero de tr�s numeros digitados
		
		
                /***********************************		
 
        int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.println(" MENOR =" + a);
	    }else if(b < c) {
	    	System.out.println("MENOR =" + b);
	    }else {
	    	System.out.println("MENOR =" + c);
	    }        

              
***************************/
		
			
		
		
       // 4� Exemplo
	//E mostrado a nota,media e se foi aprovado/reprovado
		
		                 
		        
		System.out.println("Bom dia ");
		System.out.println("Esse e um programa de media escolar.");
		System.out.println("Por favor siga os comandos.");
                    
		System.out.println("Digite a primeira nota:\n");
              double nota1 = sc.nextDouble();
        System.out.println("Digite a segund  nota:\n");
		      double nota2 = sc.nextDouble();
	    System.out.println("Digite a terceira nota:\n");      
		      double nota3 = sc.nextDouble(); 
		      
		      double media;
		      media = 3;
		      media =(nota1 + nota2 + nota3) / media;
		      double notaFinal;
		      notaFinal = ( nota1 + nota2 + nota3) / 3;
		      
		      System.out.printf("Media = %.1f\n " ,media);
		      System.out.printf( "Nota Final = %.1f \n" , notaFinal);
		      if(notaFinal < 60) {
			  System.out.println("Aluno Reprovado");
		      }else {
			  System.out.println("Voc� esta aprovado");
			  
	
		}           
		            
		             
		

		
		
		
		sc.close();
		
	}
	
	

}
