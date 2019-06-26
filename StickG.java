import javax.swing.JFrame;

public class StickG {

	public static StickG stickg;
	public final int WIDTH = 800,  HEIGHT = 800;

	public StickG (){
		JFrame jframe = new JFrame();

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);

	}

	public static void main(String[] args){
		stickg = new StickG ();
	}
} 
