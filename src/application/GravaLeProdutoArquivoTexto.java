package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoArqTexto;

public class GravaLeProdutoArquivoTexto {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nomeArquivo = "C:\\Users\\Marcos\\Dropbox\\ESTUDOS\\UDEMY_JAVA\\ArqTexto\\ArquivoProduto.txt"; 
		File arquivo = new File(nomeArquivo);
		FileWriter gravaArquivo = new FileWriter(arquivo);
		FileReader lerArquivo = new FileReader(arquivo);
		BufferedReader br = new BufferedReader(lerArquivo);
				
		List<ProdutoArqTexto> listaProdutos = new ArrayList<>();

		System.out.print("Informe a quantidade de produtos: ");
		Integer qtdProdutos = sc.nextInt();

		for (int i = 0; i < qtdProdutos; i++) {

			System.out.print("Informe o produto: ");
			String produto = sc.next();

			System.out.print("Informe a quantidade do produto: ");
			Double qtdProduto = sc.nextDouble();

			System.out.print("Informe o valor do produto: ");
			Double valorProduto = sc.nextDouble();

			listaProdutos.add(new ProdutoArqTexto(produto, qtdProduto, valorProduto));

		}

		System.out.println("===========================================");
		System.out.println("Gravando lista de produtos no arquivo texto");
		System.out.println("===========================================");

		for (ProdutoArqTexto produto : listaProdutos) {

			gravaArquivo.write("Produto: " + produto.getProduto() + " - Quantidade: " + produto.getPeso()
					+ " - Valor Unitário: " + String.format("%.2f", produto.getValor()) + " - Valor Total: "
					+ String.format("%.2f", produto.valorTotal()) + "\n");
		}
		gravaArquivo.close();

		System.out.println("");
		System.out.println("==================================");
		System.out.println("Listando produtos no arquivo texto");
		System.out.println("==================================");

		
		String linha;
		while ((linha = br.readLine()) != null ) {
			System.out.println(linha);
		}
		
		System.out.println("Arquivo texto " + nomeArquivo + " finalizado!!!");
		
		br.close();
		sc.close();

	}

}
