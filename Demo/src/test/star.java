package test;

public class star {

		    public static void main(String[] args) {
		        int[][] matrix = {
		        	
		            {2, 5, 6},
		            {16, 20, 12},
		            {3, 10, 18}
		        };

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

	
