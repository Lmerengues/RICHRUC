

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameSpeakJPanel extends JPanel 
{
	/** ���������ֶ��� */
	//GameMusic gm;
	/** ��������ť���� */
	JButton goBack;
	/**
	 * ���취
	 */
	public GameSpeakJPanel(final Container container,final CardLayout cardLayout){
		
		setLayout(null);
		/** ���ذ�ť */
		goBack = new JButton("����");
		goBack.setBounds(430,390,60,20);
		this.add(goBack);
		/** ����ͼƬ */
		JLabel one = new JLabel(new ImageIcon("d:\\image\\shuoming.png"));
		one.setBounds(0,0,500,460);
		this.add(one);
		this.setVisible(true);
		
		/** �¼����� */
		goBack.addMouseListener(new MouseAdapter(){
			/** �������¼� */
			public void mouseEntered(MouseEvent g){
				/** �������� */
				goBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/** ��굥���¼� */
			public void mouseClicked(MouseEvent g){
				/** ���������ֶ��� */
				//gm = new GameMusic();
				/** ��굥��ʱ���������� */
				//gm.mouseClickedSound();
				/** ��������� */
				cardLayout.show(container,"ourGameMenuJPanel");
				System.out.println("�ѷ��������");
			}
		});
	}
}
