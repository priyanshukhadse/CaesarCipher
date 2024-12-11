Basic implementation of the Caesar Cipher in Java. It allows users to encrypt and decrypt messages by shifting 
the alphabetic characters in the input text by a specified number of positions.

Encryption:
   Each character in the plaintext is shifted forward by the specified number of positions in the alphabet.
   If the end of the alphabet is reached, it wraps around to the beginning. Non-alphabetic characters remain unchanged.

Decryption:
   The encrypted text can be reversed by applying the same shift value in the opposite direction.
   The program supports iterative decryption, allowing users to test different shift values interactively.

Input Handling:
   Users specify whether they want to encrypt (E) or decrypt (D) text.
   They provide a valid shift value (between 1 and 25) and the corresponding text.
