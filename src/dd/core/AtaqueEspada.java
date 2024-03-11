package dd.core;

public class AtaqueEspada implements Ataque {

    @Override
    public String getTipo() {
        return "Ataque Espada";
    }

    @Override
    public int getFactor() {
        return 100;
    }
}