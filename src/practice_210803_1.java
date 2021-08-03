
public class practice_210803_1 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//대입 연산자
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		
		x= 10; y=20;
		//산술 연산자
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		
		
		
		/*
		 * x += 10
		 * x = x + 10;
		 */
		
		//복합대입 연산자
		
		
		x = 10;
		System.out.println("x += 10 : " + (x += 10));
		
		
		x = 10;
		System.out.println("x += 10 : " + (x += 10));
		
		x = 10;
		System.out.println("x -= 10 : " + (x -= 10));
		
		x = 10;
		System.out.println("x *= 10 : " + (x *= 10));
		
		x = 10;
		System.out.println("x /= 10 : " + (x /= 10));
		
		x = 10;
		System.out.println("x %= 10 : " + (x %= 10));
		
		
		//관계 연산자
		x= 10; y = 20;
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y));
		
		//증감 연산자
		x = 10;
		System.out.println("++x : " + (++x)); //먼저 계산하고 출력
		
		x = 10;
		System.out.println("--x : " + (--x)); // 먼저 계산하고 출력
		
		x = 10;
		System.out.println("x++ : " + (x++)); // 먼저 출력하고 계산 (ex : 실제로는11인데, 표현은 10)
		System.out.println("x : " + x);
		
		x = 10;
		System.out.println("x-- : " + (x--)); // 먼저 출력하고 계산
		System.out.println("x : " + x);
		
		//논리 연산자
		boolean b1 = false;
		boolean b2 = true;
		
		System.out.println("b1 && b2 : " + (b1&&b2));
		System.out.println("b1 || b2 : " + (b1||b2));
		System.out.println("!b1 : " + !b1);
		System.out.println("!b2 : " + !b2);
		
		
		//조건(삼항) 연산자
		x = 10; y = 20;
		int result = 0;
		result = (x > y) ? 100 : 200;
		System.out.println("result : " + result);
		
		result = (x < y) ? 100 : 200;
		System.out.println("result : " + result);
		
		result = (x == y) ? 100 : 200;
		System.out.println("result : " + result);
		
		
		//비트 연산자
		x = 2;
		y = 3;
		System.out.println("x & y : " + (x & y));
		System.out.println("x | y : " + (x | y));
		System.out.println("x ^ y : " + (x ^ y));
		
		
		
	}

}
