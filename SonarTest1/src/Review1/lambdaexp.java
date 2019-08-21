package Review1;

public class lambdaexp {

    public static void main(String[] args) {


        Game footballLambda = () ->
                System.out.println("playing football");


        Series superbowl = (type) ->
                System.out.println( type + " season");
    }

     interface Game{
        void play();
     }

    interface Series{
        void play(String type);
    }
}
