package br.com.appfrutaria.service;

import java.util.ArrayList;

import java.util.List;
import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Produto;
import br.com.appfrutaria.model.Verdura;
import br.com.appfrutaria.model.Limpeza;
import br.com.appfrutaria.view.Atendente;

public class Prateleira {
    private List<Fruta> listaFruta;
    private List<Verdura> listaVerdura;
    private List<Limpeza> listaLimpeza;

    public Prateleira() {
        listaFruta = new ArrayList<>();
        listaVerdura = new ArrayList<>();
        listaLimpeza = new ArrayList<>();
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
                String nome = atendente.limpezaNome();
                double preco = atendente.limpezaPreco();
                int quantidade = atendente.limpezaQuantidade();
                String fragancia = atendente.limpezaFragancia();

                Limpeza limpeza = new Limpeza(nome, preco, quantidade, fragancia);
                listaLimpeza.add(limpeza);
                System.out.println("Produto de limpeza cadastrada com sucesso!");
            }

            case 4 -> { 
                if (listaFruta.isEmpty()) {
                    System.out.println("Nenhuma fruta cadastrada.");
                } else {
                    System.out.println("\n--- LISTA DE FRUTAS ---");
                    for (Produto p : listaFruta) {
                        if (p instanceof Fruta fruta) {
                            atendente.vizualizarFruta(fruta);
                        }
                    }
                }
            }
            
            case 5 -> { 
                if (listaVerdura.isEmpty()) {
                    System.out.println("Nenhuma verdura cadastrada.");
                } else {
                    System.out.println("\n--- LISTA DE VERDURAS ---");
                    for (Produto p : listaVerdura) {
                        if (p instanceof Verdura verdura) {
                            atendente.vizualizarVerdura(verdura);
                        }
                    }
                }
            }
            
            case 6 -> { 
                if (listaLimpeza.isEmpty()) {
                    System.out.println("Nenhum produto de limpeza cadastrado.");
                } else {
                    System.out.println("\n--- LISTA DE PRODUTOS DE LIMPEZA ---");
                    for (Produto p : listaLimpeza) {
                        if (p instanceof Limpeza limpeza) {
                            atendente.vizualizarLimpeza(limpeza);
                        }
                    }
                }
            }
            
            case 7 -> { 
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
            
            case 8 -> { 
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
            
            case 9 -> { 
                String nomeBusca = atendente.pesquisarLimpeza();
                Limpeza encontrada = null;
                
                for (Limpeza limpeza : listaLimpeza) {
                    if (limpeza.getNome().equalsIgnoreCase(nomeBusca)) {
                        encontrada = limpeza;
                        break;
                    }
                }
                
                if (encontrada != null) {
                    atendente.vizualizarLimpeza(encontrada);
                } else {
                    atendente.mensagemLimpezaNaoEncontrada();
                }
            }

            case 10 -> { 
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
            
            case 11 -> { 
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
            
            case 12 -> { 
                String nome = atendente.removerLimpeza();
                boolean removido = false;

                for (int i = listaLimpeza.size() - 1; i >= 0; i--) {
                    if (listaLimpeza.get(i).getNome().equalsIgnoreCase(nome)) {
                        listaLimpeza.remove(i);
                        removido = true;
                        
                    }
                }

                if (removido) {
                    atendente.vizualizarLimpezaRemovida(nome);
                } else {
                    atendente.mensagemLimpezaNaoEncontrada();
                }
            }

            case 13 -> { 
                System.out.println("Total de frutas no estoque: " + listaFruta.size());
            }

            case 14 -> { 
                System.out.println("Total de verduras no estoque: " + listaVerdura.size());
            }
            
            case 15 -> { 
                System.out.println("Total de produtos de limpeza no estoque: " + listaLimpeza.size());
            }

            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida!");
        }
    }
}