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
        if (novoStatus != null && !novoStatus.isEmpty()) {
            this.status = novoStatus;
        } else {
            System.out.println("Status inválido!");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getStatus() {
        return status;
    }

    private void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido!");
        }
    }
}
