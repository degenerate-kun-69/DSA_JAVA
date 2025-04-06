public class stringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("nigga");
        //character at index
        System.out.println(sb.charAt(2));
        //set character at index
        //pass index and the character
        sb.setCharAt(0,'d');
        System.out.println(sb);
        //insert any data into the stringbuilder
        sb.insert(4, "er");
        System.out.println(sb);
        //delete any part of the stringbuilder
        //this is non-inclusive of end index, i.e if u pass 6,7 it will delete items at index 6 only
        sb.delete(6,7);
        System.out.println(sb);
        //append any data at end of stringbuilder
        sb.append('s');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        reverseString(sb);
        System.out.println(sb);
    }
    static StringBuilder reverseString(StringBuilder S){
        for(int i=0; i<S.length()/2;i++){
            // front = i;
            // back = S.length()-1-i;
            char temp=S.charAt(i);
            S.setCharAt(i,S.charAt(S.length()-1-i));
            S.setCharAt(S.length()-1-i, temp);
        }
        return S;
    }
}
