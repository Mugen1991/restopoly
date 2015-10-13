package com.restopoly.RMI.server;

import com.restopoly.RMI.dice.Dice;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by benny on 13.10.15.
 */
public class RMIServer {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        Dice dice = new Dice();
        Registry registry = LocateRegistry.createRegistry(Constant.RMI_PORT);

        registry.bind(Constant.RMI_ID, dice);
        System.out.println("Server was started.");
    }

}
