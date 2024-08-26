import main.java.list.OperacoesBasicas.ListaTarefas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        for (int i = 0; i < 10; i++){
            listaTarefas.AdicionarTarefa("tarefa número: "+ i);
        }

        System.out.print("o número de tarefas é: "+ listaTarefas.ObterNumeroTotalDeTarefas() + "\n");
//
//        for (String descricoes : listaTarefas.ObterDescricoesTarefas()){
//            System.out.print(descricoes + "\n");
//        }

        System.out.println(listaTarefas.ObterDescricoesTarefas());

        }
    }
