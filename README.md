# VigenereCipherDecryptionANDEncryptionThis program uses the Vigenere Cipher to encrypt your message using a specific key that provide

--> How to use <--
*note: Before you start the encryption process.
The allowed character range used in both key and message should be the set: ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789,.?! <-- space is included

First - Encryption - :
1- Open the text file "inputFile.txt"
2- In the very first line, type the key word you are willing to use to encrypt the message like: RED, Waleed, Abdulsalam... ( mind uppercase, lowercase, and spaces )
3- In the following lines, type what ever message you are willing to encrypt.
4- Run the program and select (1) for encryption.
5- The program will generate an output file "output.dec" that contains the encrypted message.

Second - Decryption - :
1- Make sure that the output.dec has has text in it, otherwise the program keep prompting again.
2- Run the program and select (2) for decryption.
3- The program will prompt you to enter the key used in decryption, please enter the correct key for to result in the correct decryption.
4- The program will generate a text file "decryptedMsg.txt" that contains the decryption key in the first line followed by the original message.

Third - Terminating - :
1- Once done with the program and you have the desired output, select (3) to terminate the program and end process.

---------------------------------------------------------------------------------------------------------------------------------------
Decryption Class:

The decryption class is used to provide the decryption key to decrypt a certain message using the concept of character frequency ( find the attached PDF for extensive explanation )

The correct way to use the code is: 
1- change the number inside the regular expression in line 30 into the key length required ( (?<=\G.{"Key length here"} )
2- Enter the encrypted message in the file "Output.dec"
3- run the program and enter the key length prompted by the program.
4- the program will generate a decryption key and an encryption key used.
5- take the encryption key ( the second one ) and put in the first program ( Encryption class ).
6- finally the decryptedMsg.txt will have the decrypted message.


