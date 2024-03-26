// public aspect VerificarSaldoAspect {
//     pointcut sacarPointcut(Conta conta, double valor) :
//         call(public void Conta.sacar(double)) && target(conta) && args(valor);

//     before(Conta conta, double valor) : sacarPointcut(conta, valor) {
//         if (conta.getSaldo() < valor) {
//             System.out.println("Saldo insuficiente para sacar " + valor + " da conta " + conta.getTipoConta());
//             // Aqui pode ser implementada uma lógica para lançar uma exceção, por exemplo
//         }
//     }
// }