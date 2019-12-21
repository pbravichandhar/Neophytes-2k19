class CommandLine{
    public static void main(String args[]){
        if(args.length>0){
            for(String var:args){
                System.out.println(var);
            }
        }
        else
        System.out.println("no args");
    }
}