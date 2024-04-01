package controller;

import br.org.Kay_Almeida.pilhastring.Pilha;

public class PILHAS_2 {
	
	    public static void main(String[] args) throws Exception {
	    	
	        Pilha pilha = new Pilha();
	        Pilha pilha2 = new Pilha();

	        pilha.push("J");
	        pilha.push("G");
	        pilha.push("R");
	        pilha.push("B");
	        pilha.push("H");
	        pilha.push("L");
	        pilha.push("W");

	        while (pilha.top() != "R") {
	        	pilha2.push(pilha.pop());
	        }
	        System.out.println(pilha.pop());

	        while (pilha2.top() != "W") {
	        	pilha.push(pilha2.pop());
	        }
	        System.out.println(pilha2.pop());

	        while(!pilha.isEmpty()) {
	        	if(pilha.top() == "L" || pilha.top() == "B") {
	        		pilha2.push(pilha.pop());; 
	        	}else if(pilha.top() == "G") {
	        		pilha2.push("M");; 
	        		pilha2.push(pilha.pop());; 
	        	}else {
	        	pilha.pop(); 
	        	}
	        }
	        pilha2.push("K");

	        System.out.println("Pilha Final:");
	        while (!pilha2.isEmpty()) {
	            System.out.println(pilha2.pop());
	        }
	    }
}
