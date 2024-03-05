package dd.core;

public class Personaje{
    public String nombre;
    Ataque ataque;
    int numAtaques;
    public int salud;

    public Personaje(String nombre, int numAtaques, int salud) {
        this.nombre = nombre;
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
        int [] arrayAtaques = new int[p.numAtaques];
        for(int i = 0; i < p.numAtaques; i++){
            arrayAtaques[i] = ataque.ejecutarAtaque();
        }
        return arrayAtaques;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int i) {
        salud = i;
    }

    public String getNombre() {
        return nombre;
    }
}