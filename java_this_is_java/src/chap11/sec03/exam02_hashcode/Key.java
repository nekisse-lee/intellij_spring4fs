package chap11.sec03.exam02_hashcode;

import java.util.Objects;

public class Key {

    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode()");
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals()");
        if (obj instanceof Key) {
            Key compareKey = (Key) obj;
            if (this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }
}
