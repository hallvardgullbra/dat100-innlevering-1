package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class O3 {
	public static void main(String[] args) {
		
		int n = parseInt (showInputDialog("Gi tall for å få Fakultet: "));
		int f = 1;
		
		for (int i = 0; i<n; n--) {
			f = f * n;
		}
		showMessageDialog(null, f);
	}
}