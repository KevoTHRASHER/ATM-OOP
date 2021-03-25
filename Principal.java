package atm;

import atm.Menu;
import atm.Retiro;
import atm.Deposito;
import atm.OperacionesATM;

public class Principal {
	public static void main(String[] args) {

		Menu mensajeroMenu = new Menu();
		mensajeroMenu.ImprimeMenu();

		if(mensajeroMenu.entradaOperacionUsuario == 1) {
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

	}
}
