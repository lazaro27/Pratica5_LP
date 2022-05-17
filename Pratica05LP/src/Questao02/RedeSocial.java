package Questao02;

import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class RedeSocial {

	public static void main(String[] args) {
		ArrayList<String> rs = new ArrayList<String>();
		int op1 = 0;
		do {
		try {
		String op = JOptionPane.showInputDialog(null,"Digite a opção desejada:\n1)Cadastrar\n2)Excluir\n3)Pesquisar\n4)Sair" );
		op1 = Integer.parseInt(op);
		switch (op1){
		
		case 1:
			String nome =JOptionPane.showInputDialog(null, "Digite o nome: ");
			String tel = JOptionPane.showInputDialog(null, "Digite o telefone: ");
			String insta = JOptionPane.showInputDialog(null,"Digite o istagran:");
			String email = JOptionPane.showInputDialog(null, "Digite o e-mail:");
			rs.add(nome + ";" + tel + ";" + insta + ";"+ email);
			
			break;
		case 2:
			String busca = JOptionPane.showInputDialog(null, "Digite o nome que deseja excluir:");
			for(int i = 0; i< rs.size(); i++) {
				if(rs.get(i).contains(busca)) {
					rs.remove(i);
					JOptionPane.showMessageDialog(null, "EXCLUIDO COM SUCESSO");		
				}
			}
			break;
		case 3:
			String pesq = JOptionPane.showInputDialog(null, "Digite o nome que deseja pesquisar:");
			for(int i = 0; i< rs.size(); i++) {
				if(rs.get(i).contains(pesq)) {
					JOptionPane.showMessageDialog(null, rs.get(i));
					}else {
						JOptionPane.showMessageDialog(null, "REGISTRO NÃO ENCONTRADO");													}
			}
			
			break;
		
		case 4:
			break;
			
			default:
				JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!");
		}
		
		}catch(InputMismatchException e){
			
		}
		}while(op1 != 4);
			

		}

}
