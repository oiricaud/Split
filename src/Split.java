public class Split{

    /** 
     * returns a string showing the separated
     * */ 
    public String split(String s, int length){
        String r = new String();
        String sub;
        for(int i = 0; i < s.length(); i+=length){
            if(i+length > s.length()){
                sub = s.substring(i, s.length());
                r = r + sub;
            }
            else{
                sub = s.substring(i, i+length); 
                r = r + sub + ", ";
            }
        }
        return r;
    }

}
