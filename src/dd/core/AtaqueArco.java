package dd.core;
public class AtaqueArco extends Ataque {
    @Override
    public String getTipo() {
        return "Ataque Arco";
    }

    @Override
    public int getFactor() {
        return 50;
    }
}