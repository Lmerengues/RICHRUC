//1��λ�û�ȡ30��ѧ��

import javax.swing.JOptionPane;
public class Position_1{
	public static void Po1(){
		int a2;
		if(PlayerOne.step==1){
			a2=JOptionPane.showConfirmDialog(null,"���30��ѧ��","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+30;
		}
		if(PlayerTwo.step==1){
	    	 a2=JOptionPane.showConfirmDialog(null,"���30��ѧ��","",JOptionPane.DEFAULT_OPTION);
	    	 PlayerTwo.Scholarship=PlayerTwo.Scholarship+30;
		}	
	}	
}