package br.com.appfrutaria;

import br.com.appfrutaria.service.Prateleira;
import br.com.appfrutaria.view.Atendente;

public class AppFrutaria {
    public static void main(String[] args) {
    	
        Atendente atendente = new Atendente();
        Prateleira prateleira = new Prateleira();
        int opcaoMenuEscolhida;

        
        do {
            opcaoMenuEscolhida = atendente.menuPrincipal();
            prateleira.gerenciarEstoque(opcaoMenuEscolhida, atendente);
        } while (opcaoMenuEscolhida != 0);

        atendente.finalizarApp();
    }
}