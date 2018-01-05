/**
 * 
 */
package ca.bcit.comp1510.lab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;



/**
 * Displays a telephone interface.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Telephone extends Application {
    
    /**
     * Declares and instantiates a new GridPane.
     */
    private GridPane grid = new GridPane();    
    
    /**
     * Holds the result for the result.
     */
    private Label result;
    
    
    /**
     * Start method. 
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        final int appWidth = 300;
        final int appHeight = 500;
        
        result = new Label("---");
        result.getText();
        grid.add(result, 0, 0);
        
        buttons();
        
        
        Scene scene = new Scene(grid, appWidth, appHeight);
        
        primaryStage.setTitle("Telephone");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
    /**
     * Makes and adds the telephone buttons.
     */
        public void buttons() {
            int x = 0;
            int y = 1;
            final int border = 9;
            final int max = 12;
            final int three = 3;
            final int ten = 10;
            final int eleven = 11;
            final int yvalue = 5;
            
            for (int i = 1; i <= max; i++) {
                
                Button btn = new Button();
                
                if (i <= border) {
                    btn.setText(String.valueOf(i));

                    grid.add(btn, x, y);
                    
                    x++;
                    if (x == three) {
                        x = 0;
                        y++;
                    }
                } else if (i == ten) {
                    
                    btn.setText("*");
                    grid.add(btn, 0, yvalue);
                    
                } else if (i == eleven) {
                    btn.setText("0");
                    grid.add(btn, 1, yvalue);
                    
                } else if (i == max) {
                    btn.setText("#");
                    grid.add(btn, 2, yvalue);
                }
                btn.setOnAction((event) -> { 
                    result.setText(btn.getText());
                });
            }
            
            
        }
        
    /**
     * Drives the method.
     * @param args unused.
     */
    public static void main(String[] args) {
        launch(args);
    }

}
