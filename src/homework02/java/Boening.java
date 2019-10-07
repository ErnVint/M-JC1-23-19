public class Boening extends Plane {
    public static void check(Plane aa) {
        if (aa instanceof Boening) {
            Boening x = (Boening)aa;
            System.out.println("downcasting done");
        }
    }
}
