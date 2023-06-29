package abstraction;

public class Pianist implements Musician  {
    @Override
    public void playMusic() {
        System.out.println("playing piano");
    }

    @Override
    public void readNotes() {
        System.out.println("reading piano notes");
    }
}
