//λ��28 ����¥
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Position_28 extends JOptionPane{
        /**
         *̫��·��28��λ��
         */
	public static int stepCount=28;
        /**
         *�ȼ��ĳ�ʼ��*/
	public static int level=0;
        /**
	 * �Ƿ��ȷ���ı���
	 */
	public static int a=5;
          /**
	 * ���ӵ�����
	 */
	public static int x1,y1,x2,y2;
        /**
	 * �����õص�������˭
	 */
	public static String color;
         /**
          *���ӵ�ͼƬ*/
	static Image red11,red22,red33,red44,red55,red66,red1,red2,red3,red4,red5,red6,image1;
	    /**
             *̫��·�Ĺ��췽��
             */
             public Position_28(){	
		if(this.color=="red"){
	    	a=this.showConfirmDialog(null,"�Ƿ���������¥��","",
		JOptionPane.YES_NO_OPTION);
	    }else if(this.color=="blue"){
	    	a=this.showConfirmDialog(null,"�Ƿ���������¥��","",
		JOptionPane.YES_NO_OPTION);
	    }else{
	    	a=this.showConfirmDialog(null,"�Ƿ�������¥��","",
		JOptionPane.YES_NO_OPTION);
	    }
		javax.swing.ImageIcon mouseImage=new javax.swing.ImageIcon("d:\\img\\mouse.png");
		java.awt.Cursor c1=this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"��Ϸ���");	
	    this.setCursor(c1);
            /**
              *����ͼƬ
              */
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
           /**
	 * �ж�����ߵ�������ϸ÷���ʲô��
	 */
	public static void ts1(){
         //�����һ�ߵ�28��λ����
	 if(PlayerOne.step==28){
               //������������һ��ʱ��	
		if(Position_28.color=="red"){
         if(Position_28.a==0){
    	       if(Position_28.level==1){
    	    	   a=JOptionPane.showConfirmDialog(null,"��������¥��1��������500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	       	     Position_28.image1=red2;Position_28.x1=418;Position_28.y1=592;
    		         Position_28.x2=126;Position_28.y2=95;
    	             Position_28.level=2;
    	             PlayerOne.Points=PlayerOne.Points-500;
                 }
               else if(Position_28.level==2){
            	   a=JOptionPane.showConfirmDialog(null,"��������¥��2��������1000֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	     Position_28.image1=red3;Position_28.x1=416;Position_28.y1=573;
    		         Position_28.x2=128;Position_28.y2=112;
    	             Position_28.level=3;
    	             PlayerOne.Points=PlayerOne.Points-1000;
                 }
               else if(Position_28.level==3){
            	   a=JOptionPane.showConfirmDialog(null,"��������¥��3��������1500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	     Position_28.image1=red4;Position_28.x1=422;Position_28.y1=563;
    		         Position_28.x2=126;Position_28.y2=125;
    	             Position_28.level=4;
    	             PlayerOne.Points=PlayerOne.Points-1500;
                  }
               else if(Position_28.level==4){
            	   a=JOptionPane.showConfirmDialog(null,"��������¥��4��������2500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	             Position_28.image1=red5;Position_28.x1=415;Position_28.y1=548;
    		         Position_28.x2=125;Position_28.y2=136;
    	             Position_28.level=5;
    	             PlayerOne.Points=PlayerOne.Points-2500;
                 }
                 else if(Position_28.level==5){
                	 a=JOptionPane.showConfirmDialog(null,"��������¥��5��������3500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	             Position_28.image1=red6;Position_28.x1=417;Position_28.y1=530;
    		         Position_28.x2=127;Position_28.y2=153;
    	             Position_28.level=6;
    	             PlayerOne.Points=PlayerOne.Points-3500;
                 }
             }
          else{
              }
      }
      
      //����������Ҷ���ʱ���չ�·��  ��Ҷ���Ǯ
    else if(Position_28.color=="blue"){
    	if(PlayerTwo.blood>0)
    	{
    	      if(Position_28.level==1){
    	    	  double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*800;
    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"������ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_28.level==2){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*1500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"������ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_28.level==3){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*2500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"������ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                  }
               else if(Position_28.level==4){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*4500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"������ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_28.level==5){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*8500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"������ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_28.level==6){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*11500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"������ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
          }
    }
    
    else{
    	if(Position_28.a==0){
    		a=JOptionPane.showConfirmDialog(null,"��������¥������300֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    		   Position_28.image1=red1;Position_28.x1=420;Position_28.y1=592;
    		   Position_28.x2=126;Position_28.y2=94;
    	       Position_28.level=1;
    	       Position_28.color="red";
    	       PlayerOne.Points=PlayerOne.Points-300;    	       
             }
          else{
          	System.out.println("1");
              }
        }
	  }
           //����Ҷ��ߵ�28λ���ϵ�ʱ��
	  else if(PlayerTwo.step==28){	
               //�����������Ҷ���
		if(Position_28.color=="blue"){
               //�����ȷ����ʱ��
         if(Position_28.a==0){
             //�ж����ĵȼ�
    	       if(Position_28.level==1){
    	    	   a=JOptionPane.showConfirmDialog(null,"��������¥��1��������500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	       	     Position_28.image1=red22;Position_28.x1=418;Position_28.y1=592;
    		         Position_28.x2=126;Position_28.y2=95;
    	             Position_28.level=2;
    	             PlayerTwo.Points=PlayerTwo.Points-500;
                 }
               else if(Position_28.level==2){
            	   a=JOptionPane.showConfirmDialog(null,"��������¥��2��������1000֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	     Position_28.image1=red33;Position_28.x1=416;Position_28.y1=573;
    		         Position_28.x2=128;Position_28.y2=112;
    	             Position_28.level=3;
    	             PlayerTwo.Points=PlayerTwo.Points-1000;
                 }
               else if(Position_28.level==3){
            	   a=JOptionPane.showConfirmDialog(null,"��������¥��3��������1500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	     Position_28.image1=red44;Position_28.x1=422;Position_28.y1=563;
    		         Position_28.x2=126;Position_28.y2=125;
    	             Position_28.level=4;
    	             PlayerTwo.Points=PlayerTwo.Points-1500;
                  }
               else if(Position_28.level==4){
            	   a=JOptionPane.showConfirmDialog(null,"��������¥��4��������2500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	             Position_28.image1=red55;Position_28.x1=415;Position_28.y1=548;
    		         Position_28.x2=125;Position_28.y2=136;
    	             Position_28.level=5;
    	             PlayerTwo.Points=PlayerTwo.Points-2500;
                 }
               else if(Position_28.level==5){
            	   a=JOptionPane.showConfirmDialog(null,"��������¥��5��������3500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	             Position_28.image1=red66;Position_28.x1=417;Position_28.y1=530;
    		         Position_28.x2=127;Position_28.y2=153;
    	             Position_28.level=6;
    	             PlayerTwo.Points=PlayerTwo.Points-3500;
                 }
               
             }
          else{
              }
      }
            //������������һ�ĵ�ʱ��Ҫ�չ�·��  ���һ��Ǯ
    else if(Position_28.color=="red"){
    	if(PlayerOne.blood>0)
    	{
    	      if(Position_28.level==1){
    	    	  a=JOptionPane.showConfirmDialog(null,"������¥ѧϰ����Сǿ����800֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-800;
    	            PlayerOne.Points=PlayerOne.Points+800;
                 }
               else if(Position_28.level==2){
            	   a=JOptionPane.showConfirmDialog(null,"������¥ѧϰ����Сǿ����1500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-1500;
    	            PlayerOne.Points=PlayerOne.Points+1500;
                 }
               else if(Position_28.level==3){
            	   a=JOptionPane.showConfirmDialog(null,"������¥ѧϰ����Сǿ����2500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-2500;
    	            PlayerOne.Points=PlayerOne.Points+2500;
                  }
               else if(Position_28.level==4){
            	   a=JOptionPane.showConfirmDialog(null,"������¥ѧϰ����Сǿ����4500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-4500;
    	            PlayerOne.Points=PlayerOne.Points+4500;
                 }
               else if(Position_28.level==5){
            	   a=JOptionPane.showConfirmDialog(null,"������¥ѧϰ����Сǿ����8500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-8500;
    	            PlayerOne.Points=PlayerOne.Points+8500;
                 }
               else if(Position_28.level==6){
            	   a=JOptionPane.showConfirmDialog(null,"������¥ѧϰ����Сǿ����11500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-11500;
    	            PlayerOne.Points=PlayerOne.Points+11500;
                 }
            }
    }
    
    else{
    	if(Position_28.a==0){
    		a=JOptionPane.showConfirmDialog(null,"��������¥������300֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    		   Position_28.image1=red11;Position_28.x1=420;Position_28.y1=592;
    		   Position_28.x2=126;Position_28.y2=94;
    	       Position_28.level=1;
    	       Position_28.color="blue";
    	       PlayerTwo.Points=PlayerTwo.Points-300;    	       
             }
          else{
          	System.out.println("1");
              }
        }
	  }
	}
           //��̫��·��λ��
	public static void drawTSL1Image(Graphics g)
    {
    	g.drawImage(Position_28.image1,Position_28.x1,Position_28.y1,
    	Position_28.x2,Position_28.y2,null);
    }
}