# Ejercicio de asistencia 
Descripción:
Esta actividad es una implementación sencilla de una Priority Queue (cola de prioridad) en Java. El programa genera números aleatorios y los almacena en la cola según su prioridad (en este caso, la prioridad es el mismo valor). Luego, los muestra en orden ascendente de prioridad.

# Clases
1. Main
   * Contiene el método main que ejecuta el programa.
   * Tiene el método ejemploPriorityQueue() que:
       * Crea una instancia de PriorityQueue.
       * Genera números aleatorios.
       * Los agrega a la cola con su valor como prioridad.
       * Muestra los elementos en orden ascendente de prioridad.
         
2. PriorityNode<T>
* Representa un nodo dentro de la cola de prioridad.
* Atributos:
   * priority: la prioridad del nodo.
   * data: el valor o dato que almacena.
* Métodos:
  * Constructores por defecto y con parámetros.
  * Getters y setters para priority y data.
 
3. PriorityQueue<T>
* Representa la cola de prioridad.
* Atributos:
   * queue: lista que almacena los nodos (PriorityNode)
* Métodos:
  * push(int priority, T data): agrega un nodo a la cola y mantiene el orden ascendente según la prioridad.
  * pop(): elimina y devuelve el nodo con menor prioridad.
  * isEmpty(): verifica si la cola está vacía.

 # Cómo compilar y ejecutar
 1. Guarda los archivos en la misma carpeta:
      * Main.java
      * PriorityNode.java
      * PriorityQueue.java
   
  2. Abre la terminal o CMD y navega hasta la carpeta donde están los archivos.

  3. Compila los archivos con:
     ```bash
     javac Main.java PriorityNode.java PriorityQueue.java
     
  4. Ejecuta el programa con:
      ```bash
      java Main
  5. Verás en la consola los valores aleatorios agregados y luego la lista de elementos en orden ascendente de prioridad.
