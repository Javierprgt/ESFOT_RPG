package personajes;

public class Arquero extends Personaje{
    private int flechas;

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        if (flechas >= 0) {
            this.flechas = flechas;
        } else {
            this.flechas = 100;
        }
    }

    public Arquero(int ataque, int defensa, int nivel, String nombre, int vida, int vida_maxima, int flechas) {
        super(ataque, defensa, nivel, nombre, vida, vida_maxima);
        setFlechas(flechas);
    }

    public void dispararFlecha(Personaje enemigo) {
        if (enemigo.estaVivo()) {
            if (this.flechas >= 1) {
                setFlechas(this.flechas - 1);
                int danio = this.getAtaque() + 5;
                enemigo.recibirDanio(danio);
                System.out.println(getNombre()+" lanza una flecha a "+enemigo.getNombre() + " con un daño de "+danio);
            } else {
                System.out.println(getNombre()+" sin flechas");
            }
        } else {
            System.out.println("No se puede atacar a un enemigo derrotado!");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Atrubuto especial!\nFlechas: "+this.flechas);
        System.out.println("Daño de flechas: "+(this.getAtaque()+5));
        System.out.println("--------------------");
    }
}
