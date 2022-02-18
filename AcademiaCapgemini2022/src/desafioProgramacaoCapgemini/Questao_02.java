package desafioProgramacaoCapgemini;

/*
 * @author 		Thalysson Wilson de Sousa Borges
 * gitHub: 		https://github.com/thalyssonborges/
 * LinkedIn: 	https://www.linkedin.com/in/thalysson-borges/
 */


import java.util.Scanner;


public class Questao_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String senha = sc.next();
		String[] caracteresEspeciais = {"!","@","#","$","%","^","&","*","(",")","-","+"};
		
		int verificaMaiuscula=0,
			verificaMinuscula=0,
			   verificaDigito=0,
			  verificaSimbolo=0;
		
		for (int i = 0; i < senha.length(); i++) {
			
			char letra = senha.charAt(i);
			
			if(Character.isLetter(letra)) {
				if(Character.isLowerCase(letra)) {
					verificaMinuscula=1;
				}else if(Character.isUpperCase(letra)) {
					verificaMaiuscula=1;
				}
			}else {
				if(Character.isDigit(letra)) {
					verificaDigito=1;
				}else{
					switch (letra) {
					case '!':
						verificaSimbolo=1;
						break;
					case '@':
						verificaSimbolo=1;
						break;
					case '#':
						verificaSimbolo=1;
						break;
					case '$':
						verificaSimbolo=1;
						break;
					case '%':
						verificaSimbolo=1;
						break;
					case '^':
						verificaSimbolo=1;
						break;
					case '&':
						verificaSimbolo=1;
						break;
					case '*':
						verificaSimbolo=1;
						break;
					case '(':
						verificaSimbolo=1;
						break;
					case ')':
						verificaSimbolo=1;
						break;
					case '-':
						verificaSimbolo=1;
						break;
					case '+':
						verificaSimbolo=1;
						break;
					default:
						break;
					}
				}
			}
		}
		
		int senhaTamanho = senha.length();
		calculaLetrasRestantes(senhaTamanho, verificaMaiuscula, verificaMinuscula,
								verificaDigito, verificaSimbolo);



	}
	

	public static void calculaLetrasRestantes(int senhaTam, int contMa, int contMi, int contDi, int contSi) {
		int calculo = 4 - (contMa + contMi + contDi + contSi);
		
		if(calculo == 0 && senhaTam>=6) { //se a senha é válida não retorna nada
			
		}else if(senhaTam>=6 && calculo<4) { //se a senha atende a quantidade de caracteres (senha>6), exibe a quantidade de requisitos que não foram satisfeitos
			System.out.println(calculo);
		}else if(senhaTam<=6 && calculo<4) { //se a senha é menor que 6 caracteres é preciso verificar quantos caracteres faltam para atender ao tamanho minimo e aos demais requisitos   
			switch (senhaTam) {
			case 1:
				System.out.println("5"); //Lógica básica pelo fator Tamanho da Senha;		
				break;
			case 2:
				System.out.println("4"); //Lógica básica pelo fator Tamanho da Senha;		
				break;
			case 3:
				System.out.println("3"); //Lógica básica pelo fator Tamanho da Senha;		
				break;
			case 4: //No 4° e 5° caractere da senha, precisamos verificar se os requisitos foram atendidos por isso novos swicths para verificação;
				switch (calculo) {
				case 1:
					System.out.println("2");
					break;
				case 2:
					System.out.println("2");
					break;
				case 3:
					System.out.println("3");
					break;
				default:
					System.out.println("2");
					break;
				}
				break;
			case 5:
				switch (calculo) {
				case 1:
					System.out.println("1");
					break;
				case 2:
					System.out.println("2");
					break;
				case 3:
					System.out.println("3");
					break;
				default:
					System.out.println("1");
					break;
				}
				
			}
		}else {
			
		}
		
			
	}
	
	

}
