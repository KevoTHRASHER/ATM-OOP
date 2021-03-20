package atm;

import atm.Menu;
import atm.Retiro;
import atm.Deposito;
import atm.ConsultaSaldo;
import atm.OperacionesATM;

public class Principal {
	public static void main(String[] args) {

		OperacionesATM mensajeroOperacionesATM = new OperacionesATM();
		System.out.println(mensajeroOperacionesATM.entradaOperacionUsuario());

		if(mensajeroOperacionesATM.entradaOperacionUsuario == 1) {
			mensajeroOperacionesATM.ImprimeSaldo();
			mensajeroOperacionesATM.EntradaOperacionMenuUsuario();
		}
		else if(mensajeroOperacionesATM.entradaOperacionUsuario == 2) {
			OperacionesATM mensajeroRetiro = new Retiro();
			mensajeroRetiro.OperacionesATM();
			mensajeroRetiro.ImprimeSaldo();
			mensajeroRetiro.ImprimeSaldo();
		}
		else if(mensajeroOperacionesATM.entradaOperacionUsuario == 3) {
			OperacionesATM mensajeroDeposito = new Deposito();
			mensajeroDeposito.OperacionesATM();
			mensajeroDeposito.ImprimeSaldo();
			mensajeroDeposito.entradaOperacionUsuario();
		}
		else if( mensajeroOperacionesATM.entradaOperacionUsuario == 4 ) {
			System.exit(0);
		}
		else {
			System.out.println("SELECCIONE UNA OPCIÓN VÁLIDA");
			mensajeroOperacionesATM.EntradaOperacionUsuario();
		}

	}
}
