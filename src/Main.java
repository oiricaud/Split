import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public String [] split(String s, int length){
        if(s.length() <= 0)
            throw new IllegalArgumentException("String length must be greater than 0");
        if(length <= 0)
            throw new IllegalArgumentException("length must be a positive int");
        if(length > Integer.MAX_VALUE)
            throw new IllegalArgumentException("length too large");
        if(s == null)
            throw new IllegalArgumentException("String must be instantiated");

        List<String> r = new ArrayList<String>();
        String sub;
        for(int i = 0; i < s.length(); i+=length){
            if(i+length > s.length()){
                sub = s.substring(i, s.length());
            }
            else{
                sub = s.substring(i, i+length); 
            }
            r.add(sub);
        }
        return r.toArray(new String[0]);
    }

}
