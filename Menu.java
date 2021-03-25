package atm;

import java.util.Scanner;

public class Menu {

	protected int entradaOperacionUsuario;
	Scanner entradaTeclado = new Scanner(System.in);

	public void ImprimeMenu() {
		System.out.println("*****	BANCO THRASHER		****\nPor favor seleccione una operacion :\n	1.- Consulta Saldo\n	2.- Retiro Efectivo\n	3.- Deposito Efectivo\n	4.- SALIR");
		entradaOperacionUsuario = entradaTeclado.nextInt();
	}
}
