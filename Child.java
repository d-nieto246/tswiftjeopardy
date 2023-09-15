import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import java.util.Stack;

public class Child extends finalProject {
    public static void check_points(int points, Label change_1, Label change_2, Stack lives, HBox chart) {
        if (points >= 4000) {
            change_1.setText("Congratulations! You've reached at least 4000 points and you're now a Swiftie! Thanks for playing!");
            change_2.setText("");
            chart.setDisable(true);
        }
        else if (lives.size() == 0) {
            change_1.setText("Unfortunately, you have no lives left so this concludes the game. Thanks for playing!");
            change_2.setText("");
            chart.setDisable(true);
        }
    }

    public static void check_answer1_1(String input, Label change, TextField box, Button submit) {
        if (input.equals("brain")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
        else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer1_2(String input, Label change, TextField box, Button submit) {
        if (input.equals("fearless")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer1_3(String input, Label change, TextField box, Button submit) {
        if (input.equals("praying")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer1_4(String input, Label change, TextField box, Button submit) {
        if (input.equals("indulged")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer1_5(String input, Label change, TextField box, Button submit) {
        if (input.equals("ferociously")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer2_1(String input, Label change, TextField box, Button submit) {
        if (input.equals("Harry Styles")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer2_2(String input, Label change, TextField box, Button submit) {
        if (input.equals("Joe Alwyn")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer2_3(String input, Label change, TextField box, Button submit) {
        if (input.equals("Taylor Lautner")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer2_4(String input, Label change, TextField box, Button submit) {
        if (input.equals("Jake Gyllenhaal")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer2_5(String input, Label change, TextField box, Button submit) {
        if (input.equals("John Mayer")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer3_1(String input, Label change, TextField box, Button submit) {
        if (input.equals("Speak Now")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer3_2(String input, Label change, TextField box, Button submit) {
        if (input.equals("6")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer3_3(String input, Label change, TextField box, Button submit) {
        if (input.equals("Seattle")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer3_4(String input, Label change, TextField box, Button submit) {
        if (input.equals("False")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer3_5(String input, Label change, TextField box, Button submit) {
        if (input.equals("2.4 million")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer4_1(String input, Label change, TextField box, Button submit) {
        if (input.equals("Country")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer4_2(String input, Label change, TextField box, Button submit) {
        if (input.equals("folklore")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer4_3(String input, Label change, TextField box, Button submit) {
        if (input.equals("Lover")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer4_4(String input, Label change, TextField box, Button submit) {
        if (input.equals("Karma")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer4_5(String input, Label change, TextField box, Button submit) {
        if (input.equals("15")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer5_1(String input, Label change, TextField box, Button submit) {
        if (input.equals("13")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer5_2(String input, Label change, TextField box, Button submit) {
        if (input.equals("Kanye West")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer5_3(String input, Label change, TextField box, Button submit) {
        if (input.equals("Alison")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer5_4(String input, Label change, TextField box, Button submit) {
        if (input.equals("Abercrombie")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
    public static void check_answer5_5(String input, Label change, TextField box, Button submit) {
        if (input.equals("Valentine's Day")) {
            change.setText("Your answer is correct! Click the button below to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        } else {
            change.setText("Your answer is incorrect. One life lost! Click the button to return to the game.");
            box.setDisable(true);
            submit.setVisible(false);
        }
    }
}