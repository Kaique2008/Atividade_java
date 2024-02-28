package primeiro_projeto;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variáveis 
		double horadetrab,valorhora,salbruto,salliquido,inss,som;
		
		//Instaciar classe Scanner 
				Scanner ler = new Scanner(System.in);
				
				//Entrada de dados 
				System.out.println("Quantas horadetrab: ");
				horadetrab = ler.nextDouble();
				
				System.out.println("Quanto valorhora: ");
				valorhora = ler.nextDouble();
				
				//Processamento 
				salbruto = horadetrab*valorhora;
				salliquido = salbruto*0.12;
				
				//Saída
				System.out.println("O valor do salário bruto é: " +salbruto);
				System.out.println("O valor do salário liquido é: " +salliquido);
				
				
				
				
				
				

	}

}
