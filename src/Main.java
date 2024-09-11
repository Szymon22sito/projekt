import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        //kolekcjie
        //nie muszą miec zdefiniowanego rozmiaru
        //listy list , zbiory
        //wstawianie liczb z klawy

        ArrayList<Integer> listaLiczbWpisanych = new ArrayList<>();
        System.out.println("podaj 6 liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbWpisanych.add(liczba);
        }
        System.out.println("Wstawiono liczby");
        for (Integer liczbaWpisana:listaLiczbWpisanych) {
            System.out.println(liczbaWpisana);
        }
        // wypisywanie inaczej
        for (int i = 0; i < listaLiczbWpisanych.size(); i++) {
            System.out.println(listaLiczbWpisanych.get(i));
        }
        //losowanie bez powtórzeń
        ArrayList<Integer>listaLosowychBezpow = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            int liczba = (int) (Math.random()*100+1);
            while (listaLosowychBezpow.contains(liczba)){
                liczba = (int) (Math.random()*100+1);
            }
            listaLosowychBezpow.add(liczba);
        }
        System.out.println("wylosowane bez powtorzeń");
        System.out.println(listaLosowychBezpow);

    }
}