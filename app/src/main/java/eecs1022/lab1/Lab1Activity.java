package eecs1022.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab1Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
    }

    private void setContentsOfTextView(int id, String newContents){

        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents); //this code will find the code from the text view

    }

    private String getInputOfTextField(int id) {
        // my computer
        View view= findViewById(id);
        EditText editText= (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getItemSeleted(int id) {
        View view = findViewById(id);
        Spinner spinner =(Spinner)view;
        String string = spinner.getSelectedItem().toString();
        return string;
        //this one gets the value that the person will type on the empty space(the input)

    }

    public void computeBMIClicked(View view){
        String textName = getInputOfTextField(R.id.inputName);
        String selectedHeight = getItemSeleted(R.id.spinnerHeight);
        String selectedWeight =  getItemSeleted(R.id.spinnerWeight);

        String textWeight = getInputOfTextField(R.id.inputWeight);
        String textHeight = getInputOfTextField(R.id.inputHeight);




        double weight=  Double.parseDouble(textWeight);
        double height = Double.parseDouble(textHeight);


        if(selectedHeight.equals("Inches")){
            height = height*0.0254;
        }else if(selectedHeight.equals("Centimeters")){
            height= height/100;
        }

        if(selectedWeight.equals("Pounds(Lbs)")){
            weight= weight*0.45359237;
        }

//the github is working perfectly

        Person user = new Person(textName, weight, height);        //this line will get the answer back that it was calculated
        setContentsOfTextView(R.id.labelAnswer,user.toString());    //this line will substitute the word answer to the
    }
}


