//command line argument program
class Command {
    public static void main(String[] a) {
        if (a.length > 0) {
            System.out.println("The command line" + " arguments are:");
            for (String val : a)
                System.out.println(val);
        } else
            System.out.println("No command line " + "arguments found.");
    }
}