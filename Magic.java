public class Magic {
	public static void main(String[] args) {
    int myNumber=5;
   
   // myNumber is the original number
    int stepOne=myNumber*myNumber;
    int stepTwo=stepOne+myNumber;
    int stepThree=stepTwo/myNumber;
    int stepFour=stepThree+17;
    int stepFive=stepFour-myNumber;
    int stepSix=stepFive/6;

    //To print out the last result
    System.out.println(stepSix);

	}
}
