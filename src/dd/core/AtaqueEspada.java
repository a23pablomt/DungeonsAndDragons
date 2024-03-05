package dd.core;

public class AtaqueEspada implements Ataque{
    private static final String tipo = "AtaqueEspada";
    private static final int factor = 100;

    @Override
    public int ejecutarAtaque() {
        return (int) ((Math.random())*(Math.random()*2)*factor);
    }

    @Override
    public String getNombre() {
        return tipo;
    }
}