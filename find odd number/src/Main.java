public class Main {
    public static void main(String[] args) {

        //Find odd numbers
        int a =1;
        System.out.println("Odd Numbers: " );
        while (a <= 100) {
            if(a % 2 != 0) {

                System.out.println("a = " + a);
            }
            a++;
        }
    }
}