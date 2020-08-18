import java.util.Scanner;

public class Calculos{
	Scanner input = new Scanner(System.in);

	/**
	*\brief Calcular promedio de n numeros ingresados por el usuario
	*\param void
	*\return void
	*/
	public static void promedio()
	{
		Scanner input = new Scanner(System.in);
		int numero;
		int total = 0;
		int contador = 0;
		int opcion;

		do
		{
			System.out.print("Ingrese un numero: ");
			numero = input.nextInt();
			total+=numero;
			contador++;
			System.out.print("Continuar?\n 1) Si\n 0) No\n");
			opcion = input.nextInt();
		}while(opcion == 1);
		System.out.println("El promedio es: "+(double)(total / contador));
	}

	/**
	*\brief Calcular factorial de un numero
	*\param int numero Numero del que se calcula factorial
	*\return void
	*/
	public static void factorial(int numero)
	{
		long factorial=1;
		int i;

		for(i=1;i<=numero;i++){
			factorial*=i;
		}
		System.out.println("El factorial de "+numero+" es "+factorial);
	}

	/**
	*\brief Calcular porcentaje
	*\param int numero Total del que se calcula porcentaje
	*\param int porcentaje Porcentaje a calcular
	*\return void
	*/
	public static void porcentaje(int numero,int porcentaje)
	{
		double resultado = 0;

		if(porcentaje <= 100)
		{
			resultado = (numero * porcentaje);
			resultado /= 100;
		}
		System.out.println("El "+porcentaje+"% de "+numero+" es "+resultado);
	}

	/**
	*\brief Suma de dos numeros
	*\param int primerNumero
	*\param int segundoNumero
	*\return Retorna suma de ambos numeros
	*/
	public static int suma(int primerNumero,int segundoNumero)
	{
		return primerNumero + segundoNumero;
	}
	/**
	*\brief Resta de dos numeros
	*\param int primerNumero
	*\param int segundoNumero
	*\return Retorna resta de ambos numeros
	*/
	public static int resta(int primerNumero,int segundoNumero)
	{
		return primerNumero - segundoNumero;
	}
	/**
	*\brief Multiplicacion de dos numeros
	*\param int primerNumero
	*\param int segundoNumero
	*\return Retorna multiplicacion de ambos numeros
	*/
	public static int multiplicacion(int primerNumero,int segundoNumero)
	{
		return primerNumero * segundoNumero;
	}
	/**
	*\brief Division de dos numeros
	*\param int primerNumero
	*\param int segundoNumero
	*\return Retorna division de ambos numeros
	*/
	public static double division(int primerNumero,int segundoNumero)
	{
		try{
			return primerNumero / segundoNumero;
		}
		catch(ArithmeticException divisionZero)
		{
			System.out.println("Can't divide by zero");
		}
	}
	/**
	*\brief Busca el numero mayor entre dos numeros
	*\param int primerNumero
	*\param int segundoNumero
	*\return Retorna el numero mayor entre ambos
	*/
	public static int major(int primerNumero,int segundoNumero)
	{
		if(primerNumero > segundoNumero)
		{
			return primerNumero;
		}
		else
		{
			return segundoNumero;
		}
	}
	/**
	*\brief Busca el numero menor entre dos numeros
	*\param int primerNumero
	*\param int segundoNumero
	*\return Retorna el numero menor entre ambos
	*/
	public static int minor(int primerNumero,int segundoNumero)
	{
		if(primerNumero < segundoNumero)
		{
			return primerNumero;
		}
		else
		{
			return segundoNumero;
		}
	}

	/**
	*\brief Compara si son iguales dos numeros
	*\param int primerNumero
	*\param int segundoNumero
	*\return Retorna true si son iguales sino false
	*/
	public static boolean equals(int primerNumero,int segundoNumero)
	{
		if(primerNumero == segundoNumero)
		{
			return true;
		}
	}



	public static void main(String[] args)
	{
		//Calculos.promedio();
		//Calculos.factorial(4);
		Calculos.porcentaje(200,20);
	}


}