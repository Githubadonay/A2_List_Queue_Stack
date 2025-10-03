/*
   Description: This class tests various cases for different inputs to a Doubly Linked List. 
*/
public class TestList {
   public static void main(String[] args) {

      // Test1
      List l1 = new List<Character>();
      assertTrue("Test1.1", l1.toString().equals("{}"));
      assertTrue("Test1.2", l1.isEmpty() == true);
      assertTrue("Test1.3", l1.size() == 0);

      // Test2
      l1.addToHead('i');
      assertTrue("Test2.1", l1.toString().equals("{i}"));
      assertTrue("Test2.2", l1.isEmpty() == false);
      assertTrue("Test2.3", l1.size() == 1);

      // Test3
      l1.addToHead('t');
      l1.addToHead('3');
      l1.addToHead('0');
      l1.addToHead('6');
      assertTrue("Test3", l1.toString().equals("{6,0,3,t,i}"));

      // Test4
      l1.addToTail(' ');
      l1.addToTail('a');
      l1.addToTail('l');
      l1.addToTail('g');
      l1.addToTail('o');
      l1.addToTail('r');
      l1.addToTail('i');
      l1.addToTail('t');
      l1.addToTail('h');
      l1.addToTail('m');

      assertTrue("Test4", l1.toString().equals("{6,0,3,t,i, ,a,l,g,o,r,i,t,h,m}"));

      // Test5
      assertTrue("Test5.1", (char) l1.remove() == '6');
      assertTrue("Test5.2", (char) l1.remove() == '0');
      assertTrue("Test5.3", (char) l1.remove() == '3');
      assertTrue("Test5.4", l1.toString().equals("{t,i, ,a,l,g,o,r,i,t,h,m}"));
      assertTrue("Test5.5", l1.isEmpty() == false);
      assertTrue("Test5.6", l1.size() == 12);

      // Test6
      boolean passed = false;
      List l2 = new <Character>List();
      try {
         l2.remove();
      } catch (IllegalStateException ise) {
         passed = true;
      }
      assertTrue("Test6.1", passed);

      passed = false;
      try {
         l2.addToHead('t');
         l2.remove();
         l2.remove();
      } catch (IllegalStateException ise) {
         passed = true;
      }
      assertTrue("Test6.2", passed);

      /// Test 7
      List l3 = new <Integer>List();
      l3.addToHead(100);
      l3.addToHead(200);
      assertTrue("Test7.1", l3.toString().equals("{200,100}"));

   }

   private static void assertTrue(String testName, boolean passed) {
      if (passed)
         System.out.println(testName + ":Passed");
      else
         System.out.println(testName + ":FAILED!");
   }

}