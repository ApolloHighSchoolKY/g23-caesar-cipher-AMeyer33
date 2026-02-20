/**
 * @(#)G19.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class G19 {

    public static void main(String[] args) {

    	CaesarCipher cipher = new CaesarCipher(4);
		
    	System.out.println(cipher.encrypt("hello world!"));
    	System.out.println(cipher.decrypt("ukq zez ep!"));
		System.out.print("\n");

    	//Create a new cipher using the shifter(#) method
    	//Encrypt and decrypt a message with your new cipher
		CaesarCipher cipher2 = new CaesarCipher(6);
		
    	System.out.println(cipher2.encrypt("howdy!"));
    	System.out.println(cipher2.decrypt("cngz oy av?"));
		System.out.print("\n");

		CaesarCipher cipher3 = new CaesarCipher(6);
		
    	System.out.println(cipher3.encrypt("gs hugy cm xlyq,"));
    	System.out.println(cipher3.decrypt("gtj o gs znk hkyz!"));
		System.out.print("\n");

    }


}