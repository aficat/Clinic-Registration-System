/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Afiqah Rashid
 * A0160361R
 */

public class DoctorEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long doctorId;
    private String firstName;
    private String lastName;
    private String registration;
    private String qualifications;
    
    public DoctorEntity() {
    }

    public DoctorEntity(String firstName, String lastName, String registration) {
        this();
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
    }

    public DoctorEntity(Long doctorId, String firstName, String lastName, String registration, String qualifications) {
        this();
        
        this.doctorId = doctorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.qualifications = qualifications;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.doctorId != null ? this.doctorId.hashCode() : 0);
        
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof DoctorEntity)) 
        {
            return false;
        }
        
        DoctorEntity other = (DoctorEntity) object;
        
        if ((this.doctorId == null && other.doctorId != null) || (this.doctorId != null && !this.doctorId.equals(other.doctorId))) 
        {
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString() {
        return "entity.DoctorEntity[ doctorId=" + this.doctorId + " ]";
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegistration() {
        return registration;
    }

    public void setUserName(String registration) {
        this.registration = registration;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
