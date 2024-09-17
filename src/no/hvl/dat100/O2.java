package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;
import static java.lang.Integer.*;

public class O2 {
	public static void main(String[] args) {
		// Leser inn
		
		double trinn1 = 208050;
		double trinn2 = 292850;
		double trinn3 = 670000;
		double trinn4 = 937900;
		double trinn5 = 1350000;
		
		double a = parseInt(showInputDialog("Skriv inn din bruttoinntekt: "));
		double skatt = 0;
		
		System.out.println("Brutto: " + a);

		// Beregner trinn skatt
		if (a <= trinn1) {
			System.out.println("Ingen trinnskatt å beregne.");
		}
		if ((a > trinn1) && (a <= trinn2)) {
			double skatt1 = beregnSkatt(1.7, a - trinn1);
			skatt = skatt + skatt1;
			
			DecimalFormat af = new DecimalFormat("#.##");
			System.out.println("Skatt å betale: " + af.format(skatt));
		}
		if (a > trinn2) {
			double skatt1 = beregnSkatt(1.7, trinn2 - trinn1);
			skatt = skatt + skatt1;
			
			if ((a > trinn2) && (a <= trinn3)) {
				double skatt2 = beregnSkatt(4.0, a - trinn2);
				skatt = skatt + skatt2;
				
				DecimalFormat af = new DecimalFormat("#.##");
				System.out.println("Skatt å betale: " + af.format(skatt));
			}
			if (a > trinn3)	{
				double skatt2 = beregnSkatt(4.0, trinn3 - trinn2);
				skatt = skatt + skatt2;
				
				if ((a > trinn3) && (a <= trinn4)) {
					double skatt3 = beregnSkatt(13.6, a - trinn3);
					skatt = skatt + skatt3;
					
					DecimalFormat af = new DecimalFormat("#.##");
					System.out.println("Skatt å betale: " + af.format(skatt));
				}
				if (a > trinn4) {
					double skatt3 = beregnSkatt(13.6, trinn4 - trinn3);
					skatt = skatt + skatt3;
					
					if ((a > trinn4) && (a <= trinn5)) {
						double skatt4 = beregnSkatt(16.6, a - trinn4);
						skatt = skatt + skatt4;

						DecimalFormat af = new DecimalFormat("#.##");
						System.out.println("Skatt å betale: " + af.format(skatt));
						
					}
					if (a > trinn5) {
						double skatt4 = beregnSkatt(16.6, trinn5 - trinn4);
						skatt = skatt + skatt4;
						double skatt5 = beregnSkatt(17.6, a - trinn5);
						skatt = skatt + skatt5;
						
						DecimalFormat af = new DecimalFormat("#.##");
						System.out.println("Skatt å betale: " + af.format(skatt));
							
					}
				
				}
			}
		}
	}


	private static double beregnSkatt(double prosent, double a) {

		double p;
		
		p = prosent / 100;
		
		double skatt= a * p;
		
		return skatt;
	}
}
