public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public String split(String s, int length){
        String r = new String("");
        String sub;
        for(int i = 0; i < s.length(); i+=length){
            if(i+length > s.length()){
                sub = s.substring(i, s.length());
            }
            else{
                sub = s.substring(i, i+length);
            }
            if (r.equals("")){
                r = sub;
            }
            else{
                r = r + ", " + sub ;
            }
        }
        return r;
    }
}
