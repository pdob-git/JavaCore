//My solution
public class ArrayNumbers {
    public static void main(String[] args) {
        double[] row1 = {1.0, 1.5, 2.0};
        double[] row2 = {1.5, 2.0, 2.5};
        double[] row3 = {2.0, 2.5, 3.0};
        double[][] table = {row1, row2, row3};
        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.printArray(table);
        System.out.println("Diagonal sum = " + arrayUtils.sumOfDiagonalProducts(table));
        System.out.println("Product of middle row and middle column sums = " + arrayUtils.productOfMiddleRowMiddleColumnSum(table));
        System.out.println("Borders sum = " + arrayUtils.bordersSum(table));
        
    }
}
