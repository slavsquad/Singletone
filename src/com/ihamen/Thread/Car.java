package com.ihamen.Thread;

import com.ihamen.Singletone.ResourceRace;

/**
 * Created by stepanenko.sg on 07.10.2017.
 */
public class Car implements Runnable{
    private int carNumber;

    public Car(int number){
        this.carNumber = number;
    }
    @Override
    public void run() {
        ResourceRace race = ResourceRace.getInstance(carNumber);
        System.out.println(String.format("Секундант команды машины №%d: Победила машина - %d",carNumber,race.getWinnerNumber()));
    }
}
