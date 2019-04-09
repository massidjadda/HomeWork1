package homework;

public class HomeWork2 {

	

	public static void main( String[] args) {
		
		HomeWorkClass object = new HomeWorkClass();
		object.HomeWorkMeth();
		
		HomeWork3 object2 = new HomeWork3(222);
		object2.HomeWorkMeth2();

		
		HomeWork3 object3 = new HomeWork3(5000);
	    System.out.println(object3.price);

	    HomeWork3 object4 = new HomeWork3(6000, "akbou");
	    System.out.println(object4.car +" "+ object4.price);
	    
	    System.out.println(object2.price);
	    
	    HomeWork3 object5 = new HomeWork3();
	    object5.method2();
	    
	    
	   HomeWork3 object6 = new HomeWork3();
	   object6.price5 = 5;
	   System.out.println(object6.price5);
	   
	   HomeWork3 object7 = new HomeWork3();
	   object7.method3();
	   
	   HomeWork3 compare = new HomeWork3();
	   compare.compare3();
	   
	 
	
	    
	    
	    

	}
}
		
		

	


