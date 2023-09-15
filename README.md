# tswiftjeopardy
This repository showcases my achievement of constructing a simple Jeopardy game, 
consisting of a JavaFX Application and its components, and applications 
of data structures. The idea of this game is inspired by my deep interest in
singer-songwriter Taylor Swift, her life, and music. Categories in this game
test your knowledge of her dating life, lyrics, albums, personal life, and her
ongoing concert tour, The Eras Tour. Do you have what it takes to be crowned
the "Swiftie" title?

Below explains how the JavaFX Application and data structures are applied, as well as
how the program demonstrates Java inheritance.
//------------------------------------------------------------------------------------------
VBOX AND HBOX: Numerous VBoxes were used to structure the welcome page and rules page,
and there are many VBoxes and HBoxes used to structure the game page with the buttons,
labels, and the list/stack below it.

INHERITANCE: There is a child class that inherits 25 public methods to check the answer
to each individual question of the Jeopardy game. The child class also includes a method
where the program checks the status of how many points you earned and how many lives you
have left.

LISTS: The ArrayList that is displayed below the buttons serves as the point counter
for the game. When a user gets a question correct, the amount of points is added to that
list and displays an integer with the total points collected so far next to it.

STACKS: A String Stack is used where a bullet point represents a life. There are four
of them that are pushed into the stack at the beginning and if a user gets a question
wrong, each life gets popped out of the stack until there are none left.

