public class Break {
    public static void main(String[] args){

        // break statement used in loop
        for(int i=0; i<=5; i++){
            System.out.println(i);
            if(i==3){
                break;
            }
        }

        // break statement used in switch case
        int i=1;
        switch(i){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
        }

    }
}
