package Practice;

public class singleReview {

    /*
    *  make pvt constructor
    * make instance and get instance
    * */

    private singleReview(){}

    private static final singleReview instance = new singleReview();

    public singleReview getInstance() {
        return instance;
    }

}
