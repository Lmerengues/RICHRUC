

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameMaderJPanel extends JPanel 
{
	
	
	/** ���� */
	 //GameMusic gm;
	
	/** ���취 */
	public GameMaderJPanel(final Container container,final CardLayout cardLayout){
		setLayout(null);
		/** ��ť */
		final JButton goBack = new JButton("����");
		goBack.setBounds(430,390,60,20);
		this.add(goBack);
		/** ����ͼƬ */
		JLabel maker = new JLabel(new ImageIcon("d:\\image/team.png"));
		maker.setBounds(0,0,500,460);
		this.add(maker);
		
		
		/** ����¼� */
		goBack.addMouseListener(new MouseAdapter(){
			/** �������¼� */
			public void mouseEntered(MouseEvent g){
				/** �������� */
				goBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/** ��굥���¼� */
			public void mouseClicked(MouseEvent g){
				/** �������ֶ��� */
				//gm= new GameMusic();
				/** ���ŵ���ʱ������ */
				//gm.mouseClickedSound();
				/** ��������� */
				cardLayout.show(container,"ourGameMenuJPanel");
				System.out.println("�ѷ��������");
			}
		});
		
	}
}
