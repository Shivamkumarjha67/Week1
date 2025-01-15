
public class NullPointerExceptionDemo {
    private static String str = null;
    public static void main(String[] args) {        
        genratingNullpointerException();    
        handlingNullpointerException();
    }

    // Generating the null pointer exception
    private static void genratingNullpointerException() {  
        try {
            int lengthOfString = str.length();
            System.out.println(lengthOfString);
        } catch(java.lang.NullPointerException e) {
            System.out.println("Null pointer exception occurred!");
        }
    }
   
    // Handling the null pointer exception
    private static void handlingNullpointerException() {    
        if(str == null) {
            System.out.println("String is null, can not perform any operations");
        } else {
            int length = str.length();
            System.out.println("Size of the string is: " + length);
        }
    }
}

