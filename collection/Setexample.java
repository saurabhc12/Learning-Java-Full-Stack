import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// set don't have index
//heterogineous 
// do not allow repetation

public class Setexample {
    public static void main(String args[]){
        Set<Integer> db=new HashSet<Integer>(); 
        // hash can sort elements and print also
        // Set db=new TreeSet<>(); 
        // tree can't sort elements and don't print
        // Set db=new LinkedHashSet(); 
        // lisnedHashSet print as it is without shorting
    
        db.add(10);
        db.add(12);
        db.add(13);
        db.add(14);
        db.add(15);
        db.add(16);
        // db.add(20.5);
        // db.add("shiv");
        // db.add('a');
        // db.add("shiv");
    
        System.out.println(db.size());
        System.out.println(db);

        for(Object obj : db){
            System.out.println(obj);
        }
    }

    
}
