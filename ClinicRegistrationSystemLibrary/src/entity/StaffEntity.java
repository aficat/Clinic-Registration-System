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
public class StaffEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long staffId;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    
    public StaffEntity() {
    }

    public StaffEntity(String firstName, String lastName, String username, String password) {
        this();
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = username;
        this.password = password;
    }

    public StaffEntity(Long staffId, String firstName, String lastName, String username, String password) {
        this();
        
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = username;
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.staffId != null ? this.staffId.hashCode() : 0);
        
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof StaffEntity)) 
        {
            return false;
        }
        
        StaffEntity other = (StaffEntity) object;
        
        if ((this.staffId == null && other.staffId != null) || (this.staffId != null && !this.staffId.equals(other.staffId))) 
        {
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString() {
        return "entity.StaffEntity[ staffId=" + this.staffId + " ]";
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
