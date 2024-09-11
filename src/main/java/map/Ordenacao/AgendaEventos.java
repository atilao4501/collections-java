package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void AdicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(atracao,data,nome));
    }

    public void ObterProximoEvento(){
        Map<LocalDate,Evento> eventosTreeMap= new TreeMap<>(eventosMap);

        LocalDate dataAtual = LocalDate.now();

        for (Map.Entry<LocalDate,Evento> entry : eventosMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public void ExibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap= new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public static void main(String[] args) {
        // Criando a instância da AgendaEventos
        AgendaEventos agenda = new AgendaEventos();

        // Adicionando eventos à agenda
        agenda.AdicionarEvento(LocalDate.of(2024, 9, 15), "Festival de Música", "Banda XYZ");
        agenda.AdicionarEvento(LocalDate.of(2024, 10, 10), "Conferência de Tecnologia", "Palestrante ABC");
        agenda.AdicionarEvento(LocalDate.of(2024, 12, 25), "Celebração de Natal", "Coro Infantil");
        agenda.AdicionarEvento(LocalDate.of(2024, 9, 11), "Workshop de Desenvolvimento", "Instrutor DEF");

        // Exibindo a agenda completa
        System.out.println("Exibindo todos os eventos na agenda:");
        agenda.ExibirAgenda();

        // Obtendo o próximo evento a partir da data atual
        System.out.println("\nBuscando o próximo evento:");
        agenda.ObterProximoEvento();
    }
}
