package day6.cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.IIOException;

public class test {
    public static void main(String[] args) throws IOException {
        //try{
        String line32 = Files.readAllLines(Paths.get("src/main/java/day6/cookie/FortuneCookie.txt")).get(2);

       // BufferedReader br = new BufferedReader(new StringReader(line32)); } catch (IIOException e){};
        System.out.println(line32);
    }
}
