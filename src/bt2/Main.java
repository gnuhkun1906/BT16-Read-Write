package bt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Country country=new Country();
        try {
            BufferedReader   bufferedReader=new BufferedReader(new FileReader("src//bt2//countries.csv"));
           String line="";
           while ((line=bufferedReader.readLine())!=null){
               printCountry(country.parseLine(line));
           }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public  static void printCountry(List<String> country){
        System.out.println("Country [ id= " +country.get(0)+
                ", code= " +country.get(1)+
                ", name= " +country.get(2)+
                " ]");
    }
}
