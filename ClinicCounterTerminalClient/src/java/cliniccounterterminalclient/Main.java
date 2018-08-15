/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliniccounterterminalclient;

import ejb.session.stateful.RegistrationControllerRemote;
import javax.ejb.EJB;
import util.exception.EntityManagerException;

/**
 *
 * @author Afiqah Rashid 
 * A0160361R
 * 
 */

public class Main {
    
    @EJB
    private static RegistrationControllerRemote registrationControllerRemote;
    
    public static void main(String[] args) {
        
    MainApp mainApp = new MainApp(registrationControllerRemote);
        mainApp.runApp();
    }
}
