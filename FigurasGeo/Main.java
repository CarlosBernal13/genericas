public class Main {
       
public static void main(String[] args) {
    // Crear instancias de figuras
    Circulo circulo = new Circulo("Círculo ", 10.0);
    Rectangulo rectangulo = new Rectangulo("Rectángulo ", 12.0, 6.0);
    Triangulo triangulo = new Triangulo("Triángulo ", 9.0, 6.0, 4.0, 7.0);

    // Crear una variable para obtener las figuras y agregar las figuras
    Figuras<FiguraGeometrica> obtener = new Figuras<>();
    obtener.agregarFigura(circulo);
    obtener.agregarFigura(rectangulo);
    obtener.agregarFigura(triangulo);
    // Mostrar las características de las figuras
    obtener.mostrarFiguras(); 
}
}
