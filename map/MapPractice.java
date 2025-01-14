import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class MapPractice {
    public static void main(String[] args) {
      Map<String,List<String>> moviesdb =new HashMap<String,List<String>>();

      List<String> starcast1 = new ArrayList<String>();

      starcast1.add("Iron man");
      starcast1.add("Thor");
      starcast1.add("Captain");
      starcast1.add("Hulk");

      List<String> starcast2 = new ArrayList<String>();

      starcast2.add("Superman");
      starcast2.add("Batman");
      starcast2.add("Wonder Women");
      starcast2.add("Flash");
      
      moviesdb.put("Marvel",starcast1);
      moviesdb.put("DC",starcast2);
      
      //   System.out.println(starcast1);
      
    //   System.out.println(moviesdb.get("DC"));
    //   System.out.println(moviesdb.keySet());
    
    
    //   List<String> arr= moviesdb.get("Marvel");    // use to put in another variable ( array )
    //   System.out.println(arr);;
      
      Set<String> names = moviesdb.keySet();   // to get key names ( movies )
      for(String n : names){                   // for loop to print name of movies
        // System.out.println(n);
        // System.out.println(n + "----> " + moviesdb.get(n) );

        System.out.println("["+n+"]");
        for(String an : moviesdb.get(n)){
            System.out.println(an);
        }
        System.out.println("--------------");
      }
    //   System.out.println(names);               // to print set of keys
      

    }
    
}
