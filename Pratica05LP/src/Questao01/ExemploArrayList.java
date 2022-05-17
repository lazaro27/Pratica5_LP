package Questao01;

import java.util.ArrayList;
import java.util.Scanner;


public class ExemploArrayList {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String>agenda = new ArrayList<String>();
		agenda.add("Juca Bala;11 1111-1111");
		agenda.add("Marcos Paqueta;22 2222-2222");
		agenda.add("Maria Antonieta;33 3333-3333");
		agenda.add("Ant�nio Conselheiro;44 4444-4444");
		
		System.out.printf("Percorrendo o ArrayList (usando o �ndice)\n");
		int n = agenda.size();
		int i;
		for (i=0; i<n; i++) {
		System.out.printf("Posi��o %d- %s\n", i, agenda.get(i));
		}
		System.out.printf("\nInforme a posi��o a ser exclu�da:\n");
		i = ler.nextInt();
		try {
		// [ D ] remove o i-�simo contato da agenda
		agenda.remove(i);
		} catch (IndexOutOfBoundsException e) {
		// exce��o lan�ada para indicar que um �ndice (i)
		// est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
		System.out.printf("\nErro: posi��o inv�lida (%s).",
		e.getMessage());
		}
		
		// [ E ] mostrando os "n" contatos da agenda (usando for-each)
		System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
		i = 0;
		for (String contato: agenda) {
		System.out.printf("Posi��o %d- %s\n", i, contato);
		i++;
		}
		// [ F ] mostrando os "n" contatos da agenda (com iterator)
		System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
		i = 0;
		
		/*
		 * Iterator<String> iterator = agenda.iterator();
		 * 
		 * while (iterator.hasNext()) { System.out.printf("Posi��o %d- %s\n", i,
		 * iterator.next()); i++; }
		 */
		
		ler.close();
	  }
	}


