package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void AdicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void RemoverConato(String nome){
        if (agendaContatoMap.isEmpty()){
            System.out.println("Map vazio!");
        }
        else{
           agendaContatoMap.remove(nome);
        }
    }

    public Map<String,Integer> ExibirContatos(){
        return agendaContatoMap;
    }

    public Integer PesquisarPorNome(String nome){
            return agendaContatoMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.AdicionarContato("cleyton", 15);
        agendaContatos.AdicionarContato("rasta", 2);
        agendaContatos.AdicionarContato("pedro", 7);
        agendaContatos.AdicionarContato("lima", 24);
        agendaContatos.AdicionarContato("pedro", 18);

        System.out.println(agendaContatos.ExibirContatos());

        System.out.println(agendaContatos.PesquisarPorNome("pedro"));
    }
}
