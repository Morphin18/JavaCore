package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.*;
import java.net.URL;

public class Solution {


    public static void main(String[] args) throws IOException {

        URL oracle = new URL("https://www.oracle.com/index.html");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }


}
