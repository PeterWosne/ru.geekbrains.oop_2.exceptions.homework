package ru.geekbrains.oop_2.exceptions.homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] arr = {{"1","2","3","4"}, {"2","3","4","5"}, {"3","4","5","6"}, {"4","5","6","7"}};
        try {
            System.out.println(myMethod(arr));
        } catch (MyArraySizeException e) {
            System.out.println(e.EXCEEDED);
        } catch (MyArrayDataException e) {
            System.out.printf(e.INVALID_CELL, e.x, e.y);
        }
    }

    public static int myMethod(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if(arr.length != 4) {
            throw new MyArraySizeException();
        }

        for(int i = 0;i < 4;i++) {
            if(arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for(int j = 0;j < 4; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}
