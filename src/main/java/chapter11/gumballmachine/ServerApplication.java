package chapter11.gumballmachine;

import chapter11.gumballmachine.GumballMachine;
import chapter11.gumballmachine.GumballMachineRemote;


import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerApplication {
    public static final String UNIC_BINDING_NAME_ONE = "Santafe";
    public static final String UNIC_BINDING_NAME_TWO = "Seattle";
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {
        GumballMachineRemote gumballMachine = null;

        int countOne = Integer.parseInt(args[1]);
        int countTwo = Integer.parseInt(args[3]);
        GumballMachineRemote gumballMachineOne = new GumballMachine(args[0], countOne);
        GumballMachineRemote gumballMachineTwo = new GumballMachine(args[2], countTwo);
        final Registry registry = LocateRegistry.createRegistry(2099);

        Remote stubOne = UnicastRemoteObject.exportObject(gumballMachineOne, 0);
        Remote stubTwo = UnicastRemoteObject.exportObject(gumballMachineTwo, 2);

        registry.bind(UNIC_BINDING_NAME_ONE, stubOne);
        registry.bind(UNIC_BINDING_NAME_TWO, stubTwo);
        Thread.sleep(Integer.MAX_VALUE);
    }
}
