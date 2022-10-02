package PROJECT220928_이소현;

public class Book1 {
	String title;
	String author;
	
	public Book1(String t) { // 생성자
		title = t; author = "작자미상";
	}
	
	public Book1(String t, String a) { // 생성자
		title = t; author = a;
	}
	
	public Book1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args) {
		Book1 littlePrince = new Book1("어린왕자", "생텍쥐페리");
		Book1 loveStory = new Book1("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
}
