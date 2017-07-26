
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;


public class Leader extends JFrame implements MouseListener 
{
	/** �������ֶ��� */
	public static Music gm = new Music();
    public static Leader gs;
	boolean run = true;

	int index = 0;

	String[] imagePath = new String[] { "d:\\image\\c1.png", "d:\\image\\c2.png",
			"d:\\image\\c3.png", "d:\\image\\c4.png", "d:\\image\\c5.png" };

	/** ���ֹ��� */
	CardLayout cardLayout = new CardLayout();

	Container container = this.getContentPane();

	/**
	 * �������췽�� ʵ�ִ��� ���� temp ����ͼƬ
	 */
	public Leader() {

		/** �����ֹ���������Ϊ���Զ�λ */
		getContentPane().setLayout(cardLayout);
		/** ��ȡ��ǰ��ʾ��Ļ�ĳߴ� */
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		/** ����ǰ���ڵ�λ������Ϊ������ʾ */
		setBounds((int) (dim.getWidth() - 500) / 2,
				(int) (dim.getHeight() - 400) / 2, 500, 400);
		/** ���ô����С,���� */
		setSize(500, 460);
		setTitle("RUCRICH");
		/** �¼����� */
		this.addMouseListener(this);	
		/** ���岻�ɸı��С */
		this.setResizable(false);
		/** ��屳��ɫΪ��ɫ */
		this.setBackground(Color.BLUE);
		/** ���ó���ر� */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/** ���ô���ɼ� */
		this.setVisible(true);
		/** Ƭͷ���� */
		gm.sunAudio();
		while (run) {// ���runΪtrue��ִ�и�ѭ��
			repaint();
			try {
				Thread.sleep(1000);// ���߳�˯��3�뻭ͼ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			index ++;
			if (index == imagePath.length-1 ) {
				run = false;//ֹͣ��ǰ�¼�
			}
		}

		/**
		 * Ƭͷ������������ ���������͸����
		 */
		/** ֹͣƬͷ�������� */
		/** ��ʼ����������� */
		//gm.menuMusic();
		//imagePath=null;

		/** ����� */
		OurGameMenu ourGameMenuJPanel = new OurGameMenu(container, cardLayout);
		container.add("ourGameMenuJPanel", ourGameMenuJPanel);

		/** ��Ϸ˵����� */
		GameSpeakJPanel gameSpeakJPanel = new GameSpeakJPanel(container,
				cardLayout);
		container.add("gameSpeakJPanel", gameSpeakJPanel);

		/** ����С����� */
		GameMaderJPanel gameMaderJPanel = new GameMaderJPanel(container,
				cardLayout);
		container.add("gameMaderJPanel", gameMaderJPanel);


	//	this.setVisible(true);

	}

	/**
	 * ���� ��imagePathͼ�����黭����
	 */
	public void paint(Graphics g) {
		Image img = this.getToolkit().getImage(imagePath[index]);
		g.drawImage(img, 0, 0, 500, 460, this);
	}
	/** ��굥���¼� */
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getClickCount() >= 2) {
			run = false;//ִֹͣ�е�ǰ�¼�
		}
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}
   	public static void main(String[] args) {
		gs=new Leader();
	}
}