package personajes;

public class Personaje {
    private String nombre;
    private int nivel;
    private int vida;
    private int vida_maxima;
    private int ataque;
    private int defensa;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("[ERROR]: Nombre no valido!\nSe le asignara el nombre 'Aventurero'!");
            this.nombre = "Aventurero";
        }

        String nombreLimpio = nombre.trim();

        if (nombreLimpio.length()<3 || nombreLimpio.length()>15) {
            System.out.println("[ERROR]: El nombre debe tener entre 3 y 15 caracteres!");
            System.out.println("Se le asignara el nombre 'Aventurero'!00");
            this.nombre = "Aventurero";
        } else {
            this.nombre = nombreLimpio;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel <= 0 || nivel >100) {
            System.out.println("[ERROR]: Nivel del personaje no valido\nSe asignará por defecto el nivel 1.");
            this.nivel = 1;
        } else {
            this.nivel = nivel;
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= 0 && vida <= vida_maxima) {
            this.vida = vida;
        } else {
            System.out.println("[ERROR]: Valor no valido\nLa vida se mantiene intacta!");
            if (vida > vida_maxima) {
                this.vida = vida_maxima;
            }
        }

    }

    public int getVida_maxima() {
        return vida_maxima;
    }

    public void setVida_maxima(int vida_maxima) {
        if (vida_maxima > 0){
            this.vida_maxima = vida_maxima;
        } else {
            System.out.println("[ERROR]: Vida maxima no puede ser negativa");
            if (this.vida_maxima == 0) {
                System.out.println("Se le asiganra una vida maxima de 100!");
                this.vida_maxima = 100;
            } else {
                System.out.println("Se mantendra la vida maxima actual");
            }
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque > 0) {
            this.ataque = ataque;
        } else {
            System.out.println("[ERROR]: El atque no puede ser 0 o menor\nSe lñe asiganra un ataque de 1°");
            this.ataque = 1;
        }
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        if (defensa >= 0) {
            this.defensa = defensa;
        } else {
            this.defensa = 0;
        }
    }

    public Personaje(int ataque, int defensa, int nivel, String nombre, int vida, int vida_maxima) {
        setAtaque(ataque);
        setDefensa(defensa);
        setNivel(nivel);
        setNombre(nombre);
        setVida_maxima(vida_maxima);
        setVida(vida);
    }

    public void mostrarInfo() {
        System.out.println("--------------------");
        System.out.println("Personaje: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Vida maxima: " + vida_maxima);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("--------------------");
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDanio(int cantidad){
        if (cantidad < 0) {
            cantidad = 0;
        }
        int danioReal = Math.max(1, cantidad - defensa);
        vida = Math.max(0, vida - danioReal);
        System.out.println(nombre + " recibe un ataque de " + danioReal);
        System.out.println("Vida de "+nombre+": "+ vida);
    }

    public void atacar(Personaje enemigo) {
        if (enemigo.estaVivo()) {
            int danio = this.ataque;
            enemigo.recibirDanio(danio);
            System.out.println(nombre + " ataca a " + enemigo.getNombre() + " con un daño de " + danio);
        } else {
            System.out.println("No se puede atacar a un enemigo derrotado!");
        }
    }

    public void atacar(Personaje enemigo, int bonificacion) {
        if (enemigo.estaVivo()) {
            if (bonificacion < 0) {
                bonificacion = 0;
            }
            int danio = this.ataque + bonificacion;
            enemigo.recibirDanio(danio);
            System.out.println(nombre + " ataca a " + enemigo.getNombre() + " con un ataque especial de " + danio);
        } else {
            System.out.println("No se puede atacar a un enemigo derrotado!");
        }
    }
}
