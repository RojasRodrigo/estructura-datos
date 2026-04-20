class ListaSimple {
    Nodo cabeza; // El inicio de la lista

    public ListaSimple() {
        this.cabeza = null;
    }

    // ==========================================
    // a. Mostrar los elementos con recursividad
    // ==========================================
    public void mostrar() {
        mostrarRecursivo(cabeza);
        System.out.println("null"); // Para que se vea bonito al final
    }

    private void mostrarRecursivo(Nodo actual) {
        // CASO BASE: Si el nodo está vacío, ya terminamos.
        if (actual == null) {
            return;
        }

        // ACCIÓN: Imprimimos el dato del nodo actual
        System.out.print(actual.dato + " -> ");

        // RECURSIVIDAD: Le pasamos la tarea al siguiente nodo
        mostrarRecursivo(actual.siguiente);
    }

    // ==========================================
    // b. Insertar al final con recursividad
    // ==========================================
    public void insertarAlFinal(int dato) {
        // Si la lista está completamente vacía, el nuevo nodo es la cabeza
        if (cabeza == null) {
            cabeza = new Nodo(dato);
        } else {
            // Si ya hay nodos, empezamos a buscar el final desde la cabeza
            insertarRecursivo(cabeza, dato);
        }
    }

    private void insertarRecursivo(Nodo actual, int dato) {
        // CASO BASE: Si el "siguiente" está vacío, estamos en el último nodo.
        if (actual.siguiente == null) {
            actual.siguiente = new Nodo(dato); // ¡Aquí enganchamos el nuevo nodo!
        } else {
            // RECURSIVIDAD: Si no es el último, seguimos avanzando al siguiente
            insertarRecursivo(actual.siguiente, dato);
        }
    }
}