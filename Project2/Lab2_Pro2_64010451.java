import java.util.Scanner;

public class Lab2_Pro2_64010451 {
    public static void main(String[] args) {
        int player, computer_play;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("scissor (0), rock (1), paper (2) :");
            player = input.nextInt();
        } while (player <0 || player > 2);

        computer_play = (int) (Math.random()*3);
        String play_str, computer_str, answer_str;

        if (player == 0) {
            play_str = "scissor";
        }
        else if (player == 1) {
            play_str = "rock";
        }
        else {
            play_str = "paper";
        }

        if (computer_play == 0) {
            computer_str = "scissor";
        }
        else if (computer_play == 1) {
            computer_str = "rock";
        }
        else  {
            computer_str = "paper";
        }

        if((computer_play == 0 && player == 1)||(computer_play == 1 && player == 2)||(computer_play == 2 && player == 0)){
            answer_str = " You won.";
        }
        else if ((computer_play == 0 && player == 2)||(computer_play == 1 && player == 0)||(computer_play == 2 && player == 1)) {
            answer_str = " You lose.";
        }
        else {
            answer_str = " too. It is a draw";
        }
        
        System.out.println("The computer is " +computer_str +". You are " +play_str +answer_str);
        input.close();

    }

}
