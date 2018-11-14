package sample;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {


    public TextField theight;
    public TextField tweight;

    public Label lbmi;
    public Label lresults;

    public void buttonclicked() {

        float height;
        float weight;
        float bmi;

        String results="";

        height = Float.parseFloat(theight.getText());
        weight = Float.parseFloat(tweight.getText());

        bmi = height * height;
        bmi = weight / bmi;

        lbmi.setText("Your bmi is " + bmi);
        if (bmi < 18.5) {

            results = "Under weight";

        } else if (bmi > 18.5 && bmi < 25) {
            results = "Normal (you are in good shape)";

        }  else if(bmi>25) {
                results = "Over weight";
            }
             lresults.setText("You are " + results);
        }
    }

