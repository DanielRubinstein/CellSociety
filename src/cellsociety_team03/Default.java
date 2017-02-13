//Written by Alex Blumenstock
package cellsociety_team03;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
public abstract class Default {
	//Abstract SuperClass for the Classes that will initialize the display 
	private int maxsize=40;
	private int maxspeed= 10;
	private boolean initialGrid;
	private String states;
	private String shape;
	private List<String> DATA_FIELDS;
	private String DATA_TYPE;
	//Selects between shapes-cannot be done until final dimensions are known
	private Map<String,ScrollPaneMaker> SCROLLPANE;
    public  void getScrollPanes( int row, int col,int side, Cell[][]grid ){
    	Map<String,ScrollPaneMaker>myMap=new HashMap<String,ScrollPaneMaker>();
    	myMap.put("square", new SquareDisplayTester( row, col,side, grid));
    	myMap.put("triangular", new TriDisplayTester(row, col,side, grid));
    	myMap.put("hexagonal", new HexDisplayTester( row, col, side,grid));
    	SCROLLPANE=myMap;
    };
	  private Map<String, String> myDataValues;
	
	  private boolean toroidal;
	  public abstract Map<String,Integer>getMaxes();
	  private List<String>ALLOWED_STATES;
	  public abstract List<String>getStates();
	  public int getmaxsize(){
		  return maxsize;
	  }
	  public String getShape(){
		  return shape;
	  }
	  public boolean isToroidal(){
		  return toroidal;
	  }
	  public void setToroidal(boolean b){
		  toroidal=b;
	  }
	  public Map<String,ScrollPaneMaker>getScrollPaneChoices(){
		  return SCROLLPANE;
	  }
	  public int getmaxspeed(){
		  return maxspeed;
	  }
	  private String title;
	  private String author;
	public void setTitle(String s){
		title=s;
	}
	public void setAuthor(String a){
		author=a;
	}
	public String getHeader(){
		return title+" by "+author;
	}
	public void setShape(String s){
		shape=s;
	}
public abstract Map<String,String>getAttributes();
//contains what game the default corresponds to
public abstract String getType();
public abstract void setDataValues(Map<String, String> dataValues);
public abstract List<String> getFields();
public abstract Cell[][] getGrid(int[] parameters);
public abstract Game getnewgame(int[] parameters,String cellShape);
public void setStates(String initializedStates){
	states=initializedStates;
}
}