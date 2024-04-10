public class App {
    public static void main(String[] args) throws Exception {
        //Crear la instancia de la (clase u objeto) MetodosOrdenamiento
        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();

        int[] numeros = {7 , 30, 12, 5};

        //Mandar a imprimir mi arreglo

        metodosOrdenamiento.imprime(numeros);

        //Llamo al metodo sortByBubble y su respuesta guardo en la variable arregloOrdenadoBuble

        int[] arregloOrdenadoBuble =metodosOrdenamiento.sortBybuble(numeros, true);
        metodosOrdenamiento.imprime(arregloOrdenadoBuble);
        // TODO: hacer un menu que elija el metodo
    }
}
