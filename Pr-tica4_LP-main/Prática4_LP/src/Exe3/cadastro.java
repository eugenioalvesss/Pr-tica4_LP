package Exe3;


import java.util.ArrayList;
import java.util.Scanner;

public class cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int opcao, num=0, menu;
		String item, autor, local, data, descricao;
		ArrayList<String> cad = new ArrayList();
		
		for(int i=0; i<10; i++) {			
			System.out.println("(1) Cadastrar Item Perdido\n(2) Buscar Item\n(3) Sair");
			opcao = entrada.nextInt();
			
			switch(opcao)
		{
			case 1:
									
					System.out.println("Item: ");
					item = entrada.next();
					System.out.println("Autor: ");
					autor = entrada.next();
					System.out.println("Local: ");
					local = entrada.next();
					System.out.println("Data: ");
					data = entrada.next();
					System.out.println("Descri��o: ");
					descricao = entrada.next();
				
					cad.add(item+" / "+autor+" / "+local+" / "+data+" / "+descricao);
				
				break;
				
			case 2:
				System.out.printf("Lista de itens cadastrados \n ");
				
				int n = cad.size();
				
				for (i=0; i<n; i++) {
					System.out.printf("Posi��o %d - %s\n", i+1,cad.get(i));
				}
				System.out.println("Encontrou seu item? Informe a posi��o para retir�-lo \n Caso n�o localize, digite 0");
				menu = entrada.nextInt();

				if(menu <= 10 && menu >=0) {
					System.out.println("Item encontrado na posi��o "+menu);

				}else if (menu == 0) {
					System.out.println("Voltando para o menu principal");
				}else 
					System.out.println("Op��o inv�lida!");
				
			case 3:
				System.out.println("N�mero total de itens cadastrados: " + num);
				break;
				
					
		}
		}
	}
}
			
		
	

