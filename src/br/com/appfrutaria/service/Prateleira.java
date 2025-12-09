package br.com.appfrutaria.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appfrutaria.model.*;
import br.com.appfrutaria.view.Atendente;

public class Prateleira {

    private List<Fruta> listaFruta = new ArrayList<>();
    private List<Verdura> listaVerdura = new ArrayList<>();
    private List<Limpeza> listaLimpeza = new ArrayList<>();

    public void executar(Atendente atendente) {

        boolean rodando = true;

        while (rodando) {

            int opcao = atendente.menuPrincipal();

            switch (opcao) {

                case 1 -> {
                    int sub = atendente.submenuCadastrar();
                    switch (sub) {

                        case 1 -> {
                            Fruta f = new Fruta(
                                    atendente.frutaNome(),
                                    atendente.frutaPreco(),
                                    atendente.frutaQuantidade(),
                                    atendente.frutaTipo()
                            );
                            listaFruta.add(f);
                            System.out.println("Fruta cadastrada!");
                        }

                        case 2 -> {
                            Verdura v = new Verdura(
                                    atendente.verduraNome(),
                                    atendente.verduraPreco(),
                                    atendente.verduraQuantidade(),
                                    atendente.verduraPeso()
                            );
                            listaVerdura.add(v);
                            System.out.println("Verdura cadastrada!");
                        }

                        case 3 -> {
                            Limpeza l = new Limpeza(
                                    atendente.limpezaNome(),
                                    atendente.limpezaPreco(),
                                    atendente.limpezaQuantidade(),
                                    atendente.limpezaFragancia()
                            );
                            listaLimpeza.add(l);
                            System.out.println("Produto de limpeza cadastrado!");
                        }
                    }
                }

                case 2 -> {
                    int sub = atendente.submenuListar();
                    switch (sub) {
                        case 1 -> {
                            if (listaFruta.isEmpty()) System.out.println("Nenhuma fruta.");
                            else for (Fruta f : listaFruta) atendente.vizualizarFruta(f);
                        }

                        case 2 -> {
                            if (listaVerdura.isEmpty()) System.out.println("Nenhuma verdura.");
                            else for (Verdura v : listaVerdura) atendente.vizualizarVerdura(v);
                        }

                        case 3 -> {
                            if (listaLimpeza.isEmpty()) System.out.println("Nenhum produto de limpeza.");
                            else for (Limpeza l : listaLimpeza) atendente.vizualizarLimpeza(l);
                        }
                    }
                }

                case 3 -> {
                    int sub = atendente.submenuPesquisar();
                    switch (sub) {

                        case 1 -> {
                            String nome = atendente.pesquisarFruta();
                            boolean achou = false;

                            for (Fruta f : listaFruta) {
                                if (f.getNome().equalsIgnoreCase(nome)) {
                                    atendente.vizualizarFruta(f);
                                    achou = true;
                                    break;
                                }
                            }

                            if (!achou) atendente.mensagemFrutaNaoEncontrado();
                        }

                        case 2 -> {
                            String nome = atendente.pesquisarVerdura();
                            boolean achou = false;

                            for (Verdura v : listaVerdura) {
                                if (v.getNome().equalsIgnoreCase(nome)) {
                                    atendente.vizualizarVerdura(v);
                                    achou = true;
                                    break;
                                }
                            }

                            if (!achou) atendente.mensagemVerduraNaoEncontrada();
                        }

                        case 3 -> {
                            String nome = atendente.pesquisarLimpeza();
                            boolean achou = false;

                            for (Limpeza l : listaLimpeza) {
                                if (l.getNome().equalsIgnoreCase(nome)) {
                                    atendente.vizualizarLimpeza(l);
                                    achou = true;
                                    break;
                                }
                            }

                            if (!achou) atendente.mensagemLimpezaNaoEncontrada();
                        }
                    }
                }

                case 4 -> {
                    int sub = atendente.submenuRemover();
                    switch (sub) {

                        case 1 -> {
                            String nome = atendente.removerFruta();
                            boolean ok = false;

                            for (int i = 0; i < listaFruta.size(); i++) {
                                if (listaFruta.get(i).getNome().equalsIgnoreCase(nome)) {
                                    listaFruta.remove(i);
                                    ok = true;
                                    break;
                                }
                            }

                            if (ok) atendente.vizualizarFrutaRemovida(nome);
                            else atendente.mensagemFrutaNaoEncontrado();
                        }

                        case 2 -> {
                            String nome = atendente.removerVerdura();
                            boolean ok = false;

                            for (int i = 0; i < listaVerdura.size(); i++) {
                                if (listaVerdura.get(i).getNome().equalsIgnoreCase(nome)) {
                                    listaVerdura.remove(i);
                                    ok = true;
                                    break;
                                }
                            }

                            if (ok) atendente.vizualizarVerduraRemovida(nome);
                            else atendente.mensagemVerduraNaoEncontrada();
                        }

                        case 3 -> {
                            String nome = atendente.removerLimpeza();
                            boolean ok = false;

                            for (int i = 0; i < listaLimpeza.size(); i++) {
                                if (listaLimpeza.get(i).getNome().equalsIgnoreCase(nome)) {
                                    listaLimpeza.remove(i);
                                    ok = true;
                                    break;
                                }
                            }

                            if (ok) atendente.vizualizarLimpezaRemovida(nome);
                            else atendente.mensagemLimpezaNaoEncontrada();
                        }
                    }
                }

                case 5 -> {
                    int sub = atendente.submenuTotais();
                    switch (sub) {
                        case 1 -> System.out.println("Total de frutas: " + listaFruta.size());
                        case 2 -> System.out.println("Total de verduras: " + listaVerdura.size());
                        case 3 -> System.out.println("Total de limpeza: " + listaLimpeza.size());
                    }
                }

                case 0 -> {
                    System.out.println("Saindo...");
                    rodando = false;
                }
            }
        }
    }
}
