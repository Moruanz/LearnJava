import java.util.ArrayList;

class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    // Add your code below
   int i = 0;
   while (i < lunchBox.size()){
     if (lunchBox.get(i) == "ant"){
       lunchBox.remove(lunchBox.get(i));
     } else {
       i++;
     }
   }
  return lunchBox;
  }
 
  
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");
    lunchContainer.add("ant");
    lunchContainer.add("ant");
    lunchContainer.add("sandwich");
    lunchContainer.add("ant");
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer);

  }
}
