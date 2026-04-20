package principal;

import aplicacion.*; // Importamos todas las clases e interfaces del paquete 1
import java.util.Arrays;

/**
 * Clase que contiene el método principal del programa.
 * Se encarga de la gestión del catálogo de mandos, su ordenación y 
 * la ejecución de pruebas funcionales según el tipo de dispositivo.
 */
public class Main {

    public static void main(String[] args) {
        
        // 1. Declarar un array de 5 mandos con al menos uno de cada tipo
        // Los constructores siguen el orden: modelo, precio, encendido (según tu UML)
        Mando[] catalogo = new Mando[] {
        		new MandoTV("Sony Bravia X1", 25.50, 15, "Antena 3"),
        		new MandoMinicadena("LG SoundTower", 15.00, 20),
        	    new MandoAspiradora("Roomba v9", 45.99, 1),
        		new MandoAire("Daikin Eco", 60.00, 2, "FRIO"),
        	    new MandoTV("Samsung Crystal", 30.00, 10, "Netflix")
        };

        // 2. Ordenar el catálogo
        // Arrays.sort utiliza el método compareTo implementado en la clase Mando
        Arrays.sort(catalogo);

        // 3. Imprimir el catálogo ordenado
        System.out.println("=== CATÁLOGO DE MANDOS ORDENADO ALFABÉTICAMENTE ===");
        for (Mando m : catalogo) {
            System.out.println(m.toString());
        }
        System.out.println("---------------------------------------------------\n");

        // 4. Recorrer el array y realizar acciones específicas
        System.out.println("=== INICIANDO PRUEBAS DE DISPOSITIVOS ===");
        for (Mando m : catalogo) {
            System.out.println("Probando: " + m.getModelo());
            
            // Acción común: Encender
            m.encender();

            try {
                // Identificación del tipo de mando 
                
                if (m instanceof MandoTV) {
                    MandoTV tv = (MandoTV) m; 
                    tv.setCanal("Telecinco");
                    tv.subir(); // Sube de 5 en 5 según enunciado
                    tv.bajar();
                    System.out.println("   [TV] Canal cambiado y volumen probado.");

                } else if (m instanceof MandoMinicadena) {
                    MandoMinicadena mini = (MandoMinicadena) m;
                    mini.subir(); // Sube de 10 en 10 según enunciado
                    mini.bajar();
                    System.out.println("   [Minicadena] Volumen ajustado con éxito.");

                } else if (m instanceof MandoAspiradora) {
                    MandoAspiradora asp = (MandoAspiradora) m;
                    asp.aumentar(); // Sube de 1 en 1
                    asp.disminuir();
                    System.out.println("   [Aspiradora] Velocidad de succión verificada.");

                } else if (m instanceof MandoAire) {
                    MandoAire aire = (MandoAire) m;
                    aire.cambiarModo();
                    // aire.setTemperatura(22); // Si añadiste el setter en la clase
                    aire.aumentar(); // Aumenta velocidad ventilador
                    aire.disminuir();
                    System.out.println("   [Aire] Modo cambiado y ventilación ajustada.");
                }

            } catch (Exception e) {
                // Captura de DispositivoApagadoExcepcion si se implementó en los métodos
                System.out.println("   ERROR: " + e.getMessage());
            }

            // Mostrar estado final tras las pruebas
            System.out.println("   Estado final: " + m.toString() + "\n");
        }
       }
    }