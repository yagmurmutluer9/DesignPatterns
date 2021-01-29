public class ATMMachine {


    static ATMState hasCard;
    static ATMState noCard;
    static ATMState hasCorrectPin;
    static ATMState outOfMoney;
    static ATMState atmState;
    private static volatile ATMMachine instance;
    int cashMachine = 7000;
    boolean correctPin = false;

    private ATMMachine() {
    }

    public static ATMMachine getInstance() {
        if (instance == null) {
            synchronized (ATMMachine.class) {
                if (instance == null) {
                    instance = new ATMMachine();
                }
            }

            hasCard = new HasCard(instance);
            noCard = new NoCard(instance);
            hasCorrectPin = new HasCorrectPin(instance);
            outOfMoney = new OutOfMoney(instance);

            atmState = noCard;


        }

        return instance;
    }

    public int getCashMachine() {
        return cashMachine;
    }

    public void setCashMachine(int money) {
        cashMachine = money;
    }

    void setATMState(ATMState newState) {
        atmState = newState;

    }


    public void insertCard(String name) {
        atmState.insertCard(name);
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int requestCash) {
        atmState.requestCash(requestCash);
    }

    public void insertPin(int pinEntered) {
        atmState.insertPin(pinEntered);
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return outOfMoney;
    }


}
