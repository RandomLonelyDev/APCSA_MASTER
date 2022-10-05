package libs;

public class StringArray {
    private StringBuilder sBValue = new StringBuilder("");
    private String sValue = "";
    public <T> StringArray(T[] input){ //TODO: overload
        for (T element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public static String reeify(String in){
        char[] chars = new char[in.length()];
        String out = "";
        for(int i = 0; i < in.length(); i++){
            chars[i] = in.charAt(i);
            out += ((Math.random()*2.0)>1)?Character.toString(chars[i]).toUpperCase():chars[i];
        }
        return out;
    }

    public String getValue(){
        return sValue;
    }
}
