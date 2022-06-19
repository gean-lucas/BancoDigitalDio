
public class Main {

	public static void main(String[] args) {
		Cliente gean = new Cliente("Gean");
		
		Conta cc = new ContaCorrente(gean);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(gean);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
