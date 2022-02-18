package desafioProgramacaoCapgemini;

/*
 * @author 		Thalysson Wilson de Sousa Borges
 * gitHub: 		https://github.com/thalyssonborges/
 * LinkedIn: 	https://www.linkedin.com/in/thalysson-borges/
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_03 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavra = sc.next();  
									
		
		List<String> anagrama = new ArrayList<>();
		
		for(int i = 0; i< palavra.length(); i++) {
			for(int j = 0; j<palavra.length(); j++) {
				if(palavra.charAt(i) == palavra.charAt(j) && i!=j && i<j) { 	//verifica se tem alguma letra a frente repetida
					
					if(palavra.charAt(i) == palavra.charAt(i+1)) { 				//verifica se a letra é igual a próxima letra
						String letra1 = palavra.substring(i, i+1);
						anagrama.add(letra1);
						
					}else {
						String letra2 = palavra.substring(i, j); 
						String letra3 = palavra.substring(i+1, j+1);
						String letra4 = palavra.substring(i, i+1);
						
						anagrama.add(letra4);
						anagrama.add(letra3);
						anagrama.add(letra2);
						
						
					}
				}
				
				
			}
			
		}
		
		System.out.println(anagrama.size());
		
	}

}
