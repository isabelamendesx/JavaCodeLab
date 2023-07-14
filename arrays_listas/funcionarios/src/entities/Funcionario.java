package entities;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salário;
	
	public Funcionario() {
		
	}
	
	public Funcionario(Integer id, String nome, Double salário) {
		this.id = id;
		this.nome = nome;
		this.salário = salário;
	}


	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalário() {
		return salário;
	}

	public void setSalário(Double salário) {
		this.salário = salário;
	}
	
	public void aumentaSalario(double porcentagem) {
		salário += salário * porcentagem / 100.00;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salário);
	}
	
	
	

}
