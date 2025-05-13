import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int attempt=1,round=1,n=1,max_attempts=3;
        System.out.println("POINT TO REMEMBER:"+"\t"
        +"YOU HAVE ONLY THREE CHANCES TO GUESS THE NUMBER WITHIN RANGE OF 100\n\t\t....... LET'S START THE GAME.......");
       UserGuess u;
       do{
        u=new UserGuess();
        attempt++;
        if(attempt>3){
            System.out.println("\nSORRY!!YOUR ATTEMPTS ARE OVER."+"\n"
            +"\t.......if you want to continue the game enter any number otherwise 0......")  ;
            n=sc.nextInt();
            if(n!=0){
                attempt=1;
                round++;
            }
        }
        }while(attempt<=max_attempts && n!=0 );  
        System.out.println("NUMBER OF ROUNDS: "+round);
        u.display();//toatl score
        System.out.println("\t\tTHANK YOU FOR PLAYING GAME...!!");
        System.exit(0);
    }
}
class UserGuess{
    int score=0;
    UserGuess(){
         Scanner sc=new Scanner(System.in);
         Random r=new Random();
         int random_no= r.nextInt(100);
         System.out.println("Guess the number:");
         int num=sc.nextInt();
         System.out.println("The raondom number is: "+random_no);
         if(random_no==num){
            System.out.println("CORRECT..!!");
            score++;
         }else if(num<random_no){
            System.out.println("YOUR NUMBER IS TOO LOW");
         }else{
            System.out.println("YOUR NUMBER IS TOO HIGH");
         }
        }
    void display(){
        System.out.println("YOUR SCORE BASED ON NUMBER OF ATTEMPTS: "+score);
    }

}
