package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
        //Reading program argument

        if (args.length > 0) {
            //Check length args
            if (args[1].length() > 30) {
                  args[1] = args[1].substring(0,30);
            } else if (args[2].length() > 8) {
                args[2] = args[2].substring(0,8);
            } else if (args[3].length() > 4) {
                args[3] = args[3].substring(0,4);
            }
            //Reading fileName
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            //Reading file and looking for id
            int id = 0, max = 0;
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
                while (bufferedReader.ready()) {
                    id = Integer.parseInt(bufferedReader.readLine().substring(0, 8).split(" ")[0]);
                    if (max < id) {
                        max = id;
                    }
                }
                bufferedReader.close();
                //Writing information in file object
                String strId = String.valueOf(++max);
                PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
                writer.append('\n');
                writer.printf("%-8s%-30s%-8.2f%-a4d", strId, args[1],Double.parseDouble(args[2]),Integer.parseInt(args[3]));
                writer.close();

            } catch (FileNotFoundException ignored) {

            }


        }
    }
}
