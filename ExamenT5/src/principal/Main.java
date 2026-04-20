package principal;

import java.util.Arrays;

import aplicacion.MandoTV;
import aplicacion.MandoAire;
import aplicacion.MandoAspiradora;
import aplicacion.MandoMinicadena;
import aplicacion.Velocidad;
import aplicacion.DispositivoApagadoException;
import aplicacion.Mando;
import aplicacion.Ajustable;


public class Main {
    public static void main(String[] args) {
        // a) Declaración y relleno de la tabla
        Mando[] catalogo = {
            new MandoTV("Alexa Echo", "Amazon", 59.99, "Alexa"),
            new MandoMinicadena("Hue Bulb", "Philips", 19.50, "Blanco Cálido"),
            new MandoAspiradora("Nest Learning", "Google", 249.00, 21.5),
            new MandoAire("Arlo Pro", "Netgear", 180.00, "2K")
        };

        // b) Ordenar por precio y mostrar
        System.out.println("--- CATÁLOGO ORDENADO DE FORMA ALFABÉTICA ---");
        Arrays.sort(catalogo);
        for (Mando m : catalogo) System.out.println(m);

        // c) Recorrido y acciones específicas
        System.out.println("\n--- PROCESANDO MANDO ---");
        for (Mando m : catalogo) {
            try {
                m.encender();
                System.out.println("Encendiendo: " + m.getClass().getSimpleName());

                if (m instanceof MandoTV) {
                    MandoTV mtv = (MandoTV) mtv;
                    mtv.subir(); mtv.subir();
                    System.out.println("Canal: " + mtv.getCanal());
                } 
                
//                else if (d instanceof LucesInteligentes) {
//                    LucesInteligentes l = (LucesInteligentes) d;
//                    l.subir();
//                    l.setColor("Azul Neón");
//                } 
//                else if (d instanceof Termostatos) {
//                    Termostatos t = (Termostatos) d;
//                    t.cambiarModo();
//                    t.activarAlerta("Temperatura inusual");
//                } 
//                else if (d instanceof CamarasSeguridad) {
//                    CamarasSeguridad c = (CamarasSeguridad) d;
//                    c.iniciarGrabacion();
//                    c.activarAlerta("Movimiento detectado");
//                }
//                
//                System.out.println("Resultado: " + d);
//            } catch (DispositivoApagadoException e) {
//                System.err.println(e.getMessage());
//            }
//        }
//
//        // d) Caso de error forzado (Altavoz apagado)
//        System.out.println("\n--- PRUEBA DE ERROR FORZADO ---");
//        AltavocesInteligentes testAltavoz = new AltavocesInteligentes("Prueba", "Marca", 10.0, "Siri");
//        testAltavoz.apagar();
//        try {
//            testAltavoz.subir();
//        } catch (DispositivoApagadoException e) {
//            System.out.println("Capturado: " + e.getMessage());
//        }
//    }
