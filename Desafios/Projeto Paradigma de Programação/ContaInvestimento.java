// Classe filha ContaInvestimento
public class ContaInvestimento extends Conta {
    public ContaInvestimento(String tipoConta, String tipoCliente, String dataAbertura, double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calcularValorTarifaManutencao() {
        // Implementação específica para ContaInvestimento
        return 0;
    }
}