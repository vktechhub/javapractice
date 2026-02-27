public class CJ_NullReturn {    
    public static void main(String[] args) {
        CJ_NullReturn obj = new CJ_NullReturn();
        System.out.println(obj.getX(5));
        System.out.println(obj.getX(-3));
    }

    public String getX(int a) {
        if (a > 0) {
            return "Positive";
        } 
        return null;
    }
}