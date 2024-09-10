package main.java.set.Ordenacao;

import main.java.set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> _produtoSet;

    public CadastroProdutos() {
        this._produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        _produtoSet.add(new Produto(nome,cod,preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(_produtoSet);

        return  produtosPorNome;

    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(_produtoSet);

        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(54122,"Maçã",12,55.41);
        cadastroProdutos.adicionarProduto(521,"Laranja",2,8.00);
        cadastroProdutos.adicionarProduto(15888,"Beterraba",6,32.85);
        cadastroProdutos.adicionarProduto(433788,"Chocolate",8,5);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }




}
