package bt1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
ReadAndWriter readAndWriter=new ReadAndWriter();
String PATH_NUMBER="src//bt1//numbers.txt";
String PATH_COPY="src//bt1//write.txt";
List<Integer> number=readAndWriter.readFile(PATH_NUMBER);
List<Integer> list=copyList(number);
readAndWriter.writeFile(PATH_COPY,list);
    }
    public static List<Integer> copyList(List<Integer> list){
        List<Integer>listNumbers=new ArrayList<>();
        for (Integer i:list
             ) {
            listNumbers.add(i);
        }
        return listNumbers;
    }
}
