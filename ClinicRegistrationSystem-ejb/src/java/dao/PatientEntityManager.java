/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.DoctorEntity;
import entity.PatientEntity;
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

/**
 *
 * @author Afiqah Rashid
 * A0160361R
 */
public class PatientEntityManager {
    
    public PatientEntityManager() {
    }

    public static List<PatientEntity> retrieve() throws EntityManagerException { 

        List<PatientEntity> patientEntities = new ArrayList<>();
        patientEntities.add(new PatientEntity((long) 1, "Tony", "Teo", "Male", 44, "S7483027A", "87297373", "11 Tampines Ave 3"));
        patientEntities.add(new PatientEntity((long) 2, "Wendy", "Tan", "Female", 35, "S8381028X", "97502837", "15 Computing Drive"));
        return patientEntities;
        /*
        try {
            List<PatientEntity> patientEntities = new ArrayList<>();
            String sql = "SELECT * FROM patiententity ORDER BY PATIENTID ASC;";
            
            Connection connection = new MySqlJdbcHelper().createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) {
                do {
                    patientEntities.add(new PatientEntity(resultSet.getLong("PATIENTID"), resultSet.getString("FIRSTNAME"), resultSet.getString("LASTNAME"), resultSet.getString("GENDER"), resultSet.getInt("AGE"), resultSet.getString("IDENTITYNUMBER"), resultSet.getString("PHONE"), resultSet.getString("ADDRESS")));
                } while(resultSet.next());
            } 
            return patientEntities;
            
        } catch(NamingException | SQLException ex) {
            throw new EntityManagerException(ex.getMessage());
        }
        */

    }
    
    public static void update(PatientEntity patientEntity) throws EntityManagerException {
    }

    public static void delete(PatientEntity patientEntity) throws EntityManagerException {
    }
}
