/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateful;

// import ejb.session.stateless.SaleTransactionEntityControllerLocal;
import dao.EntityManager;
import entity.ConsultationEntity;
import entity.DoctorEntity;
import entity.PatientEntity;
import entity.StaffEntity;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import util.exception.DoctorNotFoundException;
import util.exception.EntityManagerException;
import util.exception.InvalidLoginException;
import util.exception.StaffNotFoundException;

@Stateful
@Local(RegistrationControllerLocal.class)
@Remote(RegistrationControllerRemote.class)

/**
 *
 * @author Afiqah Rashid
 * A0160361R
 */

public class RegistrationController implements RegistrationControllerLocal, RegistrationControllerRemote {
   
    private final EntityManager entityManager;
    // queue number/ consultation operation
    private ConsultationEntity consultationEntity;
    private String identityNumber;
    private Long doctorId;
    private Integer queue;

    public RegistrationController() {
        entityManager = new EntityManager();
        initialiseState();
    }
    
    @Override
    public StaffEntity staffLogin(String username, String password) throws EntityManagerException, InvalidLoginException {
        List<StaffEntity> staffEntities = retrieveAllStaffs();

        for(StaffEntity staffEntity:staffEntities) {
            if(staffEntity.getUserName().equals(username) && staffEntity.getPassword().equals(password)) {
                return staffEntity;
            }
        } 
        throw new InvalidLoginException("Username does not exist or invalid password!");
    }
    
    @Override
    public List<StaffEntity> retrieveAllStaffs() throws EntityManagerException {
        return entityManager.retrieve(StaffEntity.class);
    }
    
    // track queue
    
    
    private void initialiseState() {
        // reset queue number and consultation list
    }
    
    
    // clear patient contents/ consultation contents
    @Override
    public void clearQueue() {
        initialiseState();
    }
    
    @Override
    public Integer getQueue() {
        return queue;
    }

    @Override
    public void setQueue(Integer queue) {
        this.queue = queue;
    }
}