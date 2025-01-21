public class Complex {
    private double real;
    private double imag;

    public void init(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public void display(){
        System.out.println("Complex number:- "+real+ " + "+imag+ "i");
    }

    public static void main(String[] args){
        if (args.length !=2){
            System.out.println("Complex number real and imagnary part");
            return;
        }
        double real = Double.parseDouble(args[0]);
        double imag = Double.parseDouble(args[1]);

        Complex complexNumber = new Complex();
        complexNumber.init(real, imag);
        complexNumber.display();
    }
}


/* run this program after compilation use java Complex 5.3 7.2
 * then you get answer "Complex number:- 5.3 + 7.2i" */

