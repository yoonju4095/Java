public class CircleTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Point p = new Point(25,78);
      Circle c = new Circle(p, 10);
      
      Point p2 = new Point(37,82);
      Circle c2 = new Circle(p, 12);
    		  
    		  
      System.out.println("첫번째 원의 면적: " + c.calcArea());
      System.out.println("두번째 원의 면적: " + c2.calcArea());

   }
}

