package com.restopoly.RMI.dice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

/**
 * Created by benny on 13.10.15.
 */
public class Dice extends UnicastRemoteObject implements DiceRMI {

    private static final int[] diceRange = new int[]{1, 6};

    public Dice() throws RemoteException {}

    public Roll roll() throws RemoteException {
        Random rand = new Random();

        return new Roll(rand.nextInt((diceRange[1] - diceRange[0]) + 1) + diceRange[0]);
    }

}
