package chapter11;

import chapter11.gumballmachine.GumballMachine;
import chapter11.gumballmachine.GumballMachineRemote;


import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerApplication {
    public static final String UNIC_BINDING_NAME = "gumballMachine";

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {
        GumballMachineRemote gumballMachine = null;
        int count;

        count = Integer.parseInt(args[1]);
        gumballMachine = new GumballMachine(args[0], count);//создаем 1 машину скоторй будем работать удаленно

        final Registry registry = LocateRegistry.createRegistry(2099);//создаем реестр открытых для доступа
        // объектов(так написано в объяснении, но как я понимаю указываем порт для связи, еще IP может указываться перед портом)

        Remote stub = UnicastRemoteObject.exportObject(gumballMachine, 0);//создание "заглушки" – приемника удаленных вызовов
                                                                               //вверху определение из книги мое -готовим объект к передаче
        registry.bind(UNIC_BINDING_NAME, stub);//регистрация "заглушки" в реесте
                                               //мое определение - передаем объект
        Thread.sleep(Integer.MAX_VALUE);//усыпляем главный поток, иначе программа завершится

        /*
        код из книги
        GumballMachineRemote gumballMachine = null;
        int count;
        if (args.length < 2) {
        System.out.println(“GumballMachine <name> <inventory>”);
        System.exit(1);
        }
        try {
        count = Integer.parseInt(args[1]);
        gumballMachine = new GumballMachine(args[0], count);
        Naming.rebind(“//” + args[0] + “/gumballmachine”, gumballMachine);
        } catch (Exception e) {
        e.printStackTrace();
        }*/
    }
}
