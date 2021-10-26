public class ArraySum {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {10,11,12};
        int result;
        ArrayUtils arrayUtils = new ArrayUtils();
        result = arrayUtils.addArrays(numbers1, numbers2);
        System.out.println("Liczenie sumy tablic");
        System.out.println("Tablica 1: {" + numbers1[0]+ "," + numbers1[1]+ "," + numbers1[2]+ "}");
        System.out.println("Tablica 2: {" + numbers2[0]+ "," + numbers2[1]+ "," + numbers2[2]+ "}");
        System.out.println("Suma dwóch tablic: " + result);

    }


}
