package callbyval_ref;

public class Callbyval {

	int data = 50;

	void change(int data) {
		data = data + 100;// changes will be in the local variable only
	}

	public static void main(String args[]) {
		Callbyval op = new Callbyval();

		System.out.println("before change " + op.data);
		op.change(500);
		System.out.println("after change " + op.data);

	}
}

class Callbyref {
	int data = 50;

	void change(Callbyref op) {
		op.data = op.data + 100;// changes will be in the instance variable
	}

	public static void main(String args[]) {
		Callbyref op = new Callbyref();

		System.out.println("before change " + op.data);
		op.change(op);// passing object
		System.out.println("after change " + op.data);

	}
}