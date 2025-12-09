package br.com.appfrutaria;

import br.com.appfrutaria.service.Prateleira;
import br.com.appfrutaria.view.Atendente;

public class AppFrutaria {
    public static void main(String[] args) {

        Atendente atendente = new Atendente();
        Prateleira prateleira = new Prateleira();

        prateleira.executar(atendente);
    }
}
