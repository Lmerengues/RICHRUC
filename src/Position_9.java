//9��λ�û��50��ѧ��

import javax.swing.JOptionPane;

public class Position_9{
	public static void Po9(){
		int a2;
		if(PlayerOne.step==9){
			a2=JOptionPane.showConfirmDialog(null,"���50��ѧ��","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+50;
		}
		if(PlayerTwo.step==9){
			a2=JOptionPane.showConfirmDialog(null,"���50��ѧ��","",JOptionPane.DEFAULT_OPTION);
			PlayerTwo.Scholarship=PlayerTwo.Scholarship+50;
		}	
	}	
}