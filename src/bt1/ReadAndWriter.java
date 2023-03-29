package bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriter {
    public List<Integer> readFile(String pathFile)  {
       List<Integer> numbers=new ArrayList<>();
        try {
            File file=new File(pathFile);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
          while ((line=bufferedReader.readLine())!=null){
              numbers.add(Integer.parseInt(line));
          }
    bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
     return numbers;
    }
    public void  writeFile(String pathFile,List<Integer>list){
        try{
            FileWriter fileWriter=new FileWriter(pathFile,true);
            BufferedWriter br=new BufferedWriter(fileWriter);
            br.write(list.toString()+"\n");
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
