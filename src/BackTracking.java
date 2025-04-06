public class BackTracking {
    public static void main(String[] args) {
        permutation(new StringBuilder("abcd"),new StringBuilder(),0);
    }
    // method to print all possible combinations of a string using backtracking
    static void permutation(StringBuilder str,StringBuilder perm,int idx){
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            StringBuilder newStr= new StringBuilder(str);
            newStr.deleteCharAt(i);
            perm.append(currentChar);
            permutation(newStr,perm,idx+1);
            perm.deleteCharAt(perm.length() - 1);
        }
    }
}
