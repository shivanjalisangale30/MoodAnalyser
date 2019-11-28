package com.com.generics;

public class Generics<X, Y, Z> {

    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;

    public Generics(X[] myXArray, Y[] myYArray, Z[] myZArray) {
        this.myXArray = myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }

    public static void main(String args[]) {
        Integer intArray1[] = {22, 11, 33};
        Double doubleArray2[] = {1.2, 2.2, 2.3};
        Character charArray3[] = {'a', 'b', 'c'};

        toPrint(intArray1);
        toPrint(doubleArray2);
        toPrint(charArray3);

        new Generics<Integer, Double, Character>(intArray1, doubleArray2, charArray3).toPrint();
    }

    private void toPrint() {
        toPrint(myXArray);
        toPrint(myYArray);
        toPrint(myZArray);
    }

    private static <E> void toPrint(E[] doubleArray2) {
        for (E i : doubleArray2)
            System.out.println(i);
    }


}

