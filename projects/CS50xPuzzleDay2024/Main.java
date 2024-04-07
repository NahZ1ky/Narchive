import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        exhaustiveSearch();
    }

    public static void initLayout(String[][] layout) {
        // Initialize the rooms
        layout[1][0] = "b";
        layout[2][0] = "B";
        layout[3][0] = "L";
        layout[4][0] = "K";

        // Initialize the items
        layout[0][1] = "W";
        layout[0][2] = "H";
        layout[0][3] = "C";
        layout[0][4] = "L";
    }

    // There must be a blue lamp in the bedroom.
    public static boolean condition1(String[][] layout){
        if (!layout[1][4].equals("B")){
            return false;
        }
        return true;
    }

    // Each of the two cool colors (blue and green) must not appear on the same side of the house as the other.
    public static boolean condition2(String[][] layout){
        int bluesOnLeft = 0;
        int greensOnLeft = 0;
        int bluesOnRight = 0;
        int greensOnRight = 0;

        // left rooms: bath room (b) and living room (L)
        // right rooms: bedroom (B) and kitchen (K)

        for (int room = 1; room < 5; room++) {
            String roomName = layout[room][0];
            for (int item = 1; item < 5; item++) {
                String obj = layout[room][item];

                if (obj == null) {
                    continue;
                }
                if (!(obj.equals("B") || obj.equals("G"))) {
                    continue;
                }
                if (roomName.equals("b") || roomName.equals("L")) {
                    if (obj.equals("B")) {
                        bluesOnLeft++;
                    } else {
                        greensOnLeft++;
                    }
                }
                if (roomName.equals("B") || roomName.equals("K")) {
                    if (obj.equals("B")) {
                        bluesOnRight++;
                    } else {
                        greensOnRight++;
                    }
                }
            }
        }

        if (bluesOnLeft > 0 && greensOnLeft > 0) {
            return false;
        }

        if (bluesOnRight > 0 && greensOnRight > 0) {
            return false;
        }

        return true;
    }

    // public static String style(String object, String color) {
    //     if (object.equals("H")) {
    //         if (color.equals("R")) {
    //             return "U";
    //         } else {
    //             return "M";
    //         }
    //     }
    // }

    // There must not be any modern objects downstairs.
    public static boolean condition3(String[][] layout){
        if ((layout[3][2] != null && layout[3][2].equals("R")) ||
            (layout[4][2] != null && layout[4][2].equals("R")) ||
            (layout[3][3] != null && layout[3][3].equals("G")) ||
            (layout[4][3] != null && layout[4][3].equals("G")) ||
            (layout[3][4] != null && layout[3][4].equals("B")) ||
            (layout[4][4] != null && layout[4][4].equals("B"))){
            return false;
        }
        return true;
    }

    // The bathroom must contain only one color.
    public static boolean condition4(String[][] layout){
        for (int i = 1; i < 5; i++){
            int count = 0;
            if (layout[1][i].equals("Y")){
                count++;
            }
            if (layout[1][i].equals("R")){
                count++;
            }
            if (layout[1][i].equals("G")){
                count++;
            }
            if (layout[1][i].equals("B")){
                count++;
            }
            if (count > 1){
                return false;
            }
        }
        return true;
    }

    // There must not be any empty slots upstairs.
    public static boolean condition5(String[][] layout){
        for (int i = 1; i < 5; i++){
            if (layout[1][i] == null){
                return false;
            }
            if (layout[2][i] == null){
                return false;
            }
        }
        return true;
    }

    // Each room must contain a curio of a different color.
    public static boolean condition6(String[][] layout){
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                if (layout[i][3] != null && layout[j][3] != null && layout[i][3].equals(layout[j][3]) && i != j){
                    return false;
                }
            }
        }
        return true;
    }

    // The house must contain only one retro object.
    public static boolean condition7(String[][] layout){
        int countRetro = 0;
        for (int i = 1; i < 5; i++){
            if (layout[i][1] == null || layout[i][2] == null ||
                layout[i][3] == null || layout[i][4] == null) {
                continue;
            } else {
                // check hangings
                if (layout[i][2] != null && layout[i][2].equals("B")){
                    countRetro++;
                }
                // check curios
                if (layout[i][3] != null && layout[i][3].equals("Y")){
                    countRetro++;
                }
                // check lamps
                if (layout[i][4] != null && layout[i][4].equals("R")){
                    countRetro++;
                }
            }
        }
        return countRetro == 1;
    }

    // There are more red objects on the left side of the house than on the right side.
    public static boolean condition8(String[][] layout){
        int countRight = 0;
        int countLeft = 0;
        for (int i = 2; i < 5; i++){
            if (layout[2][i] != null && layout[2][i].equals("R")){
                countRight++;
            }
            if (layout[4][i] != null && layout[4][i].equals("R")){
                countRight++;
            }
            if (layout[1][i] != null && layout[1][i].equals("R")){
                countLeft++;
            }
            if (layout[3][i] != null && layout[3][i].equals("R")){
                countLeft++;
            }
        }
        if (countLeft <= countRight){
            return false;
        }
        return true;
    }

    // Each room in the house must be painted a different wall color.
    public static boolean condition9(String[][] layout){
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                if (layout[i][1] != null &&
                    layout[j][1] != null &&
                    layout[i][1].equals(layout[j][1]) &&
                    i != j){
                    return false;
                }
            }
        }
        return true;
    }

    // In the upstairs of the house, the wall color must match the color of at least one of the objects in the room. In the downstairs, the wall color must not match the color of any of the objects in the room.
    public static boolean condition10(String[][] layout){
        int countBathroom = 0;
        int countBedroom = 0;
        int countLivingRoom = 0;
        int countKitchen = 0;
        for (int i = 2; i < 5; i++){
            if (layout[1][i] != null && layout[1][i].equals(layout[1][1])){
                countBathroom++;
            }
            if (layout[2][i] != null && layout[2][i].equals(layout[2][1])){
                countBedroom++;
            }
            if (layout[3][i] != null && layout[3][i].equals(layout[3][1])){
                countLivingRoom++;
            }
            if (layout[4][i] != null && layout[4][i].equals(layout[4][1])){
                countKitchen++;
            }
        }
        if (countBathroom == 0 || countBedroom == 0 ||
            countLivingRoom > 0 || countKitchen > 0){
            return false;
        }
        return true;
    }

    // The left side of the house must contain one more object than the right side of the house.
    public static boolean condition11(String[][] layout){
        int countRight = 0;
        int countLeft = 0;
        for (int i = 1; i < 5; i++){
            if (layout[2][i] != null){
                countRight++;
            }
            if (layout[4][i] != null){
                countRight++;
            }
            if (layout[1][i] != null){
                countLeft++;
            }
            if (layout[3][i] != null){
                countLeft++;
            }
        }

        return countLeft == countRight + 1;
    }

    // Exactly one type of object (same category, color, and style) must appear in multiple rooms. Every other object type must appear in at most one room.
    public static boolean condition12(String[][] layout){
        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 1; i < 5; i++){
            for (int j = 2; j < 5; j++){
                String item_color = layout[i][j];
		if (item_color == null) continue;
                String key = layout[0][j] + item_color;
                if (count.containsKey(key)){
                    count.put(key, count.get(key) + 1);
                } else {
                    count.put(key, 1);
                }
            }
        }

        int count_multiple = 0;
        for (String key : count.keySet()){
            if (count.get(key) > 1){
                count_multiple++;
            }
        }

	/*
	System.out.println(count_multiple);
        for (String key : count.keySet()){
		System.out.println(key + ": " + count.get(key));
	}
	printLayout(layout);
	*/

        return count_multiple == 1;
    }

    // There are more antique objects downstairs than upstairs.
    public static boolean condition13(String[][] layout){
        int countUpstairs = 0;
        int countDownstairs = 0;
        for (int i = 1; i < 5; i++){
            if (i < 3){ // upstairs
                if (layout[i][2] != null && layout[i][2].equals("G")){
                    countUpstairs++;
                }
                if (layout[i][3] != null && layout[i][3].equals("B")){
                    countUpstairs++;
                }
                if (layout[i][4] != null && layout[i][4].equals("Y")){
                    countUpstairs++;
                }
            } else {    // downstairs
                if (layout[i][2] != null && layout[i][2].equals("G")){
                    countDownstairs++;
                }
                if (layout[i][3] != null && layout[i][3].equals("B")){
                    countDownstairs++;
                }
                if (layout[i][4] != null && layout[i][4].equals("Y")){
                    countDownstairs++;
                }
            }
        }
        return countDownstairs > countUpstairs;
    }

    // There must be more unusual objects than modern objects in the house.
    public static boolean condition14(String[][] layout){
        int countUnusual = 0;
        int countModern = 0;
        for (int i = 1; i < 5; i++){
            // count unusual objects
            if (layout[i][2] != null && layout[i][2].equals("Y")){
                countUnusual++;
            }
            if (layout[i][3] != null && layout[i][3].equals("R")){
                countUnusual++;
            }
            if (layout[i][4] != null && layout[i][4].equals("G")){
                countUnusual++;
            }
            // count modern objects
            if (layout[i][2] != null && layout[i][2].equals("R")){
                countModern++;
            }
            if (layout[i][3] != null && layout[i][3].equals("G")){
                countModern++;
            }
            if (layout[i][4] != null && layout[i][4].equals("B")){
                countModern++;
            }
        }
        return countUnusual > countModern;
    }


    public static void exhaustiveSearch() {
        int count = 0;
        final String[] ROOM_COLOR_COMB = new String[] {
            "RGBY",
            "RGYB",
            "RBGY",
            "RBYG",
            "RYGB",
            "RYBG",
            "GRBY",
            "GRYB",
            "GBRY",
            "GBYR",
            "GYRB",
            "GYBR",
            "BRGY",
            "BRYG",
            "BGRY",
            "BGYR",
            "BYRG",
            "BYGR",
            "YRGB",
            "YRBG",
            "YGRB",
            "YGBR",
            "YBRG",
            "YBGR"
        };

        final String[] ALL_COLORS = new String[] {"R", "G", "B", "Y"};
        final String[] ALL_COLORS_PLUS_EMPTY = new String[] {"R", "G", "B", "Y", null};

        String[][] layout = new String[5][5];
	initLayout(layout);

        // rule 1: bedroom must have blue lamp
        layout[2][4] = "B";

        // rule 4: bathroom must have only one color
        for (String color : ALL_COLORS) {
            layout[1][1] = color;
            layout[1][2] = color;
            layout[1][3] = color;
            layout[1][4] = color;

            // rule 9: each room must have different wall color
            for (String wallColors : ROOM_COLOR_COMB) {

                // only consider the case where the bathroom has the
                // same color as the wall
                if (!wallColors.substring(0,1).equals(layout[1][1])) {
                    continue;
                }
                layout[2][1] = wallColors.substring(1,2);
                layout[3][1] = wallColors.substring(2,3);
                layout[4][1] = wallColors.substring(3,4);

                for (int i = 0; i < 5*5*5*5*5*5*5*5; i++) {
                    int[] digits = new int[8];
                    int n = i;
                    for (int j = 0; j < 8; j++) {
                        digits[j] = n % 5;
                        n /= 5;
                    }

                    layout[2][2] = ALL_COLORS_PLUS_EMPTY[digits[0]];
                    layout[2][3] = ALL_COLORS_PLUS_EMPTY[digits[1]];
                    layout[3][2] = ALL_COLORS_PLUS_EMPTY[digits[2]];
                    layout[3][3] = ALL_COLORS_PLUS_EMPTY[digits[3]];
                    layout[3][4] = ALL_COLORS_PLUS_EMPTY[digits[4]];
                    layout[4][2] = ALL_COLORS_PLUS_EMPTY[digits[5]];
                    layout[4][3] = ALL_COLORS_PLUS_EMPTY[digits[6]];
                    layout[4][4] = ALL_COLORS_PLUS_EMPTY[digits[7]];

                    if (count++ % 10000 == 0) {
                        // System.out.println(count);
                        // printLayout(layout);
                    }

                    if (testLayout(layout)) {
                        printLayout(layout);
                    }
                }
                System.out.println("count at " + wallColors + " is " + count);
            }
        }
    }

    public static boolean testLayout(String[][] layout) {
        if (!condition5(layout))
            return false;
        if (!condition12(layout))
            return false;
        if (!condition6(layout))
            return false;
        if (!condition8(layout))
            return false;
        if (!condition2(layout))
            return false;
        if (!condition10(layout))
            return false;
        if (!condition11(layout))
            return false;
        if (!condition14(layout))
            return false;
        if (!condition7(layout))
            return false;
        if (!condition13(layout))
            return false;

        if (!condition3(layout))
            return false;
        return true;
    }

    public static void printLayout(String[][] layout) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (layout[i][j] == null) {
                    System.out.print("  ");
                } else {
                    System.out.print(layout[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}