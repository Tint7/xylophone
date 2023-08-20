package application;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Rectangle;

public class XylophoneController  
{

	  @FXML
	    private Rectangle node1;

	    @FXML
	    private Rectangle node2;

	    @FXML
	    private Rectangle node3;

	    @FXML
	    private Rectangle node4;

	    @FXML
	    private Rectangle node5;

	    @FXML
	    private Rectangle node6;

	    @FXML
	    private Rectangle node7;

	    @FXML
	    private Rectangle node8;

    
    public void playSound(MouseEvent event)
    {
    	Node node = (Node) event.getSource();
    	SoundItem item = SoundItem.valueOf(node.getId());
    	play(item.getVoice());
    }

	private void play(String voice) 
	{
		// TODO Auto-generated method stub
		AudioClip clip = new AudioClip(getClass().getResource(voice).toString());
		clip.setCycleCount(2);
		clip.play();
	}
}
