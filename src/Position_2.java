//2��λ�� ������ѧһ¥

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Position_2 extends JOptionPane{
	public static int stepCount=2;        //λ��
	public static int level=0;            //��ǰ���ݵȼ�
	public static int a=5;                //�Ի������
	public static int x1,y1,x2,y2;        //��������
	public static String color;           //�õ�����
	static Image red11,red22,red33,red44,red55,red66,red1,red2,red3,red4,red5,red6,image1;    //����ͼƬ
	
	public Position_2(){	
	    if(this.color=="red"){
	    	a=this.showConfirmDialog(null,"�Ƿ�����������ѧһ¥��","",JOptionPane.YES_NO_OPTION);
	    }else if(this.color=="blue"){
	    	a=this.showConfirmDialog(null,"�Ƿ�����������ѧһ¥��","",JOptionPane.YES_NO_OPTION);
	    }else{
	    	a=this.showConfirmDialog(null,"�Ƿ��򹫹���ѧһ¥��","",JOptionPane.YES_NO_OPTION);
	    }
	    
	    //�������ͼ��
		javax.swing.ImageIcon mouseImage=new javax.swing.ImageIcon("d:\\img\\mouse.png");
		java.awt.Cursor c1=this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"��Ϸ���");	
	    this.setCursor(c1);
	    
	    //����ͼƬ
	    red1=Toolkit.getDefaultToolkit().getImage("d:\\img\\red1.png");
	    red2=Toolkit.getDefaultToolkit().getImage("d:\\img\\red2.png");	    
	    red3=Toolkit.getDefaultToolkit().getImage("d:\\img\\red3.png");
	    red4=Toolkit.getDefaultToolkit().getImage("d:\\img\\red4.png");
	    red5=Toolkit.getDefaultToolkit().getImage("d:\\img\\red5.png");
	    red6=Toolkit.getDefaultToolkit().getImage("d:\\img\\ming_de_lou_red.png");
	    red11=Toolkit.getDefaultToolkit().getImage("d:\\img\\red11.png");
	    red22=Toolkit.getDefaultToolkit().getImage("d:\\img\\red22.png");	    
	    red33=Toolkit.getDefaultToolkit().getImage("d:\\img\\red33.png");
	    red44=Toolkit.getDefaultToolkit().getImage("d:\\img\\red44.png");
	    red55=Toolkit.getDefaultToolkit().getImage("d:\\img\\red55.png");
	    red66=Toolkit.getDefaultToolkit().getImage("d:\\img\\ming_de_lou_blue.png");	 
	}
	
	public static void Po2(){
		if(PlayerOne.step==2){	
			if(Position_2.color=="red"){
				if(Position_2.a==0){
					if(Position_2.level==1){
    	    	   	 	a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��1��������500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	    	   	 	Position_2.image1=red2;
    	    	   	 	Position_2.x1=280;Position_2.y1=403;
    	    	   	 	Position_2.x2=126;Position_2.y2=94;
    	    	   	 	Position_2.level=2;
    	    	   	 	PlayerOne.Points=PlayerOne.Points-500;
					}
					else if(Position_2.level==2){
  	    	   	 		a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��2��������1000֪ʶ��","",JOptionPane.DEFAULT_OPTION);
  	    	   	 		Position_2.image1=red3;
  	    	   	 		Position_2.x1=280;Position_2.y1=382;
  	    	   	 		Position_2.x2=128;Position_2.y2=112;
  	    	   	 		Position_2.level=3;
  	    	   	 		PlayerOne.Points=PlayerOne.Points-1000;
					}
					else if(Position_2.level==3){
  	    	   	    	a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��3��������1500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
  	    	   	    	Position_2.image1=red4;
  	    	   	    	Position_2.x1=280;Position_2.y1=373;
  	    	   	    	Position_2.x2=127;Position_2.y2=120;
  	    	   	    	Position_2.level=4;
  	    	   	    	PlayerOne.Points=PlayerOne.Points-1500;
					}
					else if(Position_2.level==4){
  	    	   	    	a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��4��������2500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
  	    	   	    	Position_2.image1=red5;
  	    	   	    	Position_2.x1=280;Position_2.y1=360;
  	    	   	    	Position_2.x2=125;Position_2.y2=136;
  	    	   	    	Position_2.level=5;
  	    	   	    	PlayerOne.Points=PlayerOne.Points-2500;
					}
					else if(Position_2.level==5){
    	    	   	 	a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��5��������3500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	    	   	 	Position_2.image1=red6;
    	    	   	 	Position_2.x1=281;Position_2.y1=342;
    	    	   	 	Position_2.x2=127;Position_2.y2=153;
    	    	   	 	Position_2.level=6;
    	    	   	 	PlayerOne.Points=PlayerOne.Points-3500;
					}
				}
				else{	
				}
			}
		else if(Position_2.color=="blue"){
			if(PlayerTwo.blood>0){
				if(Position_2.level==1){
					double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*800;
    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
				else if(Position_2.level==2){
					double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*1500;
    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
				else if(Position_2.level==3){
					double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*2500;
    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                  }
				else if(Position_2.level==4){
					double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*4500;
    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
				else if(Position_2.level==5){
					double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*8500;
    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
				else if(Position_2.level==6){
					double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*11500;
    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
			}
		}
		else{
			if(Position_2.a==0){
    		   a=JOptionPane.showConfirmDialog(null,"���򹫹���ѧһ¥������300֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    		   Position_2.image1=red1;
    		   Position_2.x1=280;Position_2.y1=397;
    		   Position_2.x2=126;Position_2.y2=94;
    	       Position_2.level=1;
    	       Position_2.color="red";
    	       PlayerOne.Points=PlayerOne.Points-300;    	       
			}
			else{
				System.out.println("1");
            }
		}
	}
	else if(PlayerTwo.step==2){	
		if(Position_2.color=="blue"){
			if(Position_2.a==0){
				if(Position_2.level==1){
					a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��1��������500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
					Position_2.image1=red22;
					Position_2.x1=280;Position_2.y1=403;
    		        Position_2.x2=126;Position_2.y2=94;
    	            Position_2.level=2;
    	            PlayerTwo.Points=PlayerTwo.Points-500;
                }
				else if(Position_2.level==2){
					a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��2��������1000֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	    Position_2.image1=red33;
               	    Position_2.x1=280;Position_2.y1=382;
    		        Position_2.x2=128;Position_2.y2=112;
    	            Position_2.level=3;
    	            PlayerTwo.Points=PlayerTwo.Points-1000;
				}
				else if(Position_2.level==3){
					a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��3��������1500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	    Position_2.image1=red44;
               	    Position_2.x1=280;Position_2.y1=373;
    		        Position_2.x2=127;Position_2.y2=120;
    	            Position_2.level=4;
    	            PlayerTwo.Points=PlayerTwo.Points-1500;
				}
				else if(Position_2.level==4){
					a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��4��������2500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	            Position_2.image1=red55;Position_2.x1=280;Position_2.y1=360;
    		        Position_2.x2=125;Position_2.y2=136;
    	            Position_2.level=5;
    	            PlayerTwo.Points=PlayerTwo.Points-2500;
				}
				else if(Position_2.level==5){
					a=JOptionPane.showConfirmDialog(null,"����������ѧһ¥��5��������3500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	            Position_2.image1=red66;Position_2.x1=281;Position_2.y1=342;
    		        Position_2.x2=127;Position_2.y2=153;
    	            Position_2.level=6;
    	            PlayerTwo.Points=PlayerTwo.Points-3500;
                }     
			}
			else{
            }
		}
		else if(Position_2.color=="red"){
			if(PlayerOne.blood>0){
				if(Position_2.level==1){
					double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*800;
    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
				}
				else if(Position_2.level==2){
					double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*1500;
    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
				}
				else if(Position_2.level==3){
					double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*2500;
    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
				}
				else if(Position_2.level==4){
					double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*4500;
    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
				}
				else if(Position_2.level==5){
					double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*8500;
    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
				}
				else if(Position_2.level==6){
					double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*11500;
    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"�ڽ�һѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
				}
			}
		}
		else{
			if(Position_2.a==0){
				a=JOptionPane.showConfirmDialog(null,"���򹫹���ѧһ¥����300֪ʶ��","",JOptionPane.DEFAULT_OPTION);
				Position_2.image1=red11;Position_2.x1=280;Position_2.y1=397;
				Position_2.x2=126;Position_2.y2=94;
				Position_2.level=1;
				Position_2.color="blue";
				PlayerTwo.Points=PlayerTwo.Points-300;    	       
			}
			else{
				System.out.println("1");
			}
        }
	}	
}
	
	public static void drawCX1Image(Graphics g){
    	g.drawImage(Position_2.image1,Position_2.x1,Position_2.y1,Position_2.x2,Position_2.y2,null);
    }
}