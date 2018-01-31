package com.company;

import java.util.Scanner;

public class Main {

    private static final int ACTION_SUM = 1;
    private static final int ACTION_SUBTRACTION = 2;
    private static final int ACTION_MULTIPLICATION = 3;
    private static final int ACTION_REPEAT = 5;


    public static void main(String[] args) {
        // 1.9.​ Sukurti supaprastintą skaičiuoklės programą kuri paprašytų įvesti du skaičius ir
        // operacijos tarp jų skaičių (1 – suma, 2 – skirtumas, 3 – sandauga). Gautą rezultatą
        // programa pavaizduotų ekrane ir paklaustų ar norėsime kartoti. Įvedus skaičių 5,
        // programa turėtų kartoti darbą iš naujo, priešingu atveju programa baigtų darbą

        Main objektas = new Main();
        objektas.skaiciuok();


    }

    private void skaiciuok() {
        boolean arTesti = true;
        Scanner sc = new Scanner(System.in);
        while (arTesti = true) {
            System.out.println("Iveskite du skaicius: ");
            int sk1 = sc.nextInt();
            int sk2 = sc.nextInt();


            System.out.println("Iveskite norima veiksma: ");
            System.out.println("1- suma");
            System.out.println("2- skirtumas");
            System.out.println("3- sandauga");
            int veiksmas = sc.nextInt();

            switch (veiksmas) {
                case ACTION_SUM:
                    System.out.println("Suma= " + (sk1 + sk2));
                    break;
                case ACTION_SUBTRACTION:
                    System.out.println("Skirtumas= " + (sk1 - sk2));
                    break;
                case ACTION_MULTIPLICATION:
                    System.out.println("Sandauga= " + (sk1 * sk2));
                    break;
            }
            System.out.println("Iveskite ar norite kartoti");
            System.out.println("5- kartoti");
            int kartojimoSkaicius = sc.nextInt();

            if (kartojimoSkaicius != ACTION_REPEAT) {
                arTesti = false;
            }
        }
    }
}
