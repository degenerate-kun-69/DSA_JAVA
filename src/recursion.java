public class recursion {
    public static int first = -1;
    public static int last = -1;
    public static String nigga1="";
    static void firstLastOccurance(String s,int idx,char x){
        if(idx==s.length()){
            return;
        }
        char currChar=s.charAt(idx);
        if(currChar==x){
            if(first==-1){
                first=idx;
            }
            else last=idx;
        }
        firstLastOccurance(s,idx+1,x);
    }

    public static void main(String[] args) {
        firstLastOccurance("Skibidi skibidi hawk tuah hawk",0,'a');
        System.out.println("A found first at "+first+" And last at "+last);
        nigga1="xsrqefaxckoxkixsw";
        System.out.println(nigga1);
        moveX(nigga1,0,0,new StringBuilder());
        System.out.println(nigga1);

    }
    static boolean arraySortedOrNot(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]) return arraySortedOrNot(arr,idx+1);
        else return false;
    }
    static void moveX(String s,int idx,int count,StringBuilder newS){
        if(idx==s.length()){
            for (int i=0;i<count;i++){
                newS.append('x');
            }
            nigga1=String.valueOf(newS);
            return;
        }
        char currChar=s.charAt(idx);
        if(currChar=='x'){
            count++;
            moveX(s,idx+1,count,newS);
        }
        else{
            newS.append(currChar);
            moveX(s,idx+1,count,newS);
        }
    }
    static StringBuilder removeDuplicate(String s,int idx){
        StringBuilder str=new StringBuilder();
        return str;
    }
}
