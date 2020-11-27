package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.*;

public class FileConsoleWriter {
    private final FileWriter fileWriter;

    public FileConsoleWriter(FileDescriptor fileDescriptor) {
        this.fileWriter = new FileWriter(fileDescriptor);
    }
    public FileConsoleWriter(String fileWriter, boolean append) throws  IOException {
        this.fileWriter = new FileWriter(fileWriter,append);
    }
    public FileConsoleWriter(String fileWriter) throws IOException {
        this.fileWriter = new FileWriter(fileWriter);
    }
    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }
    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }


    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileConsoleWriter fileConsoleWriter = new FileConsoleWriter(reader.readLine());

    }
    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf,off,len);
        for (int i = off; i < off+len; i++) {
            System.out.print(cbuf[i]);
        }
    }
    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.print(c);
    }
    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }
    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
            System.out.print(str.substring(off,off+len));


    }
    public void write(char[] cbuf) throws IOException {
      fileWriter.write(cbuf);
        for (char c : cbuf) {
            System.out.print(c);
        }
    }
    public void close() throws IOException {
        fileWriter.close();
    }
}
