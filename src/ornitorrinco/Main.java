import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // pido datos del castor
            System.out.print("Cola del castor (cm): ");
            double cola = sc.nextDouble();

            System.out.print("Velocidad base del castor (km/h, máx 8): ");
            double vel = sc.nextDouble();

            // creo los ornitorrincos
            OrnitorrincoVerde verde = new OrnitorrincoVerde("Perry", cola, vel);

            System.out.print("Propulsión de Blue (5 a 10 km/s): ");
            double propBlue = sc.nextDouble();

            System.out.print("Propulsión de Blui (5 a 10 km/s): ");
            double propBlui = sc.nextDouble();

            OrnitorrincoAzul blue = new OrnitorrincoAzul("Blue", cola, vel, propBlue);
            OrnitorrincoAzul blui = new OrnitorrincoAzul("Blui", cola, vel, propBlui);

            // muestro habilidades
            System.out.println("--- HABILIDADES ---");
            System.out.println("Orni verde: " + verde.getNombre());
            verde.nadar();
            verde.tocarGuitarra();
            verde.tocarGuitorgan(sc);

            System.out.println("Orni azul: " + blue.getNombre());
            blue.nadar();
            blue.tocarGuitarra();

            System.out.println("Orni azul: " + blui.getNombre());
            blui.nadar();
            blui.tocarGuitarra();

            // arreglo de 3
            Castor[] hermanos = new Castor[3];
            try {
                hermanos[0] = blue;
                hermanos[1] = verde;
                hermanos[2] = blui;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error al guardar en el arreglo.");
            }

            // mejores nadadores (solo azules)
            List<OrnitorrincoAzul> lista = new ArrayList<>();
            for (Castor c : hermanos) {
                if (c instanceof OrnitorrincoAzul) {
                    lista.add((OrnitorrincoAzul) c);
                }
            }

            if (!lista.isEmpty()) {
                // ordeno descendente para elegir 2
                lista.sort((a, b) -> Double.compare(b.getPropulsionKms(), a.getPropulsionKms()));
                List<OrnitorrincoAzul> top2 = lista.subList(0, Math.min(2, lista.size()));

                // los paso ascendente y los recorro con iterador
                top2.sort(Comparator.comparingDouble(OrnitorrincoAzul::getPropulsionKms));
                System.out.println("Top nadadores (orden ascendente por propulsión):");
                Iterator<OrnitorrincoAzul> it = top2.iterator();
                while (it.hasNext()) {
                    OrnitorrincoAzul o = it.next();
                    System.out.println(o.getNombre() + " -> " + o.getPropulsionKms() + " km/s");
                }
            } else {
                System.out.println("No hay azules para mostrar.");
            }

        } finally {
            System.out.println("Los ornitohermanos juntos al fin...");
        }
    }
}

   