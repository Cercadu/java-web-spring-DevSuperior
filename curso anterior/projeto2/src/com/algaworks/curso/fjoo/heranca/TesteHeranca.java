package com.algaworks.curso.fjoo.heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "Cadu";
        j.idade = 37;
        j.time = "S�o Paulo";

        j.seApresentar();
        j.dizerSeAindaJoga();
        j.time();
        

    }
}
