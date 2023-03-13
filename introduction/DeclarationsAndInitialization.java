// This is a single line comment

class DeclarationsAndInitialization {
    /*
    This is multi line comment which can be used to gererate class documentations
    This class demonstrates declaration and initialization of different primitive data types
    Syntactical demonstration is also available
     */
    public static void main(String[] args) {
        boolean a; // a is declared but not initialized
        int b = 10; // b is declared as well as initialized
        long c, d = 104L; // c is declared and d is declared as well as initlized
        float e, f, g; // e, f and g are only declared
        char h = 'U', i = 'J'; // h and i are both declared as well as initialized
        /*
        DeclarationsAndInitialization.java:14: error: incompatible types: String cannot be converted to char
        char h = "U", i = 'J'; // h and i are both declared as well as initialized
        if a character is defined using "" (double quotes) then it is treated as string
         */

        System.out.print("Value of different data types\n");
        System.out.println(b);

        /*
        DeclarationsAndInitialization.java:17: error: variable c might not have been initialized
        System.out.print(c);

        Upon accessing a variable which has not been initialized java compiler complains
        Here
         */
        System.out.println(d);
        System.out.println(h);
        System.out.println(i);
        System.out.print("\n");
    }
}