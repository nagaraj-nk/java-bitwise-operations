public class BitwiseOperations {
    public static void main(String[] args) {
        BitwiseOperations bitwiseOperations = new BitwiseOperations();
        bitwiseOperations.setSpecificBitInNumber();
        bitwiseOperations.unsetSpecificBitInNumber();
        bitwiseOperations.notOperator();
    }

    private void setSpecificBitInNumber() {
        System.out.println("--setSpecificBitInNumber--");
        int num = 4, pos = 0;
        num |= (1 << pos);
        System.out.println("Ans=" + num);
        System.out.println("---");
        // 4 - 100
        // after left shift of 1 - 001
        // bitwise OR between 100 - 001 is 101 that is 5
    }

    private void unsetSpecificBitInNumber() {
        System.out.println("--unsetSpecificBitInNumber--");
        int num = 5, pos = 0;
        num &= ~(1 << pos);
        System.out.println("Ans=" + num);
        System.out.println("---");
        // 5 => 101
        // after left shift of 1 - 001
        // not of above value is   100
        // bitwise AND between 100 - 101 is 100 that is 4
    }

    private void notOperator() {
        System.out.println("--not operator--");
        int a = 0; // 4 => 100
        a = ~a; // ~100 => 011
        System.out.println("Ans=" + a);
        System.out.println("---");
    }
}