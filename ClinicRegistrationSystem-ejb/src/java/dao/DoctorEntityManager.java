/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.ConsultationEntity;
import entity.DoctorEntity;
import entity.PatientEntity;
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
public class DoctorEntityManager {
    public DoctorEntityManager() {
    }

    public static List<DoctorEntity> retrieve() throws EntityManagerException { 
        
        List<DoctorEntity> doctorEntities = new ArrayList<>();
        doctorEntities.add(new DoctorEntity((long) 1, "Peter", "Lee", "S18018", "MBBS"));
        doctorEntities.add(new DoctorEntity((long) 2, "Cindy", "Leong", "S64921", "BMedSc"));
        doctorEntities.add(new DoctorEntity((long) 3, "Matthew", "Liu", "S38101", "MBBS"));
        return doctorEntities;
        
        /*
        try {
            List<DoctorEntity> doctorEntities = new ArrayList<>();
            String sql = "SELECT * FROM doctorentity ORDER BY DOCTORID ASC;";
            
            Connection connection = new MySqlJdbcHelper().createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) {
                do {
                    doctorEntities.add(new DoctorEntity(resultSet.getLong("DOCTORID"), resultSet.getString("FIRSTNAME"), resultSet.getString("LASTNAME"), resultSet.getString("REGISTRATION"), resultSet.getString("QUALIFICATIONS")));
                } while(resultSet.next());
            } 
            return doctorEntities;
            
        } catch(NamingException | SQLException ex) {
            throw new EntityManagerException(ex.getMessage());
        }
        */

    }
    
    public static DoctorEntity create(DoctorEntity newDoctorEntity) throws EntityManagerException {
        return newDoctorEntity;
    }
    
    public static void update(DoctorEntity doctorEntity) throws EntityManagerException {
        
    }

    public static void delete(DoctorEntity doctorEntity) throws EntityManagerException {
    }
}
