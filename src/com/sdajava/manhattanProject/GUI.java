package com.sdajava.manhattanProject;

/**
 * Created by Andrzej on 18.03.2017.
 */
public class GUI {

    public static String menuTitle="Projekt Manhattan";  //przykład GUI -> Main



    public static void showMenu()
    {
        System.out.println("Menu: \n" + " \n"+
                "1.Lista pracownikow \n" +
                "2.Dodaj pracownika \n" +
                "3.Export do pliku \n" +
                "4.Usuniecie pracownika \n" +
                "5.Edycja danych\n"+
                "6.Dodatkowe funkcje\n"+
                "7.Dodatkowe funkcje dla plików tekstowych\n"+
                "8.Informacje o programie"
        );
    }
}

