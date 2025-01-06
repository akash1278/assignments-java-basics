import java.util.Scanner;
public class below_n {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.println("enter the number to print prime number upto that number: ");
        int num=st.nextInt();
        for(int j=2;j<=num;j++){
           if(j==2){
            System.out.print(j +" ");
        }
        else{
            int count=0;
            for(int i=2;i<j;i++){
                if(j%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(j+" ");
    
            }
            
        }
    }
    }
}