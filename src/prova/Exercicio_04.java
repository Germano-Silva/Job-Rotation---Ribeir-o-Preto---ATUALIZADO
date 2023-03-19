package prova;

import java.text.DecimalFormat;

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
