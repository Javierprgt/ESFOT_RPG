package personajes;

public class Mago extends Personaje{
    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana >= 0) {
            this.mana = mana;
        } else {
            this.mana = 100;
        }
    }

    public Mago(int ataque, int defensa, int nivel, String nombre, int vida, int vida_maxima, int mana) {
        super(ataque, defensa, nivel, nombre, vida, vida_maxima);
        setMana(mana);
    }

    public void lanzarHechizo(Personaje enemigo) {
        if (enemigo.estaVivo()) {
            if (this.mana >= 10) {
                setMana(this.mana - 10);
                int danio = 20;
                enemigo.recibirDanio(danio);
                System.out.println(getNombre()+" lanza un hechizo a "+enemigo.getNombre() + " con un daño de "+danio);
            } else  {
                System.out.println(getNombre()+" sin mana");
            }
        } else {
            System.out.println("No se puede atacar a un enemigo derrotado!");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Atrubuto especial!\nMana: "+this.mana);
        System.out.println("Daño de hechizo: 20");
        System.out.println("--------------------");
    }
}
