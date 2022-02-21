public class JavaVersion {

        public static void main(String[] args) {
            greeting();
            System.out.println(Modulus(3,5));

            System.out.println(add(4,4,6,8));
            interesting();

        }
        public static void  greeting (){
            String name = "Mitchele";
            System.out.println( "Hello " + name);
        }
        public static int Modulus (int x , int y){
             int mod = x % y;
            return mod;

        }
        public static int add(int a , int b, int c , int d) {
             return a+b+c+d;

        }
        public static void  interesting(){
            System.out.println("I love myself");

        }
    }

