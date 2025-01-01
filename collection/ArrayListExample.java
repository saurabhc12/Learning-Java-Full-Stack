import java.util.ArrayList;
import java.util.List;

public class ArrayListExample { 

    public static void main(String[] args) {
        // List marks = new ArrayList();  //heterogeneous 
        List<Integer> marks = new ArrayList<Integer>(); // adding constrain make arraylist homogeneous

        int c[]={1,2,3};
        // marks.add(c); // gives the location of c

        marks.add(68);
        // marks.add("jay"); //arrsylist can have heterogeneous elements
        marks.add(98);
        marks.add(98); // also can have same elements 
        marks.add(88);

        System.out.println(marks);
        System.out.println(marks.get(3)); // give elemnet by index

        for(int i=0;i<marks.size();i++){
            System.out.println(marks.get(i));
        }

        for(int i:marks){
            System.out.println(i);
        }

        System.out.println(marks.contains(88)); // tells true or false 
    }
        
}