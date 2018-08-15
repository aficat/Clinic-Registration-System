/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateful;

import entity.ConsultationEntity;
import entity.DoctorEntity;
import entity.PatientEntity;
import entity.StaffEntity;
import java.math.BigDecimal;
import java.util.List;
import util.exception.DoctorNotFoundException;
import util.exception.EntityManagerException;
import util.exception.InvalidLoginException;

/**
 *
 * @author Afiqah Rashid
 * A0160361R
 */

// void queue at the end of the day
public interface RegistrationControllerRemote {
   
    List<StaffEntity> retrieveAllStaffs() throws EntityManagerException;
    StaffEntity staffLogin(String username, String password) throws EntityManagerException, InvalidLoginException;


    // void queue number
    // void consultations
            
    //createNewConsultation
            
    void clearQueue();
    Integer getQueue();
    void setQueue(Integer queue);
}
