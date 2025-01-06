import java.util.*;
public class roundoff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.println("eneter any float number");
        float num=s.nextFloat();
        float temp=num;
        if(num>=0)
        {
            num+=0.5;
        }
        else{
            num-=0.5;
        }
        int result=(int)num;
        System.out.println("the roundoff the given float value "+temp+" is : "+result);
        s.close();
    }
   
}