/* Demostrate a block of code */
class BlockTest{
    public static void main(String[] args) {
        int x,y;
        y=20;

        //the target of this loop is block
        for(x=0; x<10; x++){
            System.out.println("This is x: "+x);
            System.out.println("This is Y: "+y);
            y=y-2;

        }
    }
}
