package Strings;

public class SBuilder {
    public static void main(String[] args) {    // StringBuilder is also a Class like String in java

           StringBuilder builder = new StringBuilder(); // StringBuilder Changes the object
        for(int i=0;i<20;i++){
            char ch = (char)('a'+i);
            builder.append(ch);

            System.out.println(builder.toString());
        }
    }
}
