package atm;

public class Retiro extends OperacionesATM {

	@Override
	public void OperacionesATM() {
		saldo = saldo - retiro;
	}
}
