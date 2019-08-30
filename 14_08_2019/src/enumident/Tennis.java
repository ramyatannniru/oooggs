package enumident;

public class Tennis implements Coach {
  private String name;
  private Level level;
  public Tennis() {
	  super();
  }
  
	
	public void createCoach(String name,Level level)
	{
		this.name=name;
		this.level=level;
	}
	public String getName() {
		return name;
	}
      public void setName(String name) {
    	  this.name=name;
      }
      public Level getLevel() {
    	  return level;
      }
      public void setLevel(Level level) {
    	  this.level=level;
      }
      public String getcoachDetails() {
    	  StringBuilder sb=new StringBuilder();
    	  sb.append("today work plan"+getDailyworkout()+"\n");
    	  sb.append("coach name"+getName()+"\n");
    	  sb.append("level is"+level+"\n");
    	  sb.append("coach level rank is"+level.getcode()+"\n");
    	  
		return sb.toString();
    	  
    	  
      }


	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "getdetails";
	}
}




