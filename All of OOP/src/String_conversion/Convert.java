package String_conversion;

public class Convert {
    public static void main(String[] args) {
        int a =100;
         long b=1000000000L;
        double c= 6666666.66;
        boolean d=true;
        // Cnverting To Strings!!;
        String s1=a+""; // way1 just by adding an empty string to the value;
        String s2=String.valueOf(a);
        String s3=String.valueOf(b);
        String S4=c+"";
        String S5=String.valueOf(d);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(S4);
        System.out.println(S5);

    }
}
