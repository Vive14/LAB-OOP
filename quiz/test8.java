import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] a = {{"a","b","c","d","e","f","g","h","i","j"},{"0","1","2","3","4","5","6","7","8","9"}};
        System.out.print("Random characters are ");
        int start = (int)(Math.random()*2);
        for (int i = 0; i < 10; i++) {
            int tmp = (int)(Math.random()*10);
            while(a[start][tmp]=="x"){
                tmp = (int)(Math.random()*10);
            }
            System.out.print(a[start][tmp]+" ");
            a[start][tmp] = "x";
            start++;
            start%=2;
        }
        System.out.print("\nSelect group of characters[1] characters or [2] numberic: ");
        int index = in.nextInt();
        if(index == 1){
            System.out.print("Characters not in the list are: ");
            for(int i=0;i<10;i++){
                if(a[0][i]!="x")System.out.print(a[0][i]+" ");
            }
        }
        else if(index == 2){
            System.out.print("Numberics not in the list are: ");
            for(int i=0;i<10;i++){
                if(a[1][i]!="x")System.out.print(a[1][i]+" ");
            }
        }
        else{
            System.out.println("Please Enter again (1 or 2)");
        }
        System.out.println("\nEnd of program.");
        in.close();
    }
}
