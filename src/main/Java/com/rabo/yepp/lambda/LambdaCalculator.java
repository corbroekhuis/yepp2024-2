package com.rabo.yepp.lambda;

@FunctionalInterface
interface Comp{
    boolean calculate( int int1, int int2);
}

@FunctionalInterface
interface Calc{
    int calculate( int int1, int int2);
}

public class LambdaCalculator {

    public static void main(String[] args) {
        Calc calculator =  (int1, int2) -> int1 + int2;

        int result = process( calculator, 45, 98);
        System.out.println( result);

        calculator =  (int1, int2) -> int1 - int2;
        result = process( calculator, 45, 98);
        System.out.println( result);

        result = process(  ( int1, int2) -> int1 * int2    , 45, 98);
        System.out.println( result);

        result = process(  ( int1, int2) -> { return 0;}    , 45, 98);
        System.out.println( result);

        boolean compare = compare(  ( int1, int2) -> int1 < int2    , 45, 98);
        System.out.println( compare);

    }

    private static int process( Calc calculator, int int1, int int2){

        int result = calculator.calculate( int1, int2);
        return result;
    }

    private static boolean compare( Comp compare, int int1, int int2){

        boolean result = compare.calculate( int1, int2);
        return result;
    }

}
