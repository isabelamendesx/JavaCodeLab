package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		double porcentagem;
		boolean idEncontrado = false;
		
		System.out.printf("Quantos funcionários serão cadastrados?");
		int n = sc.nextInt();
		sc.nextLine();

		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("FUNCIONARIO #%d:\n", (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salário = sc.nextDouble();
	
			Funcionario funcionario = new Funcionario(id, nome, salário);
			listaFuncionarios.add(funcionario);	
		}

		
		System.out.printf("\nQual id do funcionário que terá seu salário aumentado? ");
		int idAumento = sc.nextInt();
		
		for(Funcionario x : listaFuncionarios){
			if (x.getId() == idAumento) {
				System.out.print("Digite a Porcentagem: ");
				porcentagem = sc.nextDouble();
				x.aumentaSalario(porcentagem);
				idEncontrado = true;
				System.out.println();
		    } 
	    }
		
		if(idEncontrado != true) {
			System.out.println("Esse id não existe!");
			System.out.println();
		}
	
		System.out.println("Lista de funcionários: ");
		
		for(Funcionario x : listaFuncionarios) {
			System.out.println(x.toString());
		}
		
		sc.close();
			

}
}
