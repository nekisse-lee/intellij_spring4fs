package chap08.sec05.examArrayTire;

import chap08.sec05.examTire.KumhoTire;
import chap08.sec05.examTire.Tire;

public class Car {

    Tire[] tires = {
            new KumhoTire(),
            new KumhoTire(),
            new KumhoTire(),
            new KumhoTire()
    };

void run() {
    for (Tire tire : tires) {
        tire.roll();
    }
}
}
