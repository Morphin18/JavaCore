package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args)  {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName_one = reader.readLine();
            String fileName_second = reader.readLine();
            reader.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName_one)));
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName_second)));
            while (bufferedReader.ready()) {
                allLines.add(bufferedReader.readLine());
            }
            bufferedReader.close();
            while (bufferedReader1.ready()) {
                forRemoveLines.add(bufferedReader1.readLine());
            }
            bufferedReader1.close();
        }catch (IOException e)
        {

        }
        try {
            Solution solution = new Solution();
            solution.joinData();
        } catch (CorruptedDataException e) {
        }
    }

    public  void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
