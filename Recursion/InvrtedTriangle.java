package Recursion;

public class InvrtedTriangle {

        public static void main(String[] args) {

            triangle(4,0);
        }
        public static void triangle(int r, int c){
            while(c<r){
                System.out.print("*"+" ");
                c++;
            }
            System.out.println();
            if(c>=r){
                return;
            }
            triangle(r-1,c);
        }
    }


