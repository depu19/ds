
package map;

/**
 * Class for Runner.
 */
public class Runner {

  public static void main(String[] args) {
    MyHashMap myHashMap = new MyHashMap();
    myHashMap.put("Deepa","29");
    myHashMap.put("Shaz","29");
    myHashMap.put("Kabir","31");
    myHashMap.put(null,"40");
    myHashMap.put(null,"45");
    //myHashMap.print();
    System.out.println(myHashMap.get("Deepa"));
    System.out.println(myHashMap.get("Shaz"));
    System.out.println(myHashMap.get("Kabir"));
    System.out.println(myHashMap.get(null));
  }

}
