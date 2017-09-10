package com.company;

import java.util.Scanner;

public class GameLogic {

    Field newField = new Field();



    void start(){
        helloPlayer();
        newField.playerMakeMove();
        newField.refreshField();
        newField.computerMakeMove();
        newField.refreshField();
        newField.playerMakeMove();
        newField.refreshField();
        newField.computerMakeMove();
        newField.refreshField();
        newField.playerMakeMove();
        newField.refreshField();
        if (newField.checkWinner()){
            endGame();
            return;
        }
        newField.computerMakeMove();
        newField.refreshField();
        if (newField.checkWinner()) {
            endGame();
            return;
        }
        newField.playerMakeMove();
        newField.refreshField();
        if (newField.checkWinner()){
            endGame();
            return;
        }
        newField.computerMakeMove();
        newField.refreshField();
        if (newField.checkWinner()) {
            endGame();
            return;
        }
        newField.playerMakeMove();
        newField.refreshField();
        if (newField.checkWinner()){
            endGame();
            return;
        }
        System.out.println("Ничья");
        endGame();
        return;

    }

    void helloPlayer() {
        System.out.println("Добро пожаловать в игру крестики нолики");
        System.out.println("Для хода нужно выбрать поле от 1 до 9");
        System.out.println("1 " + "2 " + "3");
        System.out.println("4 " + "5 " + "6");
        System.out.println("7 " + "8 " + "9");
        System.out.println("Ваш крестик будет отображен 1, а нолик компьютера 2\n Пустое место поля 0");
    }
    void endGame(){
        System.out.println("Game Over");
    }

}
