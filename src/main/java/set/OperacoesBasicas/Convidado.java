package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String _nome;
    private int _codigoConvite;

    public String get_nome() {
        return _nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return _codigoConvite == convidado._codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(_codigoConvite);
    }

    public int get_codigoConvite() {
        return _codigoConvite;
    }

    public Convidado(String _nome, int _codigoConvite) {
        this._nome = _nome;
        this._codigoConvite = _codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "_nome='" + _nome + '\'' +
                ", _codigoConvite=" + _codigoConvite +
                '}';
    }
}
