package controller;

import br.org.Kay_Almeida.pilhaint.Pilha;

public class PILHAS_6 {
	public static void main(String[] args) throws Exception {
		
        Pilha pilha0 = new Pilha();
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        
//      int vetor [] = {14, 26, 38, 15, 5, 39, 11, 25, 22, 20, 17, 1};  
        int vetor [] = {1, 17, 20, 22, 25, 11, 39, 5, 15, 38, 26, 14};  
        
        for(int i=0; i<vetor.length; i++) {
        	pilha0.push(vetor[i]);
        }
        
        while(!pilha0.isEmpty()) {
        	pilha1.push(pilha0.pop());
        }
        
//        while(!pilha1.isEmpty()) {
//        	pilha0.push(pilha1.pop());
 //       }
        
        
        while(!pilha1.isEmpty()) {
        	pilha2.push(pilha1.pop());
        }
        
        while(!pilha2.isEmpty()) {
        	pilha0.push(pilha2.pop());
        }
        
        System.out.println("Pilha principal: ");
        while(!pilha0.isEmpty()) {
        	System.out.println(pilha0.pop());
        }
        
	}

}
