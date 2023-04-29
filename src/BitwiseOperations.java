public class BitwiseOperations {
    public static void main(String[] args) {
        BitwiseOperations bitwiseOperations = new BitwiseOperations();
        bitwiseOperations.setSpecificBitInNumber();
    }

    private void setSpecificBitInNumber() {
        int num = 4, pos = 0;
        num |= (1 << pos);
        System.out.println(num);
        // 4 - 100
        // after left shift of 1 - 001
        // bitwise OR between 100 - 001 is 101 that is 5
    }

}