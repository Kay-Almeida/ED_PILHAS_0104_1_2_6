package controller;

import br.org.Kay_Almeida.pilhaint.*;

public class PILHAS_1 {
	public static void main(String[] args) throws Exception {
		
		int vetor [] = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};  
		Pilha pl = new Pilha(); 
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]>=0) {
				pl.push(vetor[i]);
			}
			if(vetor[i]<0) {
				int n1= pl.pop(); 
				int n2 = pl.pop(); 
				pl.push(vetor[i]);
				pl.push(n2+n1);
			}
		}
		
		System.out.println("Pilha com "+ pl.size()+ " elementos");
		
        while (!pl.isEmpty()) {
            System.out.println(pl.pop());
        }
		
	}
	
	

}
