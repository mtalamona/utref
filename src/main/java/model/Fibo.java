package model;

import java.util.ArrayList;

public class Fibo {
    // t1: primer termino de la serie
    // t2: segundo termino de la serie
    // sum: sumatoria de t1 y t2
    int t1, t2, size;

    // Para ir colectando los números de la serie
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    // Valido en el constuctor
    public Fibo (int n) {
        if (n < 0) throw new IllegalArgumentException("No se aceptan números negativos");

        this.size = n;
        this.t1 = 0;
        this.t2 = 1;
    }

    // Calcula la serie
    public ArrayList<Integer> calculate() {

        int sum = 0;

        // Colecto los números de la serie
        numbers.add(sum);

        for (int i = 2; i <= size-1; ++i) {
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            // Colecto los números de la serie
            numbers.add(sum);
        }

        
        return numbers;
        //return numbersToString(numbers);
    }

    // Dado un ArrayList, retorna los valores sin los corchetes
    private String numbersToString(ArrayList<Integer> numbers) {

        StringBuffer strbuffer = new StringBuffer();
        for (Integer str : numbers) {
            strbuffer.append(str).append(" ");
        }

        return strbuffer.toString();
    }
}