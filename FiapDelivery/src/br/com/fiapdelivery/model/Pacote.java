package br.com.fiapdelivery.model;

public class Pacote {

    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso) {
        this.codigo = codigo;
        this.setPeso(peso);
        this.status = "Pendente";
    }

    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.isEmpty()) {
            System.out.println("Status inválido!");
            return;
        }
        this.status = novoStatus;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getStatus() {
        return status;
    }

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}