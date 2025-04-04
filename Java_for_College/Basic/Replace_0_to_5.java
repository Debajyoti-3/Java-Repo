package Java_for_College.Basic;

// a GFG problem

public class Replace_0_to_5 {

        int convertfive(int num) {
            // Your code here

            int sum =0;
            int r;
            int temp = num;
            int mult = 1;

            if(num == 0) return 5;
            while(num >0){
                r = num %10;
                if(r == 0){
                    r =5;
                }
                sum = sum  + r*mult;
                mult = mult*10;

                num = num /10;
            }
            return sum;
        }
    }

