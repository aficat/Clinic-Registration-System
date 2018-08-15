/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.ConsultationEntity;
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
public class ConsultationEntityManager {
    public ConsultationEntityManager() {
    }
 
    public static ConsultationEntity create(ConsultationEntity newConsultationEntity) throws EntityManagerException {
        /*
        try {
            String sql = "INSERT INTO consultationentity (`IDENTITYNUMBER`, `DOCTORID`, `QUEUENUMBER`) VALUES (?,?,?);";
            
            Connection connection = new MySqlJdbcHelper().createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newConsultationEntity.getIdentityNumber());
            preparedStatement.setString(2, newConsultationEntity.getDoctorId().toString());
            preparedStatement.setString(3, newConsultationEntity.getQueueNumber().toString());
            Integer result = preparedStatement.executeUpdate();
            
            if(result.equals(1))
            {
                sql = "SELECT `AUTO_INCREMENT` FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'clinicregistrationsystem' AND TABLE_NAME = 'consultationentity';";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                
                if(resultSet != null && resultSet.next()) {
                    newConsultationEntity.setQueueNumber(resultSet.getInt("AUTO_INCREMENT") - 1);
                    return newConsultationEntity;
                }
                else {
                    throw new EntityManagerException("An unknown error has occurred while retrieving the new Consultation ID");
                }
            } else {
                throw new EntityManagerException("An unknown error has occurred while creating the new consultation record");
            }
        } catch(NamingException | SQLException ex) {
            throw new EntityManagerException(ex.getMessage());
        }
        */
        return newConsultationEntity;
    }

    public static List<ConsultationEntity> retrieve() throws EntityManagerException { 
        /*
        try {
            List<ConsultationEntity> consultationEntities = new ArrayList<>();
            String sql = "SELECT * FROM consultationentity ORDER BY QUEUENUMBER ASC;";
            
            Connection connection = new MySqlJdbcHelper().createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) {
                do {
                    consultationEntities.add(new ConsultationEntity(resultSet.getString("IDENTITYNUMBER"), resultSet.getLong("DOCTORID"), resultSet.getInt("QUEUENUMBER")));
                } while(resultSet.next());
            } 
            return consultationEntities;
            
        } catch(NamingException | SQLException ex) {
            throw new EntityManagerException(ex.getMessage());
        }
        */
        List<ConsultationEntity> consultationEntities = new ArrayList<>();
        return consultationEntities;
    }
    
    public static void update(ConsultationEntity consultationEntity) throws EntityManagerException {
        
    }

    public static void delete(ConsultationEntity consultationEntity) throws EntityManagerException {
    }
}
