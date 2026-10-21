package OOP;


/**
* @generated
*/
public class News extends Observable {
    
    /**
    * @generated
    */
    private String title;
    
    /**
    * @generated
    */
    private String content ;
    
    /**
    * @generated
    */
    private Date date_published;
    
    /**
    * @generated
    */
    private String comments;
    
    
    /**
    * @generated
    */
    private Manager manager;
    
    /**
    * @generated
    */
    private User user;
    
    
    public News(String text) {
		// TODO Auto-generated constructor stub
	}

	/**
    * @generated
    */
    public String getTitle() {
        return this.title;
    }
    
    /**
    * @generated
    */
    public String setTitle(String title) {
        this.title = title;
    }
    
    /**
    * @generated
    */
    public String getContent () {
        return this.content ;
    }
    
    /**
    * @generated
    */
    public String setContent (String content ) {
        this.content  = content ;
    }
    
    /**
    * @generated
    */
    public Date getDate_published() {
        return this.date_published;
    }
    
    /**
    * @generated
    */
    public Date setDate_published(Date date_published) {
        this.date_published = date_published;
    }
    
    /**
    * @generated
    */
    public String getComments() {
        return this.comments;
    }
    
    /**
    * @generated
    */
    public String setComments(String comments) {
        this.comments = comments;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void publish_news() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public void edit_news() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public boolean addComment() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public ResearcherPaper addResearchPaper() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public long getTopResearcher() {
        //TODO
        return 0L;
    }
    
    
}
