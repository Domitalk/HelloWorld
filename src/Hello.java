public class Hello {
    // public accessible class
    // Java does this thing where it compiles every time when running... a little different from Ruby and JS

    public static void main(String[] args) {
        // static void main is the main method of the class String[] arg is default value of the args

        System.out.println("Hello, Dominic");
        // print command, use double quotes and semicolon always at the end

        int myFirstNumber = (10 + 5) + (2 * 10);
        // declaration statement
        // this allocates memory with this variable with this value of int 5
        // to access this data, we use the variable name and it points to the memory
        // when there is a built in method (aka Java operator)  like + it will assign the result to the variable

        System.out.println(myFirstNumber);
        // sout is the key shortcut for System.out.println();
        // variable should be stated without quotes obviously. quotes will make it String literal


    }
}
