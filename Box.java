//declare Box class
public class Box {

  int numOfSides;
  int height;
  int width;
  int length;
  int area;
  int volume;
  String name;

//assign values to variables
public void setValue() {

  numOfSides = 6;
  height = 6;
  width = 4;
  length = 10;
  name = "Boxy";

}

//print values from variables
public void getValue() {

  System.out.println(name + " has " + numOfSides + " sides.");
  System.out.println(name + " is " + height + "x" + width + "x" + length + ".");

}

//instantiate new instance of Box and sets its values
public static void main(String[] args) {

  Box b = new Box();
  b.setValue();
  b.getValue();

}


}