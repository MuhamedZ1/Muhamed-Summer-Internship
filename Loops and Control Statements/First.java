import java.util.Scanner;
public class First {

    public static void main(String[] args) {
        int pos=-1;
        int[] a = {10,5,2,3,7};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==number){
                pos=i;
                break;
            }
        }
        if(pos==-1)
            System.out.println("Number not in array");
        else
            System.out.println("Number in position "+(pos+1));
    }
}