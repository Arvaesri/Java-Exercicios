import java.util.Scanner;

public class BolaQuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(),z;
		double x1,x2,x3,y1,y2,y3,diferencax= 0,diferencay = 0,raioQuadrado = 0;
		
		for(z = 0; z < h; z++)
		{
			x1 = sc.nextFloat();
			y1 = sc.nextFloat();
			x2 = sc.nextFloat();
			y2 = sc.nextFloat();
			x3 = sc.nextFloat();
			y3 = sc.nextFloat();
						
			diferencax = (x1+x2+x3)/3;
			diferencay = (y1+y2+y3)/3;
								
			raioQuadrado = ((x1-diferencax)*(x1-diferencax)) + ((y1-diferencay)*(y1-diferencay));
			
			double raio = Math.sqrt(raioQuadrado);
			
			double circuferencia = 2*raio*3.141592653589793;
			
			System.out.printf("%.2f",circuferencia);
					
		}
	}
}

