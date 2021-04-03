package laptop21;

public class Main {

	public static void main(String[] args) {
			Laptop MyLaptop = new Laptop();
			Laptop JackieChanLaptop = new Laptop();
			
			MyLaptop.name = "Samsung";
			
			MyLaptop.colour = "Blue";
			MyLaptop.processor = "Windows";
			MyLaptop.memoryGB = "500GB";
	
			System.out.println(MyLaptop.name + "\n" + MyLaptop.colour + "\n" +  MyLaptop.processor +"\n" + MyLaptop.memoryGB +"\n");
			System.out.println();
			
			JackieChanLaptop.name = "Apple";
        
			JackieChanLaptop.colour = "Grey";
			JackieChanLaptop.processor = "iOS";
			JackieChanLaptop.memoryGB = "600GB";
	
			System.out.println(JackieChanLaptop.name + "\n" + JackieChanLaptop.colour + "\n" +  JackieChanLaptop.processor +"\n" + JackieChanLaptop.memoryGB +"\n");

	}

}