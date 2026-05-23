public class rowAndColumn {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                System.out.print(" " + i + j);
            }
            System.out.println();
        }
    }

}
