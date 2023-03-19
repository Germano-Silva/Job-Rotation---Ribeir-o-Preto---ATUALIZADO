package prova;

import java.text.DecimalFormat;

/**
 * 4 Dado o valor de faturamento mensal de uma distribuidora, detalhado por
 * estado:
 * 
 * SP – R$67.836,43
 * RJ – R$36.678,66
 * MG – R$29.229,88
 * ES – R$27.165,48
 * Outros – R$19.849,53
 * 
 * Escreva um programa na linguagem que desejar onde calcule o percentual de
 * representação que cada estado teve dentro do valor total mensal da
 * distribuidora.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_04 {

	public static void main(String[] args) {

		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;

		double total = sp + rj + mg + es + outros;

		double percentualSP = (sp / total);
		double percentualRJ = (rj / total);
		double percentualMG = (mg / total);
		double percentualES = (es / total);
		double percentualOutros = (outros / total);

		System.out.println("Percentual de representação de faturamento por estado:");
		System.out.printf("SP: " + new DecimalFormat("#.##%").format(percentualSP));
		System.out.printf("RJ: " + new DecimalFormat("#.##%").format(percentualRJ));
		System.out.printf("MG: " + new DecimalFormat("#.##%").format(percentualMG));
		System.out.printf("ES: " + new DecimalFormat("#.##%").format(percentualES));
		System.out.printf("Outros: " + new DecimalFormat("#.##%").format(percentualOutros));
	}

}
