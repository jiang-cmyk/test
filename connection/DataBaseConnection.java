package connection;

import java.sql.*;

/*String dbURL = "jdbc:sqlserver://localhost:53327;Database=master";
///////���ӵ����ݿ�
	String userName = "sa";
	String userPaw = "123456";
	    	String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
*/
public class DataBaseConnection{
    private final String DBDriver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String DBURL ="jdbc:sqlserver://localhost:53327;Database=master";
    private final String DBUSER ="sa";
    private final String DBPASSWORD ="123456";
    private Connection conn = null;
//������
    public DataBaseConnection(){
       try{
           Class.forName(DBDriver);
           conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
           }
        catch(Exception e){  }
                                 }

//�������
public Connection getConnection(){
return this.conn; }

//�ر�����
public void close() throws SQLException{
    this.conn.close(); }
} 
