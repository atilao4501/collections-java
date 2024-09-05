package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>
{
    private String _nome;
    private int _idade;
    private double _altura;

    public Pessoa(String nome, int idade, double altura) {
        this._nome = nome;
        this._idade = idade;
        this._altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(_idade, p._idade);
    }

    public String get_nome() {
        return _nome;
    }

    public int get_idade() {
        return _idade;
    }

    public double get_altura() {
        return _altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "_nome='" + _nome + '\'' +
                ", _idade=" + _idade +
                ", _altura=" + _altura +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.get_altura(), p2.get_altura());
    }
}
