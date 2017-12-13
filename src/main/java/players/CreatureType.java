package players;

public enum CreatureType {

    DRAGON(50),
    OGRE(40),
    ELF(30);

    private final int value;

    CreatureType(int inputValue) {
        this.value = inputValue;
    }

    public int getValue() {
        return this.value;
    }

}
