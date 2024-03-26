// Classe filha ContaPoupanca
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String tipoConta, String tipoCliente, String dataAbertura, double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calcularValorTarifaManutencao() {
        // Implementação específica para ContaPoupanca
        return 0;
    }
}