package personajes;

public class Guerrero extends Personaje {
    private int fuerza;

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if (fuerza > 0) {
            this.fuerza = fuerza;
        } else {
            this.fuerza = 1;
        }
    }

    public Guerrero(int ataque, int defensa, int nivel, String nombre, int vida, int vida_maxima, int fuerza) {
        super(ataque, defensa, nivel, nombre, vida, vida_maxima);
        setFuerza(fuerza);
    }

    @Override
    public void atacar(Personaje enemigo) {
        if (enemigo.estaVivo()) {
            int danio = this.getAtaque() + this.fuerza;
            enemigo.recibirDanio(danio);
            System.out.println(getNombre() + " ataca a " + enemigo.getNombre() + " con un daño de " + danio);
        } else {
            System.out.println("No se puede atacar a un enemigo derrotado!");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Atrubuto especial!\nFuerza: "+this.fuerza);
        System.out.println("--------------------");
    }
}
