package com.restopoly.RMI.client;

import com.restopoly.RMI.dice.DiceRMI;
import com.restopoly.RMI.server.Constant;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by benny on 13.10.15.
 */
public class RMIClient {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", Constant.RMI_PORT);
        DiceRMI dice = (DiceRMI) registry.lookup(Constant.RMI_ID);

        System.out.println(dice.roll().getNumber());
    }

}
