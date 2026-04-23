package br.com.fiapdelivery.model;

public class Veiculo {

    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.setPlaca(placa);
        this.setCapacidade(capacidade);
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    private void setPlaca(String placa) {
        if (placa != null && !placa.isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Erro: placa inválida");
        }
    }

    private void setCapacidade(double capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Erro: capacidade inválida");
        }
    }
}
