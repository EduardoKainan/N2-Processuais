package com.estruturadados.arvore;

public class main {

    public static void main(String [] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        
        arvore.inserir(3);
        arvore.inserir(4);
        arvore.inserir(1);
        arvore.inserir(0);
        arvore.inserir(2);
        arvore.inserir(9);
        arvore.inserir(7);
        arvore.inserir(8);
        arvore.inserir(14);
        arvore.inserir(15);
        arvore.inserir(20);
        arvore.inserir(05);
        arvore.inserir(13);
        arvore.inserir(18);
        arvore.inserir(10);





        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(20);
        
        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
/* /*         arvore.remover(5);
        
        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(8);
        
        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(9);
        
        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(13);
        
        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(7);
        arvore.remover(18);
        
        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        arvore.remover(10);
        
        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz()); */
        
        //System.out.println("\n\nPré-ordem");
        //arvore.preOrdem(arvore.getRaiz());
        
        //System.out.println("\n\nPós-ordem");
        //arvore.posOrdem(arvore.getRaiz()); */

    }
    
}
