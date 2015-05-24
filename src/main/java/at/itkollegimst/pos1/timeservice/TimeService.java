/* TimeService.java */

package at.itkollegimst.pos1.timeservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TimeService
extends Remote
{
  public String getTime()
    throws RemoteException;

  public TimeStore storeTime(TimeStore store)
    throws RemoteException;
}