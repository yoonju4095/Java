
public class Randomwalk_202031960 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, y = 5;
		int tile[][] = new int[10][10];
		int steps;
		tile[5][5] = 1;
		
		for(steps = 0; steps < 20; steps++) {
			int ditection = (int)(Math.random() * 4);
			if(ditection == 0 && x > 0)
				x--;
			else if(ditection == 1 && x < 9)
				x++;
			else if(ditection == 2 && y > 0)
				y--;
			else if(y < 9)
				y++;
			tile[y][x] = steps+2;
			
			System.out.println("------------------------");
			for(int i = 0; i < 10; i++) {
				
				for(int j = 0; j < 10; j++){
					if(tile[i][i] == 0) {
						System.out.printf("%3s","# ");
						}
					else{
						if(tile[i][i] % 3 == 0) {
							System.out.printf("%3d",tile[i][j]);
						}
						else {
							System.out.printf("%3s",". ");
						}
					}
				}
				System.out.println();
			}
			System.out.println("---------------------------");
		}
		System.out.println("전체 이동 수는 = " + steps);
	
	}
}
