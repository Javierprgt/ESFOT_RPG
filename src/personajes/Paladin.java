package personajes;

public class Paladin extends Guerrero {
    private int energiaSagrada;

    public int getEnergiaSagrada() {
        return energiaSagrada;
    }

    public void setEnergiaSagrada(int energiaSagrada) {
        if (energiaSagrada >= 0)
            this.energiaSagrada = energiaSagrada;
        else {
            this.energiaSagrada = 100;
        }
    }

    public Paladin(int ataque, int defensa, int nivel, String nombre, int vida, int vida_maxima, int fuerza, int energiaSagrada) {
        super(ataque, defensa, nivel, nombre, vida, vida_maxima, fuerza);
        setEnergiaSagrada(energiaSagrada);
    }

    public void curar(Personaje aliado) {
        if (energiaSagrada >= 10) {
            if (aliado.estaVivo()) {
                aliado.setVida(Math.min(aliado.getVida_maxima(), aliado.getVida()+20));
                setEnergiaSagrada(this.energiaSagrada - 10);
            } else {
                System.out.println("No se puede curar a un aliado derrotado!");
            }
        } else {
            System.out.println(getNombre() + " sin energia sagrada");
        }
    }

    private boolean escudoActivo = false;

    public void activarEscudo(){
        this.escudoActivo = true;
        System.out.println(getNombre() + " activo el escudo");
    }

    @Override
    public void recibirDanio(int cantidad) {
        if (this.escudoActivo) {
            System.out.println(getNombre() + " usa su escudo para bloquear parte del ataque!");
            cantidad = Math.max(0, cantidad-5);
            this.escudoActivo = false;
        }

        super.recibirDanio(cantidad);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Atrubuto especial!\nEnergia sagrada: "+this.energiaSagrada);
        System.out.println("Escudo: -5 de daño");
        System.out.println("Curación: 20 de vida");
        System.out.println("--------------------");
    }
}
