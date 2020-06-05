package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		try {
			montaPagantes(sc, list);
			finalizaProcesso(sc, list);
		} catch (InputMismatchException e) {
			System.out.println("Informe os dados corretamente ANIMAL!!!");
			e.printStackTrace();
		}

		sc.close();

	}

	private static void finalizaProcesso(Scanner sc, List<Pessoa> list) {
		sc.nextLine();
		System.out.println("TAXAS PAGAS");
		Double totalTaxas = 0.0;

		for (Pessoa pessoa : list) {
			totalTaxas += pessoa.taxaPaga();
			System.out.println(pessoa.toString());

		}

		System.out.println("Total taxas pagas $ " + String.format("%.2f", totalTaxas));
	}

	private static void montaPagantes(Scanner sc, List<Pessoa> list) {
		System.out.print("Entre com número de Pagantes: ");
		Integer qtdPagantesInteger = sc.nextInt();

		for (int i = 1; i <= qtdPagantesInteger; i++) {
			System.out.println("Dados pagante " + i + ":");
			System.out.print("(F)isica / (J)uridica? ");
			char ch = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();

			if (ch == 'F' || ch == 'f') {
				System.out.print("Gasto com Saúde: ");
				Double gastoSaude = sc.nextDouble();

				list.add(new Fisica(nome, rendaAnual, gastoSaude));
			} else {
				System.out.print("Número de funcionários: ");
				Integer qtdFuncionarios = sc.nextInt();

				list.add(new Juridica(nome, rendaAnual, qtdFuncionarios));
			}

		}
	}

}
