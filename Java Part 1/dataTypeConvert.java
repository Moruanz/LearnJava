public class IntDetail {

	//escape character demostration
	public static void main(String[] args){
	short s = 12; //
	s = s-9; //wrong, calculate s-9 is int

	byte b = 10;
	b = b + 11;// wrong, calculate byte is int, cannot give byte int
	b = (byte)(b+11);// this is ok.

	char c = 'a';
	int i = 16;
	float d = 0.314F;
	double result = c + i + d;//can compile float -> double

	byte b = 16;
	short s = 14;
	short t = s + b;//Unable to compile, type should be int
	}
}
