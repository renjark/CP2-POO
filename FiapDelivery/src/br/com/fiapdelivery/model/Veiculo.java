package br.com.fiapdelivery.model;

public abstract class Veiculo {

    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        if (placa == null || placa.isEmpty()) {
            System.out.println("Placa inválida!");
            return;
        }
        if (capacidade <= 0) {
            System.out.println("Capacidade inválida!");
            return;
        }

        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidade() {
        return capacidade;
    }
}