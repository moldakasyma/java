package classes;
import java.io.Serializable;
import java.util.Date;
import enums.*;
public class Request implements Serializable {
    
  
    private Status status;
    private Date date;
    private UrgancyLevel urgancyLevel;
    private RequestType type;
    private boolean approved;
    
    public Request(Status status,Date date, UrgancyLevel urgancyLevel, RequestType type,boolean approved) {
    	super();
    	this.status=status;
    	this.date=date;
    	this.urgancyLevel=urgancyLevel;
    	this.type=type;
    	this.approved=approved;
    }

    public Status getStatus() {
        return this.status;
    }
  
    public void setStatus(Status status) {
        this.status = status;
    }
 
    public Date getDate() {
        return this.date;
    }
  
    public void setDate(Date date) {
        this.date = date;
    }
   
    public UrgancyLevel getUrgancyLevel() {
        return this.urgancyLevel;
    }
   
    public void setUrgancyLevel(UrgancyLevel urgancyLevel) {
         this.urgancyLevel = urgancyLevel;
    }
    public RequestType getType() {
    	return type;
    }
    public void setType(RequestType type) {
    	this.type=type;
    }
    public boolean getApproved() {
    	return approved;
    }
    public void setApproved(Boolean approves) {
    	this.approved=approved;
    }

	public String getForm() {
		// TODO Auto-generated method stub
		return null;
	}
   
}
