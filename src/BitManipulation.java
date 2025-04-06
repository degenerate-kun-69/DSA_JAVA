public class BitManipulation {
    public static void main(String[] args) {
        int n=5; // binary 0101
        int pos=2;
        int bitMask=1<<pos;
        //get bit operation
        if((bitMask&n)==0)
            System.out.println("Bit was zero");
        else System.out.println("Bit was one");
        //set bit operation
        int newNumber= 1<<1|n;
        System.out.println(newNumber);
        //clear bit operation
        int clearBit=~bitMask&n;
        System.out.println(clearBit);
    }
}
