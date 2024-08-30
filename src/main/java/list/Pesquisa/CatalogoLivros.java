package main.java.list.Pesquisa;

import main.java.list.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    public List<Livro> listaLivros;

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<>();
    }

    public void AdicionarLivros(String autor, String titulo, int anoDePublicacao){

        listaLivros.add(new Livro(autor, titulo, anoDePublicacao));

        System.out.print("Livro adicionado com sucesso! /n");
    }

    public List<Livro> PesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.get_autor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> PesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.get_anoDePublicacao() >= anoInicial && l.get_anoDePublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public List<Livro> PesquisaPorTitulo(String titulo){
        List<Livro> livrosPorTitulo = new ArrayList<>();

        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.get_titulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo.add(l);
                }
            }
        }
        return livrosPorTitulo;
    }

    public int ObterNumeroTotalTarefas(){
        return listaLivros.size();
    }

    public void ObterDescricoesTarefas(){
        System.out.println(listaLivros);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Número de elementos na lista: " + listaTarefas.ObterNumeroTotalDeTarefas());

        listaTarefas.AdicionarTarefa("Tarefa 1");

        System.out.println("Número de elementos na lista: " + listaTarefas.ObterNumeroTotalDeTarefas());

        listaTarefas.AdicionarTarefa("Tarefa 1");
        listaTarefas.AdicionarTarefa("Tarefa 2");

        System.out.println("Número de elementos na lista: " + listaTarefas.ObterNumeroTotalDeTarefas());
        System.out.println("Descrições das tarefas: " + listaTarefas.ObterDescricoesTarefas());

        listaTarefas.RemoverTarefa("Tarefa 1");
        System.out.println("Número de elementos após remover: " + listaTarefas.ObterNumeroTotalDeTarefas());




    }
}
