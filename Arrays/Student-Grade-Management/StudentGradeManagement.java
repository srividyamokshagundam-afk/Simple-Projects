
import java.util.*;
public class StudentGradeManagement{
    public static void marksOfStudents(int[] arr,int n ){
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i] < min)
            {
                min=arr[i];
            }
        }
        System.out.println("Highest Mark: "+max);
        System.out.println("Lowest Mark: "+min);
    }
    public static void avgOfMarks(int[] arr,int n){
        int sum =0;
        int avg;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.println("Average of marks:"+avg);
    }
    public static int totalPassed(int[] arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>35){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Marks of students: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        marksOfStudents(arr,n);
        avgOfMarks(arr,n);
        System.out.println("No.of Students passed: "+totalPassed(arr,n));

    }
}