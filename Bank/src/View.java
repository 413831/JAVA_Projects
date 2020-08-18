import java.util.*;

class View
{	
	//Mejorar proximamente
	public static Scanner input = new Scanner(System.in);
	public static String bufferString;
	public static long bufferLong;

	/**
	*\brief Entrada de un string con mensaje personalizable
	*\param message Mensaje para mostrar al usuario
	*\return Retorna el texto ingresado por el usuario
	*/
	public static String inputString(String message)
	{
		try{
			System.out.print(message);
			bufferString = input.nextLine();
			return bufferString;
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		finally
		{
			return bufferString;
		}
	}
	/**
	*\brief Entrada de un numero long con mensaje personalizable
	*\param message Mensaje para mostrar al usuario
	*\return Retorna el numero ingresado por el usuario
	*/
	public static long inputLong(String message)
	{
		try{
			System.out.print(message);
			bufferLong = input.nextLong();
			//validation.id() -- dni valido
			input.nextLine();
		}
		catch(Exception e)
		{
			System.out.println("Error");	
		}
		finally
		{
			return bufferLong;
		}
	}	
}