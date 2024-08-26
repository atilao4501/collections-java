package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> _listaTarefas;

    public ListaTarefas() {
        this._listaTarefas = new ArrayList<>();
    }

    public void AdicionarTarefa(String descricao){
        _listaTarefas.add(new Tarefa(descricao));
    }

    public void RemoverTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : _listaTarefas){
            if (t.get_descricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        _listaTarefas.removeAll(tarefasParaRemover);
    }

    public int ObterNumeroTotalDeTarefas(){
        return _listaTarefas.size();
    }

    public List<String> ObterDescricoesTarefas(){
        List<String> listaDescricoes = new ArrayList<String>();

        for(Tarefa tarefa : _listaTarefas){
            listaDescricoes.add(tarefa.get_descricao());
        }

        return listaDescricoes;
    }
}
