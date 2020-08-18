import java.awt.EventQueue;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
		      public void run() {
		        try {
		        //	ClasePrincipal frame = new ClasePrincipal();
		        	Formulario frame = new Formulario();
		           	frame.setVisible(true);
		        } catch (Exception e) {
		          e.printStackTrace();
		        }
		      }
		    });
	}

}
