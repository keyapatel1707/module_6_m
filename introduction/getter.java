package introduction;

public class getter 
{
     private int sid;
     private String sname,duration;
     public int getsid() {
    	 return sid;
     }
     public void setsid(int sid)
     {
    	 this.sid=sid;
     }
     public String getsname()
     {
    	 return sname;
     }
     public void setsname(String sname)
     {
    	 this.sname=sname;
     }
     public String getduration()
     {
    	 return duration;
     }
     public void setduration(String duration)
     {
    	 this.duration=duration;
     }
}
