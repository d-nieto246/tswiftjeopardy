// default imports
import javafx.application.Application;
import javafx.stage.Stage;

// other imports
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

// REQUIREMENTS:
// 1. Follow good coding practices and make sure the code is efficient.
// 2. Must be a JavaFX Application (DONE)
// 3. Must have:
// - one BorderPane (DONE)
// - one HBox and one VBox INSIDE the BorderPane (DONE)
// 4. Demonstrate inheritance to a child class from a parent class (refer to Module 4)
// 5. Represent at least TWO DIFFERENT implementations fo the following: Lists, LinkedList, Set, Map, Stack, Queue
// USED: Lists, Stacks

public class finalProject extends Application {
    public static int totalPoints = 0;
    public static List<Integer> points = new ArrayList<Integer>();
    Stack<String> lives = new Stack<String>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // WELCOME PAGE LABELS AND BUTTONS
        Label startup1 = new Label("WELCOME!");
        Label startup2 = new Label("Welcome to my Jeopardy Game!");
        Label startup3 = new Label("The making of this was inspired by my deep interest in listening to Taylor Swift.");
        Label startup4 = new Label("Do you have what it takes to win the challenge and be crowned the title of a Swiftie?");
        Label startup5 = new Label("Click the Continue button below to read the rules of the game.");
        Button cont = new Button("Continue");

        // RULES PAGE LABELS AND BUTTONS
        Label rules1 = new Label("RULES:");
        Label rules2 = new Label("1. This game is meant for a single player. In order to win, you must answer questions");
        Label rules2_5 = new Label("correctly and earn 4000 points. A list will pop up at the bottom to keep track of your points.");
        Label rules3 = new Label("2. There are 5 categories in this game, each with increasing point values and difficulty.");
        Label rules4 = new Label("3. You will be given 4 lives. Each incorrect attempt is the loss of a life.");
        Label rules4_5 = new Label("4. When you have no lives left, the game is over!");
        Label rules5 = new Label("Click the Play button to start the game!");
        Button play = new Button("Play!");

        // PUSH THE LIVES STACK FOUR TIMES TO SET THE MAX AMOUNT OF LIVES
        lives.push("•");
        lives.push("•");
        lives.push("•");
        lives.push("•");

        // SET THE VBOXES UP TO DISPLAY THE PAGES
        VBox vbox1 = new VBox(6, startup1, startup2, startup3, startup4, startup5, cont);
        VBox vbox2 = new VBox(6, rules1, rules2, rules2_5, rules3, rules4, rules4_5, rules5, play);
        vbox2.setVisible(false);

        BorderPane myBorderPane = new BorderPane();
        myBorderPane.setCenter(vbox1);
        vbox1.setAlignment(Pos.CENTER);

        // The class below is a ButtonClickHandler class where the welcome
        // page disappears and the rules page displays.
        class Rules implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                vbox1.setVisible(false);
                vbox2.setVisible(true);
                myBorderPane.setCenter(vbox2);
                vbox2.setAlignment(Pos.CENTER);

            }
        }
        cont.setOnAction(new Rules());

        // ALL BUTTONS
        Button one100 = new Button("100");
        Button two100 = new Button("100");
        Button three100 = new Button("100");
        Button four100 = new Button("100");
        Button five100 = new Button("100");
        Button one200 = new Button("200");
        Button two200 = new Button("200");
        Button three200 = new Button("200");
        Button four200 = new Button("200");
        Button five200 = new Button("200");
        Button one300 = new Button("300");
        Button two300 = new Button("300");
        Button three300 = new Button("300");
        Button four300 = new Button("300");
        Button five300 = new Button("300");
        Button one400 = new Button("400");
        Button two400 = new Button("400");
        Button three400 = new Button("400");
        Button four400 = new Button("400");
        Button five400 = new Button("400");
        Button one500 = new Button("500");
        Button two500 = new Button("500");
        Button three500 = new Button("500");
        Button four500 = new Button("500");
        Button five500 = new Button("500");

        // ALL LABELS FOR THE JEOPARDY GAME
        Label cat1 = new Label("Guess The Lyric");
        Label cat2 = new Label("Love Life");
        Label cat3 = new Label("The Eras Tour");
        Label cat4 = new Label("Albums");
        Label cat5 = new Label("Personal");

        // SET THE WIDTHS TO FILL THE ENTIRE ROW
        one100.setPrefWidth(120);
        two100.setPrefWidth(120);
        three100.setPrefWidth(120);
        four100.setPrefWidth(120);
        five100.setPrefWidth(120);

        one200.setPrefWidth(120);
        two200.setPrefWidth(120);
        three200.setPrefWidth(120);
        four200.setPrefWidth(120);
        five200.setPrefWidth(120);

        one300.setPrefWidth(120);
        two300.setPrefWidth(120);
        three300.setPrefWidth(120);
        four300.setPrefWidth(120);
        five300.setPrefWidth(120);

        one400.setPrefWidth(120);
        two400.setPrefWidth(120);
        three400.setPrefWidth(120);
        four400.setPrefWidth(120);
        five400.setPrefWidth(120);

        one500.setPrefWidth(120);
        two500.setPrefWidth(120);
        three500.setPrefWidth(120);
        four500.setPrefWidth(120);
        five500.setPrefWidth(120);

        // VBOXES SET INTO COLUMNS TO DISPLAY THE CATEGORY AND BUTTONS
        VBox col1 = new VBox(cat1, one100, one200, one300, one400, one500);
        VBox col2 = new VBox(cat2, two100, two200, two300, two400, two500);
        VBox col3 = new VBox(cat3, three100, three200, three300, three400, three500);
        VBox col4 = new VBox(cat4, four100, four200, four300, four400, four500);
        VBox col5 = new VBox(cat5, five100, five200, five300, five400, five500);

        // THE FIVE COLUMNS ARE SET INTO AN HBOX TO MAKE IT INTO A CHART
        HBox chart = new HBox(col1, col2, col3, col4, col5);

        // TWO LABELS ARE PUT TOGETHER; THE FIRST ONE DISPLAYING THE LIST
        // OF POINTS COLLECTED, AND THE SECOND ONE DISPLAYING AN INTEGER
        // DISPLAYING THE TOTAL AMOUNT OF POINTS COLLECTED
        Label pointStatus1 = new Label("Your points: " + points);
        Label pointStatus2 = new Label(" = " + totalPoints);
        HBox pointStatus = new HBox(pointStatus1, pointStatus2);

        // THE STACK IS ADDED INTO A LABEL AND IS DISPLAYED BELOW
        // THE POINTSTATUS HBOX
        Label livesLeft = new Label("Lives left: " + lives);
        HBox livesStatus = new HBox(livesLeft);
        VBox whole = new VBox(chart, pointStatus, livesStatus);

        // This second 'ButtonClickHandler' class makes the rules page disappear
        // and displays the game page.
        class Play implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                vbox1.setVisible(false);
                pointStatus.setAlignment(Pos.CENTER);
                livesStatus.setAlignment(Pos.CENTER);
                myBorderPane.setCenter(whole);
                myBorderPane.setAlignment(whole, Pos.BOTTOM_CENTER);
            }
        }

        play.setOnAction(new Play());
        /*
        When a user clicks a button on the chart, four labels will display the button's description,
        question, and a warning label that changes to tell the user if they're right or wrong on a question.
        The user inputs their answer in a TextField, submits it through a button, and depending on the answer,
        the status of their lives and points collected is updated. For each button, there are three
        'ButtonClickHandler' classes where the first makes the chart disappear to display the question, the
        second runs the input through a method in the inherited class to check the answer, and the third to
        update the user's status, to disable the button from the chart, and return to the game.

        Lines 1491 to 1494 is responsible for setting up the Scene and displaying everything.
         */
        //-----------------------------------------------------------------------------------------------------------
        Label desc_1_100 = new Label("GUESS THE LYRIC: 100 points");
        Label question_1_100 = new Label("Fill in the missing lyric...");
        Label question_1_100_p = new Label("'I stay out too late... got nothing in my _____'");
        Label warning = new Label("WARNING: Case sensitive.");
        TextField prompt_1_100 = new TextField();
        Button submit_1_100 = new Button("Submit");
        Button return_1_100 = new Button("Return");

        VBox prompt_1_1 = new VBox(desc_1_100, question_1_100, question_1_100_p, warning, prompt_1_100, submit_1_100, return_1_100);
        return_1_100.setVisible(false);
        prompt_1_1.setVisible(false);

        class song_1 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_1_1);
                prompt_1_1.setVisible(true);
            }
        }
        one100.setOnAction(new song_1());

        class song_1_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer1_1(prompt_1_100.getText(), warning, prompt_1_100, submit_1_100);
                one100.setDisable(true);
                return_1_100.setVisible(true);
                if (prompt_1_100.getText().equals("brain")) {
                    points.add(100);
                    totalPoints += 100;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_1_100.setOnAction(new song_1_submit());

        class song_1_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                prompt_1_100.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_1_100.setOnAction(new song_1_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_1_200 = new Label("GUESS THE LYRIC: 200 points");
        Label question_1_200 = new Label("Fill in the missing lyric...");
        Label question_1_200_p = new Label("'You take my hand and drag me headfirst, ________'");
        Label warning_1_200 = new Label("WARNING: Case sensitive.");
        TextField input_1_200 = new TextField();
        Button submit_1_200 = new Button("Submit");
        Button return_1_200 = new Button("Return");

        VBox prompt_1_2 = new VBox(desc_1_200, question_1_200, question_1_200_p, warning_1_200, input_1_200, submit_1_200, return_1_200);
        return_1_200.setVisible(false);
        prompt_1_2.setVisible(false);

        class song_2 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_1_2);
                prompt_1_2.setVisible(true);
            }
        }
        one200.setOnAction(new song_2());

        class song_2_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer1_2(input_1_200.getText(), warning_1_200, input_1_200, submit_1_200);
                one200.setDisable(true);
                return_1_200.setVisible(true);
                if (input_1_200.getText().equals("fearless")) {
                    points.add(200);
                    totalPoints += 200;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_1_200.setOnAction(new song_2_submit());

        class song_2_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_1_200.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_1_200.setOnAction(new song_2_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_1_300 = new Label("GUESS THE LYRIC: 300 points");
        Label question_1_300 = new Label("Fill in the missing lyric...");
        Label question_1_300_p = new Label("'This is me _______ that, this was the very first page'");
        Label warning1_300 = new Label("WARNING: Case sensitive.");
        TextField input_1_300 = new TextField();
        Button submit_1_300 = new Button("Submit");
        Button return_1_300 = new Button("Return");

        VBox prompt_1_3 = new VBox(desc_1_300, question_1_300, question_1_300_p, warning1_300, input_1_300, submit_1_300, return_1_300);
        return_1_300.setVisible(false);
        prompt_1_3.setVisible(false);

        class song_3 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_1_3);
                prompt_1_3.setVisible(true);
            }
        }
        one300.setOnAction(new song_3());

        class song_3_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer1_3(input_1_300.getText(), warning1_300, input_1_300, submit_1_300);
                one300.setDisable(true);
                return_1_300.setVisible(true);
                if (input_1_300.getText().equals("praying")) {
                    points.add(300);
                    totalPoints += 300;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_1_300.setOnAction(new song_3_submit());

        class song_3_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_1_300.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_1_300.setOnAction(new song_3_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_1_400 = new Label("GUESS THE LYRIC: 400 points");
        Label question_1_400 = new Label("Fill in the missing lyric...");
        Label question_1_400_p = new Label("'Before you, I'd only dated self-_________ takers'");
        Label warning_1_400 = new Label("WARNING: Case sensitive.");
        TextField input_1_400 = new TextField();
        Button submit_1_400 = new Button("Submit");
        Button return_1_400 = new Button("Return");

        VBox prompt_1_4 = new VBox(desc_1_400, question_1_400, question_1_400_p, warning_1_400, input_1_400, submit_1_400, return_1_400);
        return_1_400.setVisible(false);
        prompt_1_4.setVisible(false);

        class song_4 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_1_4);
                prompt_1_4.setVisible(true);
            }
        }
        one400.setOnAction(new song_4());

        class song_4_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer1_4(input_1_400.getText(), warning_1_400, input_1_400, submit_1_400);
                one400.setDisable(true);
                return_1_400.setVisible(true);
                if (input_1_400.getText().equals("indulged")) {
                    points.add(400);
                    totalPoints += 400;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_1_400.setOnAction(new song_4_submit());

        class song_4_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_1_400.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_1_400.setOnAction(new song_4_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_1_500 = new Label("GUESS THE LYRIC: 500 points");
        Label question_1_500 = new Label("Fill in the missing lyric...");
        Label question_1_500_p = new Label("'I used to scream ___________, any time I wanted'");
        TextField input_1_500 = new TextField();
        Label warning_1_500 = new Label("WARNING: Case sensitive.");
        Button submit_1_500 = new Button("Submit");
        Button return_1_500 = new Button("Return");

        VBox prompt_1_5 = new VBox(desc_1_500, question_1_500, question_1_500_p, warning_1_500, input_1_500, submit_1_500, return_1_500);
        return_1_500.setVisible(false);
        prompt_1_5.setVisible(false);

        class song_5 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_1_5);
                prompt_1_5.setVisible(true);
            }
        }
        one500.setOnAction(new song_5());

        class song_5_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer1_5(input_1_500.getText(), warning_1_500, input_1_500, submit_1_500);
                one500.setDisable(true);
                return_1_500.setVisible(true);
                if (input_1_500.getText().equals("ferociously")) {
                    points.add(500);
                    totalPoints += 500;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_1_500.setOnAction(new song_5_submit());

        class song_5_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_1_500.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_1_500.setOnAction(new song_5_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_2_100 = new Label("LOVE LIFE: 100 points");
        Label question_2_100_p = new Label("In 2015, this boyfriend dated Swift and their relationship influenced her to produce 'Style' from the album 1989.");
        TextField input_2_100 = new TextField();
        Label warning_2_100 = new Label("WARNING: Case sensitive.");
        Button submit_2_100 = new Button("Submit");
        Button return_2_100 = new Button("Return");

        VBox prompt_2_1 = new VBox(desc_2_100, question_2_100_p, warning_2_100, input_2_100, submit_2_100, return_2_100);
        return_2_100.setVisible(false);
        prompt_2_1.setVisible(false);

        class love_1 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_2_1);
                prompt_2_1.setVisible(true);
            }
        }
        two100.setOnAction(new love_1());

        class love_1_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer2_1(input_2_100.getText(), warning_2_100, input_2_100, submit_2_100);
                two100.setDisable(true);
                return_2_100.setVisible(true);
                if (input_2_100.getText().equals("Harry Styles")) {
                    points.add(100);
                    totalPoints += 100;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_2_100.setOnAction(new love_1_submit());

        class love_1_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_2_100.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_2_100.setOnAction(new love_1_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_2_200 = new Label("LOVE LIFE: 200 points");
        Label question_2_200_p = new Label("This boyfriend is a British actor whom Swift dates for 7 years until their split in 2023.");
        TextField input_2_200 = new TextField();
        Label warning_2_200 = new Label("WARNING: Case sensitive.");
        Button submit_2_200 = new Button("Submit");
        Button return_2_200 = new Button("Return");

        VBox prompt_2_2 = new VBox(desc_2_200, question_2_200_p, warning_2_200, input_2_200, submit_2_200, return_2_200);
        return_2_200.setVisible(false);
        prompt_2_2.setVisible(false);

        class love_2 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_2_2);
                prompt_2_2.setVisible(true);
            }
        }
        two200.setOnAction(new love_2());

        class love_2_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer2_2(input_2_200.getText(), warning_2_200, input_2_200, submit_2_200);
                two200.setDisable(true);
                return_2_200.setVisible(true);
                if (input_2_200.getText().equals("Joe Alwyn")) {
                    points.add(200);
                    totalPoints += 200;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_2_200.setOnAction(new love_2_submit());

        class love_2_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_2_200.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_2_200.setOnAction(new love_2_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_2_300 = new Label("LOVE LIFE: 300 points");
        Label question_2_300_p = new Label("This boyfriend is known for his role in Twilight and his relationship with Swift influenced 'Back to December.'");
        TextField input_2_300 = new TextField();
        Label warning_2_300 = new Label("WARNING: Case sensitive.");
        Button submit_2_300 = new Button("Submit");
        Button return_2_300 = new Button("Return");

        VBox prompt_2_3 = new VBox(desc_2_300, question_2_300_p, warning_2_300, input_2_300, submit_2_300, return_2_300);
        return_2_300.setVisible(false);
        prompt_2_3.setVisible(false);

        class love_3 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_2_3);
                prompt_2_3.setVisible(true);
            }
        }
        two300.setOnAction(new love_3());

        class love_3_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer2_3(input_2_300.getText(), warning_2_300, input_2_300, submit_2_300);
                two300.setDisable(true);
                return_2_300.setVisible(true);
                if (input_2_300.getText().equals("Taylor Lautner")) {
                    points.add(300);
                    totalPoints += 300;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_2_300.setOnAction(new love_3_submit());

        class love_3_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_2_300.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_2_300.setOnAction(new love_3_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_2_400 = new Label("LOVE LIFE: 400 points");
        Label question_2_400_p = new Label("The famous song 'All Too Well' dives into the story of Swift's brief relationship with this boyfriend.");
        TextField input_2_400 = new TextField();
        Label warning_2_400 = new Label("WARNING: Case sensitive.");
        Button submit_2_400 = new Button("Submit");
        Button return_2_400 = new Button("Return");

        VBox prompt_2_4 = new VBox(desc_2_400, question_2_400_p, warning_2_400, input_2_400, submit_2_400, return_2_400);
        return_2_400.setVisible(false);
        prompt_2_4.setVisible(false);

        class love_4 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_2_4);
                prompt_2_4.setVisible(true);
            }
        }
        two400.setOnAction(new love_4());

        class love_4_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer2_4(input_2_400.getText(), warning_2_400, input_2_400, submit_2_400);
                two400.setDisable(true);
                return_2_400.setVisible(true);
                if (input_2_400.getText().equals("Jake Gyllenhaal")) {
                    points.add(400);
                    totalPoints += 400;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_2_400.setOnAction(new love_4_submit());
        class love_4_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_2_400.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_2_400.setOnAction(new love_4_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_2_500 = new Label("LOVE LIFE: 500 points");
        Label question_2_500_p = new Label("This boyfriend received criticism over 'the age gap' and for influencing Swift's longest track on Speak Now.");
        TextField input_2_500 = new TextField();
        Label warning_2_500 = new Label("WARNING: Case sensitive.");
        Button submit_2_500 = new Button("Submit");
        Button return_2_500 = new Button("Return");

        VBox prompt_2_5 = new VBox(desc_2_500, question_2_500_p, warning_2_500, input_2_500, submit_2_500, return_2_500);
        return_2_500.setVisible(false);
        prompt_2_5.setVisible(false);

        class love_5 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_2_5);
                prompt_2_5.setVisible(true);
            }
        }
        two500.setOnAction(new love_5());

        class love_5_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer2_5(input_2_500.getText(), warning_2_500, input_2_500, submit_2_500);
                two500.setDisable(true);
                return_2_500.setVisible(true);
                if (input_2_500.getText().equals("John Mayer")) {
                    points.add(500);
                    totalPoints += 500;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_2_500.setOnAction(new love_5_submit());
        class love_5_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_2_500.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_2_500.setOnAction(new love_5_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_3_100 = new Label("THE ERAS TOUR: 100 points");
        Label question_3_100_p = new Label("In Swift's first Nashville show on the tour, Swift announced 'Taylor's Version' of this album.");
        TextField input_3_100 = new TextField();
        Label warning_3_100 = new Label("WARNING: Case sensitive.");
        Button submit_3_100 = new Button("Submit");
        Button return_3_100 = new Button("Return");

        VBox prompt_3_1 = new VBox(desc_3_100, question_3_100_p, warning_3_100, input_3_100, submit_3_100, return_3_100);
        return_3_100.setVisible(false);
        prompt_3_1.setVisible(false);

        class tour_1 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_3_1);
                prompt_3_1.setVisible(true);
            }
        }
        three100.setOnAction(new tour_1());

        class tour_1_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer3_1(input_3_100.getText(), warning_3_100, input_3_100, submit_3_100);
                three100.setDisable(true);
                return_3_100.setVisible(true);
                if (input_3_100.getText().equals("Speak Now")) {
                    points.add(100);
                    totalPoints += 100;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_3_100.setOnAction(new tour_1_submit());
        class tour_1_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_3_100.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_3_100.setOnAction(new tour_1_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_3_200 = new Label("THE ERAS TOUR: 200 points");
        Label question_3_200_p = new Label("Due to extremely high demand, how many dates did Swift set to perform in Los Angeles (input an integer value)?");
        TextField input_3_200 = new TextField();
        Label warning_3_200 = new Label("WARNING: Case sensitive.");
        Button submit_3_200 = new Button("Submit");
        Button return_3_200 = new Button("Return");

        VBox prompt_3_2 = new VBox(desc_3_200, question_3_200_p, warning_3_200, input_3_200, submit_3_200, return_3_200);
        return_3_200.setVisible(false);
        prompt_3_2.setVisible(false);

        class tour_2 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_3_2);
                prompt_3_2.setVisible(true);
            }
        }
        three200.setOnAction(new tour_2());

        class tour_2_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer3_2(input_3_200.getText(), warning_3_200, input_3_200, submit_3_200);
                three200.setDisable(true);
                return_3_200.setVisible(true);
                if (input_3_200.getText().equals("6")) {
                    points.add(200);
                    totalPoints += 200;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_3_200.setOnAction(new tour_2_submit());
        class tour_2_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_3_200.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_3_200.setOnAction(new tour_2_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_3_300 = new Label("THE ERAS TOUR: 300 points");
        Label question_3_300_p = new Label("While performing 'Shake It Off', Swift and her fans caused seismic activity in this city.");
        TextField input_3_300 = new TextField();
        Label warning_3_300 = new Label("WARNING: Case sensitive.");
        Button submit_3_300 = new Button("Submit");
        Button return_3_300 = new Button("Return");

        VBox prompt_3_3 = new VBox(desc_3_300, question_3_300_p, warning_3_300, input_3_300, submit_3_300, return_3_300);
        return_3_300.setVisible(false);
        prompt_3_3.setVisible(false);

        class tour_3 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_3_3);
                prompt_3_3.setVisible(true);
            }
        }
        three300.setOnAction(new tour_3());

        class tour_3_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer3_3(input_3_300.getText(), warning_3_300, input_3_300, submit_3_300);
                three300.setDisable(true);
                return_3_300.setVisible(true);
                if (input_3_300.getText().equals("Seattle")) {
                    points.add(300);
                    totalPoints += 300;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_3_300.setOnAction(new tour_3_submit());
        class tour_3_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_3_300.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_3_300.setOnAction(new tour_3_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_3_400 = new Label("THE ERAS TOUR: 400 points");
        Label question_3_400_p = new Label("True Or False: Swift is expected to make $800 million in gross revenue from the tour.");
        TextField input_3_400 = new TextField();
        Label warning_3_400 = new Label("WARNING: Case sensitive.");
        Button submit_3_400 = new Button("Submit");
        Button return_3_400 = new Button("Return");

        VBox prompt_3_4 = new VBox(desc_3_400, question_3_400_p, warning_3_400, input_3_400, submit_3_400, return_3_400);
        return_3_400.setVisible(false);
        prompt_3_4.setVisible(false);

        class tour_4 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_3_4);
                prompt_3_4.setVisible(true);
            }
        }
        three400.setOnAction(new tour_4());

        class tour_4_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer3_4(input_3_400.getText(), warning_3_400, input_3_400, submit_3_400);
                three400.setDisable(true);
                return_3_400.setVisible(true);
                if (input_3_400.getText().equals("False")) {
                    points.add(400);
                    totalPoints += 400;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_3_400.setOnAction(new tour_4_submit());
        class tour_4_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_3_400.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_3_400.setOnAction(new tour_4_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_3_500 = new Label("THE ERAS TOUR: 500 points");
        Label question_3_500_p = new Label("Approximately how many tickets were sold on the first day of the pre-sale?");
        TextField input_3_500 = new TextField();
        Label warning_3_500 = new Label("WARNING: Case sensitive.");
        Button submit_3_500 = new Button("Submit");
        Button return_3_500 = new Button("Return");

        VBox prompt_3_5 = new VBox(desc_3_500, question_3_500_p, warning_3_500, input_3_500, submit_3_500, return_3_500);
        return_3_500.setVisible(false);
        prompt_3_5.setVisible(false);

        class tour_5 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_3_5);
                prompt_3_5.setVisible(true);
            }
        }
        three500.setOnAction(new tour_5());

        class tour_5_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer3_5(input_3_500.getText(), warning_3_500, input_3_500, submit_3_500);
                three500.setDisable(true);
                return_3_500.setVisible(true);
                if (input_3_500.getText().equals("2.4 million")) {
                    points.add(500);
                    totalPoints += 500;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_3_500.setOnAction(new tour_5_submit());
        class tour_5_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_3_500.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_3_500.setOnAction(new tour_5_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_4_100 = new Label("ALBUMS (CONCEPTUAL): 100 points");
        Label question_4_100_p = new Label("What is the main genre of Swift's debut (first) album?");
        TextField input_4_100 = new TextField();
        Label warning_4_100 = new Label("WARNING: Case sensitive.");
        Button submit_4_100 = new Button("Submit");
        Button return_4_100 = new Button("Return");

        VBox prompt_4_1 = new VBox(desc_4_100, question_4_100_p, warning_4_100, input_4_100, submit_4_100, return_4_100);
        return_4_100.setVisible(false);
        prompt_4_1.setVisible(false);

        class album_1 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_4_1);
                prompt_4_1.setVisible(true);
            }
        }
        four100.setOnAction(new album_1());

        class album_1_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer4_1(input_4_100.getText(), warning_4_100, input_4_100, submit_4_100);
                four100.setDisable(true);
                return_4_100.setVisible(true);
                if (input_4_100.getText().equals("Country")) {
                    points.add(100);
                    totalPoints += 100;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_4_100.setOnAction(new album_1_submit());
        class album_1_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_4_100.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_4_100.setOnAction(new album_1_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_4_200 = new Label("ALBUMS (CONCEPTUAL): 200 points");
        Label question_4_200_p = new Label("The name of this album analyzes romanticism and is inspired by the legacy of folk songs.");
        TextField input_4_200 = new TextField();
        Label warning_4_200 = new Label("WARNING: Case sensitive.");
        Button submit_4_200 = new Button("Submit");
        Button return_4_200 = new Button("Return");

        VBox prompt_4_2 = new VBox(desc_4_200, question_4_200_p, warning_4_200, input_4_200, submit_4_200, return_4_200);
        return_4_200.setVisible(false);
        prompt_4_2.setVisible(false);

        class album_2 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_4_2);
                prompt_4_2.setVisible(true);
            }
        }
        four200.setOnAction(new album_2());

        class album_2_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer4_2(input_4_200.getText(), warning_4_200, input_4_200, submit_4_200);
                four200.setDisable(true);
                return_4_200.setVisible(true);
                if (input_4_200.getText().equals("folklore")) {
                    points.add(200);
                    totalPoints += 200;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_4_200.setOnAction(new album_2_submit());
        class album_2_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_4_200.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_4_200.setOnAction(new album_2_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_4_300 = new Label("ALBUMS (CONCEPTUAL): 300 points");
        Label question_4_300_p = new Label("This album reflects Swift's mental health recovery and promotes positive, upbeat, and passionate music.");
        TextField input_4_300 = new TextField();
        Label warning_4_300 = new Label("WARNING: Case sensitive.");
        Button submit_4_300 = new Button("Submit");
        Button return_4_300 = new Button("Return");

        VBox prompt_4_3 = new VBox(desc_4_300, question_4_300_p, warning_4_300, input_4_300, submit_4_300, return_4_300);
        return_4_300.setVisible(false);
        prompt_4_3.setVisible(false);

        class album_3 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_4_3);
                prompt_4_3.setVisible(true);
            }
        }
        four300.setOnAction(new album_3());

        class album_3_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer4_3(input_4_300.getText(), warning_4_300, input_4_300, submit_4_300);
                four300.setDisable(true);
                return_4_300.setVisible(true);
                if (input_4_300.getText().equals("Lover")) {
                    points.add(300);
                    totalPoints += 300;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_4_300.setOnAction(new album_3_submit());
        class album_3_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_4_300.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_4_300.setOnAction(new album_3_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_4_400 = new Label("ALBUMS (CONCEPTUAL): 400 points");
        Label question_4_400_p = new Label("What is the name of the rumored 'missing' album between 1989 and reputation?");
        TextField input_4_400 = new TextField();
        Label warning_4_400 = new Label("WARNING: Case sensitive.");
        Button submit_4_400 = new Button("Submit");
        Button return_4_400 = new Button("Return");

        VBox prompt_4_4 = new VBox(desc_4_400, question_4_400_p, warning_4_400, input_4_400, submit_4_400, return_4_400);
        return_4_400.setVisible(false);
        prompt_4_4.setVisible(false);
        class album_4 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_4_4);
                prompt_4_4.setVisible(true);
            }
        }
        four400.setOnAction(new album_4());

        class album_4_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer4_4(input_4_400.getText(), warning_4_400, input_4_400, submit_4_400);
                four400.setDisable(true);
                return_4_400.setVisible(true);
                if (input_4_400.getText().equals("Karma")) {
                    points.add(400);
                    totalPoints += 400;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_4_400.setOnAction(new album_4_submit());
        class album_4_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_4_400.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_4_400.setOnAction(new album_4_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_4_500 = new Label("ALBUMS (CONCEPTUAL): 500 points");
        Label question_4_500_p = new Label("How many 'From The Vault' songs are featured in Taylor's Version of Fearless and Red? (input integer)");
        TextField input_4_500 = new TextField();
        Label warning_4_500 = new Label("WARNING: Case sensitive.");
        Button submit_4_500 = new Button("Submit");
        Button return_4_500 = new Button("Return");

        VBox prompt_4_5 = new VBox(desc_4_500, question_4_500_p, warning_4_500, input_4_500, submit_4_500, return_4_500);
        return_4_500.setVisible(false);
        prompt_4_5.setVisible(false);

        class album_5 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_4_5);
                prompt_4_5.setVisible(true);
            }
        }
        four500.setOnAction(new album_5());

        class album_5_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer4_5(input_4_500.getText(), warning_4_500, input_4_500, submit_4_500);
                four500.setDisable(true);
                return_4_500.setVisible(true);
                if (input_4_500.getText().equals("15")) {
                    points.add(500);
                    totalPoints += 500;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_4_500.setOnAction(new album_5_submit());
        class album_5_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_4_500.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_4_500.setOnAction(new album_5_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_5_100 = new Label("PERSONAL LIFE: 100 points");
        Label question_5_100_p = new Label("What is considered Swift's 'lucky number' (input integer)?");
        TextField input_5_100 = new TextField();
        Label warning_5_100 = new Label("WARNING: Case sensitive.");
        Button submit_5_100 = new Button("Submit");
        Button return_5_100 = new Button("Return");

        VBox prompt_5_1 = new VBox(desc_5_100, question_5_100_p, warning_5_100, input_5_100, submit_5_100, return_5_100);
        return_5_100.setVisible(false);
        prompt_5_1.setVisible(false);

        class life_1 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_5_1);
                prompt_5_1.setVisible(true);
            }
        }
        five100.setOnAction(new life_1());

        class life_1_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer5_1(input_5_100.getText(), warning_5_100, input_5_100, submit_5_100);
                five100.setDisable(true);
                return_5_100.setVisible(true);
                if (input_5_100.getText().equals("13")) {
                    points.add(100);
                    totalPoints += 100;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_5_100.setOnAction(new life_1_submit());
        class life_1_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_5_100.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_5_100.setOnAction(new life_1_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_5_200 = new Label("PERSONAL LIFE: 200 points");
        Label question_5_200_p = new Label("When Swift won 'Best Music Video' at the MTV Awards, this man got on stage to say Beyonce should've won.");
        TextField input_5_200 = new TextField();
        Label warning_5_200 = new Label("WARNING: Case sensitive.");
        Button submit_5_200 = new Button("Submit");
        Button return_5_200 = new Button("Return");

        VBox prompt_5_2 = new VBox(desc_5_200, question_5_200_p, warning_5_200, input_5_200, submit_5_200, return_5_200);
        return_5_200.setVisible(false);
        prompt_5_2.setVisible(false);

        class life_2 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_5_2);
                prompt_5_2.setVisible(true);
            }
        }
        five200.setOnAction(new life_2());

        class life_2_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer5_2(input_5_200.getText(), warning_5_200, input_5_200, submit_5_200);
                five200.setDisable(true);
                return_5_200.setVisible(true);
                if (input_5_200.getText().equals("Kanye West")) {
                    points.add(200);
                    totalPoints += 200;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_5_200.setOnAction(new life_2_submit());
        class life_2_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_5_200.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_5_200.setOnAction(new life_2_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_5_300 = new Label("PERSONAL LIFE: 300 points");
        Label question_5_300_p = new Label("What is Swift's middle name?");
        TextField input_5_300 = new TextField();
        Label warning_5_300 = new Label("WARNING: Case sensitive.");
        Button submit_5_300 = new Button("Submit");
        Button return_5_300 = new Button("Return");

        VBox prompt_5_3 = new VBox(desc_5_300, question_5_300_p, warning_5_300, input_5_300, submit_5_300, return_5_300);
        return_5_300.setVisible(false);
        prompt_5_3.setVisible(false);

        class life_3 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_5_3);
                prompt_5_3.setVisible(true);
            }
        }
        five300.setOnAction(new life_3());

        class life_3_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer5_3(input_5_300.getText(), warning_5_300, input_5_300, submit_5_300);
                five300.setDisable(true);
                return_5_300.setVisible(true);
                if (input_5_300.getText().equals("Alison")) {
                    points.add(300);
                    totalPoints += 300;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_5_300.setOnAction(new life_3_submit());
        class life_3_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_5_300.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_5_300.setOnAction(new life_3_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_5_400 = new Label("PERSONAL LIFE: 400 points");
        Label question_5_400_p = new Label("When Swift did modeling, which clothing company did she do it for?");
        TextField input_5_400 = new TextField();
        Label warning_5_400 = new Label("WARNING: Case sensitive.");
        Button submit_5_400 = new Button("Submit");
        Button return_5_400 = new Button("Return");

        VBox prompt_5_4 = new VBox(desc_5_400, question_5_400_p, warning_5_400, input_5_400, submit_5_400, return_5_400);
        return_5_400.setVisible(false);
        prompt_5_4.setVisible(false);

        class life_4 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_5_4);
                prompt_5_4.setVisible(true);
            }
        }
        five400.setOnAction(new life_4());

        class life_4_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer5_4(input_5_400.getText(), warning_5_400, input_5_400, submit_5_400);
                five400.setDisable(true);
                return_5_400.setVisible(true);
                if (input_5_400.getText().equals("Abercrombie")) {
                    points.add(400);
                    totalPoints += 400;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_5_400.setOnAction(new life_4_submit());
        class life_4_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_5_400.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_5_400.setOnAction(new life_4_return());
        //-----------------------------------------------------------------------------------------------------------
        Label desc_5_500 = new Label("PERSONAL LIFE: 500 points");
        Label question_5_500_p = new Label("What is the name of the 2010 movie that Swift appeared in as 'Felicia'?");
        TextField input_5_500 = new TextField();
        Label warning_5_500 = new Label("WARNING: Case sensitive.");
        Button submit_5_500 = new Button("Submit");
        Button return_5_500 = new Button("Return");

        VBox prompt_5_5 = new VBox(desc_5_500, question_5_500_p, warning_5_500, input_5_500, submit_5_500, return_5_500);
        return_5_500.setVisible(false);
        prompt_5_5.setVisible(false);

        class life_5 implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                whole.setVisible(false);
                myBorderPane.setCenter(prompt_5_5);
                prompt_5_5.setVisible(true);
            }
        }
        five500.setOnAction(new life_5());

        class life_5_submit implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                Child.check_answer5_5(input_5_500.getText(), warning_5_500, input_5_500, submit_5_500);
                five500.setDisable(true);
                return_5_500.setVisible(true);
                if (input_5_500.getText().equals("Valentine's Day")) {
                    points.add(500);
                    totalPoints += 500;
                    pointStatus1.setText("Your points: " + points);
                    pointStatus2.setText(" = " + totalPoints);
                }
                else {
                    lives.pop();
                    livesLeft.setText("Lives left: " + lives);
                }
            }
        }
        submit_5_500.setOnAction(new life_5_submit());
        class life_5_return implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                input_5_500.setVisible(false);
                Child.check_points(totalPoints, pointStatus1, pointStatus2, lives, chart);
                myBorderPane.setCenter(whole);
                whole.setVisible(true);
            }
        }
        return_5_500.setOnAction(new life_5_return());

        Scene game = new Scene(myBorderPane, 600, 300);
        primaryStage.setScene(game);
        primaryStage.setTitle("Final Project");
        primaryStage.show();
    }
}