package dd.core;

public class AtaqueCuchillo implements Ataque {

    @Override
    public String getTipo() {
        return "Ataque Cuchillo";
    }

    @Override
    public int getFactor() {
        return 25;
    }
}