import java.util.Random;		
public class MakeRandom{
	public static void main(String[] args){
		Random random = new Random();
		for(int i = 0; i < 100; i++){
			System.out.println("#" + i + random.nextInt(100));
		}	
	}
}
