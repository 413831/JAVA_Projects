import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;


public class Formulario extends JFrame {
 private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField txtfield1;
  private JTextField txtfield2;
  private JLabel labelResultado;
  private JLabel lblPrecio;
  private JLabel lblPrecio2;
  private JLabel lblDescripcionDelArticulo;
  private JLabel lblDescripcionDelArticulo2;
  private JButton btnConsultaPorCdigo;
  private JLabel lblIngreseCdigoDe;
  private JTextField txtfield3;
  private JButton btnAlta;
 // VARIABLE DE  CLASE FORMULARIO 
  
  private JTextField txtfield11;
  private JTextField txtfield22;
  private JLabel labelResultado2;
  private JButton btnConsultaPorCdigo2;
  private JTextField txtfield33;
  private Sql sqlQuery;

  /**
   * Launch the application.
   */
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
        	Formulario frame = new Formulario();
        	frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
 

  /**
   * Create the frame.
   */
  public Formulario() {
    try{
      this.sqlQuery = new Sql("db1","root","");
      
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setBounds(100, 100, 606, 600);

      /* Creacion del Panel*/
      this.contentPane = new JPanel();
      this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      this.setContentPane(contentPane);
      this.contentPane.setLayout(null);
      
      /** Creacion de labels **/

      /* Descripcion */
      this.lblDescripcionDelArticulo = new JLabel("Descripción del artículo:");
      this.lblDescripcionDelArticulo.setBounds(23, 38, 193, 14);
      //lblDescripcinDelArtculo.setForeground(Color.white);
      this.contentPane.add(this.lblDescripcionDelArticulo);
      /* Precio */
      this.lblPrecio = new JLabel("Precio:");
      lblPrecio.setBounds(23, 74, 95, 14);
      contentPane.add(this.lblPrecio);
      /* Resultado */
      this.labelResultado = new JLabel("resultado");
      labelResultado.setBounds(361, 122, 229, 14);
      contentPane.add(this.labelResultado);
      /* Codigo de articulo */
      this.lblIngreseCdigoDe = new JLabel("Ingrese código de articulo a consultar:");
      lblIngreseCdigoDe.setBounds(23, 179, 243, 14);
      contentPane.add(this.lblIngreseCdigoDe);
      /* Descripcion 2 */
      this.lblDescripcionDelArticulo2 = new JLabel("Descripción del artículo:");
      this.lblDescripcionDelArticulo2.setBounds(23, 300, 193, 14);
      contentPane.add(this.lblDescripcionDelArticulo2);
      /* Precio 2 */
      this.lblPrecio2 = new JLabel("Precio:");
      this.lblPrecio2.setBounds(23, 336, 95, 14);
      contentPane.add(this.lblPrecio2);
      /* Resultado 2 */
      this.labelResultado2 = new JLabel("resultado");
      labelResultado2.setBounds(361, 374, 229, 14);
      contentPane.add(labelResultado2);

      /** Creacion de text fields **/
      this.txtfield1 = new JTextField();
      this.txtfield1.setBounds(247, 35, 193, 20);
      this.contentPane.add(this.txtfield1);
      this.txtfield1.setColumns(10);
      
      this.txtfield2 = new JTextField();
      this.txtfield2.setBounds(247, 71, 107, 20);
      this.contentPane.add(this.txtfield2);
      this.txtfield2.setColumns(10);
      
      this.txtfield3 = new JTextField();
      this.txtfield3.setBounds(247, 176, 86, 20);
      this.contentPane.add(this.txtfield3);
      this.txtfield3.setColumns(10);

      this.txtfield11 = new JTextField();
      this.txtfield11.setBounds(247, 297, 193, 20);
      this.contentPane.add(this.txtfield11);
      this.txtfield11.setColumns(10);
      
      this.txtfield22 = new JTextField();
      this.txtfield22.setBounds(247, 333, 107, 20);
      this.contentPane.add(this.txtfield22);
      this.txtfield22.setColumns(10);

      this.txtfield33 = new JTextField();
      this.txtfield33.setBounds(247, 375, 86, 20);
      this.contentPane.add(this.txtfield33);
      this.txtfield33.setColumns(10);

      /** Creacion de botones **/

      this.btnAlta = new JButton("Alta");
      this.btnAlta.addActionListener(this.altaProducto());
      this.btnAlta.setBounds(247, 118, 89, 23);
      this.contentPane.add(btnAlta);
      
      btnConsultaPorCdigo = new JButton("Consulta por código");
      btnConsultaPorCdigo.addActionListener(this.consultarProducto());
      btnConsultaPorCdigo.setBounds(23, 212, 177, 23);
      contentPane.add(btnConsultaPorCdigo);    
    
      btnConsultaPorCdigo2 = new JButton("Consulta por código");
      btnConsultaPorCdigo2.addActionListener(this.consultarProducto());
      btnConsultaPorCdigo2.setBounds(25, 374, 177, 23);
      contentPane.add(btnConsultaPorCdigo2);
        
      JButton btnNewButton2 = new JButton("Borrar");
      btnNewButton2.addActionListener(this.borrarProducto());
      btnNewButton2.setBounds(24, 408, 177, 23);
      contentPane.add(btnNewButton2);
      
      JButton btnNewButton_2 = new JButton("Modificar");
      btnNewButton_2.addActionListener(this.modificarProducto());
      btnNewButton_2.setBounds(21, 441, 179, 23);
      contentPane.add(btnNewButton_2);
      cargarDriver();
    }
    catch(SQLException ex)
    {
      setTitle(ex.toString());
    }
    catch(Exception ex)
    {
      setTitle(ex.toString());
    } 
  }
  
  public void paint(Graphics g){
	    super.paint(g);
	    g.setColor(Color.blue);
	    g.drawRoundRect(15, 50, 500, 140, 50, 50);
	    g.drawRoundRect(15, 200, 500, 90, 50, 50);
	    g.drawRoundRect(15, 300, 500, 210, 50, 50);
	   // g.fillRoundRect(15, 50, 500, 145, 6, 6);
	    
  }
  
  private void cargarDriver() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex) {
      setTitle(ex.toString());
    }
  }

  /* Button Events Listener */
  private ActionListener consultarProducto() throws SQLException
  {     
    ActionListener actionListener = new ActionListener(){
      public void actionPerformed(ActionEvent arg0) 
      {
       labelResultado.setText("");
        txtfield1.setText("");
        txtfield2.setText("");        
        try {
          Query query = new Query("articulos");
          ResultSet result;
          result = sqlQuery.select(query, "id = "+ txtfield3.getText());
          if (result.next()==true) 
          {
            txtfield1.setText(result.getString("descripcion"));
            txtfield2.setText(result.getString("precio"));
          } else
           {
            labelResultado.setText("No existe un artículo con dicho código");
          }
        } catch(SQLException ex){
          setTitle(ex.toString());
        }
      }
    };
    return actionListener;
  }

  private ActionListener altaProducto() throws SQLException
  {     
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        labelResultado.setText("");        
        try {
          Query query = new Query("articulos");
          /* Set method to retrieve data from controls */
          
          if(sqlQuery.insert(query))
          {
            labelResultado.setText("se registraron los datos");
            txtfield1.setText("");
            txtfield2.setText("");
          }
        } catch(SQLException ex){
          setTitle(ex.toString());
        }
      }
    };
    return actionListener;
  }

  private ActionListener borrarProducto() throws SQLException
  {     
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent arg0) 
      {
        labelResultado2.setText("");
        try 
        {
          Query query = new Query("articulos");
          int cantidad = sqlQuery.delete(query,"id = " + txtfield33.getText());
          if (cantidad >= 1) 
          {
            txtfield11.setText("");
            txtfield22.setText("");        
            labelResultado2.setText("Se borro el artículo con dicho código");
          } else {
            labelResultado2.setText("No existe un artículo con dicho código");
          }
        } catch(SQLException ex)
        {
          setTitle(ex.toString());
        }        
      }
    };
    return actionListener;
  }

  private ActionListener modificarProducto() throws SQLException
  {     
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        labelResultado2.setText("");
        try {
          Query query = new Query("articulos");
         
          if (sqlQuery.update(query, "id = " + txtfield33.getText())) 
          {
            labelResultado2.setText("Se modifico la descripcion y el precio del artículo con dicho código");
          } else {
            labelResultado2.setText("No existe un artículo con dicho código");
          }
        } catch(SQLException ex){
          setTitle(ex.toString());
        }                
      }
    };
    return actionListener;
  }
}
