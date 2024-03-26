// Classe mãe Conta
public class Conta {
    private String tipoConta;
    private String tipoCliente;
    private String dataAbertura;
    private double saldo;

    public Conta(String tipoConta, String tipoCliente, String dataAbertura, double saldo) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double calcularValorTarifaManutencao() {
        return 0; // Implementação específica em subclasses
    }
}






