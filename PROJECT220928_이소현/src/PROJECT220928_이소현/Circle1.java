package PROJECT220928_이소현;

	public class Circle1 {
		int radius; // 원의 반지름 필드
		String name; // 원의 이름 필드
		
		public Circle1() { } // 원의 생성자
		
		public Circle1(int i, String string) {
			// TODO Auto-generated constructor stub
		}

		public double getArea() { // 원의 면적 계산 메소드
			return 3.14*radius*radius;
		}
		
		public static void main(String[] args) {
			Circle1 pizza;
			pizza = new Circle1(); // Circle 객체 생성
			pizza.radius = 10; // 피자의 반지름을 10으로 설정
			pizza.name = "자바피자"; // 피자의 이름 설정
			double area = pizza.getArea(); // 피자의 면적 알아내기
			System.out.println(pizza.name + "의 면적은 " + area);
			
			Circle1 donut = new Circle1(); // Circle 객체 생성
			donut.radius = 2; // 도넛의 반지름을 2로 설정
			donut.name = "자바도넛"; // 도넛의 이름 설정
			area = donut.getArea(); // 도넛의 면적 알아내기
			System.out.println(donut.name + "의 면적은 " + area);
			}
		}
	