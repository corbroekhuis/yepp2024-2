package com.rabo.yepp.generics;

import java.util.ArrayList;
import java.util.List;

class Safe<T>{
    List<T> valuables = new ArrayList<>();
    void putInsafe( T t){
        valuables.add( t);
    }
    T getValuable( int index){
        return valuables.get(index);
    }
    List<T> getValuables(){
        return valuables;
    }
}

class Jewelry{
    @Override
    public String toString() {
        return "I'm Jewelry";
    }
}
class Necklace extends Jewelry{
    @Override
    public String toString() {
        return "I'm a necklace";
    }
}
class Bracelet extends Jewelry{
    public void anotherMethod(){

    }
    @Override
    public String toString() {
        return "I'm a bracelet";
    }
}

public class Exercise {

    public static void main(String[] args) {

        // Create safe for bracelets
        // Add bracelets
        // print all bracelets

        Safe<Bracelet> braceletSafe = new Safe<>();
        braceletSafe.putInsafe(new Bracelet());
        braceletSafe.putInsafe(new Bracelet());
        braceletSafe.putInsafe(new Bracelet());
        braceletSafe.putInsafe(new Bracelet());

        for(Bracelet bracelet: braceletSafe.getValuables()){
            System.out.println(bracelet);
        }
        System.out.println("-------------------------------------");
        // Create safe for necklaces
        // Add bracelets
        // print all bracelets

        Safe<Necklace> necklaceSafe = new Safe<>();
        necklaceSafe.putInsafe(new Necklace());
        necklaceSafe.putInsafe(new Necklace());
        necklaceSafe.putInsafe(new Necklace());

        for(Necklace necklace: necklaceSafe.getValuables()){
            System.out.println(necklace);
        }
        System.out.println("-------------------------------------");
        // Create safe for jewelry
        // Add bracelets and necklaces
        // print all jewelry

        Jewelry bracelet = new Bracelet();
        bracelet.toString();

        Safe<Jewelry> jewelrySafe = new Safe<>();
        jewelrySafe.putInsafe(new Jewelry());
        jewelrySafe.putInsafe(new Necklace());
        jewelrySafe.putInsafe(new Bracelet());
        jewelrySafe.putInsafe(new Jewelry());

        for (Jewelry jewelry: jewelrySafe.getValuables()){
            System.out.println(jewelry);
        }

    }
}

