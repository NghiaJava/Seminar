/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fan;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 *
 * @author nt274
 */
public class Fan extends Application{
    private final double RADIUS = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        
        Circle c = new Circle( RADIUS, null);
        c.centerXProperty().bind(pane.widthProperty().divide(2));
        c.centerYProperty().bind(pane.heightProperty().divide(2));
        c.setStroke(Color.ORANGE);
        c.setStrokeWidth(5);
        pane.getChildren().add(c);
        
        for (int i=0; i <= 4; i ++){
          
        
        
            Arc arc = new Arc();
            arc.centerXProperty().bind(pane.widthProperty().divide(2));
            arc.centerYProperty().bind(pane.heightProperty().divide(2));
            arc.setRadiusX(9*RADIUS/10);
            arc.setRadiusY(9*RADIUS/10);
            arc.setStartAngle(i*90);
            arc.setLength(30);
            arc.setType(ArcType.ROUND);
            arc.setFill(Color.GRAY);
            //arc.setStroke(Color.RED);
            //arc.setStrokeWidth(5);
            
            
            pane.getChildren().add(arc);
        
        }
       
        
        Scene scene = new Scene(pane, 400, 300);
        
        primaryStage.setTitle("Fan");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
