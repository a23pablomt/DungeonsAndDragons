package dd.core;

public abstract interface Ataque {

    String getTipo();

    int getFactor();

    default int calcAtaque() {
        return (int) ((int)(Math.random() * 2) * (Math.random()* 2) * this.getFactor());
    }

    @Override
    String toString();
}