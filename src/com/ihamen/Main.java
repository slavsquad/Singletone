package com.ihamen;

import com.ihamen.Thread.Car;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Thread car1 = new Thread(new Car(1));
            Thread car2 = new Thread(new Car(2));
            Thread car3 = new Thread(new Car(3));

            car1.start();
            car2.start();
            car3.start();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}

