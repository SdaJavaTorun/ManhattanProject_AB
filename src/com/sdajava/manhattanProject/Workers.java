package com.sdajava.manhattanProject;

/**
 * Created by Andrzej on 18.03.2017.
 */
public class Workers {

    public String imie;
    public String nazwisko;
    public char plec;
    public int nr_dzialu;
    public float placa;
    public int wiek;
    public int dzieci;
    public boolean stan_cywilny;

    public Workers() {}

    public Workers(String imie, String nazwisko, char plec, int nr_dzialu, float placa, int wiek,
                   int dzieci, boolean stan_cywilny){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.nr_dzialu = nr_dzialu;
        this.placa = placa;
        this.wiek = wiek;
        this.dzieci = dzieci;
        this.stan_cywilny = stan_cywilny;
    }

}
