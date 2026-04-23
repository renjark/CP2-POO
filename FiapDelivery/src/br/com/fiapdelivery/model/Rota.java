public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {

        System.out.println("\n--- INICIANDO ENTREGA ---");

        // REGRA DE NEGÓCIO (Aula 2)
        if (pacote.getPeso() > veiculo.getCapacidade()) {
            System.out.println("❌ ERRO: Veículo não suporta o peso do pacote!");
            return;
        }

        pacote.atualizarStatus("Em transporte");

        System.out.println("Pacote: " + pacote.getCodigo());
        System.out.println("Peso: " + pacote.getPeso() + "kg");
        System.out.println("Veículo: " + veiculo.getPlaca());
        System.out.println("Status: " + pacote.getStatus());

        finalizarEntrega();
    }

    private void finalizarEntrega() {
        pacote.atualizarStatus("Entregue");

        System.out.println("✅ Entrega finalizada!");
        System.out.println("Status final: " + pacote.getStatus());
    }
}
