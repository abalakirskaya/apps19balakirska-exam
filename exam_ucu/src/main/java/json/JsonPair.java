package json;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonPair extends Tuple<String, Json>{

    public JsonPair(String name, Json value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}