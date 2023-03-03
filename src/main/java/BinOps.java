public class BinOps {
    static BinOps binOps;
    public String sum (String a, String b){
        int number = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(number);
    }
    public String mult (String a, String b){
        int number = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return Integer.toBinaryString(number);
    }
}
