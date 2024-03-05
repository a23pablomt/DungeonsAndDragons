package dd.core;

public abstract class  Ataque {


    protected abstract String getTipo();

    protected abstract int getFactor();

    public int calcAtaque(){
        return (int)(((int)(Math.random()*2)*(Math.random()*2)*this.getFactor()));
    }

    @Override
    public String toString() {
        return getTipo();
    }
}
