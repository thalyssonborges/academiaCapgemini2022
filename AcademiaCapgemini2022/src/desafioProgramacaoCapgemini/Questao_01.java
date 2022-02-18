package desafioProgramacaoCapgemini;

/*
 * @author 		Thalysson Wilson de Sousa Borges
 * gitHub: 		https://github.com/thalyssonborges/
 * LinkedIn: 	https://www.linkedin.com/in/thalysson-borges/
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Questao_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		for(int i = 0; i < n; i++) {  	// linha
			for(int j=n; j>i; j--) {	// coluna
				if((j-1)>i) {
					System.out.printf(" ");  
				}else {
					for (int k = 0; k < j; k++) {
						System.out.printf("*");
					}
				}
			}
			System.out.println();
		}
		
		
		


	}

}
