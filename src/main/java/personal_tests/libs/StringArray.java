package personal_tests.libs;

public class StringArray {
    private StringBuilder sBValue = new StringBuilder("");
    private String sValue = "";
    public String getValue(){
        return sValue;
    }
    public <T> StringArray(T[] input){
        for (T element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public StringArray (boolean[] input){
        for (boolean element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public StringArray (char[] input){
        for (char element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public StringArray (String[] input){
        for (String element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public StringArray (float[] input){
        for (float element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public StringArray (double[] input){
        for (double element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public StringArray (byte[] input){
        for (byte element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public StringArray (short[] input){
        for (short element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public StringArray (int[] input){
        for (int element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public StringArray (long[] input){
        for (long element : input) {
            this.sBValue.append(String.format("%s,",element));
        }
        sValue = String.format("//{%s}\\\\", sBValue.substring(0,sBValue.length()-1));
    }
    public static String reeify(String in){
        char[] chars = new char[in.length()];
        String out = "";
        for(int i = 0; i < in.length(); i++){
            chars[i] = in.charAt(i);
            out += ((Math.random()*2.0)>=1)?Character.toString(chars[i]).toUpperCase():chars[i];
        }
        return out;
    }

    public static boolean[] parseBoolean(StringArray in) throws RuntimeException{
        String input = in.getValue();
        boolean[] out;
        if(input.startsWith("//{") && input.endsWith("}\\\\")){
            String ofIntrest = input.substring(input.indexOf("{")+1,input.indexOf("}"));
            String[] strings = ofIntrest.split(",");
            out = new boolean[strings.length];
            for (int i = 0; i < strings.length; i++) {
                if(strings[i].equals("true")){
                    out[i] = true;
                } else if (strings[i].equals("false")) {
                    out[i] = false;
                } else {
                    throw new RuntimeException();
                }
            }
            return out;
        } else {
            return null;
        }
    }

    public static char[] parseChar(StringArray in) throws RuntimeException{
        String input = in.getValue();
        char[] out;
        if(input.startsWith("//{") && input.endsWith("}\\\\")){
            String ofIntrest = input.substring(input.indexOf("{")+1,input.indexOf("}"));
            String[] strings = ofIntrest.split(",");
            out = new char[strings.length];
            for (int i = 0; i < strings.length; i++) {
                out[i] = strings[i].charAt(0);
            }
            return out;
        } else {
            return null;
        }
    }

    public static String[] parseString(StringArray in) throws RuntimeException{
        String input = in.getValue();
        String[] out;
        if(input.startsWith("//{") && input.endsWith("}\\\\")){
            String ofIntrest = input.substring(input.indexOf("{")+1,input.indexOf("}"));
            String[] strings = ofIntrest.split(",");
            out = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                out[i] = strings[i];
            }
            return out;
        } else {
            return null;
        }
    }
}
