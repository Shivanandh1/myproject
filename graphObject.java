package javap;


 public abstract class graphObject {
     int x, y;
     void moveTo(int newX,int newY) {
    	 System.out.println("move to x is" +x+ "and y is:"+y);
     }
     
     abstract void draw();
     abstract void resize();
     
      class Circle extends graphObject {

   	@Override
   	void draw() {
   		System.out.println("draeing a circle");
   		
   	}

   	@Override
   	void resize() {
   		System.out.print("resizig acircle");
   		
   	}
     
      } 
 public static void main (String[]args) {
	graphObject c= new Circle();
	   c.draw();
	   c.resize();
	 
	 
 
 }
      }
 
 
 
 