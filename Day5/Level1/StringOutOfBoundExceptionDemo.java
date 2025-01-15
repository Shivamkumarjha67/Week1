public class StringOutOfBoundExceptionDemo {
    public static void main(String[] args) {        
        // genratingSIOOBException();  
        handlingSIOOBException();
    }

    // Generating the string out of bound exception
    private static void genratingSIOOBException() {
        String str = "BridgeLabz";
        System.out.println("Character at 11th index is: " + str.charAt(11));
    }
   
    // Handling the null pointer exception
    private static void handlingSIOOBException() {  
        String str = "BridgeLabz";
       
        try {
            str.charAt(11);
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("String out of bound exception occured!");
        }
    }
}

