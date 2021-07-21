

//A Box Class for printing boxes of stars with variable length/width dimensions
//The Box Class invokes a custom printBox method.

public class Box {
	
		//box size variable 
		private static int size = 0;
		
		//Constructor method for printBox
		public Box(int size) {	
		}
	
    //Main method
	public static void main(String[] args) {
		
		Box box1;
		
		box1 = new Box(size);
		
		box1.printBox(5);
			
	}
		
	//printBox method
	public void printBox(int size) {
			
			for (int l=0; l<size; l++) {  //advances row
				for (int w=0; w<size; w++) { //handles width per line
				System.out.print("*");
				}	
			System.out.println();//returns to begin next row
			}		
		}
		
		
}


