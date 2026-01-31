package model;

public class Aluno extends Pessoa{
	protected double[] nota;
	protected int matricula;
	
	public Aluno(String nome, int idade, double[] nota, int matricula) throws Exception {
		super(nome, idade);
		validarNota(nota);
		validarMatricula(matricula);
		this.nota = nota;
		this.matricula = matricula;
	}
	
	public double[] getNota() {
		return nota;
	}


	public void setNota(double[] nota) throws Exception {
		validarNota(nota);
		this.nota = nota;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) throws Exception {
		validarMatricula(matricula);
		this.matricula = matricula;
	}
	
	public static void validarNota(double[] nota) throws Exception {
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] < 0 || nota[i] > 10) 
				throw new Exception("Nota inválida. Preencha novamente.");
		}
		
	}
	
	public static void validarMatricula(int matricula) throws Exception {
		if (matricula < 0) 
			throw new Exception("Matricula inválida. Deve ser maior que 0.");
	}
	
	public void mediaAluno(double[] nota) throws Exception {
		double soma = 0;
		for (int i = 0; i < nota.length - 1; i++) {
			soma += nota[i];
		}
		
		int numNotas = nota.length - 1;
		
		this.nota[nota.length - 1] = soma / numNotas;
	}
	
	@Override
	public String toString() {
		return  "MATRICULA: " + matricula + "\n"
				+ "NOME: " + getNome() + "\n"
				+ "IDADE: " + getIdade() + "\n"
				+ "NOTA: " + java.util.Arrays.toString(nota);
	}
}
