package test;

public class star1 {

	    public static void main(String[] args) {
	        if (args.length < 11) {
	            System.out.println("Insufficient arguments. Please provide matrix size and elements.");
	            return;
	        }

	        int rows = Integer.parseInt(args[0]);
	        int cols = Integer.parseInt(args[1]);

	        if (args.length != (rows * cols) + 2) {
	            System.out.println("Invalid number of elements. Please provide the correct number of elements for the matrix size.");
	            return;
	        }

	        int[][] matrix = new int[rows][cols];
	        int index = 2;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = Integer.parseInt(args[index]);
	                index++;
	            }
	        }

	        int smallestElement = findSmallestElement(matrix);
	        System.out.println(smallestElement);
	    }

	    public static int findSmallestElement(int[][] matrix) {
	        int smallest = matrix[0][0];
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                if (matrix[i][j] < smallest) {
	                    smallest = matrix[i][j];
	                }
	            }
	        }
	        return smallest;
	    }
	


}
