import java.util.Scanner;

public class S1Q2_64010451 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] all_sum = {{"a","b","c","d","e","f","g","h","i","j"},{"0","1","2","3","4","5","6","7","8","9"}};
        System.out.print("Random characters are ");
        int temp = (int)(Math.random()*2);
        for (int i = 0; i < 10; i++) {
            int coop = (int)(Math.random()*10);
            while(all_sum[temp][coop]=="x"){
                coop = (int)(Math.random()*10);
            }
            System.out.print(all_sum[temp][coop]+" ");
            all_sum[temp][coop] = "x";
            temp++;
            temp%=2;
        }
        System.out.print("\nSelect group of characters[1] characters or [2] numberic: ");
        int index = in.nextInt();
        if(index == 1){
            System.out.print("Characters not in the list are: ");
            for(int i=0;i<10;i++){
                if(all_sum[0][i]!="x")System.out.print(all_sum[0][i]+" ");
            }
        }
        else if(index == 2){
            System.out.print("Numberics not in the list are: ");
            for(int i=0;i<10;i++){
                if(all_sum[1][i]!="x")System.out.print(all_sum[1][i]+" ");
            }
        }
        else{
            System.out.println("Please Enter again (1 or 2)");
        }
        System.out.println("\nEnd of program.");
        in.close();
    }
}
