package projects.CS50xPuzzleDay2024;

public class roomDecor {
    public static void main(String[] args) {
        String[][] layout = new String[5][5];

        // Initialize the rooms
        layout[1][0] = "Bathroom (TL):";
        layout[2][0] = "Bedroom (TR):";
        layout[3][0] = "Living Room (BL):";
        layout[4][0] = "Kitchen (BR):";

        // Initialize the items
        layout[0][1] = "Wall";
        layout[0][2] = "Hang";
        layout[0][3] = "Curio";
        layout[0][4] = "Lamp";
    }
    // There must be a blue lamp in the bedroom.
    public boolean condition1(String[][] layout){
        if (!layout[1][4].equals("B")){
            return false;
        }
        System.out.println("Condition 1 passed");
        return true;

    }

    // Each of the two cool colors (blue and green) must not appear on the same side of the house as the other.
    public boolean condition2(String[][] layout){
        for (int i = 1; i < 5; i++){
            if (layout[1][i].equals("B") || layout[4][i].equals("B")){
                for (int j = 1; j < 5; j++){
                    if (layout[1][j].equals("G") || layout[4][j].equals("G")){
                        return false;
                    }
                }
            }
        }
        for (int i = 1; i < 5; i++){
            if (layout[2][i].equals("B") || layout[3][i].equals("B")){
                for (int j = 1; j < 5; j++){
                    if (layout[2][j].equals("G") || layout[3][j].equals("G")){
                        return false;
                    }
                }
            }
        }
        System.out.println("Condition 2 passed");
        return true;
    }

    // There must not be any modern objects downstairs.
    public boolean condition3(String[][] layout){
        // check walls
        if (layout[3][1].equals("Y") || layout[4][1].equals("Y")
            || layout[3][2].equals("R") || layout[4][2].equals("R")
            || layout[3][3].equals("G") || layout[4][3].equals("G")
            || layout[3][4].equals("B") || layout[4][4].equals("B")){
            return false;
        }
        return true;
    }

    // The bathroom must contain only one color.
    public boolean condition4(String[][] layout){
        for (int i = 1; i < 5; i++){
            int count = 0;
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
        System.out.println("Condition 4 passed");
        return true;
    }

    // There must not be any empty slots upstairs.
    public boolean condition5(String[][] layout){
        for (int i = 1; i < 5; i++){
            if (layout[1][i] == null){
                return false;
            }
            if (layout[4][i] == null){
                return false;
            }
        }
        System.out.println("Condition 5 passed");
        return true;
    }

    // Each room must contain a curio of a different color.
    public boolean condition6(String[][] layout){
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                if (layout[i][3].equals(layout[j][3])){
                    return false;
                }
            }
        }
        System.out.println("Condition 6 passed");
        return true;
    }

    // The house must contain only one retro object.
    public boolean condition7(String[][] layout){
        int count = 0;
        for (int i = 1; i < 5; i++){
            // check walls
            if (layout[i][1].equals("G")){
                count++;
            }
            // check hangings
            if (layout[i][2].equals("B")){
                count++;
            }
            // check curios
            if (layout[i][3].equals("Y")){
                count++;
            }
            // check lamps
            if (layout[i][4].equals("R")){
                count++;
            }
        }
        if (count > 1){
            return false;
        }
        System.out.println("Condition 7 passed");
        return true;
    }

    // There are more red objects on the left side of the house than on the right side.
    public boolean condition8(String[][] layout){
        int countRight = 0;
        int countLeft = 0;
        for (int i = 1; i < 5; i++){
            if (layout[2][i].equals("R")){
                countRight++;
            }
            if (layout[4][i].equals("R")){
                countRight++;
            }
            if (layout[1][i].equals("R")){
                countLeft++;
            }
            if (layout[3][i].equals("R")){
                countLeft++;
            }
        }
        if (countLeft <= countRight){
            return false;
        }
        System.out.println("Condition 8 passed");
        return true;
    }

    // Each room in the house must be painted a different wall color.
    public boolean condition9(String[][] layout){
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                if (layout[i][1].equals(layout[j][1])){
                    return false;
                }
            }
        }
        System.out.println("Condition 9 passed");
        return true;
    }

    // In the upstairs of the house, the wall color must match the color of at least one of the objects in the room. In the downstairs, the wall color must not match the color of any of the objects in the room.
    public boolean condition10(String[][] layout){
        int countBathroom = 0;
        int countBedroom = 0;
        int countLivingRoom = 0;
        int countKitchen = 0;
        for (int i = 1; i < 5; i++){
            if (layout[1][i].equals(layout[1][1])){
                countBathroom++;
            }
            if (layout[2][i].equals(layout[2][1])){
                countBedroom++;
            }
            if (layout[3][i].equals(layout[3][1])){
                countLivingRoom++;
            }
            if (layout[4][i].equals(layout[4][1])){
                countKitchen++;
            }
        }
        if (countBathroom == 0 || countBedroom == 0 || countLivingRoom > 0 || countKitchen > 0){
            return false;
        }
        System.out.println("Condition 10 passed");
        return true;
    }

    // The left side of the house must contain one more object than the right side of the house.
    public boolean condition11(String[][] layout){
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
        if (countLeft != countRight + 1){
            return false;
        }
        System.out.println("Condition 11 passed");
        return true;
    }

    // Exactly one type of object (same category, color, and style) must appear in multiple rooms. Every other object type must appear in at most one room.

    // There are more antique objects downstairs than upstairs.
    public boolean condition13(String[][] layout){
        int countUpstairs = 0;
        int countDownstairs = 0;
        for (int i = 0; i < 4; i++){
            if (i < 3){ // upstairs
                if (layout[i][1].equals("R")){
                    countUpstairs++;
                }
                if (layout[i][2].equals("G")){
                    countUpstairs++;
                }
                if (layout[i][3].equals("B")){
                    countUpstairs++;
                }
                if (layout[i][4].equals("Y")){
                    countUpstairs++;
                }
            } else {    // downstairs
                if (layout[i][1].equals("R")){
                    countDownstairs++;
                }
                if (layout[i][2].equals("G")){
                    countDownstairs++;
                }
                if (layout[i][3].equals("B")){
                    countDownstairs++;
                }
                if (layout[i][4].equals("Y")){
                    countDownstairs++;
                }
            }
        }
        if (countDownstairs <= countUpstairs){
            return false;
        }
        System.out.println("Condition 13 passed");
        return true;
    }

    // There must be more unusual objects than modern objects in the house.
    public boolean condition14(String[][] layout){
        int countUnusual = 0;
        int countModern = 0;
        for (int i = 1; i < 5; i++){
            // count unusual objects
            if (layout[i][1].equals("R")){
                countUnusual++;
            }
            if (layout[i][2].equals("G")){
                countUnusual++;
            }
            if (layout[i][3].equals("B")){
                countUnusual++;
            }
            if (layout[i][4].equals("Y")){
                countUnusual++;
            }
            // count modern objects
            if (layout[i][1].equals("Y")){
                countModern++;
            }
            if (layout[i][2].equals("R")){
                countModern++;
            }
            if (layout[i][3].equals("G")){
                countModern++;
            }
            if (layout[i][4].equals("B")){
                countModern++;
            }
        }
        if (countUnusual <= countModern){
            return false;
        }
        System.out.println("Condition 14 passed");
        return true;
    }






}
