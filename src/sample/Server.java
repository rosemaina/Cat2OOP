package sample;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Movies {
    // Public Constructor
    public Server() {}

    public static void main(String args[]){
        try {
            /**
             *
             * Instantiating the implementation class
             */
            Movies obj= new Movies();
            /**
             *
             * Exporting the object of implementation class
             */
            /**
             *
             * Export the remote object to the stub
             */
            RemoteStub stub = (RemoteStub) UnicastRemoteObject.exportObject(obj, 0);

            /**
             *
             *Binding the remote object (stub) in the registry
             */
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("RemoteStub", stub);

            System.err.println("Server ready");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
