//λ��0 ���10��ѧ��

import javax.swing.JOptionPane;

public class Position_0{
	public static void Po0(){
		int a2;
		if(PlayerOne.step==0){
			a2=JOptionPane.showConfirmDialog(null,"���10��ѧ��","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+10;
		}
		if(PlayerTwo.step==0){
			a2=JOptionPane.showConfirmDialog(null,"���10��ѧ��","",JOptionPane.DEFAULT_OPTION);
			PlayerTwo.Scholarship=PlayerTwo.Scholarship+10;
		}	
	}	
}