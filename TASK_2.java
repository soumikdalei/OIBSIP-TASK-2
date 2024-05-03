import java.util.Scanner;

public class TASK_2 {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);

       int comp_choice=(int)(Math.random()*100);
       int attempts=10;boolean playagain=true;
       while(playagain) {
           System.out.println("Enter a number of your choice between 0 to 100:");
           int your_choice=sc.nextInt();
           if(your_choice>100){
               throw new Exception("Please enter number between 0 and 100 not beyond that");
           }
           if(your_choice<0){
               throw new Exception("Please enter number between 0 and 100 not beyond that");
           }

           if (attempts==0) {
               System.out.println("You have used all your attempts!!");
               System.out.println("You failed");
               System.out.println("Do you want to play again?(Y/N)");
               sc.nextLine();
               String s=sc.nextLine();
               if (!s.equalsIgnoreCase("Y")) {
                   playagain = false;
               }
               else{
                   attempts=10;
               }
           }
           else if (your_choice > comp_choice) {
               System.out.println("Guess is too high");
               attempts=attempts-1;playagain=true;
           } else if (your_choice < comp_choice) {
               System.out.println("Guess is too low");
               attempts=attempts-1;playagain=true;
           }
           else if(your_choice==comp_choice){
               System.out.println("You Won");
               int points=attempts*10;
               System.out.println("Points:"+points);
               System.out.println("Do you want to continue playing?(Y/N)");
               sc.nextLine();
               String ch=sc.nextLine();
               if(ch.equalsIgnoreCase("Y")){
               playagain=true;}
               else{
               playagain=false;}
           }
       }
    }
}
