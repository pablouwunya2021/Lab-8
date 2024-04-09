# Lab-8
# Sistema de Colas con Prioridad para Atender Pacientes en Emergencias Hospitalarias

Este proyecto implementa un sistema de colas con prioridad para gestionar la atención de pacientes en la sección de emergencias de un hospital. Se proporcionan dos versiones del sistema: una utilizando la estructura de datos PriorityQueue del Java Collection Framework y otra utilizando una implementación personalizada de PriorityQueue llamada VectorHeap.

## Contenido del Proyecto

El proyecto consta de los siguientes archivos:

### Versión con Java Collection Framework

- `MainJC.java`: La clase principal del programa que carga los pacientes desde un archivo, los agrega a una cola de prioridad y los atiende uno por uno.
- `PacienteJC.java`: La clase que define la estructura de un paciente y su comparador de prioridad.

### Versión con Implementación Personalizada

- `Main.java`: La clase principal del programa que carga los pacientes desde un archivo, los agrega a una cola de prioridad y los atiende uno por uno.
- `Paciente.java`: La clase que define la estructura de un paciente y su comparador de prioridad.
- `VectorHeap.java`: Una implementación personalizada de PriorityQueue utilizando un heap basado en un vector.

- `pacientes.txt`: Un archivo de texto que contiene la información de los pacientes que serán atendidos.

## Uso

Para utilizar cualquiera de las versiones del programa, sigue estos pasos:

1. Asegúrate de tener instalado Java en tu sistema.
2. Coloca el archivo `pacientes.txt` en el directorio raíz del proyecto, o bien, asegúrate de especificar la ubicación correcta en el código.
3. Compila y ejecuta el archivo correspondiente (`MainJC.java` o `Main.java`).
4. El programa mostrará la información de cada paciente que está siendo atendido en orden de prioridad.

## Formato del Archivo pacientes.txt

El archivo `pacientes.txt` debe tener el siguiente formato:

por ejemplo: 

Juan Perez, fractura de pierna, C
Maria Ramirez, apendicitis, A
Lorenzo Toledo, chikungunya, E
Carmen Sarmientos, dolores de parto, B


## Autor

Este proyecto fue creado por Pablo Andrés Cabrera Arguello 231156.

