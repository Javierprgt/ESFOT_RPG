import juego.GestorJuego;
import personajes.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GestorJuego gestor = new GestorJuego();

        int opc = 0;

        List<Personaje> personajes = new ArrayList<>();
        Map<String, Personaje> registro = new HashMap<>();

        do {
            System.out.println("====================================");
            System.out.println("        ESFOT RPG - Java POO");
            System.out.println("====================================");
            System.out.println("1. Crear Guerreo");
            System.out.println("2. Crear Mago");
            System.out.println("3. Crear Arquero");
            System.out.println("4. Crear Paladín");
            System.out.println("5. Mostrar personajes");
            System.out.println("6. Buscar personaje por nombre");
            System.out.println("7. Atacar a otro personaje");
            System.out.println("8. Utilizar habilidad especial");
            System.out.println("9. Simular combate por turnos");
            System.out.println("10. Mostrar personajes vivos");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:{
                    gestor.crearGuerrero();
                    break;
                }
                case 2:{
                    gestor.crearMago();
                    break;
                }
                case 3:{
                    gestor.crearArquero();
                    break;
                }
                case 4:{
                    gestor.crearPaladin();
                    break;
                }
                case 5:{
                    gestor.mostrarPersonaje();
                    break;
                }
                case 6:{
                    gestor.buscarNombre();
                    break;
                }
                case 7:{
                    gestor.atacarPersonaje();
                    break;
                }
                case 8:{
                    gestor.habilidadEspecial();
                    break;
                }
                case 9:{
                    gestor.combate();
                    break;
                }
                case 10:{
                    gestor.personajesVivos();
                    break;
                }
                case 11:{
                    System.out.println("--------------------\nGracias por jugar...\nSaliendio dek juego...\n-----");
                    break;
                }
                default:{
                    System.out.println("[ERROR]: Opcion no valida!");
                    break;
                }
            }
        } while (opc != 11);

        sc.close();
    }
}