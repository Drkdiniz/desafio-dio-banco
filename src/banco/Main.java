package banco;

public class Main {
    public static void main(String[] args) {
        Cliente derek = new Cliente();
        derek.setNome("Derek");

        Conta cc = new ContaCorrente(derek);
        Conta cp = new ContaPoupança(derek);

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

