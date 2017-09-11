package com.company;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private int move = 1;
    Field gameField = new Field();


    void start() {
        helloPlayer();
        initializeField();
        gaming();
    }

    void initializeField(){
        for (int i = 0; i<9; i++){
            gameField.setFieldElement(i, ".");
        }
    }

    void helloPlayer() {
        System.out.println("Добро пожаловать в игру крестики нолики");
        System.out.println("Для хода нужно выбрать поле от 1 до 9");
        System.out.println("1 " + "2 " + "3");
        System.out.println("4 " + "5 " + "6");
        System.out.println("7 " + "8 " + "9");
    }

    boolean checkWinner() {
        if (gameField.getFieldElement(0).equals("X") & gameField.getFieldElement(1).equals("X") & gameField.getFieldElement(2).equals("X")) {
            System.out.println("Вы выиграли");
            return false;
        } else if (gameField.getFieldElement(3).equals("X") & gameField.getFieldElement(4).equals("X") & gameField.getFieldElement(5).equals("X")) {
            System.out.println("Вы выиграли");
            return false;
        } else if (gameField.getFieldElement(6).equals("X") & gameField.getFieldElement(7).equals("X") & gameField.getFieldElement(8).equals("X")) {
            System.out.println("Вы выиграли");
            return false;
        } else if (gameField.getFieldElement(0).equals("X") & gameField.getFieldElement(3).equals("X") & gameField.getFieldElement(6).equals("X")) {
            System.out.println("Вы выиграли");
            return false;
        } else if (gameField.getFieldElement(1).equals("X") & gameField.getFieldElement(4).equals("X") & gameField.getFieldElement(7).equals("X")) {
            System.out.println("Вы выиграли");
            return false;
        } else if (gameField.getFieldElement(2).equals("X") & gameField.getFieldElement(5).equals("X") & gameField.getFieldElement(8).equals("X")) {
            System.out.println("Вы выиграли");
            return false;
        } else if (gameField.getFieldElement(0).equals("X") & gameField.getFieldElement(4).equals("X") & gameField.getFieldElement(8).equals("X")) {
            System.out.println("Вы выиграли");
            return false;
        } else if (gameField.getFieldElement(2).equals("X") & gameField.getFieldElement(4).equals("X") & gameField.getFieldElement(6).equals("X")) {
            System.out.println("Вы выиграли");
            return false;
        } else if (gameField.getFieldElement(0).equals("O") & gameField.getFieldElement(1).equals("O") & gameField.getFieldElement(2).equals("O")) {
            System.out.println("Вы проиграли, компьютер победил");
            return false;
        } else if (gameField.getFieldElement(3).equals("O") & gameField.getFieldElement(4).equals("O") & gameField.getFieldElement(5).equals("O")) {
            System.out.println("Вы проиграли, компьютер победил");
            return false;
        } else if (gameField.getFieldElement(6).equals("O") & gameField.getFieldElement(7).equals("O") & gameField.getFieldElement(8).equals("O")) {
            System.out.println("Вы проиграли, компьютер победил");
            return false;
        } else if (gameField.getFieldElement(0).equals("O") & gameField.getFieldElement(3).equals("O") & gameField.getFieldElement(6).equals("O")) {
            System.out.println("Вы проиграли, компьютер победил");
            return false;
        } else if (gameField.getFieldElement(1).equals("O") & gameField.getFieldElement(4).equals("O") & gameField.getFieldElement(7).equals("O")) {
            System.out.println("Вы проиграли, компьютер победил");
            return false;
        } else if (gameField.getFieldElement(2).equals("O") & gameField.getFieldElement(5).equals("O") & gameField.getFieldElement(8).equals("O")) {
            System.out.println("Вы проиграли, компьютер победил");
            return false;
        } else if (gameField.getFieldElement(0).equals("O") & gameField.getFieldElement(4).equals("O") & gameField.getFieldElement(8).equals("O")) {
            System.out.println("Вы проиграли, компьютер победил");
            return false;
        } else if (gameField.getFieldElement(2).equals("O") & gameField.getFieldElement(4).equals("O") & gameField.getFieldElement(6).equals("O")) {
            System.out.println("Вы проиграли, компьютер победил");
            return false;
        }
        return true;
    }

    void playerMakeMove() {
        System.out.println("Ваш ход, введите число от 1 до 9 ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int moveInt = in.nextInt();
            switch (moveInt) {
                case 1:
                    if (gameField.getFieldElement(0).equals(".")) {
                        gameField.setFieldElement(0, "X");
                        break;
                    } else {
                        System.out.println("Это поле занято");
                        playerMakeMove();
                        break;
                    }
                case 2:
                    if (gameField.getFieldElement(1).equals(".")) {
                        gameField.setFieldElement(1, "X");
                        break;
                    } else {
                        System.out.println("Это поле занято");
                        playerMakeMove();
                        break;
                    }
                case 3:
                    if (gameField.getFieldElement(2).equals(".")) {
                        gameField.setFieldElement(2, "X");
                        break;
                    } else {
                        System.out.println("Это поле занято");
                        playerMakeMove();
                        break;
                    }
                case 4:
                    if (gameField.getFieldElement(3).equals(".")) {
                        gameField.setFieldElement(3, "X");
                        break;
                    } else {
                        System.out.println("Это поле занято");
                        playerMakeMove();
                        break;
                    }
                case 5:
                    if (gameField.getFieldElement(4).equals(".")) {
                        gameField.setFieldElement(4, "X");
                        break;
                    } else {
                        System.out.println("Это поле занято");
                        playerMakeMove();
                        break;
                    }
                case 6:
                    if (gameField.getFieldElement(5).equals(".")) {
                        gameField.setFieldElement(5, "X");
                        break;
                    } else {
                        System.out.println("Это поле занято");
                        playerMakeMove();
                        break;
                    }
                case 7:
                    if (gameField.getFieldElement(6).equals(".")) {
                        gameField.setFieldElement(6, "X");
                        break;
                    } else {
                        System.out.println("Это поле занято");
                        playerMakeMove();
                        break;
                    }
                case 8:
                    if (gameField.getFieldElement(7).equals(".")) {
                        gameField.setFieldElement(7, "X");
                        break;
                    } else {
                        System.out.println("Это поле занято");
                        playerMakeMove();
                        break;
                    }
                case 9:
                    if (gameField.getFieldElement(8).equals(".")) {
                        gameField.setFieldElement(8, "X");
                        break;
                    } else {
                        System.out.println("Это поле занято");
                        playerMakeMove();
                        break;
                    }
                default:
                    System.out.println("Вы ввели некоректное число, введите от 1 до 9");
                    playerMakeMove();
            }
        }
    }

    void computerMakeMove(){
        Random random = new Random();
        int number = (random.nextInt(9) + 1);
        switch (number){
            case 1:
                if (gameField.getFieldElement(0).equals(".")){
                    gameField.setFieldElement(0, "O");
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 2:
                if (gameField.getFieldElement(1).equals(".")){
                    gameField.setFieldElement(1, "O");
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 3:
                if (gameField.getFieldElement(2).equals(".")){
                    gameField.setFieldElement(2, "O");
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 4:
                if (gameField.getFieldElement(3).equals(".")){
                    gameField.setFieldElement(3, "O");
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 5:
                if (gameField.getFieldElement(4).equals(".")){
                    gameField.setFieldElement(4, "O");
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 6:
                if (gameField.getFieldElement(5).equals(".")){
                    gameField.setFieldElement(5, "O");
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 7:
                if (gameField.getFieldElement(6).equals(".")){
                    gameField.setFieldElement(6, "O");
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 8:
                if (gameField.getFieldElement(7).equals(".")){
                    gameField.setFieldElement(7, "O");
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
            case 9:
                if (gameField.getFieldElement(8).equals(".")){
                    gameField.setFieldElement(8, "O");
                    System.out.println("Компьютер сделал ход");
                    break;
                } else {
                    computerMakeMove();
                    break;
                }
        }
    }

    void showField(){
        System.out.println(gameField.getFieldElement(0) + " " + gameField.getFieldElement(1) + " " + gameField.getFieldElement(2));
        System.out.println(gameField.getFieldElement(3) + " " + gameField.getFieldElement(4) + " " + gameField.getFieldElement(5));
        System.out.println(gameField.getFieldElement(6) + " " + gameField.getFieldElement(7) + " " + gameField.getFieldElement(8));
    }

    void gaming(){
        if (move<10){
            if (checkWinner()){
                if (move == 9){
                    playerMakeMove();
                    showField();
                    checkWinner();
                    move++;
                    gameOver();
                }
                else if (move == 10) {
                    gameOver();
                }
                else if (move % 2 == 1) {
                    playerMakeMove();
                    showField();
                    move++;
                    gaming();
                }
                else if (move % 2 == 0){
                    computerMakeMove();
                    showField();
                    move++;
                    gaming();
                }
            }
            else {gameOver();}
        }
        else {gameOver();}
    }

    void gameOver(){
        System.out.println("Game Over");
    }
}
