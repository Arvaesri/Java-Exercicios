import java.util.Scanner;

public class SaoBraz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt(),a2 = sc.nextInt(), a3 = sc.nextInt(),minutos,aux = 6001;
		
		for(int x = 1; x < 4; x++)
		{
			if(x == 1)
			{
				minutos = a2*2;
				minutos += a3 *4;
				if(minutos < aux)
				{
					aux = minutos;
				}
			}
			else if(x == 2)
			{
				minutos = a1*2;
				minutos += a3*2;
				if(minutos < aux)
				{
					aux = minutos;
				}
			}
			else
			{
				minutos = a1*4;
				minutos += a2*2;
				if(minutos < aux)
				{
					aux = minutos;
				}
			}
		}
		
		System.out.println(aux);
	}

}
