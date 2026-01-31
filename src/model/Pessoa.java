package model;

public class Pessoa {
	protected String nome;
	protected int idade;

	public Pessoa(String nome, int idade) throws Exception{
		super();
		this.nome = nome;
		validarIdade(idade);
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws Exception {
		validarIdade(idade);
		this.idade = idade;
	}

	
	public static void validarIdade(int idade) throws Exception {
		if (idade < 15 || idade > 120) 
			throw new Exception("Idade Inválida. Deve ser entre 15 e 120");
	}
}
