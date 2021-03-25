package atm;

import java.util.Scanner;

public abstract class OperacionesATM {
	protected int entradaOperacionUsuario, retiro, deposito, saldo = 500;

	Scanner entradaTeclado = new Scanner(System.in);
	Menu mensajeroMenu = new Menu();

		public void entradaRetiro() {
		System.out.println("----------------------------------------------------");
		System.out.println("Introduce la cantidad a RETIRAR : ");
		System.out.println("----------------------------------------------------");
		retiro = entradaTeclado.nextInt();
	}

	public void entradaDeposito() {
		System.out.println("----------------------------------------------------");
		System.out.println("Introduce la cantidad a DEPOSITAR : ");
		System.out.println("----------------------------------------------------");
		deposito = entradaTeclado.nextInt();
	}

	public abstract void OperacionesATM();
}
