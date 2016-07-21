package session3assignment1;

public class Squareroot {

	static int m; 
	static int n=5;
	public static int Sqrt(int m,int n){
		m=n*n;
		System.out.println(m);
		return m;
	}
	public static int cbrt(int m,int n){
		m=n*n*n;
		System.out.println(m);
		return m;
		
	}
	public static void main(String[] args) {
	
		Squareroot value=new Squareroot();
		value.Sqrt(m, n);
        value.cbrt(m, n);

	}

}
