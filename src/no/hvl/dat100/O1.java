package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		
		for (int i = 0; i<10; i++) {
			String as = showInputDialog("Student nr " +(i+1) + " Poeng: ");
			
			int a = parseInt (as);
			
			printKarakter (a, i);
			
			while (a > 100) {
				as = showInputDialog("Sum for høy - " + "Student nr " +(i+1) + " Poeng: ");
				a = parseInt (as);
				printKarakter (a, i);
			}
			while (a < 0) {
				as = showInputDialog("Sum for lav - " + "Student nr " +(i+1) + " Poeng: ");
				a = parseInt (as);
				printKarakter (a, i);
			}
		}
	}
	
	private static void printKarakter (int a, int i) {
		
		if (a <=100 && a >=90) {
			System.out.println("Student" + (i+1) + ": " + "A");
		}  
		if (a <90 && a >=80) {
			System.out.println("Student" + (i+1) + ": " + "B");
		} 
		if (a <80 && a >=60) {
			System.out.println("Student" + (i+1) + ": " + "C");
		}
		if (a <60 && a >=50) {
			System.out.println("Student" + (i+1) + ": " + "D");
		} 
		if (a <50 && a >=40) {
			System.out.println("Student" + (i+1) + ": " + "E");
		} 
		if (a <40 && a >=0) {
			System.out.println("Student" + (i+1) + ": " + "F");
		}
	}
}
