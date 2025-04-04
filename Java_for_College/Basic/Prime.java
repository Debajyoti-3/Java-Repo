package Java_for_College.Basic;

public class Prime {
    public static void main(String[] args){
        int num =12;
        int flag =0;
        for(int i=2; i<num; i++){
            if(num%i == 0){
               flag++;
               break;
            }

        }
        if(flag == 0){
            System.out.println("Prime");
        }
        else{
            System.out.println("NOT Prime");
        }
    }
}
