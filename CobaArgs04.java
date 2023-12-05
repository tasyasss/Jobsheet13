package Jobsheet13;

public class CobaArgs04 {
    public static void main(String[] args) {
        // System.out.println("hello world");
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }
        if (args.length > 0) {
            System.out.println("hai " + args[0]);
            System.out.println("selamat datang di " + args[1]);
        } else {
            System.out.println("hi, selamat datang");
        }
    }
}
