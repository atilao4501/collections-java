package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> _convidadosSet;

    public ConjuntoConvidados() {
        this._convidadosSet = new HashSet<>();
    }

    public void AdicionarConvidado(String nome, int codigoConvite){
        this._convidadosSet.add(new Convidado(nome,codigoConvite));
    }

    public void RemoverConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : _convidadosSet){
            if(_convidadosSet.isEmpty()){
                System.out.println("Não há nada para remover! O set está vazio");
                break;
            }
            if (c.get_codigoConvite() == codigoConvite){
                convidadoParaRemover = c;
            }
        }
        _convidadosSet.remove(convidadoParaRemover);
    }

    public int ContarConvidados(){
        return _convidadosSet.size();
    }

    public void ExibirConvidados(){
        System.out.println(_convidadosSet);
    }

    public static void main(String[] args){
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.AdicionarConvidado("cleyton", 14);
        conjuntoConvidados.AdicionarConvidado("Cleber", 25);
        conjuntoConvidados.AdicionarConvidado("Rasta", 2);
        conjuntoConvidados.AdicionarConvidado("Berto", 25);

        conjuntoConvidados.ExibirConvidados();

        System.out.println(conjuntoConvidados.ContarConvidados());

        conjuntoConvidados.RemoverConvidado(2);

        System.out.println(conjuntoConvidados.ContarConvidados());

        conjuntoConvidados.ExibirConvidados();
    }
}
