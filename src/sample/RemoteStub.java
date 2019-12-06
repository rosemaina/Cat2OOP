package sample;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Creating Remote interface for our application
 *
 */
public interface RemoteStub extends Remote{
    void animation() throws RemoteException;
}