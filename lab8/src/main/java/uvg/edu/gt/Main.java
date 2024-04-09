package uvg.edu.gt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cargar pacientes desde el archivo pacientes.txt
        PriorityQueue<Paciente> colaPrioridad = cargarPacientes("C:\\Users\\Pbloc\\IdeaProjects\\lab8\\src\\main\\resources\\pacientes.txt");

        // Verificar si hay pacientes en la cola antes de atenderlos
        if (!colaPrioridad.isEmpty()) {
            // Atender pacientes uno por uno
            while (!colaPrioridad.isEmpty()) {
                Paciente paciente = colaPrioridad.remove();
                System.out.println("Atendiendo a " + paciente.getNombre() +
                        " con síntoma de " + paciente.getSintoma() +
                        ", prioridad " + paciente.getPrioridad());
            }
        } else {
            System.out.println("No hay pacientes en la cola para atender.");
        }

        // Verificar si la cola está vacía después de atender a todos los pacientes
        if (colaPrioridad.isEmpty()) {
            System.out.println("Todos los pacientes han sido atendidos.");
        }
    }

    public static PriorityQueue<Paciente> cargarPacientes(String filename) {
        PriorityQueue<Paciente> colaPrioridad = new VectorHeap<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String nombre = parts[0].trim();
                String sintoma = parts[1].trim();
                char prioridad = parts[2].trim().charAt(0);
                Paciente paciente = new Paciente(nombre, sintoma, prioridad);
                colaPrioridad.add(paciente);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return colaPrioridad;
    }
}
