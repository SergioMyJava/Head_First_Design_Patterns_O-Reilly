package chapter11;

import chapter11.gumballmachine.GumballMachine;
import chapter11.gumballmachine.GumballMachineRemote;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerApplication {

    public static void main(String[] args) {

        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            GumballMachineRemote stub = (GumballMachineRemote) UnicastRemoteObject.exportObject(gumballMachine, 0);
            Registry registry = LocateRegistry.createRegistry(2001);
            registry.bind("GumballMachine", stub);

            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
