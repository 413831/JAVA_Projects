import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql
{
    Connection conexion;
    Statement comando;
    ResultSet registro;
    String baseDeDatos;
    String user;
    String pass;
    Boolean dbReturn;

    public Sql(String baseDeDatos, String user, String pass)
    {
        this.baseDeDatos = baseDeDatos;
        this.user = user;
        this.pass = pass;
    }
    
    public Boolean conectar()
    {
        this.dbReturn = false;

        try
        {
            this.conexion= DriverManager.getConnection("jdbc:mysql://localhost/"+this.baseDeDatos, this.user, this.pass);
            this.comando= conexion.createStatement();
            this.dbReturn = true;
            return this.dbReturn;
        }
        catch(SQLException e)
        {
            return this.dbReturn;
        }        
    }

    public ResultSet select(Query query, String condicion) throws SQLException
    {
        try 
        {            
            List<String> keys = new ArrayList<String>(query.values.keySet());
            ResultSet result = null;

            if(this.conectar())
            {
                result = comando.executeQuery("select"+ String.join(",",keys) + " from "+query.table+" WHERE " + condicion);
                /*Retornar algun tipo de mensaje*/                 
            }            
            return result;
        } 
        catch(SQLException ex)
        {
            throw ex;
        }
        finally
        {                        
            conexion.close();
        }
    }

    public Boolean insert(Query query) throws SQLException
    {
        try 
        {            
            List<String> keys = new ArrayList<String>(query.values.keySet());
            List<String> values = new ArrayList<String>(query.values.values());
            
            this.dbReturn = false;
            
            if(this.conectar())
            {
                comando.executeUpdate("insert into "+query.table+"("+String.join(",",keys)+") values ('"+String.join("'',''",values)+")");
                /*Retornar algun tipo de mensaje*/                 
                this.dbReturn = true;
            }            
            return dbReturn;
        } 
        catch(SQLException ex)
        {
            throw ex;
        }
        finally
        {                        
            conexion.close();
        }
    }

    public Boolean update(Query query,String condicion) throws SQLException
    {
        try 
        {            
            List<String> keys = new ArrayList<String>(query.values.keySet());
            int cantidad = 0;
            StringBuilder stringQuery;

            this.dbReturn = false;
            
            if(this.conectar())
            {
                stringQuery = new StringBuilder("update " + query.table + " set ");
                keys.stream().forEach(key -> stringQuery.append(key + "=" + query.values.get(key)));

                cantidad = comando.executeUpdate(stringQuery + " where "+ condicion);
                if(cantidad > 0)
                {
                    this.dbReturn = true;
                }                 
            }            
            return dbReturn;
        } 
        catch(SQLException ex)
        {
            throw ex;
        }
        finally
        {                        
            conexion.close();
        }
    }

    public int delete(Query query,String condicion) throws SQLException
    {
        try 
        {                     
            int retorno = 0;

            if(this.conectar())
            {
                retorno = comando.executeUpdate("delete from" + query.table + " where " + condicion);
            }            
            return retorno;
        } 
        catch(SQLException ex)
        {
            throw ex;
        }
        finally
        {                        
            conexion.close();
        }
    }

}