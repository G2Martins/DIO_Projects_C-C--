public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Poupança", "Pessoa", "01/01/2024", 1000);
        ContaInvestimento contaInvestimento = new ContaInvestimento("Investimento", "Empresa", "01/01/2024", 5000);

        contaPoupanca.sacar(200); // Saque permitido, saldo suficiente
        contaInvestimento.sacar(6000); // Saque bloqueado, saldo insuficiente
    
    }
}

