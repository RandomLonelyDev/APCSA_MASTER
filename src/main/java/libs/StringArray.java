package libs;

import java.util.Objects;

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

    public static boolean[] parseBoolean(String in) throws RuntimeException{ //TODO: overload
        boolean[] out;
        if(in.startsWith("//{") && in.endsWith("}\\\\")){
            String ofIntrest = in.substring(in.indexOf("{")+1,in.indexOf("}"));
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

    public static char[] parseChar(String in) throws RuntimeException{ //TODO: overload
        char[] out;
        if(in.startsWith("//{") && in.endsWith("}\\\\")){
            String ofIntrest = in.substring(in.indexOf("{")+1,in.indexOf("}"));
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

    public static String[] parseString(String in) throws RuntimeException{ //TODO: overload
        String[] out;
        if(in.startsWith("//{") && in.endsWith("}\\\\")){
            String ofIntrest = in.substring(in.indexOf("{")+1,in.indexOf("}"));
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
