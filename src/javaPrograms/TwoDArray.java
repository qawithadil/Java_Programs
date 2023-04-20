package javaPrograms;

public class TwoDArray {

	public static void main(String[] args) {
		String [][]x = new String[3][5];
		int i=0,j=0;
		int row_length=x.length; // total number of rows
		System.out.println("Total No of Rows="+row_length);
		int col_length=x[0].length;
		System.out.println("Total No of Columns= "+col_length);
		System.out.println("2 D Array....");
		for(i=0;i<row_length;i++) {
			for(j=0;j<col_length;j++) {
				x[i][j]="Hello"+i;
				System.out.print(x[i][j]);
			}
			System.out.print("   ");
		}

	}

}
