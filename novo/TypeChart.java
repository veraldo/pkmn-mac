
public class TypeChart {
	int typeChart[][];
	
	public TypeChart(){
		typeChart = new int[3][3];
		typeChart[0][0] = 0;
		typeChart[0][1] = 1;
		typeChart[0][2] = -1;
		typeChart[1][0] = -1;
		typeChart[1][1] = 0;
		typeChart[1][2] = 1;
		typeChart[2][0] = 1;
		typeChart[2][1] = -1;
		typeChart[2][2] = 0;
	}
	
	int typeCompare(int a, int b){
		if (typeChart[a][b] > 0) return 1;
		if (typeChart[a][b] == 0) return 0;
		return -1;
	}
}
