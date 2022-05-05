package Exe1;

import java.util.Scanner;
import java.util.Arrays;

public class vetor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int aux;
		int soma=0;	
        int [] notas = new int[10];
        for (int i = 0; i < 10;i++){
        	
        	System.out.println("Digite a nota posição n° " + (i+1) );
        	notas [i] = entrada.nextInt();
        	soma = soma + notas[i];
        }
        
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < 9; j++) {
        		if(notas [j] > notas [j + 1]) {
        			aux = notas [j];
        			notas [j] = notas [j + 1];
        			notas [j  + 1 ] = aux;
        			

        
        		}
        		
        	}
        }
        System.out.println("A média é " + soma/10);
        System.out.println("A maior nota foi a " + notas [9]);
        System.out.println("A segunda maior nota foi a " + notas [8]);
        System.out.println("A terceira maior nota foi a " + notas [7]);
        System.out.println("A menor nota foi a " + notas [0]);

     }
}
