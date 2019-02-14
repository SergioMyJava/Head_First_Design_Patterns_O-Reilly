package chapter11.gumballmachine;

import chapter11.gumballmachine.GumballMachineRemote;
import chapter11.gumballmachine.GumballMonitor;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientApplication {
    public static final String UNIC_BINDING_NAME = "serverApp";

    public static void main(String[] args) throws RemoteException, NotBoundException {
        String[] location = {"Santafe","Seattle"};
        final Registry registry = LocateRegistry.getRegistry(2099);
        for(int i = 0;i<location.length;i++) {
            GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) registry.lookup(location[i]);
            GumballMonitor monitor = new GumballMonitor(gumballMachineRemote);
            monitor.report();
            System.out.println(" ");
        }
    }
}
