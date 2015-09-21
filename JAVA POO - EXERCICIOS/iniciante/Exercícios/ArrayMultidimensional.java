public class ArrayMultidimensional {

	public static void main(String[] args){
	
		String[] uma  = {"Ricardo", "Sandra"};
		String[][] duas = 
		{
			{"Ricardo", "M", "DF"},
			{"Sandra", "F", "MG"}
		};
		duas[1][0] = "SANDRA";
		System.out.print(duas[1][0]);
		//System.out.println(duas[0][0]);//para acessar o Ricardo
		//System.out.println(duas[1][0]);//para acessar a Sandra
		
	
	}
}