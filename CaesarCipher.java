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
        alphabet = new char[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabet.length; i++)
        {
            alphabet[i] = alpha.charAt(i);
            //System.out.println(alpha.charAt(i));
        }   
        shift = num;
        shifter(num);
    }

    public String encrypt(String message){
        String encryptedmessage = "";
        for(int i = 0; i < message.length(); i++)
        {
            int index = -1;
            for(int x = 0; x < 26; x++)
            {
                if(message.charAt(i) == alphabet[x])
                {
                    index = x;
                }
                
            }
            if(index == -1)
            {
                encryptedmessage += message.charAt(i);
            }
            else
            {
                encryptedmessage += shifted[index];
            }
        }
        return encryptedmessage;
    }

    public String decrypt(String message){
        String decryptedmessage = "";
        for(int i = 0; i < message.length(); i++)
        {
            int index = -1;
            for(int x = 0; x < 26; x++)
            {
                if(message.charAt(i) == shifted[x])
                {
                    index = x;
                }
                
            }
            if(index == -1)
            {
                decryptedmessage += message.charAt(i);
            }
            else
            {
                decryptedmessage += alphabet[index];
            }
        }
        return decryptedmessage;
        
    }

    public void shifter(int num){
        shifted = new char[26];
        for(int i = 0; i < 26; i++)
        shifted[i] = alphabet[(i + num) % 26];
    }



}
