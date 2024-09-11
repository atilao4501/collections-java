package main.java.map.Ordenacao;

import java.time.LocalDate;

public class Evento {

    private String _atracao;
    private LocalDate _data;
    private String _nome;

    public Evento(String _atracao, LocalDate _data, String _nome) {
        this._atracao = _atracao;
        this._data = _data;
        this._nome = _nome;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "_atracao='" + _atracao + '\'' +
                ", _data=" + _data +
                ", _nome='" + _nome + '\'' +
                '}';
    }
}
