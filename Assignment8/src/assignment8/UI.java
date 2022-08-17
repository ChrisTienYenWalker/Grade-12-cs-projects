package assignment8;

public class UI {
	public static void main(String args[])
    {
LinkedScores score=new LinkedScores();//Initialize Scores object
        
        //Add objects
        score.add(new GameEntry("Mike",1105));
        score.add(new GameEntry("Paul",720));
        score.add(new GameEntry("Rose",590));
        score.add(new GameEntry("Jack",510));
        score.add(new GameEntry("Anna",660));
        score.add(new GameEntry("Rob",750));
        
        //Output number of entries
        System.out.println(score.getNumEntries()+" Entries");
        
        //Output top 5 entries
        System.out.println(score);
        
        score.add(new GameEntry("Jill",720));
        
        System.out.println(score);
        
        score.remove("Paul");
        
        System.out.println(score);
        
        score.add(new GameEntry("Phil",870));
        score.add(new GameEntry("Don",470));
        score.add(new GameEntry("Donna",630));
        score.add(new GameEntry("Erin",420));
        score.add(new GameEntry("George",500));
        
        //Capture invalid arguments using try...catch block
        try{
            score.add(new GameEntry(6,"Tom"));
        }catch(Exception e)
        {
            System.out.println(e.getMessage()+"\n");
        }
        
        System.out.println(score.getNumEntries()+" Entries");
        System.out.println(score);

    }       

}
