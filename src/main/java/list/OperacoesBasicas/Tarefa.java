package main.java.list.OperacoesBasicas;

public class Tarefa {
    private String _descricao;

    public Tarefa(String _descricao) {
        this._descricao = _descricao;
    }

    public String get_descricao() {
        return _descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "_descricao='" + _descricao + '\'' +
                '}';
    }
}
