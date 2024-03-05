package dd.core;

class AtaqueCuchillo implements Ataque {
    private static final String tipo = "AtaqueCuchillo";
    private static final int factor = 25;

    @Override
    public int ejecutarAtaque() {
        return (int) ((Math.random())*(Math.random()*2)*factor);
    }

    @Override
    public String getNombre() {
        return tipo;
    }
}