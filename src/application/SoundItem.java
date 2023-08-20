package application;

public enum SoundItem 
{
	node1("Note1.wav"),
	node2("Note2.wav"),
	node3("Note3.wav"),
	node4("Note4.wav"),
	node5("Note5.wav"),
	node6("Note6.wav"),
	node7("Note7.wav"),
	node8("Note8.wav");
	String voice;
	private SoundItem(String voice)
	{
		this.voice = voice ;
	}
	public String getVoice()
	{
		return voice;
		
	}
}
