public class Bagno {
    private int wait = 2000;
    public synchronized void use(String name) throws InterruptedException{
        System.out.println(name + " è entrato in bagno.");
        Thread.sleep(wait);
        System.out.println(name + " è uscito dal bagno.");
    }
}
