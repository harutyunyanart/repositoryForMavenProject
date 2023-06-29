package dynamicarray;


public class DynamicArray {

    /**
     * Returns the number of elements in this DynamicArray.
     * վերադարձնում է էլեմենտների քանակը(չշփոթել մասիվի էլեմենտների քանակի հետ)
     * @return the number of elements in this DynamicArray
     */
    public int size(){return 0;}

    /**
     * Returns <tt>true</tt> if this DynamicArray contains no elements.
     *  եթե մասիվի մեջ էլեմենտներ չկան վերադարձնում է true, հակառակ դեպքում false
     * @return <tt>true</tt> if this DynamicArray contains no elements
     */
    public boolean isEmpty(){return false;}

    /**
     * Returns <tt>true</tt> if this DynamicArray contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this DynamicArray contains
     * at least one element <tt>e</tt> such that
     * o==null ? get(i)==null : o.equals( get(i) ).
     *  վերադարձնում է true, եթե մասիվի մեջ կա տվյալ e էլեմենտին հավասար էլեմենտ
     * @param o element whose presence in this DynamicArray is to be tested
     * @return <tt>true</tt> if this DynamicArray contains the specified element
     */
    public boolean contains(int e){return false;}

    /**
     * Returns the index of the first occurrence of the specified element
     * in this DynamicArray, or -1 if this DynamicArray does not contain the element.
     * More formally, returns the lowest index <tt>i</tt> such that
     * o==null ? get(i)==null : o.equals( get(i) )
     * or -1 if there is no such index.
     * վերադարձնում է տվյալ e էլեմենտին հավասար առաջին էլեմենտի ինդեքսը
     */
    public int indexOf(int e){return -1;}

    /**
     * Returns the index of the last occurrence of the specified element
     * in this DynamicArray, or -1 if this DynamicArray does not contain the element.
     * More formally, returns the highest index <tt>i</tt> such that
     * o==null ? get(i)==null : o.equals( get(i) )
     * or -1 if there is no such index.
     * վերադարձնում է տվյալ e էլեմենտին հավասար վերջին էլեմենտի ինդեքսը
     */
    public int lastIndexOf(int o){return -1;}

      /**
     * Returns the element at the specified position in this DynamicArray.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this DynamicArray
     * @throws IndexOutOfBoundsException
       * վերադարձնում է տրված ինդեքսի տակ գտնվող էլեմենտը,
       * եթե ինդեքսը վալիդ չէ ապա պետք է IndexOutOfBoundsException throw անել (շպրտել)
     */
      public int get(int index){return 0;}

    /**
     * Replaces the element at the specified position in this DynamicArray with
     * the specified element.
     *
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException
     * տրված "index" ինդեքսի տակ գտնվող էլեմենտը փոխարինում է "element" էլեմենտով
     * և վերադարձնում է տվյալ ինդեքսի տակ գտնվող նախկին արժեքը
     * եթե ինդեքսը վալիդ չէ ապա պետք է IndexOutOfBoundsException throw անել (շպրտել)
     */
    public int set(int index, int element){return 0;}

    /**
     * Appends the specified element to the end of this DynamicArray.
     *
     * @param e element to be appended to this DynamicArray
     * @return <tt>true</tt>
     * մասիվի մեջ եղած վերջին էլեմենտի հաջորդ ինդեքսի տակ գտնվող էլեմենտին վերագրում է e էլեմենտը
     * վերադարձնում է true եթե էլեմենտը բարեհաջող ավելացվել է, հակառակ դեպքում false
     */
    public boolean add(int e){return false;}

    /**
     * Inserts the specified element at the specified position in this
     * DynamicArray. Shifts the element currently at that position (if any) and
     * any subsequent elements to the right (adds one to their indices).
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException
     * տրված index ինդեքսի տակ գտնվող էլեմենտի տեղն ավելացնում է նոր էլեմենտ, մնացած էլեմենտները տեղաշարժում է մեկական ինդեքսով աջ
     * եթե ինդեքսը վալիդ չէ ապա պետք է IndexOutOfBoundsException throw անել (շպրտել)
     */
    public void add(int index, int element){}

    /**
     * Removes the element at the specified position in this DynamicArray.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the DynamicArray
     * @throws IndexOutOfBoundsException
     * ջնջում է տվյալ ինդեքսի տակ գտնվող էլեմենտը, իսկ նրանից աջ գտնվող էլեմենտները մեկական ինդեքսով տեղափոխում է ձախ
     * վերադարձնում է ջնջված էլեմենտը
     * եթե ինդեքսը վալիդ չէ ապա պետք է IndexOutOfBoundsException throw անել (շպրտել)
     */
    //public int remove(int index){return 0;}

    /**
     * Removes the first occurrence of the specified element from this DynamicArray,
     * if it is present.  If the DynamicArray does not contain the element, it is
     * unchanged.  More formally, removes the element with the lowest index
     * <tt>i</tt> such that
     * <tt>(o==null? get(i)==null : o.equals( get(i) ) )</tt>
     * (if such an element exists).  Returns <tt>true</tt> if this DynamicArray
     * contained the specified element (or equivalently, if this DynamicArray
     * changed as a result of the call).
     *
     * @param o element to be removed from this DynamicArray, if present
     * @return <tt>true</tt> if this DynamicArray contained the specified element
     * ջնջում է առաջին պատահած էլեմենտը, որն հավասար էտրված e էլեմենտին,
     * վերադարձնում է true եթե գտել և ջնջել է տվյալ էլենետը, հակառակ դեպքում false
     */
    public boolean remove(int o){return false;}
}
