import javax.swing.JOptionPane;
public class Login {
	public static void main(String [] args) {
		String U, P;
		U = JOptionPane.showInputDialog("Enter your username");
		P = JOptionPane.showInputDialog("Enter your password");
		if( U.equals("sta") & P.equals("505")){
			JOptionPane.showMessageDialog(null,"Welcome " + U);
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong username or password ");
		}

		
	}

}

