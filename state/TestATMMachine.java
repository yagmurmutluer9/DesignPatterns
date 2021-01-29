public class TestATMMachine {

    public static void main(String... args) {
        ATMMachine machine = ATMMachine.getInstance();
        ATMMachine machine2 = ATMMachine.getInstance();
        machine.setCashMachine(7000);

        // check double locked singleton

        System.out.println("checking if atm machine has singleton...");

        if (System.identityHashCode(machine) == System.identityHashCode(machine2)) {

            System.out.println("Hash code is same. Atm has double checked locking singleton!");
        } else {

            System.out.println("Hash code is NOT same");
        }
        System.out.println();
        System.out.println();

        System.out.println("Version 1: user enters wrong pin.");
        machine.insertCard("card one");
        machine.insertPin(123);
        System.out.println();

        System.out.println("Version 2: user enters true pin and atm gives the requested money. ");

        machine.insertCard("card one");
        machine.insertPin(123456);
        machine.requestCash(7000);

        System.out.println();

        System.out.println("Version 3: user enters true pin but atm is out of money. ");

        machine.insertCard("card one");


    }
}
