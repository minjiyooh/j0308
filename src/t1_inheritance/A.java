package t1_inheritance;

public class A {
	private int item1 = 500;
	int item2 = 600;
	
	//사각형의 면적 
	public void areRec(int x, int y ) { //메소드
		int area = x * y;
		System.out.println("사각형의 면적: (가로:"+x+",세로:"+y+")"+ area);
	}
}
