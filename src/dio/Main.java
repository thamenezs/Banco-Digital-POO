package dio;

public class Main {

    public static void main(String[] args) {
            Cliente espezzialy = new Cliente();
            espezzialy.setNomeCliente("Espezzialy");

            Conta cc = new ContaCorrente(espezzialy);
            Conta poupanca = new ContaPoupanca(espezzialy);

            cc.depositar(100);
            cc.extrato();
            cc.sacar(50);
            cc.extrato();
    }
}
