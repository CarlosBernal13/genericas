import java.util.ArrayList;
import java.util.List;
// Generic class to retrieve geometric shapes
class Figuras<T extends FiguraGeometrica> {
    private List<T> figuras;

    public Figuras() {
        figuras = new ArrayList<>();
    }

    // Add a shape to the list
    public void agregarFigura(T figura) {
        figuras.add(figura);
    }
    // Display information about the shapes
    public void mostrarFiguras() {
        for (T figura : figuras) {
            System.out.println("Tipo de Figura: " + figura.getClass().getSimpleName());
            System.out.println("Nombre de la Figura: " + figura.nombre);
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: "+figura.calcularPerimetro());
            System.out.println();
        }
    }
        }







