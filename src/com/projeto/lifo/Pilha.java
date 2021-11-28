package com.projeto.lifo;

public class Pilha {
	
	private No refNoEntradaPilha;

	public Pilha() {
	}
	public Pilha(No refNoEntradaPilha) {
		this.refNoEntradaPilha =null;
	}
	public void push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha= novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	public No pop() {
		
		if(!this.IsEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha= refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
	
	public No top() {
		return refNoEntradaPilha;
	}
	public boolean IsEmpty() {
//		if(refNoEntradaPilha == null) {
//			return true;
//		}
//		return false;
		return refNoEntradaPilha== null? true: false;
	}

	
}
