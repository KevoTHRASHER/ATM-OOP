package atm;

import java.util.Scanner;

public abstract class OperacionesATM {
	protected int entradaOperacionUsuario, retiro, deposito, saldo = 500;

	Scanner entradaTeclado = new Scanner(System.in);
	Menu mensajeroMenu = new Menu();


	public void ImprimeSaldo(){
		System.out.println("----------------------------------------------------");
		System.out.println("Tu SALDO es : " + saldo );
		System.out.println("----------------------------------------------------");
	}

	public void entradaRetiro() {
		System.out.println("Introduce la cantidad a RETIRAR : ");
		retiro = entradaTeclado.nextInt();
	}

	public abstract void OperacionesATM();
}
