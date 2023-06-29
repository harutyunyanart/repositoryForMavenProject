package dynamicarrayold;

public class DynamicArrayTest {
    public static void main(String[] args) {


        DynamicArray newDynamicArray = new DynamicArray();
        System.out.println("Size"+newDynamicArray.size());
        System.out.println("ArrayIsEmpty "+newDynamicArray.isEmpty());
        System.out.println("Array contains that element "+newDynamicArray.contains(2));
        System.out.println("Returns the index of the first occurrence of the specified element "+newDynamicArray.indexOf(3));
        System.out.println("Returns the index of the last occurrence of the specified element "+newDynamicArray.lastIndexOf(8));
        System.out.println("Returns the element at the specified position in this DynamicArray "+newDynamicArray.get(1));
        System.out.println("Replaces the element at the specified position in this DynamicArray with the specified element,return the previous element "+newDynamicArray.set(3,22));
        newDynamicArray.print(newDynamicArray.getArray());
        System.out.println();
        System.out.println("Appends the specified element to the end of this DynamicArray. "+newDynamicArray.add(5));
        newDynamicArray.add(10, 3);
        newDynamicArray.print(newDynamicArray.getArray());
        System.out.println();
        System.out.println("Removes the element at the specified position,return removed element" + " " + newDynamicArray.removeIndexOf(10));
        System.out.println("Removes the first occurrence of the specified element" + " " + newDynamicArray.remove(3));


    }

}
