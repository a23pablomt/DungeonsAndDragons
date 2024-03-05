package dd.core;

class AtaqueCuchillo extends Ataque {
    @Override
    public int getFactor() {
        return 25;
    }

    @Override
    public String getTipo() {
        return "Ataque Cuchillo";
    }
}