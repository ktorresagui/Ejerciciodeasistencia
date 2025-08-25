import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ejemploPriorityQueue();
    }

    public static void ejemploPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Random rand = new Random();
        int cantidad = 10; // Puedes cambiar la cantidad de elementos

        System.out.println("Agregando valores aleatorios a la PriorityQueue:");
        for (int i = 0; i < cantidad; i++) {
            int valor = rand.nextInt(100) + 1; // 1 a 100
            pq.push(valor, valor); // prioridad y valor iguales
            System.out.print(valor + " ");
        }

        
        System.out.print("\n\nElementos en orden ascendente de prioridad: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.pop() + " ");
        }
    }
}
