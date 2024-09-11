public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //tablica
        //musi miec rozmiar
        //nie mozna potem zmienic
        //elementy proste i zlozone
        //wartosci losowe od 1 do 100
        //6 elemen
        int [] tablicaLosowych = new int[6];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = (int) (Math.random()*100+1);
        }
        //wypisywanie elementów z tablicy
        for (int element:tablicaLosowych) {
            System.out.println(element+", ");
        }
    }



}