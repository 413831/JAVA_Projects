import javax.swing.JOptionPane;
import java.util.Scanner;


public class Calculo {

	public static int suma(int numeroUno,int numeroDos)
	{
		return numeroUno + numeroDos; //Sin validacion
	}

	public static int resta(int numeroUno,int numeroDos)
	{
		return numeroUno - numeroDos; //Sin validacion
	}

	public static double division(int numeroUno,int numeroDos)
	{
		double resultado = 0;

		if(numeroDos == 0)
		{
			JOptionPane.showMessageDialog(null,"No es posible división por cero");
		}
		else
		{
			resultado = numeroUno / numeroDos;
		}
		return (double)resultado;
	}

	public static long multiplicacion(int numeroUno,int numeroDos)
	{
		return numeroUno * numeroDos; //Sin validar
	}

	public static void tablasMultiplicar(int numero)
	{
		int i;
		String tabla = new String();

		if(numero > 0)
		{
			for(i = numero;i<=numero*10;i+=numero)
			{
			//	System.out.print("\n"+Integer.toString(i));
				tabla = tabla.concat(Integer.toString(i)+"\n");

			}
			JOptionPane.showMessageDialog(null,tabla);

		}
	}

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
		input.close();
	}

	public static void factorial(int numero)
	{
		long factorial=1;
		int i;

		for(i=1;i<=numero;i++){
			factorial*=i;
		}
		System.out.println("El factorial de "+numero+" es "+factorial);
	}

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
}
