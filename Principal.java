package atm;

import atm.Menu;
import atm.Retiro;
import atm.Deposito;
import atm.OperacionesATM;

public class Principal {
	public static void main(String[] args) {

		Menu mensajeroMenu = new Menu();
		mensajeroMenu.ImprimeMenu();

		//OperacionesATM mensajeroOperacionesATMConsultaSaldo = null;
		OperacionesATM mensajeroOperacionesATMConsultaSaldo = new ConsultaSaldo();

		switch(mensajeroMenu.entradaOperacionUsuario) {

			case 1:
				//OperacionesATM mensajeroOperacionesATMConsultaSaldo = new ConsultaSaldo();
				mensajeroOperacionesATMConsultaSaldo.OperacionesATM();
				mensajeroMenu.ImprimeMenu();
				break;
			case 2:
				OperacionesATM mensajeroOpercionesATMRetiro = new Retiro();
				mensajeroOpercionesATMRetiro.entradaRetiro();
				mensajeroOpercionesATMRetiro.OperacionesATM();
				//mensajeroOperacionesATMConsultaSaldo = new OperacionesATM();
				mensajeroOperacionesATMConsultaSaldo.OperacionesATM();
				mensajeroMenu.ImprimeMenu();
				break;
			case 3:
				OperacionesATM mensajeroOperacionesATMDeposito = new Deposito();
				mensajeroOperacionesATMDeposito.entradaDeposito();
				mensajeroOperacionesATMDeposito.OperacionesATM();
				mensajeroMenu.ImprimeMenu();
				break;
			case 4:
				System.out.println("	****PROGRAMA FINALIZADO****		");
				System.exit(0);
				break;
			default :	
				System.out.println("SELECCIONE UNA OPCIÓN VÁLIDA");
				mensajeroMenu.ImprimeMenu();
				break;
		}

/*		if(mensajeroMenu.entradaOperacionUsuario == 1) {
			OperacionesATM mensajeroOperacionesATMConsultaSaldo = new ConsultaSaldo();
			mensajeroOperacionesATMConsultaSaldo.OperacionesATM();
			mensajeroMenu.ImprimeMenu();
		}
		else if(mensajeroMenu.entradaOperacionUsuario == 2) {
			OperacionesATM mensajeroOpercionesATMRetiro = new Retiro();
			mensajeroOpercionesATMRetiro.entradaRetiro();
			mensajeroOpercionesATMRetiro.OperacionesATM();
			OperacionesATM mensajeroOperacionesATMConsultaSaldo = new ConsultaSaldo();
			mensajeroOperacionesATMConsultaSaldo.OperacionesATM();
			mensajeroMenu.ImprimeMenu();
		}
		else if(mensajeroMenu.entradaOperacionUsuario == 3) {
			OperacionesATM mensajeroOperacionesATMDeposito = new Deposito();
			mensajeroOperacionesATMDeposito.entradaDeposito();
			mensajeroOperacionesATMDeposito.OperacionesATM();
			mensajeroMenu.ImprimeMenu();
		}
		else if( mensajeroMenu.entradaOperacionUsuario == 4 ) {
			System.exit(0);
		}
		else {
			System.out.println("SELECCIONE UNA OPCIÓN VÁLIDA");
			mensajeroMenu.ImprimeMenu();
		}
*/
	}
}
