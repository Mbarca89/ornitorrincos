package ornitorrinco;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
          
            System.out.print("Cola del castor (cm): ");
            double cola = sc.nextDouble();

            System.out.print("Velocidad base del castor (km/h, máx 8): ");
            int vel = sc.nextInt();

           
            OrnitorrincoVerde verde = new OrnitorrincoVerde("Perry", vel, cola);

            System.out.print("Propulsión de Blue (5 a 10 km/h): ");
            int propBlue = sc.nextInt();

            System.out.print("Propulsión de Blui (5 a 10 km/h): ");
            int propBlui = sc.nextInt();

            OrnitorrincoAzul blue = new OrnitorrincoAzul("Blue", vel, cola, propBlue);
            OrnitorrincoAzul blui = new OrnitorrincoAzul("Blui", vel, cola, propBlui);

            
            System.out.println("\n--- HABILIDADES ---");
            System.out.println("Ornitorrinco verde: " + verde.getNombre());
            verde.nadar();
            verde.tocarGuitarra();
            verde.tocarGuitorgan();

            System.out.println("\nOrnitorrinco azul: " + blue.getNombre());
            blue.nadar();
            blue.tocarGuitarra();

            System.out.println("Ornitorrinco azul: " + blui.getNombre());
            blui.nadar();
            blui.tocarGuitarra();

           
            Castor[] hermanos = new Castor[3];
            try {
                hermanos[0] = blue;
                hermanos[1] = verde;
                hermanos[2] = blui;
               
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" Error al guardar en el arreglo.");
            }

          
            List<OrnitorrincoAzul> lista = new ArrayList<>();
            for (Castor c : hermanos) {
                if (c instanceof OrnitorrincoAzul) {
                    lista.add((OrnitorrincoAzul) c);
                }
            }

            if (!lista.isEmpty()) {
                
                lista.sort((a, b) -> Integer.compare(b.getPropulsion(), a.getPropulsion()));
                List<OrnitorrincoAzul> top2 = lista.subList(0, Math.min(2, lista.size()));

            
                top2.sort(Comparator.comparingInt(OrnitorrincoAzul::getPropulsion));
                System.out.println("\nTop nadadores (orden ascendente por propulsión):");
                Iterator<OrnitorrincoAzul> it = top2.iterator();
                while (it.hasNext()) {
                    OrnitorrincoAzul o = it.next();
                    System.out.println(o.getNombre() + " -> " + o.getPropulsion() + " km/h");
                }
            } else {
                System.out.println("No hay azules para mostrar.");
            }

        } finally {
            System.out.println("\nLos ornitohermanos juntos al fin...");
            sc.close();
        }
    }
}