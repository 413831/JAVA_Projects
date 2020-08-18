import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		int numeroUno;
		int numeroDos;
		char opcion;

		do
		{
			numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
			numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

			JOptionPane.showMessageDialog(null,"El resultado de la suma es "+
			Calculo.suma(numeroUno, numeroDos)+
			"\nEl resultado de la resta es "+Calculo.resta(numeroUno, numeroDos)+
			"\nEl resultado de la division es "+Calculo.division(numeroUno, numeroDos)+
			"\nEl resultado de la multiplicacion es "+Calculo.multiplicacion(numeroUno, numeroDos));

			Calculo.tablasMultiplicar(numeroUno);
			Calculo.tablasMultiplicar(numeroDos);
			Calculo.factorial(numeroUno);
			Calculo.promedio();
			Calculo.porcentaje(200,numeroUno);

			opcion = JOptionPane.showInputDialog("Desea continuar?").charAt(0);

		}while(opcion == 's');
	}

}
