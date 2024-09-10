package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>
{
    private String _nome;
    private long _cod;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return _cod == produto._cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(_cod);
    }

    private double _preco;
    private int _quantidade;

    public Produto(String _nome, long _cod, double _preco, int _quantidade) {
        this._nome = _nome;
        this._cod = _cod;
        this._preco = _preco;
        this._quantidade = _quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "_nome='" + _nome + '\'' +
                ", _cod=" + _cod +
                ", _preco=" + _preco +
                ", _quantidade=" + _quantidade +
                '}';
    }

    public String get_nome() {
        return _nome;
    }

    public long get_cod() {
        return _cod;
    }

    public double get_preco() {
        return _preco;
    }

    public int get_quantidade() {
        return _quantidade;
    }

    @Override
    public int compareTo(Produto o) {
        return _nome.compareToIgnoreCase(o.get_nome());
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.get_preco(), p2.get_preco());
    }
}
