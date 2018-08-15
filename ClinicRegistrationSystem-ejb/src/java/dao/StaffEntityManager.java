/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Afiqah Rashid
 * A0160361R
 */

import entity.StaffEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import util.database.MySqlJdbcHelper;
import util.exception.EntityManagerException;

public class StaffEntityManager {
    
    public StaffEntityManager() {
    }
    
    public static List<StaffEntity> retrieve() throws EntityManagerException {
        
        List<StaffEntity> staffEntities = new ArrayList<>();
        staffEntities.add(new StaffEntity((long) 1, "Linda", "Chua", "manager", "password"));
        staffEntities.add(new StaffEntity((long) 2, "Barbara", "Durham", "nurse", "password"));
        return staffEntities;
        
        /*
        try {
            List<StaffEntity> staffEntities = new ArrayList<>();
            String sql = "SELECT * FROM staffentity ORDER BY STAFFID ASC;";
            
            Connection connection = new MySqlJdbcHelper().createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) {
                do {
                    staffEntities.add(new StaffEntity(resultSet.getLong("STAFFID"), resultSet.getString("FIRSTNAME"), resultSet.getString("LASTNAME"), resultSet.getString("USERNAME"), resultSet.getString("PASSWORD")));
                } while(resultSet.next());
            } 
            return staffEntities;
            
        } catch(NamingException | SQLException ex) {
            throw new EntityManagerException(ex.getMessage());
        } 
        */
        
    }
}
