import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Pro2_64010451 {
    static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
       
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()]; 
        for(int i = 0; i < list1.length ; i++){
            list1[i] = input.nextInt();
        }
        String temp = input.nextLine(); // Remove the excess array and store it in temp 

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        temp = input.nextLine();
        System.out.print("The merged list is ");

        //foreach 
        for(int i : merge(list1, list2)) {  //displays all elemrnts in array merge 
            System.out.print(i + " ");
        }

    }

    public static int[] merge(int[] list1, int[] list2){
        int[] list3 = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, list3, 0, list1.length);
        System.arraycopy(list2, 0, list3, list1.length, list2.length);
        Arrays.sort(list3); // no return , sort keep in list3
        return list3;
    }

  

}
