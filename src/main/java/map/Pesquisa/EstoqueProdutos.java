package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> mapProdutos;

    public EstoqueProdutos() {
        this.mapProdutos = new HashMap<>();
    }

    public void AdicionarProduto(long cod, String nome, int quantidade, double preco){
        mapProdutos.put(cod,new Produto(cod, nome, quantidade, preco));
    }

    public void ExibirProdutos(){
        System.out.println(mapProdutos);
    }

    public double CalcularValorTotalEstoque(){
        double valorTotal = 0;

        if(!mapProdutos.isEmpty()){
            for (Produto p : mapProdutos.values()){
                valorTotal += p.get_preco()*p.get_quantidade();
            }
        }
        return valorTotal;
    }

    public Produto ObterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!mapProdutos.isEmpty()){
            for (Produto p : mapProdutos.values()){
                if (p.get_preco() > maiorPreco){
                    maiorPreco = p.get_preco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto ObterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double maiorPreco = Double.MAX_VALUE;

        if(!mapProdutos.isEmpty()){
            for (Produto p : mapProdutos.values()){
                if (p.get_preco() < maiorPreco){
                    maiorPreco = p.get_preco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto ObterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaior = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!mapProdutos.isEmpty()){
            for (Produto p : mapProdutos.values()){
                if (p.get_preco()*p.get_quantidade() > maiorPreco){
                    maiorPreco = p.get_preco()*p.get_quantidade();
                    produtoMaior = p;
                }
            }
        }
        return produtoMaior;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.AdicionarProduto(45, "maça", 5, 12.50);
        estoqueProdutos.AdicionarProduto(13, "pera", 2, 13.40);
        estoqueProdutos.AdicionarProduto(12, "beterraba", 3, 18);
        estoqueProdutos.AdicionarProduto(5454, "jere", 10, 5);

        estoqueProdutos.ExibirProdutos();

        System.out.println(estoqueProdutos.CalcularValorTotalEstoque());
        System.out.println(estoqueProdutos.ObterProdutoMaisBarato());
        System.out.println(estoqueProdutos.ObterProdutoMaisCaro());
        System.out.println(estoqueProdutos.ObterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
