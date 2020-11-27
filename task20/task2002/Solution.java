package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Ivan");
            user.setLastName("Ivanov");
            user.setBirthDate(new Date());
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);

            User user1 = new User();
            user1.setFirstName("Ivan1");
            user1.setLastName("Ivanov1");
            user1.setBirthDate(new Date());
            user1.setMale(true);
            user1.setCountry(User.Country.UKRAINE);

            javaRush.users.add(user);
            javaRush.users.add(user1);


            javaRush.save(outputStream);
            outputStream.close();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            inputStream.close();
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if (javaRush.equals(loadedObject)) {
                System.out.println("true");
            }
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);

            if (!users.isEmpty()) {
                for (User user : users) {
                    writer.println(user.getFirstName());
                    writer.println(user.getLastName());
                    writer.println(user.getBirthDate().getTime());
                    writer.println(user.isMale());
                    writer.println(user.getCountry());

                }
            }
            writer.flush();
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            if (users != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                while (reader.ready()) {
                    User user = new User();
                    user.setFirstName(reader.readLine());
                    user.setLastName(reader.readLine());
                    user.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                    user.setMale(Boolean.parseBoolean(reader.readLine()));
                    switch (reader.readLine()) {
                        case "RUSSIA":
                            user.setCountry(User.Country.RUSSIA);
                            break;
                        case "UKRAINE":
                            user.setCountry(User.Country.UKRAINE);
                            break;
                        case "OTHER":
                            user.setCountry(User.Country.OTHER);
                            break;
                    }
                    users.add(user);
                }
                reader.close();

            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
