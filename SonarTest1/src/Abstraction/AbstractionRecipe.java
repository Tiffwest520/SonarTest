package Abstraction;

public abstract class AbstractionRecipe {

    public void execute(){
        getReady();
        doTheDish();
        cleanup();
    }
    abstract void cleanup();
    abstract void getReady();
    abstract void doTheDish();

}

class RecipewMicrowave extends AbstractionRecipe {
    @Override
    void cleanup() {
        System.out.println("clean up workspace");
    }

    @Override
    void getReady() {
        System.out.println("get ingredients");
    }

    @Override
    void doTheDish() {
        System.out.println("put in microwave");

    }
}

class RecipeRunner {
    public static void main(String[] args) {
        RecipewMicrowave recipewMicrowave = new RecipewMicrowave();
        recipewMicrowave.execute();
    }
}