/**
 * Created by jianiyang on 16/7/12.
 */
import java.util.LinkedList;
import java.util.List;
public class StringEncode {
    public String stringEncode(List<String> strs){
        StringBuilder output = new StringBuilder();
        for(String str : strs){
            output.append(String.valueOf(str.length()) + "#");
            output.append(str);
        }
        return output.toString();

    }

    public List<String> stringDecode(String s){
        List<String> result = new LinkedList<String>();

        int start = 0;
        while(start < s.length()){
            int index = s.indexOf("#", start);
            int size = Integer.parseInt(s.substring(start, index));

            result.add(s.substring(index + 1, index + size + 1));
            start = index + size + 1;
        }
        return result;
    }

    public static void main(String[] args){
        StringEncode res = new StringEncode();
        String s = new String("3#1234#12345#12345");
        List<String> result = res.stringDecode(s);
        for(String out : result){
            System.out.println(out);
        }
    }
}
