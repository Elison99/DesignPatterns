public class test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        int result;
        try {
            result = demo.divTest(4,0);
            System.out.println(result);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        result = demo.divTest(200,10);
        System.out.println(result);
    }
}
