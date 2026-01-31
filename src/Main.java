import java.util.Scanner;

import model.Aluno;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos alunos estão matriculados nesta turma? ");
		int qtdAlunos = scanner.nextInt();
		scanner.nextLine();
		
		Aluno[] aluno = new Aluno[qtdAlunos];
		
		for (int i = 0; i < qtdAlunos; i++) {
			
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			
			
			System.out.print("Idade: ");
			int idade = scanner.nextInt();
			scanner.nextLine();
			
			double[] nota = new double[4]; // 3 provas durante o ano e a ultima posição
									       // fica guardada para a média
			
			for(int j = 0; j < nota.length - 1; j++) {
				System.out.print("Nota " + (j+1) + ": ");
				nota[j] = scanner.nextDouble();
				scanner.nextLine();
			}
			
			System.out.print("Matricula: ");
			int matricula = scanner.nextInt();
			scanner.nextLine();
			
			aluno[i] = new Aluno(nome, idade, nota, matricula);
			aluno[i].mediaAluno(nota);
		}
		
		for (int i = 0; i < aluno.length; i++) {
			if (aluno[i] != null) System.out.println( (i + 1) + "° Aluno " + ":\n"+ aluno[i] + "\n--------------------------------------");
		}
	}
}
