package Exe3new;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ItensPerdidos[] itens = new ItensPerdidos[10]; //cria vetor de objetos
		
		String item, autor, local, data, descricao;
		int opcao;
		
		
		do {
			System.out.println("\n1 - Cadastrar Item Perdido\n2 - Pesquisar Item\n3 - Sair");
			opcao = entrada.nextInt();
			switch(opcao)
			{
			case 1:
				System.out.println("Item: ");
				item = entrada.nextLine();
				System.out.println("Autor: ");
				autor = entrada.nextLine();
				System.out.println("Local: ");
				local = entrada.nextLine();
				System.out.println("Data: ");
				data = entrada.nextLine();
				System.out.println("Descrição: ");
				descricao = entrada.nextLine();
				itens[cont] = new ItensPerdidos(item,autor,local,data,descricao);
				
				cont++;
				break;
			case 2:
				break;
			case 3:
				break;
				
		}while(opcao!=3);	
		}
	}

}
