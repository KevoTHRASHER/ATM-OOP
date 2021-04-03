package atm;

public class ConsultaSaldo extends OperacionesATM {

	@Override
	public void OperacionesATM(){
		System.out.println("----------------------------------------------------");
		System.out.println("Tu SALDO es : " + saldo );
		System.out.println("----------------------------------------------------");
	}

}
