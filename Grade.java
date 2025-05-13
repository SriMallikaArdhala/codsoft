import java.util.*;
public class Grade {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER EACH SUBJECT MARKS :");
        int[] marks=new int[6];
        int sum=0;
        int max_marks = marks.length * 100;
        for(int i=0;i<6;i++){
            System.out.print("SUBJECT "+(i+1)+": ");
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
        System.out.println("\nTOTAL MARKS OBTAINED :"+sum);
        double avg_per=percentage(sum,max_marks);
        System.out.printf("\nAVERAGE PERCENTAGE :%.2f%%\n",avg_per);
        String grade=gradeCal(avg_per);
        System.out.println("\nGRADE : "+grade);   
    }
    static double percentage(int sum,int max_marks){
        return ((double)sum/max_marks)*100;
    }
    static String gradeCal(double avg_per){
        if(avg_per>=90.0 && avg_per<100.0){
            return "A+";
        }else if(avg_per>=80.0 && avg_per<=89.0){
            return "A";
        }else if(avg_per>=70.0 && avg_per<=79.0){
            return "B";
        }else if(avg_per>=60.0 && avg_per<=69.0){
            return "C";
        }else if(avg_per>=50.0 && avg_per<=59.0){
            return "D";
        }else if(avg_per>=40.0 && avg_per<=49.0){
            return "E";
        }else{
            return "F";
        }
    } 
}
