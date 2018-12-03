import java.util.*;
import java.util.ArrayList;

public class duplicateList {

public static void main(String[] args) {

List<String> dupList = new ArrayList<String>();
dupList = Arrays.asList("A","B","C","D","C","D","B","E");
System.out.println("List has duplicates : "+dupList);

Set<String> uniqueList = new HashSet<String>(dupList);
dupList = new ArrayList<String>(uniqueList); 
System.out.println("Copy of list with no duplicates : "+dupList);


 }

}
