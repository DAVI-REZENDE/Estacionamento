import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexcaoBancoDeDados {
	
	String server = "localhost";
    String port = "3306";               // Porta TCP padrão do MySQL
    String database = "estacionamento";
    String user = "root";
    String passwd = "Info@1234";
    String url = "jdbc:mysql://" + server + ":" + port + "/" + database;

    
	public Connection getConnection(){
		
        Connection con = null ;
		try {
			con = DriverManager.getConnection(url, user, passwd);
			System.out.println("Abrindo uma conexao");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return con;
        
	}
	
	//public Collection 
	
	//Statement statement = con.createStatement();

}
