package primeiro_projeto;
import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variáveis
		int idade;
		String nome;
		
		//Instaciar classe Scanner 
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Qual o seu nome: ");
		nome = ler.next();
		
		System.out.println("Qual a sua idade: ");
		idade = ler.nextInt();
		
		//Saída 
		System.out.println("Olá "+nome+" de "+idade+" anos! ");
		
		
	}

}
