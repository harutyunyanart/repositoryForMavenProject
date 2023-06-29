package generics;

public class MyNonGeneric {

    private Object value;
    private Object[] values;

    private int size;

    public MyNonGeneric(Object value){
        this.value = value;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public Object[] getValues() {
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }


    public void add(Object o){
        if(size < values.length){
            values[size++] = o;
        }
    }

}
