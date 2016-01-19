import java.io.File;

public abstract class AbstractTest implements Tester {
	private final String parameterName; 
    private String parameterValue;  
    
    public AbstractTest(String name) {
        parameterName = name;
    }
    
    @Override 
    public boolean accept(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals(parameterName))
                parameterValue = args[i + 1];
            return true;
        }
        
        return false;
    }

}