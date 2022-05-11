public class Persona extends Thread{
    private String name;
    private Bagno wc;

    public Persona(String name, Bagno wc) {
        this.name = name;
        this.wc = wc;
    }
    
    public void run(){
        try {
            wc.use(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
