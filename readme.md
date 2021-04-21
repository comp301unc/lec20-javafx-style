# Lecture 20 JavaFX Style Example

This repository contains a example mockup of the game 2048 for JavaFX with Maven. Notice that a new file was added to the project: `src/main/resources/style/main.css`. This `css` file contains the style information for making the GUI look colorful and pretty. The code inside `main.css` is a variant of "Cascading Style Sheets" (CSS), which is supported by JavaFX, and is the primary language used by browsers to style websites.

## Running the example

This repository uses Maven as a build manager, and JavaFX as a GUI library. Since JavaFX is an external library, it has to be included in the build process in order for the application to successfully run. JavaFX has already been added as a Maven dependency to the POM file.

To run the application with Maven in IntelliJ, follow these steps:

1. Click the vertical "Maven" expansion tab which is on the right side of the window.

2. Expand the "Plugins" folder.

3. Expand the "javafx" folder.

4. Double-click "javafx:run" to run the project.