package streams;

import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try{
            FileInputStream input = new FileInputStream("src/streams/example.txt");
            int data = input.read();
            while (data!=-1){
                System.out.print((char) data);
                data=input.read();
            }
        }catch (IOException e){
            System.out.println("An error occurred");
        }
    }
}