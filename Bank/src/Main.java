import java.util.Scanner;
import java.util.HashMap;

/*
/ Programa para simular operaciones básicas de un cajero
/ Sección para el usuario (operaciones)
/ Sección interna para creación y enlace de cuentas (Base de datos)
/ Se implementa login.
/ Se utiliza HashMap en reemplazo de base de datos.
/
/ Clases:
/ BankAccount (Cuenta bancaria enlazada al cliente)
/ Customer (Cliente con sus datos personales)
/ Controller (Operaciones del programa)
/ View (Ejemplo para interactuar con usuario)
/ Validation (validaciones de datos)
/
*/
public class Main
{
	public static void main(String[] args)
	{
		HashMap<long,BankAccount> accountsList = new LinkedList<BankAccount>(); 
		BankAccount account;

		Controller.create(accountsList);//Creacion de cuenta
		account = Controller.login(accountsList);//Acceso a cuenta
		if(account != null)
		{
			Controller.menu(account);//Operaciones
		}
	}
}


