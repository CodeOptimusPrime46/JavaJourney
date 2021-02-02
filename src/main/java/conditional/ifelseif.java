package conditional;

public class ifelseif {

    public static void main(String[] args) {

        if (true){
            System.out.println("if condition was true");
        }

        if(false){

        }else {

            System.out.println("else was applied");
        }
        if(false){

        }
        else if(true){

            System.out.println("else if was applied");

        }

        int a = 50;
        int b = 60;
        int maxofAB = 0 ;
        maxofAB = a > b ? a : b ;

        System.out.println("Greater is " + maxofAB);


    }
}
