public class ArrayUtils {
    public void printArray(double[][] table) {
        for (int i = 0; i < 3; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                String cellNumber = "[" + i + "," + j + "]";
                stringBuilder.append(cellNumber);
                stringBuilder.append(table[i][j]);
                stringBuilder.append(" ");
            }
            System.out.println(stringBuilder);
        }
    }

    public double sumOfDiagonalProducts(double[][] table) {
        double sum = table[0][0] * table[1][1] * table[2][2];
        sum += (table[0][2] * table[1][1] * table[0][2]);
        return sum;
    }

    public double bordersSum(double[][] table) {
        double sum = table[0][0] + table[0][1] +table[0][2] + table[1][0] + table[2][0] + table[2][2] + table[2][1] + table[1][2];
        return sum;
    }

    public double productOfMiddleRowMiddleColumnSum(double[][] table) {
        double product;
        double sumMiddleRow;
        double sumMiddleColumn;
        sumMiddleRow = table[1][0] + table[1][1] + table[1][2];
        sumMiddleColumn = table[0][1] + table[1][1] + table[2][1];
        product = sumMiddleRow * sumMiddleColumn;

        return product;
    }

}
