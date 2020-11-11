public class RandomSentence {
	public static void main (String[] args){
		String[] greetingList = {"Hii!", "Bye!", "Hello!"};
		String[] firstNameList = {"Ramesh", "Suresh", "Ganesh", "Mahesh"};
		String[] lastNameList = {"Shrestha", "Sigdel", "Pokhrel"};
		int greetingListLength = greetingList.length;
		int firstNameListLength = firstNameList.length;
		int lastNameListLength = lastNameList.length;
		int randomGreeting = (int) (Math.random()*greetingListLength);
		int randomFirstName = (int) (Math.random()*firstNameListLength);
		int randomLastName = (int) (Math.random()*lastNameListLength);
		System.out.println (greetingList[randomGreeting]+" "+firstNameList[randomFirstName]+" "+lastNameList[randomLastName]+".");
	}
}
	
		
		
	