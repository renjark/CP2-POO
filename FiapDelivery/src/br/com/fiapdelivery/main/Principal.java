package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== FIAP DELIVERY ===");

        Caminhao caminhao = new Caminhao("NEO9738", 1000, 6);
        Pacote pacote = new Pacote("BR873", 10.5);

        Rota rota1 = new Rota(pacote, caminhao);
        rota1.iniciarEntrega();

        Moto moto = new Moto("LOP3619", 50, true);

        Rota rota2 = new Rota(pacote, moto);
        rota2.iniciarEntrega();
    }
}