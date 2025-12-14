package StringMethods;
public class StringMethods {
        public static void main(String[] args) {

            String text = "Qafarova Elvira";

            System.out.println("length(): " + text.length());
            System.out.println("charAt(2): " + text.charAt(2));
            System.out.println("toUpperCase(): " + text.toUpperCase());
            System.out.println("toLowerCase(): " + text.toLowerCase());
            System.out.println("contains(): " + text.contains("Elvira"));
            System.out.println("startsWith(): " + text.startsWith("Salam"));
            System.out.println("endsWith(): " + text.endsWith("ra"));
            System.out.println("indexOf(): " + text.indexOf("f"));
            System.out.println("replace(): " + text.replace("Qafarova", "Eliyeva"));
            System.out.println("substring(6): " + text.substring(6));
        }

}
