/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.database;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Afiqah Rashid
 * A0160361R
 */

public class MySqlJdbcHelper {
    public Connection createConnection() throws NamingException, SQLException
    {
        Context context = new InitialContext();
        DataSource dataSource = (DataSource)context.lookup("jdbc/clinicregistrationsystem");
        
        return dataSource.getConnection();
    }
}

