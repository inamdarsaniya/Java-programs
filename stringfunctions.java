public class stringfunctions {
    public static void main(String[] args) {
        String s1="Java Developer";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.charAt(5));
        System.out.println(s1.indexOf("Developer"));
        System.out.println(s1.lastIndexOf('a'));
        
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5,12));
        
        System.out.println(s1.replace("Developer","Expert"));
        System.out.println(s1.concat(" Expert"));
        
        System.out.println(s1.equals("Java Developer"));
        System.out.println(s1.equals("JAVA Developer"));
        System.out.println(s1.equals("Java Developer Expert"));

        System.out.println(s1.equalsIgnoreCase("JAVA Developer"));
        System.out.println(s1.equalsIgnoreCase("Java Developer Expert"));

        System.out.println(s1.compareTo("Java Developer"));
        System.out.println(s1.compareTo("JAVA Developer"));
        System.out.println(s1.compareTo("Java Developer Expert"));
        
        System.out.println(s1.trim());

        System.out.println(s1.startsWith("Java"));
        System.out.println(s1.endsWith("loper"));


    }
}
