package prova;

import java.io.File;
import com.google.gson.Gson;
import java.util.Scanner;

/**
 * 3 Dado um vetor que guarda o valor de faturamento diário de uma
 * distribuidora, faça um programa, na linguagem que desejar, que calcule e
 * retorne: • O menor valor de faturamento ocorrido em um dia do mês; • O maior
 * valor de faturamento ocorrido em um dia do mês; • Número de dias no mês em
 * que o valor de faturamento diário foi superior à média mensal.
 * 
 * IMPORTANTE: a) Usar o json ou xml disponível como fonte dos dados do
 * faturamento mensal; b) Podem existir dias sem faturamento, como nos finais de
 * semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 * 
 * @author Germano-Silva
 *
 */

public class Exercicio_03 {

	public static void main(String[] args) {
		double[] faturamento = null;
		double maior;
		double menor;
		double soma;
		int diasUteis;
		double media;
		int acimaDaMedia;

		File arquivo = new File("faturamento.json");
		String conteudo = "";
		try {
			Scanner scan = new Scanner(arquivo);
			while (scan.hasNextLine()) {
				conteudo += scan.nextLine();
			}
			scan.close();

			faturamento = converterJsonParaFaturamento(conteudo);
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo de faturamento!");
			return;
		}

		maior = faturamento[0];
		menor = faturamento[0];

		soma = 0.0;
		diasUteis = 0;

		for (int i = 0; i < faturamento.length; i++) {
			double valor = faturamento[i];
			if (valor > 0) {
				soma += valor;
				diasUteis++;
			}

			if (valor < menor) {
				menor = valor;
			}

			if (valor > maior) {
				maior = valor;
			}
		}

		media = soma / diasUteis;

		acimaDaMedia = 0;
		for (int i = 0; i < faturamento.length; i++) {
			if (faturamento[i] > media) {
				acimaDaMedia++;
			}
		}

		System.out.println("Menor faturamento diário: R$" + menor);
		System.out.println("Maior faturamento diário: R$" + maior);
		System.out.println("Número de dias com faturamento acima da média: " + acimaDaMedia);
	}

	public static double[] converterJsonParaFaturamento(String json) {
		Gson gson = new Gson();
		double[] faturamento = gson.fromJson(json, double[].class);
		return faturamento;

	}

}
