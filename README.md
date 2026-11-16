# 🎮 ESFOT RPG: La Batalla de los Reinos

## 📉 Descripción
Prototipo de videojuego de rol (RPG) por consola desarrollado en Java, enfocado en la aplicación práctica de los pilares fundamentales de la Programación Orientada a Objetos (POO): encapsulamiento, herencia (simple, jerárquica y multinivel), sobrescritura, sobrecarga, polimorfismo, casting seguro y manejo de colecciones dinámicas.
---


## 🚀Cómo ejecutarlo

1. Clonar este repositorio en tu equipo local:
```bash
   git clone <URL-DE-TU-REPOSITORIO>
   ```
2. Abrir el proyecto en tu IDE de Java preferido (IntelliJ IDEA, Eclipse, NetBeans o VS Code) o compilar desde la terminal:
```bash
   cd ESFOT-RPG/src
   javac personajes/*.java juego/*.java Main.java
   java Main
   ```
3. Interactuar con el menú numérico ingresando las opciones solicitadas por teclado.
---


## 🗂️ Estructura del proyecto
El código fuente está organizado en paquetes para separar la lógica de negocio de la interfaz por consola:
```text
ESFOT-RPG/
├── src/
│   ├── personajes/
│   │   ├── Personaje.java
│   │   ├── Guerrero.java
│   │   ├── Mago.java
│   │   ├── Arquero.java
│   │   └── Paladin.java
│   ├── juego/
│   │   └── GestorJuego.java
│   └── Main.java
└── README.md
```
---


## 🧬 Modelo de Herencia y Diagrama UML

El diseño del sistema modela tres tipos de herencia:
1. **Herencia Simple:** `Guerrero` extiende directamente de `Personaje`.
2. **Herencia Jerárquica:** Las clases `Guerrero`, `Mago` y `Arquero` comparten una misma clase padre (`Personaje`).
3. **Herencia Multinivel:** `Paladin` extiende de `Guerrero`, el cual a su vez extiende de `Personaje` (`Personaje` -> `Guerrero` -> `Paladin`).

```mermaid
classDiagram
    class Personaje {
        -String nombre
        -int nivel
        -int vida
        -int vidaMaxima
        -int ataque
        -int defensa
        +mostrarInformacion()
        +estaVivo() boolean
        +recibirDanio(int cantidad)
        +atacar(Personaje enemigo)
        +atacar(Personaje enemigo, int bonificacion)
    }

    class Guerrero {
        -int fuerza
        +atacar(Personaje enemigo)
        +mostrarInformacion()
    }

    class Mago {
        -int mana
        +lanzarHechizo(Personaje enemigo)
        +mostrarInformacion()
    }

    class Arquero {
        -int flechas
        +dispararFlecha(Personaje enemigo)
        +mostrarInformacion()
    }

    class Paladin {
        -int energiaSagrada
        -boolean escudoActivo
        +curar(Personaje aliado)
        +activarEscudo()
        +recibirDanio(int cantidad)
        +mostrarInformacion()
    }

    Personaje <|-- Guerrero
    Personaje <|-- Mago
    Personaje <|-- Arquero
    Guerrero <|-- Paladin
```

---


## Evidencias
### Creación de personajes

`Guerrero`

<img width="583" height="525" alt="image" src="https://github.com/user-attachments/assets/9b520c6b-aa0b-47d7-b655-c1f6c7ef09dd" />

`Mago`

<img width="473" height="537" alt="image" src="https://github.com/user-attachments/assets/92c9750e-5cbb-4e3a-bd5b-9d460344cb18" />

`Arquero`

<img width="522" height="558" alt="image" src="https://github.com/user-attachments/assets/b33f4309-bcd5-485f-849b-373536bb0f29" />

`Paladín`

<img width="552" height="691" alt="image" src="https://github.com/user-attachments/assets/40ee2588-10cf-4cdd-b876-499ce4b26801" />

`Personaje repetido`

<img width="515" height="87" alt="image" src="https://github.com/user-attachments/assets/4bc2f5f3-eb67-427d-b3ef-47cf0b64a81e" />

`Valores no validos`

<img width="502" height="662" alt="image" src="https://github.com/user-attachments/assets/191e247e-4f06-4a52-a327-e608b66eef88" />

### Mostrar personajes

<img width="267" height="736" alt="image" src="https://github.com/user-attachments/assets/86cf3a6c-490d-41a8-a3d8-5cbcfc5ecf7c" />


<img width="270" height="763" alt="image" src="https://github.com/user-attachments/assets/8781618d-6f42-4189-83d2-a3c59dce00fc" />

### Búsqueda por nombre

<img width="420" height="450" alt="image" src="https://github.com/user-attachments/assets/a0f1c32e-6779-48f0-8bc7-b8962d91dc7b" />


<img width="412" height="122" alt="image" src="https://github.com/user-attachments/assets/578860c9-2dfc-41a1-9c49-8e3fc3692177" />

### Atacar a otro personaje

<img width="438" height="225" alt="image" src="https://github.com/user-attachments/assets/a4b50163-564d-4157-8bdf-dd845f3e444a" />

`Ataque con bonificacion`

<img width="558" height="176" alt="image" src="https://github.com/user-attachments/assets/78c5bde2-70f5-4e0d-b5a6-4ebe21b129a8" />

### Habilidades especiales

<img width="487" height="190" alt="image" src="https://github.com/user-attachments/assets/53eab6e8-d039-443c-a7ff-25c2f2a10451" />


<img width="507" height="207" alt="image" src="https://github.com/user-attachments/assets/3091fd61-add1-4f12-ad75-1c26887b6743" />

`Hechizo con mana y sin mana`

<img width="520" height="182" alt="image" src="https://github.com/user-attachments/assets/884450ab-96e8-46c7-84a5-c22c3ee0fe1b" />


<img width="512" height="126" alt="image" src="https://github.com/user-attachments/assets/29e5ed50-d7a0-4a45-a1dd-c9107f59961c" />

`Disparo de flechas`

<img width="543" height="173" alt="image" src="https://github.com/user-attachments/assets/ff7504f3-3f83-47d8-a648-0f174b366f85" />


<img width="525" height="120" alt="image" src="https://github.com/user-attachments/assets/a495132d-89bb-49c6-bfe4-020dc0e768a0" />

`Curar aliado`

<img width="508" height="155" alt="image" src="https://github.com/user-attachments/assets/83d99785-6bf1-497f-9390-e67e938a990a" />


<img width="516" height="530" alt="image" src="https://github.com/user-attachments/assets/f0dfccde-4096-47b0-ab35-3358bbdce581" />

### Combate completo

<img width="682" height="722" alt="image" src="https://github.com/user-attachments/assets/a0a3412b-8530-4709-9af8-4715aa264e4c" />

### Personajes vivos

<img width="391" height="181" alt="image" src="https://github.com/user-attachments/assets/fea645fb-7693-430b-82f5-aa877eef7177" />

## Preguntas de análisis
1. `¿Dónde se aplica herencia simple en el proyecto?`
Se aplica en varias partes, siendo la clase padre "Personaje" y las clases hijas "Guerrero, Mago, Arquero, Paladín", cada una de forma individual es de herencia simple.

2. `¿Por qué Personaje → Guerrero → Paladin representa herencia multinivel?`
Porque se forma una cadena , donde se van heredando atributos en varios niveles. "Paladín" hereda "Guerrero, y a la vez "Guerrero" hereda "Personaje". Así "Paladín" hereda "Guerrero" y "Personaje" a la vez.

3. `¿Qué relación ejemplifica herencia jerárquica?`
La relación de las subclases "Guerrero, Mago, Arquero y Paladín". Heredan simultáneamente la misma super clase "Personaje". 

4. `¿Cuál es la diferencia entre sobrescritura y sobrecarga de atacar()?`
La sobrecarga es dentro de la misma clase, y pasa al escribir el mismo método pero con una diferencia en los parámetros, pueden haber mas o menos.
La sobreescritura ocurre en una clase hija, en la que se hereda el mismo método del padre, pero se le añade atributos únicos de la clase hija.

5. `¿Qué aporta super en constructores y métodos?`
En los constructores invoca los atributos del constructor padre, así no hay necesidad de volver a asignar estos atributos a la clase hija, ya que toma las validaciones establecidas en la clase padre, pero también se le puede asignar mas atributos únicos de la clase hija.<br>En los metodos sirve de la misma manera, ayuda a reutilizar la lógica del método padre, añadiendo atributos únicos de la clase hija.

6. `¿Por qué List<Personaje> admite guerreros, magos, arqueros y paladines?`
Por el polimorfismo, admite las subclases hijas porque son una extensión de la clase padre, por ende pertenecen a padre, y pueden ser incluidas en la lista del padre.

7. `¿Qué versión de mostrarInformacion() se ejecuta al recorrer la lista y por qué?`
La versión sobre escrita de cada subclase hija, porque, dentro de la lista se encuentra las subclases hijas, tomando los metodos de estas, gracias al enlace dinámico de JAVA.

8. `¿Cuándo se necesita instanceof antes de hacer casting?`
Se necesita cuando manejas un objeto genérico (Personaje) y quieres usar métodos exclusivos de una subclase (como lanzarHechizo o dispararFlecha). El instanceof verifica que el objeto sea del tipo correcto antes de convertirlo, evitando errores fatales en ejecución (ClassCastException).

9. `¿Qué ventaja aporta HashMap para localizar un personaje por nombre?`
Guarda datos en pares, clave-atributo, asi se guarda como clave el nombre del personaje y su atributo es la clase hija del personaje. Haciendo que para encontrar al personaje solo se necesite su nombre, y ya puedo acceder al atributo guardado junto al nombre.

10. `¿Cómo se protege la consistencia de los atributos mediante encapsulamiento?`
 Se protegen declarando los atributos como privade, así cuando se quiera acceder a ellos para lectura o modificación, se debe pasar por getters, setters y metodos ya establecidos en esa clase, con sus respectivas validaciones, funcionando como filtros. 
