import javax.swing.*;
import java.awt.*;
public class eventOnHere extends JOptionPane{
	/**
	 *�����漴�¼�����
	 */
	public int hanpend;
	/**
	 *�漴�¼����췽��
	 */
	public eventOnHere(){
		this.hanpend=(int)(1+Math.round(Math.random()*6));
		//this.hanpend=1;
		if(this.hanpend==1){
			this.showMessageDialog(null,"��С�ĵ���һ�׳�������𵴣�ס��ҽԺ ","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
				MainMap.jhc.sy();MainMap.jhc.kaiche();
	        	PlayerOne.step=90;PlayerOne.blood=-100;
			}else if(PlayerTwo.step==15){
				MainMap.jhc.sy();MainMap.jhc.kaiche();
	        	PlayerTwo.step=90;PlayerTwo.blood=-100;
			}
		}else if(this.hanpend==2){
			this.showMessageDialog(null,"����������Ϊ����ѧ����͵��100��- -","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.Scholarship -= 100;
			   if(PlayerOne.Scholarship<0)  PlayerOne.Scholarship=0;
			}else if(PlayerTwo.step==15){
				PlayerTwo.Scholarship -=100;
				if(PlayerTwo.Scholarship<0)  PlayerTwo.Scholarship=0;
			}
		}else if(this.hanpend==3){
			this.showMessageDialog(null,"���˺�����ʦ������ƺ��Ȼ���ʣ�֪ʶ������10000","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.Points=PlayerOne.Points+10000;
			}else if(PlayerTwo.step==15){
				PlayerTwo.Points=PlayerTwo.Points+10000;
			}
		}else if(this.hanpend==4){
			this.showMessageDialog(null,"һ������ͻȻʧ���ˣ�ѧ���Ķ�����,��ס��ֻʣһ����ˣ�","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.Points=10000;
			}else if(PlayerTwo.step==15){
				PlayerTwo.Points=10000;
			}
		}else if(this.hanpend==5){
			this.showMessageDialog(null,"Уѡ��ˢ���ɹ���GPA����0.1","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.GPA=PlayerOne.GPA+0.1;
			}else if(PlayerTwo.step==15){
			   PlayerTwo.GPA=PlayerTwo.GPA+0.1;
			}
		}else if(this.hanpend==6){
			this.showMessageDialog(null,"��ѧ��ѧ�ĺܰ�������ý�ѧ��100�㣡","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.Scholarship=PlayerOne.Scholarship+100;
			}else if(PlayerTwo.step==15){
			   PlayerTwo.Scholarship=PlayerTwo.Scholarship+100;
			}
		}else if(this.hanpend==7){
			this.showMessageDialog(null,"ͻȻ����һ��������û���ˣ�GPA�½�0.1","",INFORMATION_MESSAGE);
		    if(PlayerOne.step==15){	
			   PlayerOne.GPA=PlayerOne.GPA-0.1;
			}else if(PlayerTwo.step==15){
				PlayerTwo.GPA=PlayerTwo.GPA-0.1;
			}
		}
	}
}