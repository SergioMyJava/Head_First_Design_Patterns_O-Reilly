package chapter11;

import chapter11.gumballmachine.GumballMachine;
import chapter11.gumballmachine.GumballMachineRemote;
import chapter11.gumballmachine.GumballMonitor;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientApplication {
    public static final String UNIC_BINDING_NAME = "gumballMachine";

    public static void main(String[] args) throws RemoteException, NotBoundException {

        final Registry registry = LocateRegistry.getRegistry(2099);//создание реестра расшареных объетов
        GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) registry.lookup(UNIC_BINDING_NAME);//получаем объект (на самом деле это proxy-объект)
                                                                                                              //мое определение - находим нашу машину по ключевому имени
        GumballMonitor monitor = new GumballMonitor(gumballMachineRemote);//Вызываем удаленный метод
                                                                          //мое определение - сроздаем объект который обрабатывает машины с жевачкой
        monitor.report();                                                  //выводим переданное машиной через метод в монитор

            /*
            код из книги
            String[] location = {“rmi://santafe.mightygumball.com/gumballmachine”,
            “rmi://boulder.mightygumball.com/gumballmachine”,
            “rmi://seattle.mightygumball.com/gumballmachine”};
             GumballMonitor[] monitor = new GumballMonitor[location.length];
            for (int i=0;i < location.length; i++) {
            try {
            GumballMachineRemote machine =
            (GumballMachineRemote) Naming.lookup(location[i]);
            monitor[i] = new GumballMonitor(machine);
            System.out.println(monitor[i]);
            } catch (Exception e) {
            e.printStackTrace();
                }
            }
            for(int i=0; i < monitor.length; i++) {
            monitor[i].report();
            }*/
    }
}
