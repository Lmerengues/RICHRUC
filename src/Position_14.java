//λ��14 ���30��ѧ��

import javax.swing.JOptionPane;

public class Position_14{
	public static void Po14(){
		int a2;
		if(PlayerOne.step==14){
			 a2=JOptionPane.showConfirmDialog(null,"���30��ѧ��","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+30;
		}
		if(PlayerTwo.step==14){
			 a2=JOptionPane.showConfirmDialog(null,"���30��ѧ��","",JOptionPane.DEFAULT_OPTION);
			PlayerTwo.Scholarship=PlayerTwo.Scholarship+30;
		}	
	}	
}