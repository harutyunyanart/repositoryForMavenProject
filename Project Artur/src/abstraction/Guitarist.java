package abstraction;

public abstract class Guitarist implements Musician{


    @Override
    public void readNotes() {
        System.out.println("reading guitar notes");
    }
}
