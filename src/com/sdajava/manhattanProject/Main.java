package com.sdajava.manhattanProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean menuFlag = true;
        int option;

        Scanner in = new Scanner(System.in);


        while (menuFlag) {

            System.out.println(GUI.menuTitle);
            GUI.showMenu();
            option = in.nextInt();

            switch (option) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                default:
                    menuFlag = false;
            }
        }

    }
}
