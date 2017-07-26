

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class OurGameMenu extends JPanel 
{

	/** ����尴ťͼƬ */
	static Image gameSpeakImage, gameMaderImage, startGameImage, stopGameImage;

	/** ��Ϸ˵����屳��ͼƬ */
	static Image gameSpeakPanelImage;

	/** ����С����屳�� */
	static Image makerPanelImage;

	/** ��ť */
	JLabel gameSpeakJLabel, gameMaderJLabel, gameStartJLabel, gameOverJLabel,
			menuImage,gl1,gl2,gl3,gl4;

	/** ���� */
	Music gm;

	/** ���취 */
	public OurGameMenu(final Container container, final CardLayout cardLayout) {
		/** ���ַ�ʽ */
		this.setLayout(null);
		/** ���ô������ */
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int) (dim.getWidth() - 500) / 2,
				(int) (dim.getHeight() - 400) / 2, 500, 400);
		

		/** ��Ϸ˵����ť */
		gameSpeakJLabel = new JLabel(new ImageIcon("d:\\image\\RUC1.png"));
		gameSpeakJLabel.setBounds(50, 180, 60, 60);
		this.add(gameSpeakJLabel);

        gl1 = new JLabel(new ImageIcon("d:\\image\\shuo.png"));
		gl1.setBounds(150, 180, 110, 60);
		this.add(gl1);
		/** ��Ϸ������ť */
		gameMaderJLabel = new JLabel(new ImageIcon("d:\\image\\RUC1.png"));
		gameMaderJLabel.setBounds(50, 245, 60, 60);
		this.add(gameMaderJLabel);
        
        gl2 = new JLabel(new ImageIcon("d:\\image\\zhi.png"));
		gl2.setBounds(150, 245, 110, 60);
		this.add(gl2);
		/** ��ʼ��Ϸ��ť */
		gameStartJLabel = new JLabel(new ImageIcon("d:\\image\\RUC1.png"));
		gameStartJLabel.setBounds(50, 115, 60, 60);
		this.add(gameStartJLabel);
        
        gl3 = new JLabel(new ImageIcon("d:\\image\\/δ����-1.png"));
		gl3.setBounds(150, 115, 110, 60);
		this.add(gl3);
		/** �˳���Ϸ��ť */
		gameOverJLabel = new JLabel(new ImageIcon("d:\\image\\RUC1.png"));
		gameOverJLabel.setBounds(50, 310, 60, 60);
		this.add(gameOverJLabel);
		
		gl4 = new JLabel(new ImageIcon("d:\\image\\tuichu.png"));
		gl4.setBounds(150, 310, 110, 60);
		this.add(gl4);
		/** �����汳��ͼ */
		menuImage = new JLabel(new ImageIcon("d:\\image\\bg3.png"));
		 menuImage.setBounds(0,0,500,491);		 
	
		this.add(menuImage);

		
		/**
		 * ����¼� �����Ӧ�İ�ť����ʾ��Ӧ�����
		 */

		/** ��Ϸ˵����ť */
		gameSpeakJLabel.addMouseListener(new MouseAdapter() {
			/** �������¼� */
			public void mouseEntered(MouseEvent arg0) {
				/** ���� */
				gm = new Music();
				gm.mouseMoveSound();// ����Ƶ���Ӧ����Ͳ�����Ӧ������
				/** �������� */
				gameSpeakJLabel.setCursor(Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR));
				gameSpeakJLabel.setIcon(new ImageIcon("d:\\image\\RUCR.png"));// �任��ͼƬ
			}

			/** ����Ƴ��¼� */
			public void mouseExited(MouseEvent g) {
				gameSpeakJLabel.setIcon(new ImageIcon("d:\\image\\RUC1.png"));// ���ԭ����ͼ
			}

			/** ������¼� */
			public void mouseClicked(MouseEvent arg0) {
				/** ���� */
				//gm = new GameMusic();
				//gm.mouseClickedSound();// ��굥��������Ӧ������
				cardLayout.show(container, "gameSpeakJPanel");// ��굥��������Ӧ���¼�����ʾ��Ϸ˵����壩
				System.out.println("�ѽ�����Ϸ˵�����");
			}
		});

		/** ��Ϸ������ť */
		gameMaderJLabel.addMouseListener(new MouseAdapter() {
			/** �������¼� */
			public void mouseEntered(MouseEvent g) {
				/** �������� */
				gameMaderJLabel.setCursor(Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR));
				/** ���� */
				gm = new Music();
				gm.mouseMoveSound();// ����Ƶ���Ӧ����Ͳ�����Ӧ������
				gameMaderJLabel.setIcon(new ImageIcon("d:\\image\\RUCR.png"));// �任��ͼƬ
			}

			/** ����Ƴ��¼� */
			public void mouseExited(MouseEvent g) {
				gameMaderJLabel.setIcon(new ImageIcon("d:\\image\\RUC1.png"));// ���ԭ����ͼ
			}

			/** ������¼� */
			public void mouseClicked(MouseEvent g) {
				/** ���� */
				//gm = new GameMusic();
				//gm.mouseClickedSound();// ��굥��������Ӧ������
				cardLayout.show(container, "gameMaderJPanel");// ��굥��������Ӧ���¼�����ʾ����С����壩
				System.out.println("�ѽ��뿪��С�����");
			}
		});

		/** ��ʼ��Ϸ��ť */
		gameStartJLabel.addMouseListener(new MouseAdapter() {
			/** �������¼� */
			public void mouseEntered(MouseEvent g) {
				/** �������� */
				gameStartJLabel.setCursor(Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR));
				/** ���� */
				gm = new Music();
				gm.mouseMoveSound();// ����Ƶ���Ӧ����Ͳ�����Ӧ������
				gameStartJLabel.setIcon(new ImageIcon("d:\\image\\info.png"));// �任��ͼƬ
			}

			/** ����Ƴ��¼� */
			public void mouseExited(MouseEvent g) {
				gameStartJLabel.setIcon(new ImageIcon("d:\\image\\RUC1.png"));// ���ԭ����ͼ

			}

			/** ������¼� */
			public void mouseClicked(MouseEvent g) {
				/** ���� */
				//gm = new GameMusic();
				//gm.mouseClickedSound();// ��굥��������Ӧ������
				Leader.gs.dispose();
                 new MainMap();Leader.gm.stopMusic1();
				 
			}
		});

		/** �˳���Ϸ��ť */
		gameOverJLabel.addMouseListener(new MouseAdapter() {
			/** �������¼� */
			public void mouseEntered(MouseEvent g) {
				/** �������� */
				gameOverJLabel.setCursor(Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR));
				/** ���� */
				gm = new Music();
				gm.mouseMoveSound();// ����Ƶ���Ӧ����Ͳ�����Ӧ������
				gameOverJLabel.setIcon(new ImageIcon("d:\\image\\info.png"));// �任��ͼƬ
			}

			/** ����Ƴ��¼� */
			public void mouseExited(MouseEvent g) {
				gameOverJLabel.setIcon(new ImageIcon("d:\\image\\RUC1.png"));// ���ԭ����ͼ
			}

			/** ������¼� */
			public void mouseClicked(MouseEvent g) {
				/** ���� */
				//gm = new GameMusic();
				//gm.mouseClickedSound();// ��굥��������Ӧ������
				System.out.println("���˳���Ϸ");
				System.exit(0);// �Ƴ���Ϸ
			}
		});

		this.setVisible(true);
	}

}
