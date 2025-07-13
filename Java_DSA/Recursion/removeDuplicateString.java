
//condition : a-z character range

public class removeDuplicateString{


public static void main(String args[]){
    String str = "hhhhhhhhhhhhhhhhhhhhhhaaaarrrrrrrrr";
    duplicateremove(str, 0, new StringBuilder(""), new boolean[26]);

}

    public static void duplicateremove(String str, int idx,StringBuilder newStr,boolean map[]){
        
        //Base Case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        //Kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            duplicateremove(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            duplicateremove(str, idx+1, newStr.append(currChar), map);
        }

    }

}