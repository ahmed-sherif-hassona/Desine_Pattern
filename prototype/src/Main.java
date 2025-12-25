public class Main {

    public static void main(String[] args) {

        long startTime, endTime;


        startTime = System.currentTimeMillis();
        Board originalBoard = new Board();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to create board: "
                + (endTime - startTime) + " ms");

        originalBoard.print();

        System.out.println("----------------------------");


        startTime = System.currentTimeMillis();
        Board clonedBoard = (Board) originalBoard.clone();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to clone board: "
                + (endTime - startTime) + " ms");

        clonedBoard.print();
    }
}
