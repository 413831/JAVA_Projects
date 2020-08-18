import java.util.*;

public class Query
{
    public String table;
    public Map<String,String> values;
    
    public Query(String table)
    {
        this.table = table;
        this.values = new Hashtable<String,String>();
    }

    public void SetRequestData(String key, String value)
    {
        this.values.put(key, value);
    }
}