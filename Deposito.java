package atm;

public class Deposito extends OperacionesATM {

	@Override
	public void OperacionesATM() {
		saldo = saldo + deposito;
	}
}
