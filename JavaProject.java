import java.util.Scanner;


public class JavaProject {
	public static void main(String[] args) {
		int choice;
                                System.out.println("1)Newton Raphson Method \n 2)Newton Law of Cooling");
		System.out.println("Enter the choice ");
                                choice=STDIN_SCANNER.nextInt();
		switch(choice){
		case 1:float x, y1, y2;
		float[] a = new float[10], b = new float[10];
		int deg, j = 1, n;
		System.out.print("Enter the degree of polynomial equation: ");
		deg = STDIN_SCANNER.nextInt();
		System.out.print("Enter the value of x = ");
		x = STDIN_SCANNER.nextFloat();
		for(int i = 0; i <= deg; i++) {
			System.out.print("Enter the coefficient of x to the power " + i + ": ");
			a[i] = STDIN_SCANNER.nextFloat();
			b[i] = i * a[i];
		}
		System.out.print("\n Enter no.of iterations = ");
		n = STDIN_SCANNER.nextInt();
		while(j <= n) {
			x -= poly(a, deg, x) / poly1(b, deg, x);
			j++;
		}
		System.out.printf("\n Approximate Root = %f", x);
		break;
	case 2: 
		System.out.println("Enter Time 2,Constant Temperature and Temperatures at T1 and T2 =");
		double t2,ct,tat1,tat2,tat3,rt;
		t2=STDIN_SCANNER.nextFloat();
		ct=STDIN_SCANNER.nextFloat();
		tat1=STDIN_SCANNER.nextFloat();
		tat2=STDIN_SCANNER.nextFloat();
		System.out.println("The temperature at which time to be calculated = ");
		tat3=STDIN_SCANNER.nextFloat();
		double c=(tat1-ct)/1;
	    double k=-(Math.log10((tat2-ct)/c))/t2;
	    rt=(Math.log10((tat3-ct)/c)/k);
	    System.out.println("Time Required = "+rt);



	       }
	}

	public static float poly(float[] a, int deg, float x) {
		float p;
		p = a[deg];
		for(int i = deg; i >= 1; i--) {
			p = a[i - 1] + x * p;
		}
		return p;
	}

	public static float poly1(float[] b, int deg, float x) {
		float p;
		p = b[deg];
		for(int i = deg; i >= 1; i--) {
			p = b[i - 1] + x * p;
		}
		return p;
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}