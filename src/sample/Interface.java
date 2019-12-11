/**
 * <h1> Interface </h1>
 * This is the interface class for the RMI
 * @author George Kimani
 * @author Sankan Nabuyani
 * @author Rose Maina
 * @version v1.0
 */

package sample;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {

    /**
     * This abstract method references the UI to be run
     * @return void None(does not return anything)
     */
    void animation() throws RemoteException;
}
