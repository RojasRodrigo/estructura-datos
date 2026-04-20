public class Main {
    public static void main(String[] args) {
        ListaSimple miLista = new ListaSimple();

        // Usamos el método recursivo para insertar datos
        miLista.insertarAlFinal(10);
        miLista.insertarAlFinal(20);
        miLista.insertarAlFinal(30);
        miLista.insertarAlFinal(40);

        // Usamos el método recursivo para mostrar los datos
        System.out.println("Los elementos de la lista son:");
        miLista.mostrar();
        // Salida esperada: 10 -> 20 -> 30 -> 40 -> null
    }
}