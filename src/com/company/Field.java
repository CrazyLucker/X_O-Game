package com.company;

import java.util.Random;
import java.util.Scanner;

public class Field {
    int[] field = new int[9];
    int move;

    void createField() {
        for (int i = 0; i < field.length; i++) {
            field[i] = 0;
        }
    }

    void playerMakeMove() {
        System.out.println("Сделайте ход на незанятое поле");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()){
            move = in.nextInt();
        } else {System.out.println("Введите число от 1 до 9");}
        switch (move) {
            case 1:
                if (field[0] == 0) {
                    field[0] = 1;
                    break;
                } else {
                    playerMakeMove();
                    break;
                }
            case 2:
                if (field[1] == 0) {
                    field[1] = 1;
                    break;
                } else {
                    playerMakeMove();
                    break;
                }
            case 3:
                if (field[2] == 0) {
                    field[2] = 1;
                    break;
                } else {
                    playerMakeMove();
                    break;
                }
            case 4:
                if (field[3] == 0) {
                    field[3] = 1;
                    break;
                } else {
                    playerMakeMove();
                    break;
                }
            case 5:
                if (field[4] == 0) {
                    field[4] = 1;
                    break;
                } else {
                    playerMakeMove();
                    break;
                }
            case 6:
                if (field[5] == 0) {
                    field[5] = 1;
                    break;
                } else {
                    playerMakeMove();
                    break;
                }
            case 7:
                if (field[6] == 0) {
                    field[6] = 1;
                    break;
                } else {
                    playerMakeMove();
                    break;
                }
            case 8:
                if (field[7] == 0) {
                    field[7] = 1;
                    break;
                } else {
                    playerMakeMove();
                    break;
                }
            case 9:
                if (field[8] == 0) {
                    field[8] = 1;
                    break;
                } else {
                    playerMakeMove();
                    break;
                }
            default:
                System.out.println("Введите незанятое число от 1 до 9");
                playerMakeMove();
        }
    }

    void computerMakeMove() {
        Random random = new Random();
        int number = (random.nextInt(9) + 1);
        switch (number) {
            case 1:
                if (field[0] == 0) {
                    field[0] = 2;
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 2:
                if (field[1] == 0) {
                    field[1] = 2;
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 3:
                if (field[2] == 0) {
                    field[2] = 2;
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 4:
                if (field[3] == 0) {
                    field[3] = 2;
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 5:
                if (field[4] == 0) {
                    field[4] = 2;
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 6:
                if (field[5] == 0) {
                    field[5] = 2;
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 7:
                if (field[6] == 0) {
                    field[6] = 2;
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 8:
                if (field[7] == 0) {
                    field[7] = 2;
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 9:
                if (field[8] == 0) {
                    field[8] = 2;
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
        }
    }

    void refreshField() {
        System.out.println(field[0] + " " + field[1] + " " + field[2]);
        System.out.println(field[3] + " " + field[4] + " " + field[5]);
        System.out.println(field[6] + " " + field[7] + " " + field[8]);
    }

    boolean checkWinner() {
        if (1 == field[0] & 1 == field[1] & 1 == field[2]) {
            System.out.println("Вы выиграли");
            return true;
        } else if (field[3] == 1 & field[4] == 1 & field[5] == 1) {
            System.out.println("Вы выиграли");
            return true;
        } else if (field[6] == 1 & field[7] == 1 & field[8] == 1) {
            System.out.println("Вы выиграли");
            return true;
        } else if (field[0] == 1 & field[3] == 1 & field[6] == 1) {
            System.out.println("Вы выиграли");
            return true;
        } else if (field[1] == 1 & field[4] == 1 & field[7] == 1) {
            System.out.println("Вы выиграли");
            return true;
        } else if (field[2] == 1 & field[5] == 1 & field[8] == 1) {
            System.out.println("Вы выиграли");
            return true;
        } else if (field[0] == 1 & field[4] == 1 & field[8] == 1) {
            System.out.println("Вы выиграли");
            return true;
        } else if (field[2] == 1 & field[4] == 1 & field[6] == 1) {
            System.out.println("Вы выиграли");
            return true;
        } else if (field[0] == 2 & field[1] == 2 & field[2] == 2) {
            System.out.println("Вы проиграли, компьютер победил");
            return true;
        } else if (field[3] == 2 & field[4] == 2 & field[5] == 2) {
            System.out.println("Вы проиграли, компьютер победил");
            return true;
        } else if (field[6] == 2 & field[7] == 2 & field[8] == 2) {
            System.out.println("Вы проиграли, компьютер победил");
            return true;
        } else if (field[0] == 2  & field[3] == 2 & field[6] == 2) {
            System.out.println("Вы проиграли, компьютер победил");
            return true;
        } else if (field[1] == 2 & field[4] == 2 & field[7] == 2) {
            System.out.println("Вы проиграли, компьютер победил");
            return true;
        } else if (field[2] == 2 & field[5] == 2 & field[8] == 2) {
            System.out.println("Вы проиграли, компьютер победил");
            return true;
        } else if (field[0] == 2 & field[4] == 2 & field[8] == 2) {
            System.out.println("Вы проиграли, компьютер победил");
            return true;
        } else if (field[2] == 2 & field[4] == 2 & field[6] == 2) {
            System.out.println("Вы проиграли, компьютер победил");
            return true;
        }
        return false;
    }
}
