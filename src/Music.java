
import javax.swing.JApplet;
import java.applet.AudioClip;
import java.io.EOFException;

public class Music
{	
	AudioClip au;
	JApplet ap = new JApplet();
	
	private java.io.InputStream fish;//������Ч���ļ�����������
	private sun.audio.AudioStream fishAs;//������ը��Ч����Ƶ������
	
	public void sunAudio()
	{
		
		try
        {
			fish=new java.io.FileInputStream("music/midi10.mid");
			fishAs=new sun.audio.AudioStream(fish);//������������һ����Ƶ������
			sun.audio.AudioPlayer.player.start(fishAs);//������Ƶ������ľ�̬��ԱPLAYER�Ĳ��ŷ���
		}
		catch(java.io.IOException err){}
	}
	
	public void sunAudio1()
	{
		try
        {
			fish=new java.io.FileInputStream("..\\music\\sound21.au");
			fishAs=new sun.audio.AudioStream(fish);//������������һ����Ƶ������
			sun.audio.AudioPlayer.player.start(fishAs);//������Ƶ������ľ�̬��ԱPLAYER�Ĳ��ŷ���
		}
		catch(java.io.IOException err){}
	}
	public void sunAudio2()
	{
        try
        {
			fish=new java.io.FileInputStream("..\\music\\sound22.au");
			fishAs=new sun.audio.AudioStream(fish);//������������һ����Ƶ������
			sun.audio.AudioPlayer.player.start(fishAs);//������Ƶ������ľ�̬��ԱPLAYER�Ĳ��ŷ���
		}
		catch(java.io.IOException err){}
	}
	public void sunAudio4()
	{
        try
        {
			fish=new java.io.FileInputStream("..\\music\\sound4.au");
			fishAs=new sun.audio.AudioStream(fish);//������������һ����Ƶ������
			sun.audio.AudioPlayer.player.start(fishAs);//������Ƶ������ľ�̬��ԱPLAYER�Ĳ��ŷ���
		}
		catch(java.io.IOException err){}
	}
	public void sunAudio5()
	{
        try
        {
			fish=new java.io.FileInputStream("..\\music\\sound1.au");
			fishAs=new sun.audio.AudioStream(fish);//������������һ����Ƶ������
			sun.audio.AudioPlayer.player.start(fishAs);//������Ƶ������ľ�̬��ԱPLAYER�Ĳ��ŷ���
		}
		catch(java.io.IOException err){}
	}
	public void sunAudio6()
	{
        try
        {
			fish=new java.io.FileInputStream("..\\music\\sound5.au");
			fishAs=new sun.audio.AudioStream(fish);//������������һ����Ƶ������
			sun.audio.AudioPlayer.player.start(fishAs);//������Ƶ������ľ�̬��ԱPLAYER�Ĳ��ŷ���
		}
		catch(java.io.IOException err){}
	}

	public void sunAudio3()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("..\\music\\sound32.au"));
			au.loop();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void sunAudio7()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("..\\music\\sound23.au"));
			au.loop();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void sunAudio8()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("..\\music\\sound33.au"));
			au.loop();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void sunAudio10()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("..\\music\\sound31.au"));
			au.loop();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void sunAudio11()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("..\\music\\sound9.au"));
			au.play();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void mouseMoveSound()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("music\\InstSel.wav"));
			au.play();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void by()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("music\\an_jhc.wav"));
			au.play();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void sz()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("music\\an_zs.wav"));
			au.play();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void cs()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("music\\c_cardslect.wav"));
			au.play();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void bo()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("music\\ef_dszdbz.wav"));
			au.play();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void dd()
	{	
		try
		{
			au = ap.newAudioClip(Music.class.getResource("music\\ef_lzpz.wav"));
			au.play();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void stopMusic()
   	{
   		au.stop();
   	}
   	//fishAs
   	public void stopMusic1()
   	{
   		sun.audio.AudioPlayer.player.stop(fishAs);
   	}
}   


	


	
		
