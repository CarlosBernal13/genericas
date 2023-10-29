public class Main {
    public static void main(String[] args) {
        //create the instances
        Jugador jugador=new Jugador("Tauro", 56, "Guerrero");
        Jugador jugador1=new Jugador("Dorse", 10, "Mago");
        Jugador jugador2=new Jugador("Lancelot", 9, "Arquero");
        Enemigo enemigo=new Enemigo("Minotauro", 7, "Esqueleto");
        Enemigo enemigo1=new Enemigo("Clovedeo", 3, "Dragón");
        Enemigo enemigo2=new Enemigo("Pelayo", 12, "Orco");
        // Create a figure player and add the figures
        ObtenerPersonaje<Personaje> jugadorGrande = new ObtenerPersonaje<>();
        jugadorGrande.agregarPersonaje(enemigo);
        jugadorGrande.agregarPersonaje(enemigo1);
        jugadorGrande.agregarPersonaje(enemigo2);
        jugadorGrande.agregarPersonaje(jugador);
        jugadorGrande.agregarPersonaje(jugador1);
        jugadorGrande.agregarPersonaje(jugador2);
        // Show the characteristics of the figures
        jugadorGrande.mostrarPersonaje();
    }
}
