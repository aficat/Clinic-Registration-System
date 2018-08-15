/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliniccounterterminalclient;

import java.util.Scanner;
import ejb.session.stateful.RegistrationControllerRemote;
import entity.DoctorEntity;
import entity.PatientEntity;
import entity.StaffEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.exception.EntityManagerException;
import util.exception.InvalidLoginException;

/**
 *
 * @author Afiqah Rashid
 * A0160361R
 */
public class MainApp {
    
    private RegistrationControllerRemote registrationControllerRemote;
    private RegistrationModule registrationModule;
    private StaffEntity currentStaffEntity;
    private List<PatientEntity> patientEntities;
    private List<DoctorEntity> doctorEntities;
    
    public MainApp() {        
    }

    public MainApp(RegistrationControllerRemote registrationControllerRemote) {
    	this.registrationControllerRemote = registrationControllerRemote;
	}

    public void runApp() {
        Scanner scanner = new Scanner(System.in);
        Integer response = 0;
        
        // add existing patients
        patientEntities = new ArrayList<>();
        patientEntities.add(new PatientEntity((long) 1, "Tony", "Teo", "Male", 44, "S7483027A", "87297373", "11 Tampines Ave 3"));
        patientEntities.add(new PatientEntity((long) 2, "Wendy", "Tan", "Female", 35, "S8381028X", "97502837", "15 Computing Drive"));
        
        // add existing doctors
        doctorEntities = new ArrayList<>();
        doctorEntities.add(new DoctorEntity((long) 1, "Peter", "Lee", "S18018", "MBBS"));
        doctorEntities.add(new DoctorEntity((long) 2, "Cindy", "Leong", "S64921", "BMedSc"));
        doctorEntities.add(new DoctorEntity((long) 3, "Matthew", "Liu", "S38101", "MBBS"));
        
        while(true)
        {
            System.out.println("*** Welcome to Clinic Registration System (CRS) ***\n");
            System.out.println("1: Login");
            System.out.println("2: Exit\n");
            response = 0;
            
            while(response < 1 || response > 2)
            {
                System.out.print("> ");

                response = scanner.nextInt();

                if(response == 1)
                {
                    
                    try {
                        doLogin();
                        registrationModule = new RegistrationModule(registrationControllerRemote, patientEntities, doctorEntities);
                        menuMain();
                    }
                    catch(InvalidLoginException ex) {
                    }
                } else if (response == 2)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid option, please try again!\n");                
                }
            }
            
            if(response == 2)
            {
                break;
            }
        }
    }

    private void doLogin() throws InvalidLoginException {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";
        
        System.out.println("*** CRS :: Login ***\n");
        System.out.print("Enter username> ");
        username = scanner.nextLine().trim();
        System.out.print("Enter password> ");
        password = scanner.nextLine().trim();
        
        if(username.length() > 0 && password.length() > 0)
        {
            try {
                currentStaffEntity = registrationControllerRemote.staffLogin(username, password);
                System.out.println("Login successful!\n");
                
            } catch (EntityManagerException ex) {
                System.out.println("Invalid login: " + ex.getMessage() + "\n");
            } catch (InvalidLoginException ex) {
                System.out.println("Invalid login: " + ex.getMessage() + "\n");
                throw new InvalidLoginException();
            }           
        } else {
            System.out.println("Invalid login!");
        }
    }
    
    private void menuMain() {
        Scanner scanner = new Scanner(System.in);
        Integer response = 0;
        
        while(true)
        {
            System.out.println("*** Clinic Registration System (CRS) ***\n");    
            System.out.println("You are login as " + currentStaffEntity.getFirstName() + " " + currentStaffEntity.getLastName() + "\n");
            System.out.println("1: Registration Operation");
            System.out.println("2: Logout\n");
            response = 0;
            
            while(response < 1 || response > 3) {
                System.out.print("> ");

                response = scanner.nextInt();

                if(response == 1) {
                    registrationModule.menuRegistration();
                } else if(response == 2) {
                    break;
                } else {
                    System.out.println("Invalid option, please try again!\n");                
                }
            } if(response == 2) {
                break;
            }
        }
    }
}
