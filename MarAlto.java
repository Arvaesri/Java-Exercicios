import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MarAlto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numCompet = sc.nextInt(),minCompet = sc.nextInt(),x,y,pontMin;
		int[] pontuacao = new int[numCompet];
		ArrayList<Integer> pontuacaoOrdenada = new ArrayList<>();
		
		if(numCompet == minCompet)
		{
			System.out.println(minCompet);
		}
		else
		{
		
			for(x = 0 ; x < numCompet; x++)
			{
				System.out.println("Competidor n°" + (x+1));
			
				pontuacao[x] = sc.nextInt();
			}
			
			Arrays.sort(pontuacao);
			
			for(x = numCompet-1; x >= 0;x--)
			{
				pontuacaoOrdenada.add(pontuacao[x]);
			}
			
			pontMin = pontuacaoOrdenada.get(minCompet);
			y = 0 ;
			
			for(x = minCompet; x < numCompet; x++)
			{
				if(pontuacaoOrdenada.get(x) == pontMin)
				{
					y++;
				}
			}
			
			System.out.println(minCompet + (y));
			
		}
		

	}

}
