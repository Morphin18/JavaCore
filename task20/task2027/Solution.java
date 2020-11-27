package com.javarush.task.task20.task2027;


import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();
            if (searchWord(ch, crossword)) {
                Word word = new Word(words[i]);
                //  word.startX;
               // word.startY;
               // word.endX;
               // word.endY;
               // list.add(word);
            }
        }

        return null;
    }

    public static boolean searchWord(char[] word, int[][] crossword) {
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[0].length; j++) {
                if (i == j)
            }
        }
        return true;
    }


    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
