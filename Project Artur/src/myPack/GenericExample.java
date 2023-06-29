package myPack;

public class GenericExample <T>{
    private T contents;

    public void setContents(T contents){
        this.contents=contents;
    }

    public T getContents(){
        return contents;
    }
}
