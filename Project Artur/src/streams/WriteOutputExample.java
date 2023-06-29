package streams;

import java.io.*;

public class WriteOutputExample {
    public static void main(String[] args) {
        try {FileOutputStream fos =new FileOutputStream("src/streams/example.txt");
            String str ="oooh that is ok";
            byte[] bytes =str.getBytes();
            fos.write(bytes);
            fos.close();
        }catch (IOException e){
            System.out.println("error");
        }
    }
}
