package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<Pessoa>();
    }

    public void AdicionarPessoa(String nome, int idade, double altura){
        this.listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> OrdenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> OrdenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);

        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args){
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.AdicionarPessoa("Cleyton", 20, 1.56);
        ordenacaoPessoas.AdicionarPessoa("Marcos", 31, 1.85);
        ordenacaoPessoas.AdicionarPessoa("Rasta", 20, 1.64);
        ordenacaoPessoas.AdicionarPessoa("Baba", 16, 1.90);

        System.out.println(ordenacaoPessoas.OrdenarPorIdade());
        System.out.println(ordenacaoPessoas.OrdenarPorAltura());

    }


}
