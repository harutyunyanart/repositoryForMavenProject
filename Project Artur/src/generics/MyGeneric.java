package generics;

public class MyGeneric <T> {

    private T value;
    private T[] values;

    int size;

    public MyGeneric(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public T[] getValues() {
        return values;
    }

    public void setValues(T[] values) {
        this.values = values;
    }

    public void setValue(T value){
        this.value = value;
    }

    public void add(T t){
        if(size < values.length){
            values[size++] = t;
        }
    }


}
