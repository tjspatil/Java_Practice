package Practice;

import java.security.Permission;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota(36);
        toyota.accelerate(34);
        toyota.accelerate(20);
        toyota.changeVelocity(10,2);
    }
}
