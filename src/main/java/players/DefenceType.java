package players;

public enum DefenceType {
    ARMOUR(50),
    SHIELD(40),
    LEATHER(20);

    private final int value;

    DefenceType(int inputValue) {
        this.value = inputValue;
    }

    public int getValue() {
        return this.value;
    }

}
