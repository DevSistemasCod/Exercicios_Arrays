package exemplosComArray;

import java.util.Scanner;

public class CalculoMediaDeNotas {
	
	public static double calcularMedia(double nota1, double nota2, double nota3) {
		double media = 0;
		media = ((nota1 + nota2 + nota3)/3);
		return media;
	}

	public static void main(String[] args) {
		double []arrayNotas;
		double nota1, nota2, nota3;
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de Alunos: ");
		arrayNotas = new double  [lerDados.nextInt()];
		
		for(int i = 0; i < arrayNotas.length; i++) {
			System.out.printf("Para o aluno[%d] : ",i);
			System.out.printf(" Informe a Nota 1: ");
			nota1 = lerDados.nextDouble();
			System.out.println("Informe a Nota 2: ");
			nota2 = lerDados.nextDouble();
			System.out.println("Informe a Nota 3: ");
			nota3 = lerDados.nextDouble();
			arrayNotas[i] = calcularMedia(nota1, nota2, nota3);
		}
		
		for(int i = 0; i < arrayNotas.length; i++) {
			System.out.printf("Media do Aluno[%d]: %.2f \n",i ,arrayNotas[i]);
		}
		
		lerDados.close();
	}
}
