public class random {
	public static void main (String[] args){
		String[] list = {"Hi", "Bye", "Hello"};
		String[] list1 = {"Ramesh", "Suresh", "Ganesh", "Mahesh"};
		String[] list2 = {"Shrestha", "Sigdel", "Pokhrel"};
		int len = list.length;
		int len1 = list1.length;
		int len2 = list2.length;
		int rand = (int) (Math.random()*len);
		int rand1 = (int) (Math.random()*len1);
		int rand2 = (int) (Math.random()*len2);
		System.out.println (list[rand]+", "+list1[rand1]+" "+list2[rand2]+".");
	}
}
	
		
		
	