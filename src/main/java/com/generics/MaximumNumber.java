package com.generics;

public class MaximumNumber<E extends Comparable<E>> {

//    public Integer maximumNumberFind(Integer a, Integer b, Integer c) {
//        Integer max = a;
//        if (b.compareTo(max) > 0) {
//            max = b;
//        }
//        if (c.compareTo(max) > 0) {
//            max = c;
//        }
//        return max;
//    }
//
//    public Double maximumNumberFind(Double a, Double b, Double c) {
//        Double max = a;
//        if (b.compareTo(max) > 0) {
//            max = b;
//        }
//        if (c.compareTo(max) > 0) {
//            max = c;
//        }
//        return max;
//    }
//
//    public Character maximumNumberFind(Character a, Character b, Character c) {
//        Character max = a;
//        if (b.compareTo(max) > 0) {
//            max = b;
//        }
//        if (c.compareTo(max) > 0) {
//            max = c;
//        }
//        return max;
//    }


    public E maximumNumberFind(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}
