public class OutOfMoney implements ATMState {

    ATMMachine atmMachine;

    public OutOfMoney(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(String name) {
        System.out.println("the atm runs out of money.");
        System.out.println("your card is ejected.");


    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("the atm runs out of money!");


    }

    @Override
    public void requestCash(int requestCash) {
        System.out.println("the atm runs out of money!");


    }

    @Override
    public void ejectCard() {
        System.out.println("the atm runs out of money!");
        System.out.println("no card to eject.");


    }
}
