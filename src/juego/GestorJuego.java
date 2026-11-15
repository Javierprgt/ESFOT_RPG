package juego;

import personajes.*;
import java.util.*;

public class GestorJuego {
    List<Personaje> personajes = new ArrayList<>();
    Map<String, Personaje> registro = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    public void crearGuerrero(){
        System.out.print("Ingrese el nombre del personaje: ");
        String nombreGuerrero = sc.nextLine();

        if (registro.containsKey(nombreGuerrero)){
            System.out.println("[ERROR]: Ya existe un personaje con ese nombre!");
        } else {
            System.out.print("Ingrese nivel del personaje: ");
            int nivel = sc.nextInt();
            System.out.print("Ingrese vida maxima del personaje: ");
            int vida_maximal = sc.nextInt();
            System.out.print("Ingrese daño de ataque basio: ");
            int ataque = sc.nextInt();
            System.out.print("Ingrese defensa del personaje: ");
            int defensa = sc.nextInt();
            System.out.print("Ingrese bonificacion de fuerza del personaje: ");
            int bonificacion = sc.nextInt();

            Guerrero nuevoGuerrero = new Guerrero(ataque, defensa, nivel, nombreGuerrero, vida_maximal, vida_maximal, bonificacion);

            personajes.add(nuevoGuerrero);
            registro.put(nuevoGuerrero.getNombre(), nuevoGuerrero);

            System.out.println("Guerrero creado!");
            nuevoGuerrero.mostrarInfo();
        }
    }

    public void crearMago(){
        System.out.print("Ingrese el nombre del personaje: ");
        String nombreMago = sc.nextLine();

        if (registro.containsKey(nombreMago)){
            System.out.println("[ERROR]: Ya existe un personaje con ese nombre!");
        } else {
            System.out.print("Ingrese nivel del personaje: ");
            int nivel = sc.nextInt();
            System.out.print("Ingrese vida maxima del personaje: ");
            int vida_maximal = sc.nextInt();
            System.out.print("Ingrese daño de ataque basio: ");
            int ataque = sc.nextInt();
            System.out.print("Ingrese defensa del personaje: ");
            int defensa = sc.nextInt();
            System.out.print("Ingrese mana del personaje: ");
            int mana = sc.nextInt();

            Mago nuevoMago = new Mago(ataque, defensa, nivel, nombreMago, vida_maximal, vida_maximal, mana);

            personajes.add(nuevoMago);
            registro.put(nuevoMago.getNombre(), nuevoMago);

            System.out.println("Mago creado!");
            nuevoMago.mostrarInfo();
        }
    }

    public void crearArquero(){
        System.out.print("Ingrese el nombre del personaje: ");
        String nombreArquero = sc.nextLine();

        if (registro.containsKey(nombreArquero)){
            System.out.println("[ERROR]: Ya existe un personaje con ese nombre!");
        } else {
            System.out.print("Ingrese nivel del personaje: ");
            int nivel = sc.nextInt();
            System.out.print("Ingrese vida maxima del personaje: ");
            int vida_maximal = sc.nextInt();
            System.out.print("Ingrese daño de ataque basio: ");
            int ataque = sc.nextInt();
            System.out.print("Ingrese defensa del personaje: ");
            int defensa = sc.nextInt();
            System.out.print("Ingrese cantidad de flechas del personaje: ");
            int flechas = sc.nextInt();

            Arquero nuevoArquero = new Arquero(ataque, defensa, nivel, nombreArquero, vida_maximal, vida_maximal, flechas);

            personajes.add(nuevoArquero);
            registro.put(nuevoArquero.getNombre(), nuevoArquero);

            System.out.println("Arquero creado!");
            nuevoArquero.mostrarInfo();
        }
    }

    public void crearPaladin(){
        System.out.print("Ingrese el nombre del personaje: ");
        String nombrePaladín = sc.nextLine();

        if (registro.containsKey(nombrePaladín)){
            System.out.println("[ERROR]: Ya existe un personaje con ese nombre!");
        } else {
            System.out.print("Ingrese nivel del personaje: ");
            int nivel = sc.nextInt();
            System.out.print("Ingrese vida maxima del personaje: ");
            int vida_maximal = sc.nextInt();
            System.out.print("Ingrese daño de ataque basio: ");
            int ataque = sc.nextInt();
            System.out.print("Ingrese defensa del personaje: ");
            int defensa = sc.nextInt();
            System.out.print("Ingrese bonificacion de fuerza del personaje: ");
            int bonificacion = sc.nextInt();
            System.out.print("Ingrese energia sagrada del personaje: ");
            int energia = sc.nextInt();

            Paladin nuevoPaladin = new Paladin(ataque, defensa, nivel, nombrePaladín, vida_maximal, vida_maximal, bonificacion, energia);

            personajes.add(nuevoPaladin);
            registro.put(nuevoPaladin.getNombre(), nuevoPaladin);

            System.out.println("Paladín creado!");
            nuevoPaladin.mostrarInfo();
        }
    }

    public void mostrarPersonaje(){
        System.out.println("--------------------");
        System.out.println("Lista de personajes");
        for (Personaje personaje: personajes){
            personaje.mostrarInfo();
        }
    }

    public void buscarNombre(){
        System.out.print("Ingrese el nombre del personaje: ");
        String nombre = sc.nextLine();

        if(registro.containsKey(nombre)){
            Personaje encontrado = registro.get(nombre);
            System.out.println("--------------------");
            System.out.println("Personje encontrado!");
            encontrado.mostrarInfo();
        } else {
            System.out.println("[ERROR]: Personaje no encontrado!");
        }
    }

    public void atacarPersonaje(){
        System.out.println("--------------------");
        System.out.print("Ingrese el nombre del aliado: ");
        String nombreAliado = sc.nextLine();
        System.out.print("Ingrese el nombre del enemigo: ");
        String nombreEnemigo = sc.nextLine();

        Personaje aliado = registro.get(nombreAliado);
        Personaje enemigo = registro.get(nombreEnemigo);

        if (aliado != null && enemigo != null) {
            if (aliado == enemigo) {
                System.out.println("No se puede atacarse el mismo personaje");
            } else {
                aliado.atacar(enemigo);
            }
        } else if (aliado != null){
            System.out.println("[ERROR]: No existe el enemigo");
        } else {
            System.out.println("[ERROR]: No existe el aliado");
        }
    }

    public void habilidadEspecial(){
        System.out.print("Nombre del aliado que usará su habilidad: ");
        String nombreAliado = sc.nextLine();
        System.out.print("Nombre del enemigo: ");
        String nombreEnemigo = sc.nextLine();

        Personaje enemigo = registro.get(nombreEnemigo);
        Personaje aliado = registro.get(nombreAliado);

        if(aliado != null && enemigo != null){
            if (aliado instanceof Mago){
                Mago mago = (Mago) aliado;
                mago.lanzarHechizo(enemigo);
            } else if (aliado instanceof Arquero) {
                Arquero arquero = (Arquero) aliado;
                arquero.dispararFlecha(enemigo);
            } else if (aliado instanceof Paladin) {
                Paladin paladin = (Paladin) aliado;
                System.out.println("Que habilidad desea usar?");
                System.out.println("1. Activar escudo");
                System.out.print("2. Curar aliado\nSleccione una opcion (1 o 2): ");
                int habilidad = sc.nextInt();
                sc.nextLine();

                switch (habilidad){
                    case 1:{
                        paladin.activarEscudo();
                        return;
                    }
                    case 2:{
                        System.out.print("Ingrese nombre del aliado a curar: ");
                        String aliadoCurar = sc.nextLine();
                        if(registro.containsKey(aliadoCurar)){
                            Personaje aliadoDebil = registro.get(aliadoCurar);
                            paladin.curar(aliadoDebil);
                        }else {
                            System.out.println("Aliado no encontrado");
                        }
                        return;
                    }
                    default:{
                        System.out.println("[ERROR]: Habilidad no valida!");
                    }
                }
            } else {
                Guerrero guerrero = (Guerrero) aliado;
                guerrero.atacar(enemigo, 25);
            }
        } else if (aliado != null){
            System.out.print("[ERROR]: No existe enemigo");
        } else {
            System.out.print("[ERROR]: No existe aliado");
        }
    }

    public void combate(){
        System.out.println("--------------------");
        System.out.print("Ingrese el nombre del aliado: ");
        String nombreAliado = sc.nextLine();
        System.out.print("Ingrese el nombre del enemigo: ");
        String nombreEnemigo = sc.nextLine();

        Personaje aliado = registro.get(nombreAliado);
        Personaje enemigo = registro.get(nombreEnemigo);

        if (aliado != null && enemigo != null){

            if (aliado == enemigo){
                System.out.println("[ERROR]: Un personaje no se puece atacar asi mismo!");
                return;
            }

            if (aliado.estaVivo() && enemigo.estaVivo()){
                String claseAliado;
                String claseEnemigo;
                if (aliado instanceof Mago){
                    claseAliado = "Mago";
                } else if (aliado instanceof Arquero){
                    claseAliado = "Arquero";
                } else if (aliado instanceof Paladin){
                    claseAliado = "Paladín";
                } else {
                    claseAliado ="Guerrero";
                }
                if (enemigo instanceof Mago){
                    claseEnemigo = "Mago";
                } else if (enemigo instanceof Arquero){
                    claseEnemigo = "Arquero";
                } else if (enemigo instanceof Paladin){
                    claseEnemigo= "Paladín";
                } else {
                    claseEnemigo="Guerrero";
                }
                System.out.println("===== COMBATE RPG =====");
                System.out.println(aliado.getNombre()+" ("+claseAliado+") vs "+enemigo.getNombre()+" ("+claseEnemigo+")");
                int turno = 1;
                do{
                    System.out.print("Turno "+turno+": ");
                    aliado.atacar(enemigo);
                    if (!enemigo.estaVivo()){
                        return;
                    }
                    System.out.println("--------------------");
                    turno++;
                    System.out.print("Turno "+turno+": ");
                    enemigo.atacar(aliado);
                    System.out.println("--------------------");
                    turno++;
                } while (aliado.estaVivo() && enemigo.estaVivo());
                System.out.println("---");
                if (aliado.estaVivo()){
                    System.out.println("Ganador: "+aliado.getNombre());
                } else {
                    System.out.println("Ganador: "+enemigo.getNombre());
                }
            } else if (aliado.estaVivo()){
                System.out.println("[ERROR]: No se puede iniciar un combato con un enemigo derrotado");
            } else {
                System.out.println("[ERROR]: No se puede iniciar un combato con un aliado derrotado");
            }
        } else if (aliado != null) {
            System.out.println("[ERROR]: No existe el enemigo!");
        } else {
            System.out.println("[ERROR]: No existe el alaido!");
        }
    }

    public void personajesVivos(){
        System.out.println("--------------------\nPersonajes vivos");
        int id =1;
        for (Personaje p: personajes){
            if (p.estaVivo()){
                System.out.println(id + ". " + p.getNombre());
                id++;
            }
        }
    }
}
