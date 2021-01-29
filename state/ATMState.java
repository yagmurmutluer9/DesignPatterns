public interface ATMState {

    void insertCard(String name);

    void insertPin(int pinEntered);

    void requestCash(int requestCash);

    void ejectCard();
}

