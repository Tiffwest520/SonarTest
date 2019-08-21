package Practice;

import Review1.lambdaexp;

public class lambdareview {

    public static void main(String[] args) {

        review  math = () ->
                System.out.println("study stats");


    }


    interface review {
        void study();
    }
}
