//λ��25 ͼ���
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Position_25 extends JOptionPane{
         /**
          *����̫��·2��25��λ��
          */
	public static int stepCount=25;
         /**
          *�ȼ���ʼ����Ϊ0
          */
	public static int level=0;
         /**
          *�Ƿ��ȷ���ĳ�ʼ��
          */
	public static int a=5;
          /**
           *���ӵ�����
           */
	public static int x1,y1,x2,y2;
         /**
          *�ж���˭�ķ���
          */
	public static String color;
          /**
           *�������ӵ�ͼƬ
           */
	static Image red11,red22,red33,red44,red55,red66,red1,red2,red3,red4,red5,red6,image1;
        /**
         *̫��·2�Ĺ��췽��
         */
	public Position_25(){	
		if(this.color=="red"){
	    	a=this.showConfirmDialog(null,"�Ƿ�����ͼ��ݣ�","",
		JOptionPane.YES_NO_OPTION);
	    }else if(this.color=="blue"){
	    	a=this.showConfirmDialog(null,"�Ƿ�����ͼ��ݣ�","",
		JOptionPane.YES_NO_OPTION);
	    }else{
	    	a=this.showConfirmDialog(null,"�Ƿ���ͼ��ݣ�","",
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
           *�����λ�ûᷢ���µķ���
           */
	public static void ts2(){
           //�����һ��ȥ��ʱ��
	 if(PlayerOne.step==25){
                 //������������һ��	
		if(Position_25.color=="red"){
         if(Position_25.a==0){
    	       if(Position_25.level==1){
    	    	   a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�1��������500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	       	     Position_25.image1=red2;Position_25.x1=620;Position_25.y1=735;
    		         Position_25.x2=126;Position_25.y2=95;
    	             Position_25.level=2;
    	             PlayerOne.Points=PlayerOne.Points-500;
                 }
               else if(Position_25.level==2){
            	   a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�2��������1000֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	     Position_25.image1=red3;Position_25.x1=615;Position_25.y1=720;
    		         Position_25.x2=128;Position_25.y2=112;
    	             Position_25.level=3;
    	             PlayerOne.Points=PlayerOne.Points-1000;
                 }
               else if(Position_25.level==3){
            	   a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�3��������1500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	     Position_25.image1=red4;Position_25.x1=625;Position_25.y1=710;
    		         Position_25.x2=126;Position_25.y2=125;
    	             Position_25.level=4;
    	             PlayerOne.Points=PlayerOne.Points-1500;
                  }
               else if(Position_25.level==4){
            	   a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�4��������2500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	             Position_25.image1=red5;Position_25.x1=620;Position_25.y1=694;
    		         Position_25.x2=125;Position_25.y2=136;
    	             Position_25.level=5;
    	             PlayerOne.Points=PlayerOne.Points-2500;
                 }
                 else if(Position_25.level==5){
                	 a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�5��������3500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	             Position_25.image1=red6;Position_25.x1=624;Position_25.y1=681;
    		         Position_25.x2=127;Position_25.y2=153;
    	             Position_25.level=6;
    	             PlayerOne.Points=PlayerOne.Points-3500;
                 }
             }
          else{
              }
      }
      
      //����������Ҷ���ʱ��Ҫ�չ�·��  ��Ҷ���Ǯ
    else if(Position_25.color=="blue"){
    	if(PlayerTwo.blood>0)
    	{
    	      if(Position_25.level==1){
    	    	  double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*800;
    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_25.level==2){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*1500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_25.level==3){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*2500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                  }
               else if(Position_25.level==4){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*4500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_25.level==5){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*8500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_25.level==6){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*11500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����С������"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
             }
    }
    
    else{
    	if(Position_25.a==0){
    		a=JOptionPane.showConfirmDialog(null,"����ͼ��ݣ�����300֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    		   Position_25.image1=red1;Position_25.x1=620;Position_25.y1=735;
    		   Position_25.x2=126;Position_25.y2=94;
    	       Position_25.level=1;
    	       Position_25.color="red";
    	       PlayerOne.Points=PlayerOne.Points-300;    	       
             }
          else{
          	System.out.println("1");
              }
        }
	  }
           //����Ҷ���ȥ��ʱ��
	  else if(PlayerTwo.step==25){	
               //�����������Ҷ���
		if(Position_25.color=="blue"){
         if(Position_25.a==0){
    	       if(Position_25.level==1){
    	    	   a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�1��������500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	       	     Position_25.image1=red22;Position_25.x1=620;Position_25.y1=735;
    		         Position_25.x2=126;Position_25.y2=95;
    	             Position_25.level=2;
    	             PlayerTwo.Points=PlayerTwo.Points-500;
                 }
               else if(Position_25.level==2){
            	   a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�2��������1000֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	     Position_25.image1=red33;Position_25.x1=615;Position_25.y1=720;
    		         Position_25.x2=128;Position_25.y2=112;
    	             Position_25.level=3;
    	             PlayerTwo.Points=PlayerTwo.Points-1000;
                 }
               else if(Position_25.level==3){
            	   a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�3��������1500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
               	     Position_25.image1=red44;Position_25.x1=625;Position_25.y1=710;
    		         Position_25.x2=126;Position_25.y2=125;
    	             Position_25.level=4;
    	             PlayerTwo.Points=PlayerTwo.Points-1500;
                  }
               else if(Position_25.level==4){
            	   a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�4��������2500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	             Position_25.image1=red55;Position_25.x1=620;Position_25.y1=694;
    		         Position_25.x2=125;Position_25.y2=136;
    	             Position_25.level=5;
    	             PlayerTwo.Points=PlayerTwo.Points-2500;
                 }
               else if(Position_25.level==5){
            	   a=JOptionPane.showConfirmDialog(null,"����ͼ��ݵ�5��������3500֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    	             Position_25.image1=red66;Position_25.x1=624;Position_25.y1=681;
    		         Position_25.x2=127;Position_25.y2=153;
    	             Position_25.level=6;
    	             PlayerTwo.Points=PlayerTwo.Points-3500;
                 }
               
             }
          else{
              }
      }
             //������ �����һ��ʱ��Ҫ�׹�·��  ���һ��Ǯ
    else if(Position_25.color=="red"){
    	if(PlayerOne.blood>0)
    	{
    	
    	      if(Position_25.level==1){
    	    	  double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*800;
  	            PlayerOne.Points=PlayerOne.Points+(int)temp;
  	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
  	            a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_25.level==2){
            	   double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*1500;
   	            PlayerOne.Points=PlayerOne.Points+(int)temp;
   	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
   	            a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_25.level==3){
            	   double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*2500;
   	            PlayerOne.Points=PlayerOne.Points+(int)temp;
   	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
   	            a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                  }
               else if(Position_25.level==4){
            	   double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*4500;
   	            PlayerOne.Points=PlayerOne.Points+(int)temp;
   	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
   	            a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_25.level==5){
            	   double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*8500;
   	            PlayerOne.Points=PlayerOne.Points+(int)temp;
   	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
   	            a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_25.level==6){
            	   double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*11500;
   	            PlayerOne.Points=PlayerOne.Points+(int)temp;
   	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
   	            a=JOptionPane.showConfirmDialog(null,"��ͼ���ѧϰ����Сǿ����"+(int)temp+"֪ʶ��","",JOptionPane.DEFAULT_OPTION);
                 }
           }
    }
    
    else{
    	if(Position_25.a==0){
    		a=JOptionPane.showConfirmDialog(null,"����ͼ��ݣ�����300֪ʶ��","",JOptionPane.DEFAULT_OPTION);
    		   Position_25.image1=red11;Position_25.x1=620;Position_25.y1=735;
    		   Position_25.x2=126;Position_25.y2=94;
    	       Position_25.level=1;
    	       Position_25.color="blue";
    	       PlayerTwo.Points=PlayerTwo.Points-300;    	       
             }
          else{
          	System.out.println("1");
              }
        }
	  }
	}
          //����̫��·2��λ��
	public static void drawTSL2Image(Graphics g)
    {
    	g.drawImage(Position_25.image1,Position_25.x1,Position_25.y1,
    	Position_25.x2,Position_25.y2,null);
    }
}