public class Main {
    public static void main(String[] args) throws Exception {
        Bagno fm = new Bagno();
        Bagno ms = new Bagno();

        Persona p1 = new Persona("A", ms);
        Persona p2 = new Persona("B", ms);
        Persona p3 = new Persona("C", ms);

        Persona p4 = new Persona("D", fm);
        Persona p5 = new Persona("E", fm);
        Persona p6 = new Persona("F", fm);


        p1.start();
        p2.start();
        p3.start();

        p4.start();
        p5.start();
        p6.start();

        p1.join();
        p2.join();
        p3.join();

        p4.join();
        p5.join();
        p6.join();

        System.out.println("Thread finiti.");



    }
}
