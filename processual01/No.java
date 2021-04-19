package com.estruturadados.arvore;

public class No<TIPO> {

    TIPO valor;
    No<TIPO> esquerdo;
    No<TIPO> direito;


    public No(TIPO valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }

    public TIPO getValor() {
        return this.valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public void setEsquerdo(No<TIPO> no) {
        this.esquerdo = no;
    }

    public No<TIPO> getEsquerdo() {
        return this.esquerdo;
    }

    public void setDireito(No<TIPO> no) {
        this.direito = no;
    } 

    public No<TIPO> getDireito() {
        return this.direito;
    }
}
