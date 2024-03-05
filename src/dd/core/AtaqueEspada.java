package dd.core;

public class AtaqueEspada extends Ataque{
    @Override
    public int getFactor() {
        return 100;
    }

    @Override
    public String getTipo() {
        return "Ataque Espada";
    }
}