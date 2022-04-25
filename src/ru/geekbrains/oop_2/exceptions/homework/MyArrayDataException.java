package ru.geekbrains.oop_2.exceptions.homework;

public class MyArrayDataException extends Exception{
    int x;
    int y;
    static final String INVALID_CELL = "Wrong data type in cell [%d : %d]";

    public MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
