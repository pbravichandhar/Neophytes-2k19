class OpertrPreceTernary{
    public static void main(String[] args) {
        int a=9;
        a=++a;
        System.out.println(a);
        int b=(a<10)?a:0;
        System.out.println(b);
    }
}
