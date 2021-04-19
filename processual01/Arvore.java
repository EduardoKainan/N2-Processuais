
package com.estruturadados.arvore;

public class Arvore<TIPO extends Comparable> {
    
    private No<TIPO> raiz;
    
    public Arvore(){
        this.raiz = null;
    }
    
    public void inserir(TIPO valor){
        No <TIPO> novoNo = new No<TIPO>(valor);
        if (raiz == null){
            this.raiz = novoNo;
        }else{
            No<TIPO> atual = this.raiz;
            while(true){
                if (novoNo.getValor().compareTo(atual.getValor()) == -1){
                    if (atual.getEsquerdo() != null){
                        atual = atual.getEsquerdo();
                    }else{
                        atual.setEsquerdo(novoNo);
                        break;
                    }
                }else{ //se for maior ou igual
                    if (atual.getDireito() != null){
                        atual = atual.getDireito();
                    }else{
                        atual.setDireito(novoNo);
                        break;
                    }
                }
            }
        }
    }

    public No<TIPO> getRaiz() {
        return raiz;
    }
    
    public void emOrdem(No<TIPO> atual){
        if (atual != null){
            emOrdem(atual.getEsquerdo());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireito());
        }        
    }
    
    public void preOrdem(No<TIPO> atual){
        if (atual != null){
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerdo());            
            preOrdem(atual.getDireito());
        }        
    }
    
    public void posOrdem(No<TIPO> atual){
        if (atual != null){            
            posOrdem(atual.getEsquerdo());            
            posOrdem(atual.getDireito());
            System.out.println(atual.getValor());
        }        
    }
    
    public boolean remover(TIPO valor){
        //buscar o No na árvore
        No<TIPO> atual = this.raiz;
        No<TIPO> paiAtual = null;
        while(atual != null){
            if (atual.getValor().equals(valor)){
                break;                
            }else if (valor.compareTo(atual.getValor()) == -1){ //valor procurado é menor que o atual 
                paiAtual = atual;
                atual = atual.getEsquerdo();
            }else{
                paiAtual = atual;
                atual = atual.getDireito();
            }
        }
        //verifica se existe o No
        if (atual != null){
            
            //No tem 2 filhos ou No tem somente filho à direita
            if (atual.getDireito() != null){
                
                No<TIPO> substituto = atual.getDireito();
                No<TIPO> paiSubstituto = atual;
                while(substituto.getEsquerdo() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerdo();
                }
                substituto.setEsquerdo(atual.getEsquerdo());
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerdo(substituto);
                    }else{
                        paiAtual.setDireito(substituto);
                    }
                }else{ //se não tem paiAtual, então é a raiz
                    this.raiz = substituto;
                }
                
                //removeu o No da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerdo(null);
                }else{
                    paiSubstituto.setDireito(null);
                }
                
            }else if (atual.getEsquerdo() != null){ //tem filho só à esquerda
                No<TIPO> substituto = atual.getEsquerdo();
                No<TIPO> paiSubstituto = atual;
                while(substituto.getDireito() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getDireito();
                }
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerdo(substituto);
                    }else{
                        paiAtual.setDireito(substituto);
                    }
                }else{ //se for a raiz
                    this.raiz = substituto;
                }
                
                //removeu o No da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerdo(null);
                }else{
                    paiSubstituto.setDireito(null);
                }
            }else{ //não tem filho
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerdo(null);
                    }else{
                        paiAtual.setDireito(null);
                    }
                }else{ //é a raiz
                    this.raiz = null;
                }
            }
            
            return true;
        }else{
            return false;
        }        
    }
}