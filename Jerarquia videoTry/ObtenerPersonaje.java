//se importan las clases 
import java.util.ArrayList;
import java.util.List;
// Definition of the class GetCharacter parameterized with a type T that extends Character
class ObtenerPersonaje<T extends Personaje> {
    // Declaration of a "character" list that stores objects of type T
    private List<T>personaje;
    // Constructor of the GetCharacter class
    public ObtenerPersonaje(){
        personaje=new ArrayList<>();
    }
    //the addCharacter method is created
    public void agregarPersonaje(T jugar){
       //we add what we receive in the play variable to the character arrayList
       personaje.add(jugar);
    }
    //create the show character method
    public void mostrarPersonaje(){
        //with this improved for we can print the methods created in the interface and the abstracts
        for(T jugar:personaje){
         System.out.println("Tipo de dato "+jugar.getClass().getSimpleName()); 
         System.out.println("Nombre "+jugar.nombre); 
         System.out.println("Nivel: "+jugar.nivel);
         System.out.println("HABILIDADES");
         jugar.arrebatar();
         jugar.atacar();
         jugar.correr();
         jugar.morder();
         System.out.println("----------------------------");

        }
    }
}
