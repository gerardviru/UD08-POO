package UD08;

public class PasswordAPP extends Password {

	public static void main(String[] args) {

		Password passwordAleatoria = new Password(8, "");
		System.out.println(passwordAleatoria.generaPassword());
	}

}
