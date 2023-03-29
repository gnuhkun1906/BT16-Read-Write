package bt2;

import java.util.ArrayList;
import java.util.List;

public class Country {
    int id;
    String code;
    String name;

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Country() {
    }

    public List<String> parseLine(String line){
        List<String> list=new ArrayList<>();
      if (line!=null){
          String []result=line.split(",");
          for (int i = 0; i <result.length ; i++) {
                list.add(result[i]);
          }
      }
        return list;
 }
}
