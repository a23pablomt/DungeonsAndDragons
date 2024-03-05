package dd.core;
public class AtaqueArco implements Ataque {
    private static final String tipo = "AtaqueArco";
    private static final int factor = 50;

    @Override
    public int ejecutarAtaque() {
        return (int) ((Math.random())*(Math.random()*2)*factor);
    }

    @Override
    public String getNombre() {
        return tipo;
    }
}