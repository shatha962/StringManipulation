public class StringManipulator {
    public String trimAndConcat(String first, String second) {
            String trim1 = first.trim();
            String trim2 = second.trim();
            String concat = trim1.concat(trim2);
            return concat;
    }
    public Integer getIndexOrNull(String sentance, char x){
        if(sentance.indexOf(x)==-1){
            return null;
        }
        else {
            return sentance.indexOf(x);
            
            }
    }
    public Integer getIndexOrNull(String sentance1, String sentance2){
        if(sentance1.indexOf(sentance2)==-1){
            return null;
        }
        else {
            return sentance1.indexOf(sentance2);
            
            }
    }
    public String concatSubstring(String abc, int n, int m, String xyz){
        String substr = abc.substring(n, m);
        String concat1 = substr.concat(xyz);
        return concat1;
    }
} 