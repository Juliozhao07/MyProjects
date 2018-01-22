package eecs1022.lab1;

/**
 * Created by user on 1/22/18.
 */
public class Person
{

    String name; // here we are declaring the name is a string
    double weight;
    double height;

    public Person(String n, double w,double h){
        this.name = n;      //the thing written in the brackets are assigned here
        this.height = h;
        this.weight = w;
    }

    double getBMI(){
        //in here we are going to use the information that class person has retrieeved and then here is where the calculation happens
        double bmi = this.weight/( this.height*this.height);
        return bmi;
    }

    public String getState(){
        double bmi = getBMI();
        if(bmi<18.5){
            return " Underweight.";
        }else if(bmi>=18.5&&bmi<25.0){
            return "normal";
        }else if (bmi>=25.0&& bmi<30.0){
            return "Overweight";
        }else if(30.0<= bmi&& bmi<100){
            return "Obese";
        }
        return "Please input correct value";
    }

    //this should be typed in the class

    @Override
    public String toString()
    {
      /*  String s = "";
        s = s+this.name;
        s= s + " 's BMI is";
        //this line below is a repetition to the getbmi code
        //double bmi = this.weight/(this.height*this.height);
        double bmi = getBMI();
        s += +bmi;
        return s;*/
        String ret = name + "'s BMI is " + String.format("%.2f", getBMI()) + ", \nYour state is " + getState();
        //String ret = String.format("%s's BMI is %.2f,\n Your state is %s", name, getBMI(), getState());
        //the line above will add 's into the name and will say bmi is  and it will take only 2 sig figs
        return ret;

    }

    public void setWeight(double w){ this.weight = w;}       //these two lines will set the values
    public void setHeight(double h){ this.height = h;}

    public double getWeight(){return weight;}                // these two lines will get the value
    public double getHeight(){return height;}

}
