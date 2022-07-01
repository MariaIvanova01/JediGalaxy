# JediGalaxy

Peter is Jedi and so he starts gathering stars to grow stronger.
His galaxy is represented as a two-dimensional array. Every cell in the matrix is a star that has a value. Peter starts at the given col and row. He can move only on the diagonal from the lowest left to the upper right and adds to his score all the stars (values) from the cells he passes through. Unfortunately, there is always an Evil power that tries to prevent his success. 

Evil power starts at the given row and col and instantly destroys all-stars on the opposite diagonal – From the lowest right to the upper left. 

Peter adds the values only of the stars that are not destroyed by the evil power.

You will receive two integers, separated by space, which represent the two-dimensional array - the first being the rows and the second being the columns. Then, you must fill the two-dimensional array with increasing integers starting from 0, and continuing on every row, like this: 

first row: 0, 1, 2… m

second row: n+1, n+2, n+3… n + n.

![image](https://user-images.githubusercontent.com/81368587/176902417-4f628dee-1451-450a-bcaa-8c7e0e1c4218.png)

Peter starts with coordinates row = 5, col = -1. He must collect all stars with value [20, 16, 12, 8, 4]. Evil starts with coordinates row = 5, col = 5. Evil destroys all-stars in the range [24, 18, 12, 6, 0]. The star with a value of 12 is the cross point for Peter and The Evil, so Peter skips the stars and collects only those who are not in the evil range. 

![image](https://user-images.githubusercontent.com/81368587/176902464-ff5c03af-ad8f-4a89-8764-405e6dd68d15.png)

You will also receive multiple pairs of commands in the form of 2 integers separated by a single space. The first two integers will represent Peter’s start coordinates. The second one will represent the Evil Power’s start coordinates.

The input ends when you receive the command "Let the Force be with you". When that happens, you must print the value of all-stars that Peter has collected successfully.

Input
-------

•	On the first line, you will receive the number N, M -> the dimensions of the matrix. You must then fill the matrix according to these dimensions.

•	On the next several lines you will begin receiving 2 integers separated by a single space, which represent Peter’s row and col. On the next line, you will receive the Evil Power’s coordinates.

•	There will always be at least 2 lines of input to represent at least 1 path of Peter and the Evil force.

•	When you receive the command, "Let the Force be with you" the input ends.

Output
----------

•	The output is simple. Print the sum of the values from all-stars that Peter has collected.


Input |	Output
------|--------
5 5 | 48
5 -1 |
5 5 |
Let the Force be with you |	
5 5 | 29
4 -1 |
4 5 |
Let the Force be with you |	


