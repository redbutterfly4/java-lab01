public class MultTable {
    public static void main(String[] args) {
        System.out.println("  y | 1y | 2y | 3y | 4y | 5y ");
        System.out.println("----|----|----|----|----|----");
        for (int y = 1; y <= 10; y++) {
            System.out.printf(" %2d | %2d | %2d | %2d | %2d | %2d \n", y, y, y * 2, y * 3, y * 4, y * 5);
        }
    }
}
