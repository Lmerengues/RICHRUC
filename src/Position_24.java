
//λ��24 ���20��ѧ��

import javax.swing.JOptionPane;

public class Position_24{
	public static void Po24(){
		int a2;
		if(PlayerOne.step==24){
			a2=JOptionPane.showConfirmDialog(null,"���20��ѧ��","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+20;
			}
		if(PlayerTwo.step==24){
			a2=JOptionPane.showConfirmDialog(null,"���20��ѧ��","",JOptionPane.DEFAULT_OPTION);
			PlayerTwo.Scholarship=PlayerTwo.Scholarship+20;
			}	
	}	
}