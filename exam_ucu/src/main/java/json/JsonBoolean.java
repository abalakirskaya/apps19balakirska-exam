package json;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 */
public class JsonBoolean extends Json {
    private boolean bool;
    public JsonBoolean(Boolean bool) {
        // ToDo
        this.bool = bool;
    }

    @Override
    public String toJson() {
        // ToDo
        if (this.bool == true){
            return "true";
        }
        else if (this.bool == false){
            return "false";
        }
        return null;
    }
}
