package dd.core;

public abstract class Personaje{
    protected String nombre;
    protected Ataque ataque;
    protected int numAtaques;
    protected int salud;

    public Personaje(String nombre, Ataque ataque, int numAtaques, int salud) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.numAtaques = numAtaques;
        this.salud = salud;
    }

    public void setAtaque(Ataque at) {
        ataque = at;
    }

    public Object getAtaque() {
        return ataque;
    }

    public int[] ataca(Personaje p) {
        int [] arrayAtaques = new int[this.numAtaques];
        for(int i = 0; i < this.numAtaques; i++){
            arrayAtaques[i] = ataque.calcAtaque();
            p.pierdeVida(arrayAtaques[i]);
        }
        return arrayAtaques;
    }

    protected void pierdeVida(int damage){
        salud = salud - damage;
    }

    public int getSalud() {
        return salud;
    }

    @Override
    public String toString() {
        return "["+ this.nombre +": "+ this.salud +"]";
    }
}