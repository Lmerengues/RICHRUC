import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ShaiZiKa extends JDialog implements ActionListener{
	static JFrame jf;
	public ShaiZiKa(){	
	    super(jf,"--------------------�� ѡ �� Ҫ �� �� �� ��--------------------",true);
	    setSize(360,80);	    
	    setLocation(((getToolkit().getScreenSize()).width-getWidth())/2,
		            ((getToolkit().getScreenSize()).height-getHeight())/2);	
		
		setLayout(new GridLayout(1,6));
		JButton h1=new JButton(" һ ");
		h1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){				
				if(MainMap.turn=="boy"){
				PlayerOne.c1to6=1;
				MainMap.po.throwIt();
		        MainMap.runstart=1;
		        MainMap.turn="girl";
		        MainMap.click=0;
				}else if(MainMap.turn=="girl"){
				PlayerTwo.c1to6=1;
				MainMap.pt.throwIt();
		        MainMap.runstart=2;
		        MainMap.turn="boy";
		        MainMap.click=0;	
				}
				setVisible(false);
			}
		});
		JButton h2=new JButton(" �� ");
		h2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(MainMap.turn=="boy"){
				PlayerOne.c1to6=2;
				MainMap.po.throwIt();
		        MainMap.runstart=1;
		        MainMap.turn="girl";
		        MainMap.click=0;
				}else if(MainMap.turn=="girl"){
				PlayerTwo.c1to6=2;
				MainMap.pt.throwIt();
		        MainMap.runstart=2;
		        MainMap.turn="boy";
		        MainMap.click=0;	
				}
				setVisible(false);
				}
		});
		JButton h3=new JButton(" �� ");
		h3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(MainMap.turn=="boy"){
				PlayerOne.c1to6=3;
				MainMap.po.throwIt();
		        MainMap.runstart=1;
		        MainMap.turn="girl";
		        MainMap.click=0;
				}else if(MainMap.turn=="girl"){
				PlayerTwo.c1to6=3;
				MainMap.pt.throwIt();
		        MainMap.runstart=2;
		        MainMap.turn="boy";
		        MainMap.click=0;	
				}
				setVisible(false);
				}
		});
		JButton h4=new JButton(" ��" );
		h4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(MainMap.turn=="boy"){
				PlayerOne.c1to6=4;
				MainMap.po.throwIt();
		        MainMap.runstart=1;
		        MainMap.turn="girl";
		        MainMap.click=0;
				}else if(MainMap.turn=="girl"){
				PlayerTwo.c1to6=4;
				MainMap.pt.throwIt();
		        MainMap.runstart=2;
		        MainMap.turn="boy";
		        MainMap.click=0;	
				}
				setVisible(false);
				}
		});
		JButton h5=new JButton(" �� ");
		h5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(MainMap.turn=="boy"){
				PlayerOne.c1to6=5;
				MainMap.po.throwIt();
		        MainMap.runstart=1;
		        MainMap.turn="girl";
		        MainMap.click=0;
				}else if(MainMap.turn=="girl"){
				PlayerTwo.c1to6=5;
				MainMap.pt.throwIt();
		        MainMap.runstart=2;
		        MainMap.turn="boy";
		        MainMap.click=0;	
				}
				setVisible(false);
				}
		});
		JButton h6=new JButton(" �� ");
		h6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(MainMap.turn=="boy"){
				PlayerOne.c1to6=6;
				MainMap.po.throwIt();
		        MainMap.runstart=1;
		        MainMap.turn="girl";
		        MainMap.click=0;
				}else if(MainMap.turn=="girl"){
				PlayerTwo.c1to6=6;
				MainMap.pt.throwIt();
		        MainMap.runstart=2;
		        MainMap.turn="boy";
		        MainMap.click=0;	
				}
				setVisible(false);
				}
		});
		this.add(h1);this.add(h2);this.add(h3);this.add(h4);this.add(h5);this.add(h6);		
		javax.swing.ImageIcon mouseImage=new javax.swing.ImageIcon(".\\img\\mouse.png");
		java.awt.Cursor c1=this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"��Ϸ���");	
	    this.setCursor(c1);
	    
	    setVisible(true);
	}
   public void actionPerformed(ActionEvent e){}
}