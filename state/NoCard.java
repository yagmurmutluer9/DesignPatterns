public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(String name) {
        System.out.println("waiting... we verify " + name);
        System.out.println("please, enter your pin.");
        atmMachine.setATMState(atmMachine.getYesCardState());

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("you have not entered your card.");

    }

    @Override
    public void requestCash(int requestCash) {
        System.out.println("you have not entered your card. we can't give cash.");

    }

    @Override
    public void ejectCard() {
        System.out.println("you did not enter your card. no card to eject.");

    }
}
