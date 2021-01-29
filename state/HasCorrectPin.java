
public class HasCorrectPin implements ATMState {

    ATMMachine atmMachine;

    public HasCorrectPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(String name) {
        System.out.println("you already entered a card.");


    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("you already entered the pin.");

    }

    @Override
    public void requestCash(int requestCash) {

        if (requestCash > atmMachine.getCashMachine()) {
            System.out.println("you do not have that much cash!");
            System.out.println("your card is ejected.");
            atmMachine.setATMState(atmMachine.getNoCardState());


        } else {
            System.out.println("waiting... machine prepare your cash!");
            atmMachine.setCashMachine(atmMachine.getCashMachine() - requestCash);
            System.out.println(requestCash + " is ready, you can take it.");
            System.out.println("your card is ejected.");
            atmMachine.setATMState(atmMachine.getNoCardState());


            if (atmMachine.getCashMachine() <= 0) {
                atmMachine.setATMState(atmMachine.getNoCashState());
            }

        }

    }

    @Override
    public void ejectCard() {

        System.out.println(" your card is ejected.");
        atmMachine.setATMState(atmMachine.getNoCardState());


    }
}
