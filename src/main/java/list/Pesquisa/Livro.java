package main.java.list.Pesquisa;

import main.java.list.OperacoesBasicas.ListaTarefas;

import java.util.Date;

public class Livro {

    private String _titulo;
    private String _autor;
    private int _anoDePublicacao;

    public String get_titulo() {
        return _titulo;
    }

    public String get_autor() {
        return _autor;
    }

    public int get_anoDePublicacao() {
        return _anoDePublicacao;
    }

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this._titulo = titulo;
        this._anoDePublicacao = anoDePublicacao;
        this._autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "_titulo='" + _titulo + '\'' +
                ", _autor='" + _autor + '\'' +
                ", _anoDePublicacao=" + _anoDePublicacao +
                '}';
    }
}

