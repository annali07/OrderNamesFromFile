import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws FileNotFoundException  {
      
      Scanner scanner = new Scanner(new File ("StudentNames.txt"));
      LinkedList<String> studentNames = new LinkedList<String>();

      while(scanner.hasNextLine()){
        sortInOrder(studentNames, scanner.nextLine());
      }

      printList(studentNames);

    }


    private static void printList(LinkedList<String> linkedList){
    

        Iterator<String> i = linkedList.iterator();
        int j = 0;
        while(i.hasNext()){
          j++;
          System.out.println(j + "." + i.next()); 
          
          
        }
        System.out.println("=====================");
    
      }


    private static boolean sortInOrder(LinkedList<String> names, String name){
      ListIterator<String> sorter = names.listIterator();

      while(sorter.hasNext()){
        int comparison = sorter.next().compareTo(name); // needs .next to point to first entry 
        if (comparison == 0){
          //equal, do not add
          System.out.println(name + " is already included as a destination");
          return false;
        } else if (comparison > 0){
          
          sorter.previous();

          sorter.add(name);
          return true;
  
        }else if (comparison<0){
      
        }
  
      }
      
      // name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
      sorter.add(name); //what is this code?
      return true;
  
     
    }

}