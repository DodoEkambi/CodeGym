
public class Cat {
	 private static int catCount = 0;
	 private String fullName;

	    public void setName(String firstName, String lastName) {
	        String fullName = firstName + " " + lastName;
	        this.fullName=fullName;
	        //System.out.println(this.fullName);
	    }

	    public static void addNewCat() {
	        //write your code here
	    	catCount=catCount+1;
	    	System.out.println(catCount);
	        
	    }
	    public static void setCatCount(int catCount) {
    		Cat.catCount =  catCount;
    }
	    public static void main(String[] args) {
	    	setCatCount(3);
	    	System.out.println(Cat.catCount);
	    	setCatCount(6);
	    	System.out.println(Cat.catCount);
	    	Cat cat= new Cat();
	    	cat.setName("Dodo","Ekambi");
	    	System.out.println(cat.fullName);
	    }
}
