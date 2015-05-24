/* TimeServiceRegistration.java */

package at.itkollegimst.pos1.timeservice.registration;

import at.itkollegimst.pos1.timeservice.TimeServiceImpl;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class TimeServiceRegistration {

    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());
        try {
            System.out.println("Registering TimeService");
            TimeServiceImpl tsi = new TimeServiceImpl();
            Naming.rebind("TimeService", tsi);
            System.out.println("  Done.");
        } catch (RemoteException | MalformedURLException e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }
}
