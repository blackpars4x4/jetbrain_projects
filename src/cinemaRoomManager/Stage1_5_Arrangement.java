package cinemaRoomManager;

public class Stage1_5_Arrangement {

    public static void main(String[] args) {
        // Write your code here
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 1; i < 8; i++){
            StringBuilder seat = new StringBuilder();
            System.out.print(i);
            for (int j = 1; j < 9; j++){
                seat.append(" S");
            }
            System.out.println(seat);
        }
    }
}
