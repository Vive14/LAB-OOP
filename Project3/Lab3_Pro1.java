public class Lab3_Pro1 {
        public static void main(String[] args) {
           long start = System.nanoTime(); ///
           final int max_displays = 100;
           int number = 2;
           int num_print = 0;
           System.out.println();
           while (num_print < max_displays) 
           {
               if (isPalindrome(number) && isPrime(number)) { ///
                System.out.print(number + " ");
                   if (++num_print % 10 == 0) {
                    System.out.println();
                   }
               }
               number++;
           }
           System.out.println();
    
           long duration = System.nanoTime() -start; ///นับเวลา
           System.out.println(duration/1000000);
        }
    
        public static boolean isPrime (int number) {
            for(int i = 2; i <= Math.sqrt(number) ; i++) //number/2
            {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        public static int reverse_number(int number) {
            int reverse_s = 0;
            int r ;
            while (number > 0) {
                r = number % 10;
                number /= 10;
                reverse_s = reverse_s * 10 + r; 
            }
            return reverse_s;
        }
    
        public static boolean isPalindrome (int number) {
            return (number == reverse_number(number));
        }
    
}
