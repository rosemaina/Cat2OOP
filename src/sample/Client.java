/**
 * <h1> Client Registry </h1>
 * This program enables the client to call a remote object using the registry
 * @author George Kimani
 * @author Sankan Nabuyani
 * @author Rose Maina
 * @version v1.0
 */

package sample;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Client {
    // Private Constructor
    private Client() {}

    /** This is the main method used to access the registry
     * @param args Unused
     * @return None
     */
    public static void main(String[] args) {

        try {
            Registry registry= LocateRegistry.getRegistry(null);

            Interface stub = (Interface) registry.lookup("Interface");
            stub.animation();

            /**
             * Catching the Exception
             * Prints out an error message when an exception is caught
             * @exception Exception e  The error you get
             */
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}