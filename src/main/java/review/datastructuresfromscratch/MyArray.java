package main.java.review.datastructuresfromscratch;

public class MyArray {
    private final Object[] elements;
    private int count;

    public MyArray (int length) {
        elements = new Object[length];
    }

    public void insert(Object entry) {
        //Not implementing growth to distinguish from ArrayList()
        if(count == elements.length) {
            System.out.printf("Could not add element %s. Array full.", entry);
        }

        //Else add new item at end of array
        //NOTE: Don't forget post-increment to count when assigning
        elements[count++] = entry;
    } //end insert()


    public String toString() {
        // return Arrays.toString(elements);
        // (Seems to defeat the purpose of self-implementation to just use java.util.Arrays methods.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {
            // This can be ugly with Objects (ref var) and other potential
            // Objects with no override for toString() or long strings.
            sb.append(elements[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    } // end toString()

    public static MyArray initSampleArray(String type) {
        MyArray mA = new MyArray(4);
        switch (type) {
            case "int":
                // Inserting 4 random ints
                mA.insert(22);
                mA.insert(-6);
                mA.insert(19);
                mA.insert(17);
                break;

            case "str":
                mA = new MyArray(4);
                mA.insert("Green");
                mA.insert("Red");
                mA.insert("Black");
                mA.insert("Blue");
                break;
        }
        return mA;
    } // end initSampleArray()

    public static void main(String[] args) {
        MyArray arr = MyArray.initSampleArray("int");
        MyArray arr2 = MyArray.initSampleArray("str");

        System.out.println("Integer Array");
        System.out.println(arr);
        System.out.println("\nString Array");
        System.out.println(arr2);

    }

} // end MyArray.java
