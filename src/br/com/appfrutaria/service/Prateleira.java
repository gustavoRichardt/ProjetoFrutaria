package br.com.appfrutaria.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Produto;
import br.com.appfrutaria.model.Verdura;
import br.com.appfrutaria.view.Atendente;

public class Prateleira {
    private List<Fruta> listaFruta;
    private List<Verdura> listaVerdura;

    public Prateleira() {
        listaFruta = new ArrayList<>();
        listaVerdura = new ArrayList<>();
    }
    public void gerenciarEstoque(int opcao, Atendente atendente) {
        switch (opcao) {
        
            case 1 -> {
                String nome = atendente.frutaNome();
                double preco = atendente.frutaPreco();
                int quantidade = atendente.frutaQuantidade();
                String tipo = atendente.frutaTipo();

                Fruta fruta = new Fruta(nome, preco, quantidade, tipo);
                listaFruta.add(fruta);
                System.out.println("Fruta cadastrada com sucesso!");
            }
            
            case 2 -> {
                String nome = atendente.verduraNome();
                double preco = atendente.verduraPreco();
                int quantidade = atendente.verduraQuantidade();
                double peso = atendente.verduraPeso();

                Verdura verdura = new Verdura(nome, preco, quantidade,peso);
                listaVerdura.add(verdura);
                System.out.println("Verdura cadastrada com sucesso!");
            }

            case 3 -> { 
                if (listaFruta.isEmpty()) {
                    System.out.println("Nenhuma fruta cadastrada.");
                } else {
                    System.out.println("\n--- LISTA DE FRUTAS ---");
                    for (Fruta fruta : listaFruta) { 
                        atendente.vizualizarFruta(fruta); 
                    }
                }
            }
            
            case 4 -> { 
                if (listaVerdura.isEmpty()) {
                    System.out.println("Nenhuma verdura cadastrada.");
                } else {
                    System.out.println("\n--- LISTA DE VERDURAS ---");
                    for (Verdura verdura : listaVerdura) { 
                        atendente.vizualizarVerdura(verdura); 
                    }
                }
            }
            
            case 5 -> { 
                String nomeBusca = atendente.pesquisarFruta();
                Fruta encontrada = null;
                
                for (Fruta fruta : listaFruta) {
                    if (fruta.getNome().equalsIgnoreCase(nomeBusca)) {
                        encontrada = fruta;
                        break;
                    }
                }
                
                if (encontrada != null) {
                    atendente.vizualizarFruta(encontrada);
                } else {
                    atendente.mensagemFrutaNaoEncontrado();
                }
            }
            
            case 6 -> { 
                String nomeBusca = atendente.pesquisarVerdura();
                Verdura encontrada = null;
                
                for (Verdura verdura : listaVerdura) {
                    if (verdura.getNome().equalsIgnoreCase(nomeBusca)) {
                        encontrada = verdura;
                        break;
                    }
                }
                
                if (encontrada != null) {
                    atendente.vizualizarVerdura(encontrada);
                } else {
                    atendente.mensagemVerduraNaoEncontrada();
                }
            }

            case 7 -> { 
                String nome = atendente.removerFruta();
                boolean removido = false;

                
                for (int i = listaFruta.size() - 1; i >= 0; i--) {
                    if (listaFruta.get(i).getNome().equalsIgnoreCase(nome)) {
                        listaFruta.remove(i);
                        removido = true;
                       
                    }
                }

                if (removido) {
                    atendente.vizualizarFrutaRemovida(nome);
                } else {
                    atendente.mensagemFrutaNaoEncontrado();
                }
            }
            
            case 8 -> { 
                String nome = atendente.removerVerdura();
                boolean removido = false;

                for (int i = listaVerdura.size() - 1; i >= 0; i--) {
                    if (listaVerdura.get(i).getNome().equalsIgnoreCase(nome)) {
                        listaVerdura.remove(i);
                        removido = true;
                        
                    }
                }

                if (removido) {
                    atendente.vizualizarVerduraRemovida(nome);
                } else {
                    atendente.mensagemVerduraNaoEncontrada();
                }
            }

            case 9 -> { 
                System.out.println("Total de frutas no estoque: " + listaFruta.size());
            }

            case 10 -> { 
                System.out.println("Total de verduras no estoque: " + listaVerdura.size());
            }

            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida!");
        }
    }
}