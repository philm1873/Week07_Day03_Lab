package players;

public enum SpellType {
    NOVA(50),
    INFERNO(75),
    HYDRA(100),
    BLIZZARD(80);

    private final int value;

    SpellType(int inputValue) {
        this.value = inputValue;
    }

    public int getValue() {
        return this.value;
    }
}
