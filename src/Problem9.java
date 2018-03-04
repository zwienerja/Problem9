public class Problem9 {

    public static void main(String[] args) {
        int a=0, b=0, c=0;
        boolean pathagorean, equals1000 = false;
        for (a = 1; a < 1000; a++) {
            for (b = a + 1; b < 1000; b++) {
                for (c = b + 1; c < 1000; c++) {
                    if ((c * c) == ((a * a) + (b * b)))
                        pathagorean = true;
                    else
                        pathagorean = false;
                    if (c + b + a == 1000)
                        equals1000 = true;
                    else
                        equals1000 = false;
                    if (equals1000 && pathagorean) {
                        int product = (a * b * c);
                        System.out.println(a + " is a \n" + b + " is b\n" + c + " is c\n");
                        System.out.println(product + " is the product of the a, b, and c");
                    }
                }
            }
        }
    }
}
