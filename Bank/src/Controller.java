import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.*;

class Controller extends HashMap
{
	private static Scanner input = new Scanner(System.in);
	private static BankAccount account;
	private static Customer customer;
	private static ArrayList<Integer> indexArray = new ArrayList<Integer>();
	private static int index = 0;

	/**
	*\brief Carga los datos de las cuentas preexistentes
	*\param list Es el listado de cuentas para utilizar
	*\return Retorna true si se logra cargar sino retorna false
	*/
	public static boolean loadData(HashMap<long,BankAccount> list)
	{
		File dataAccounts;
		FileReader

		try{
			dataAccounts = new File("bankAccounts.txt");//Ejemplo

		}
		catch(Exception noFile)
		{
			System.out.println("File doesn\'t exist");
		}



	}

	/**
	*\brief Creacion de una cuenta bancaria
	*\param list Es el listado donde se carga la cuenta creada
	*\return Retorna true si se logra realizar el alta sino false
	*/
	public static boolean create(HashMap<long,BankAccount> list)//Agregar validaciones
	{	
		try//Verificar que no exista cliente
		{
			customer = new Customer(View.inputString(),View.inputLong());//Alta de cliente
			account = new BankAccount(customer);//Alta de cuenta
			//validation.newAccount()--Verificar si ya existe
			list.put(customer.getId(),account);//Carga a la "base de datos"
		//	indexArray.add(index);//Indexación de la cuenta
			index++;
			return true;
		}
		catch(Exception NullPointerException)
		{
			System.out.print("Error");
			return false;
		}
	}
	/**
	*\brief Login de usuario a cuenta
	*\param list Es el listado de cuentas existentes
	*\return Retorna un objeto tipo BankAccount sino retorna NULL
	*/
	public static BankAccount login(HashMap<long,BankAccount> list)//Retorna numero de cuenta
	{
		//Algun tipo de validacion
		long auxId;
		BankAccount auxiliar;
		BankAccount returnValue = null;
		int tries = 3;

		do
		{
			try
			{
				auxId = View.inputLong();
				auxiliar = getById(list,auxId);//Se busca id en lista
				
				if(auxiliar != null)//Comparacion
				{
					System.out.println("Welcome!");
					returnValue = auxiliar;
					break;
				}
			}
			catch(Exception NullPointerException)
			{
				System.out.println("Incorrect ID");
				tries--;//Reintentos
			}
		}while(tries != 0);
		return returnValue;
	}

	/**
	*\brief Menu de opciones para trabajar con una cuenta bancaria
	*\param account Es la cuenta recibida para utilizar
	*\return void
	*/
	public static void menu(BankAccount account)
	{
		int option;
		int amountValue = 0;

		do
		{
			System.out.print("\nMENU\n1) Deposit\n2) Withdraw\n3) Display\n4) Exit\n-> ");
			option = input.nextInt();

			switch(option)
			{
				case 1 :
					System.out.print("Indicate amount to deposit: \n-> ");
					amountValue = input.nextInt();
					account.deposit(amountValue);
					break;
				case 2 :
					System.out.print("Indicate amount to withdraw: \n-> ");
					amountValue = input.nextInt();
					account.withdraw(amountValue);
					break;
				case 3 :
					account.display();
					break;
			}
		}while(option != 4);
	}
}