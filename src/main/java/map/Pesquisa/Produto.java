package main.java.map.Pesquisa;

public class Produto {

    private long _cod;
    private String _nome;
    private int _quantidade;
    private double _preco;

    @Override
    public String toString() {
        return "Produto{" +
                "_cod=" + _cod +
                ", _nome='" + _nome + '\'' +
                ", _quantidade=" + _quantidade +
                ", _preco=" + _preco +
                '}';
    }

    public long get_cod() {
        return _cod;
    }

    public String get_nome() {
        return _nome;
    }

    public int get_quantidade() {
        return _quantidade;
    }

    public double get_preco() {
        return _preco;
    }

    public Produto(long _cod, String _nome, int _quantidade, double _preco) {
        this._cod = _cod;
        this._nome = _nome;
        this._quantidade = _quantidade;
        this._preco = _preco;
    }
}
