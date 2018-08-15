/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.ConsultationEntity;
import entity.DoctorEntity;
import entity.PatientEntity;
import entity.StaffEntity;
import java.util.List;
import util.exception.EntityManagerException;

/**
 *
 * @author Afiqah Rashid
 * A0160361R
 */

public class EntityManager {
    public EntityManager() {
    }
    
    // add patient
    //add consultation
    /*
    public Object create(Object object) throws EntityManagerException {
        if(object.getClass() == PatientEntity.class) {
            return PatientEntityManager.create((PatientEntity)object);     
        
        } else if(object.getClass() == DoctorEntity.class) {
            return DoctorEntityManager.create((DoctorEntity)object);
        } else if(object.getClass() == StaffEntity.class) {
            return StaffEntityManager.create((StaffEntity)object);
        
        } else if(object.getClass() == ConsultationEntity.class) {
            return ConsultationEntityManager.create((ConsultationEntity)object);
        } else {
            throw new EntityManagerException("Invalid entity class type");
        }

    }*/
    
    // retrive data
    public List retrieve(Class inClass) throws EntityManagerException {
        if(inClass == StaffEntity.class) {
            return StaffEntityManager.retrieve();
        } else if(inClass == DoctorEntity.class) {
            return DoctorEntityManager.retrieve();
        } else if(inClass == PatientEntity.class) {
            return PatientEntityManager.retrieve();
        }  else if(inClass == ConsultationEntity.class) {
            return ConsultationEntityManager.retrieve();
        } else {
            throw new EntityManagerException("Invalid entity class type");
        }
    }
    
    /*
    public void update(Object object) throws EntityManagerException {
        if(object.getClass() == StaffEntity.class) {
            StaffEntityManager.update((StaffEntity)object);
        } else if(object.getClass() == DoctorEntity.class) {
            DoctorEntityManager.update((DoctorEntity)object);
        } else if(object.getClass() == PatientEntity.class) {
            PatientEntityManager.update((PatientEntity)object);
        } else if(object.getClass() == ConsultationEntity.class) {
            ConsultationEntityManager.update((ConsultationEntity)object);
        } else {
            throw new EntityManagerException("Invalid entity class type");
        }
    }
    */
    
    /*
    public void delete(Object object) throws EntityManagerException {
        if(object.getClass() == StaffEntity.class) {
            StaffEntityManager.delete((StaffEntity)object);
        } else if(object.getClass() == DoctorEntity.class) {
            DoctorEntityManager.delete((DoctorEntity)object);
        } else if(object.getClass() == PatientEntity.class) {
            PatientEntityManager.delete((PatientEntity)object);
        } else if(object.getClass() == ConsultationEntity.class) {
            ConsultationEntityManager.delete((ConsultationEntity)object);
        } else {
            throw new EntityManagerException("Invalid entity class type");
        }
    }
    */
}
