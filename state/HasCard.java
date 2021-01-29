public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(String name) {

        System.out.println("atm has already a card named: " + name);


    }

    @Override
    public void insertPin(int pinEntered) {

        if (pinEntered == 123456) {
            System.out.println("you entered a correct pin. ");
            atmMachine.correctPin = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        } else {
            System.out.println("you entered a wrong pin.");
            atmMachine.correctPin = false;
            System.out.println("card is ejected.");
            atmMachine.setATMState(atmMachine.getNoCardState());

        }

    }

    @Override
    public void requestCash(int requestCash) {
        System.out.println("you have to enter your pin to request cash.");


    }

    @Override
    public void ejectCard() {
        System.out.println("card is ejected.");
        atmMachine.setATMState(atmMachine.getNoCardState());


    }
}
