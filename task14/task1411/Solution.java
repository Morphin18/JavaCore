package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
         while (true)
        {
            key = reader.readLine();
            if (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"))
            {
                switch (key)
                {
                    case "user":
                        Person.User person = new Person.User();
                        doWork(person);
                        break;
                    case "loser":
                        Person.Loser person1 = new Person.Loser();
                        doWork(person1);
                        break;
                    case "coder":
                        Person.Coder person2 = new Person.Coder();
                        doWork(person2);
                        break;
                    case "proger":
                        Person.Proger person3 = new Person.Proger();
                        doWork(person3);
                    default: break;
                }
            } else break;
        }
    }

    public static void doWork(Person person) {
        if  (person instanceof Person.User) {
            ((Person.User) person).live();
        }
         if (person instanceof Person.Loser) {
             ((Person.Loser) person).doNothing();
         } else if (person instanceof Person.Coder) {
             ((Person.Coder) person).writeCode();
         } else if (person instanceof Person.Proger) {
             ((Person.Proger) person).enjoy();
         }
    }
}
