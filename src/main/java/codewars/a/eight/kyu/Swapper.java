package codewars.a.eight.kyu;

/**
 * Swap Values (8kyu)
 *
 * I would like to be able to pass an array
 * with two elements to my swapValues function to swap the values.
 *
 * However it appears that the values aren't changing.
 * Can you figure out what's wrong here?*/

class Swapper {
    private Object[] arguments;

    public Swapper(final Object[] args) {
        this.arguments = args;
    }
  
    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        arguments[0] = args[1];
        arguments[1] = temp;
    }
}
