package cellsociety_team03;
import java.util.*;
public class ConwayCell extends Cell{
	String ALIVE="alive";
	String YELLOW="yellow";
	String DEAD="dead";
	String GREEN="green";
	
	
	
	public ConwayCell(String state){
		super(state);
		gettypes().put(ALIVE, YELLOW);
		gettypes().put(DEAD, GREEN);
		
			
	}
	
	
}
