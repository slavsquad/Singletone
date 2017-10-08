package com.ihamen.Singletone;

/**
 * Created by stepanenko.sg on 07.10.2017.
 */
public class ResourceRace {
    private static volatile ResourceRace instance;
    private int winnerNumber;

    private ResourceRace(int number){
        //Имитация соревнования - задержка 1 секунда
        try {
            Thread.currentThread().sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        this.winnerNumber = number;
    }

    public int getWinnerNumber() {
        return winnerNumber;
    }

    public static ResourceRace getInstance(int number){
        if (instance == null){
            synchronized (ResourceRace.class){
                if (instance==null){
                    instance = new ResourceRace(number);
                }
            }
        }

        return instance;
    }

    //Other methods
}
