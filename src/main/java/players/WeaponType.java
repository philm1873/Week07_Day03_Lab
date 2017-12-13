package players;

public enum WeaponType {
    SWORD(50),
    AXE(80),
    CLUB(90);

    private final int value;

    WeaponType(int inputValue) {
        this.value = inputValue;
    }

    public int getValue() {
        return this.value;
    }
}
