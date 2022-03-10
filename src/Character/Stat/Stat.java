package Character.Stat;

public abstract class Stat {

    private int value;

    public int getValue() {
        return value;
    }

    public Stat(int statvalue) {
        this.value = statvalue;
        if (this.value < 0) {
            this.value = 0;
        }
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void decrease() {
        this.value = this.value - 1;
        if (this.value < 0) {
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        return "Stat{" +
                "value=" + value +
                '}';
    }
}
