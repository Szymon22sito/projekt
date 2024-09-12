import java.util.*;

public class Main {

    //metody

    /**
     * Metoda wylosujLiczby losuje liczby calkowite z zakresu 1 do 100
     * @param ile - liczba całkowita przechowująca ile liczb wylosujemy
     * @return lista z wylosoanymi liczbami
     */
    private static ArrayList<Integer> wylosujLiczby(int ile) {
        ArrayList<Integer>listaLosowychBezpow = new ArrayList<>();
        for (int i = 0; i < ile; i++){
            int liczba = (int) (Math.random()*100+1);
            while (listaLosowychBezpow.contains(liczba)){
                liczba = (int) (Math.random()*100+1);
            }
            listaLosowychBezpow.add(liczba);
        }
        return listaLosowychBezpow;
    }
    private static ArrayList<Integer> wpiszLiczbyZKlawiatury(int ile){
        ArrayList<Integer> listaLiczbWpisanych = new ArrayList<>();
        System.out.println("podaj"+ile+"liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbWpisanych.add(liczba);
        }
        return listaLiczbWpisanych;
    }
    private static void  wypiszKolekcjie(List<Integer> listaDoWpisania){
    for (Integer element:listaDoWpisania) {
        System.out.println("Element:" + element);
        }
    }
    private static LinkedList<Integer> zwrocTrafione(ArrayList<Integer> listaLiczbWpisanych,
                                              ArrayList<Integer>listaLiczbLosowych) {
        LinkedList<Integer> trafione = new LinkedList<>();
        //trafiione to elementy które występują w wylosowanych i wpisanych
        for (Integer wpisana : listaLiczbWpisanych) {
            if (listaLiczbLosowych.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }
        return trafione;
    }
        public static void main(String[] args) {
            //losowanie liczby
            ArrayList<Integer> losowe = wylosujLiczby(6);
            System.out.println("wylosowana lista");
            wypiszKolekcjie(losowe);
            ArrayList<Integer> wpisane = wpiszLiczbyZKlawiatury(6);
            wypiszKolekcjie(wpisane);
            LinkedList<Integer> trafione = zwrocTrafione(losowe,wpisane);
            wypiszKolekcjie(trafione);
}}
