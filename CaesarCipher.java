/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;

    public CaesarCipher() {
        alphabet = new char[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabet.length; i++)
        {
            alphabet[i] = alpha.charAt(i);
            //System.out.println(alpha.charAt(i));
        }   
    }

    public CaesarCipher(int num){
        shifter(num);
    }

    public String encrypt(String message){
        String encryptedmessage = "";
        for(int i = 0; i < message.length(); i++)
        {
            for(int x = 0; x < 26; x++)
            {
                char shiftedchar = 'a';
                boolean inIt = false;
                if(message.charAt(i) == shifted[x])
                {
                    inIt = true;
                }
                if(inIt == true)
                {
                    shiftedchar = shifted[x + 4];
                    encryptedmessage += shiftedchar;
                }
                else
                {
                    encryptedmessage += " ";
                }
            }
        }
        return encryptedmessage;
    }

    public String decrypt(String message){
        return "";
    }

    public void shifter(int num){
        alphabet = new char[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++)
        {
            alphabet[i] = alpha.charAt(i);
            //System.out.println(alpha.charAt(i));
        }   

        shifted = new char[26];
        for(int i = 0; i < 26; i++)
        {
            if((i + num) % 26 >= num)
            {
                shifted[i + num] = alphabet[i];
            }
            else
            {
                shifted[(i + num) % 26] = alphabet[i];
            }
        }
        System.out.println(shifted);
    }



}
