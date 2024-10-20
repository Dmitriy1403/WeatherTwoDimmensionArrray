package org.example;


import java.util.Random;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



                Random random = new Random();
                int min = -30;
                int max = 30;
                System.out.println("Средняя погода в году");
                int[][] weather = new int[][]{new int[31], new int[28], new int[31], new int[30], new int[31], new int[30], new int[31], new int[31], new int[30], new int[31], new int[30], new int[31]};

                int i;
                int j;
                for(i = 0; i < weather.length; ++i) {
                    for(j = 0; j < weather[i].length; ++j) {
                        switch (i) {
                            case 0:
                            case 1:
                            case 11:
                                min = -30;
                                max = -5;
                                break;
                            case 2:
                            case 3:
                            case 4:
                                min = -10;
                                max = 10;
                                break;
                            case 5:
                            case 6:
                            case 7:
                                min = 10;
                                max = 30;
                                break;
                            case 8:
                            case 9:
                            case 10:
                                min = -5;
                                max = 15;
                        }

                        weather[i][j] = random.nextInt(max - min + 1) + min;
                    }
                }

                System.out.printf("%10s", " ");

                for(i = 1; i <= 31; ++i) {
                    System.out.printf("%4d", i);
                }

                System.out.println();
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");

                for(i = 0; i < weather.length; ++i) {
                    System.out.printf("%10s: ", Main.MONTH.values()[i]);

                    for(j = 0; j < weather[i].length; ++j) {
                        System.out.printf("%4d", weather[i][j]);
                    }

                    System.out.println();
                }


        Scanner scanner = new Scanner(System.in);





        // Определяем номер месяца
        int monthIndex = -1;

        while (monthIndex<0 || monthIndex>=weather.length)  {
            System.out.println("Введите название месяца (например, JANUARY) или номер месяца (1-12):");
            String userInput = scanner.next().toUpperCase();




        try {
            // Если пользователь ввел число
            monthIndex = Integer.parseInt(userInput) - 1; // Преобразуем в индекс массива
        } catch (NumberFormatException e) {
            // Если пользователь ввел название месяца
            try {
                monthIndex = MONTH.valueOf(userInput).ordinal();
            } catch (IllegalArgumentException ex) {
                System.out.println("Некорректный ввод. Пожалуйста, введите правильное название или номер месяца.");
                return;
            }
        }


        // Проверка на корректность месяца
        if (monthIndex < 0 || monthIndex >= weather.length) {
            System.out.println("Некорректный месяц. Пожалуйста, введите номер от 1 до 12 или корректное название месяца.");
            return;
         }
        }
        // Вывод погоды за выбранный месяц
        System.out.println("Погода за " + MONTH.values()[monthIndex] + ":");
        for(j = 0; j < weather[monthIndex].length; ++j) {
            System.out.printf("%4d", weather[monthIndex][j]);
        }
        System.out.println();




            }

            static enum MONTH {
                JANUARY,
                FEBRUARY,
                MARCH,
                APRIL,
                MAY,
                JUNE,
                JULY,
                AUGUST,
                SEPTEMBER,
                OCTOBER,
                NOVEMBER,
                DECEMBER;

                private MONTH() {
                }




            }








        }


