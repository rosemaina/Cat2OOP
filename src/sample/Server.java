/**
 * <h1> Server </h1>
 * This program allows connection from a client program
 * @author George Kimani
 * @author Sankan Nabuyani
 * @author Rose Maina
 * @version v1.0
 */

package sample;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends BucketList {
    // Public Constructor
    public Server() {}

    public static void main(String args[]){
        try {
            BucketList obj= new BucketList();
            Interface stub = (Interface) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Interface", stub);

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
