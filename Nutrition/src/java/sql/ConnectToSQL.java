/*
 * Database connection pool (DBCP) a collection of connection objects that's
stored in another object. This limits the number of times that connections 
are opened as well as the total number of connection objects. 
DataSource interface
https://docs.oracle.com/javase/8/docs/api/index.html
Tomcat
https://tomcat.apache.org/tomcat-8.0-doc/jndi-resources-howto.html
"Note that the resource name (here, bean/MyBeanFactory must match the 
value specified in the web application deployment descriptor. "

This is connected to the context.xml file that configures the connection pool
javax.sql.DataSource - Interface for Jakarta's connectin pool used to store the connections
javax.naming.InitialContext - Jakarta class that gets a DataSource object

To use the Singleton ConnectionToSQL:
    ConnectToSQL pool = ConectToSQL.getInstance();
    Connection connection = pool.getConnection();
This will return the pool back
    pool.freeConnection(connection);
*/
package sql;

import java.sql.*;               
import javax.sql.DataSource;    
import javax.naming.InitialContext;   
import javax.naming.NamingException;

/**
 *
 * @author Tender
 */
public class ConnectToSQL {
    
    private static ConnectToSQL pool = null;
    private static DataSource dataSource = null;
    
    // connect to mySql with automatic driver loading
    // set to private to encapsulate connection
    private ConnectToSQL() {
        try {
            InitialContext ic = new InitialContext();
            // the end of the string that's passed to the lookup method matches 
            // the name attribute that's specified in the context.xml file.
            // ic.lookup: Resource manger: JDBC 
            //            Connection Factory Type: javax.sql.DataSource
            //            JNDI Subcontext: java:comp/env/jdbc
            //            context.xml name="jdbc/nutrition" OR jdbc/recipes ?
            dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/RecipesDB");
                        
        } catch (NamingException e) {
            System.out.println(e);
        }
    }
    // Singleton pattern
    // the private constructor and the getInstance method of the ConnectionToSQL 
    // class allow only a single instance of the ConnectionToSQL to be created. 
    // Commonly used to make sure that only a single instance of an object 
    // is created.
    public static synchronized ConnectToSQL getInstance() {
        if (pool == null) {
            pool = new ConnectToSQL();
        }
        return pool;
    }
    
    // Connection object used to get access to database. getConnection is a
    // method of the DataSource object
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
