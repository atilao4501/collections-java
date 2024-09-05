package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> _listaNumeros;

    public OrdenacaoNumeros() {
        this._listaNumeros = new ArrayList<>();
    }

    public void AdicionarNumeros(int num){
        _listaNumeros.add(num);
    }

    public List<Integer> OrdenarAscendente(){
        List<Integer> ordenadosAscendente = new ArrayList<>(_listaNumeros);

        Collections.sort(ordenadosAscendente);

        return ordenadosAscendente;
    }

    public List<Integer> OrdenarDescendente(){
        List<Integer> ordenadosDecrescente = new ArrayList<>(_listaNumeros);

        Collections.sort(ordenadosDecrescente, Collections.reverseOrder());

        return ordenadosDecrescente;
    }

    public void ExibirNumeros(){
        if (!_listaNumeros.isEmpty()){
            System.out.println(_listaNumeros);
        }
        else{
            System.out.println("Não há nada na lista");
        }
    }


    public static void main(String[] args){


        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.ExibirNumeros();

        ordenacaoNumeros.AdicionarNumeros(5);
        ordenacaoNumeros.AdicionarNumeros(2);
        ordenacaoNumeros.AdicionarNumeros(15);

        System.out.println(ordenacaoNumeros.OrdenarAscendente());

        ordenacaoNumeros.ExibirNumeros();

        System.out.println(ordenacaoNumeros.OrdenarDescendente());

    }
}

