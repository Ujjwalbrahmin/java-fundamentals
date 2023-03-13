class PrimitiveDataTypes {
    /*
    This class demonstrates the primitive data types which exists in python
     */
    public static void main(String[] args) {
        boolean a; // 1 Bit
        byte c = 8; // 1 Byte
        char b = 'B'; // 2 Bytes
        short d = 16; // 2 Bytes or, 16 Bits
        int e = 32; // 4 Bytes or, 32 Bits
        long f = 64l; // 8 Bytes or, 64 Bits, notice the suffix l
        float g = 32.0f; // 4 Bytes or, 32 Bits, notice the suffix f
        double h = 64.0; // 8 Bytes or, 64 Bits

        Double i = 64.0D; // Double is a wrapper class for double with added functionalities, notice the D suffix
        System.out.println(h);
        System.out.println(i);
    }
}