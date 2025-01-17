<h1>Lab7</h1>
<h2>Concurrency</h2>
Write a program that simulates the following game between a given number of players.
At the beginning of the game there is a bag containing a number of tokens, each token being a distinct pair of numbers between 1 and n.
Each player extracts tokens successively from the bag and must create with them closed sequences of the form t1=(i1,i2), t2=(i2,i3),...,tk=(ik,i1), where ti are tokens and i1,i2,i3,...,ik are distinct numbers.
The value of a sequence is given by the number of its tokens.
The game ends when all tokens have been removed from the bag or when a player makes a sequence of length n. Each player receives a number of points equal to the value of its largest sequence.
The players might take turns (or not...) and a time limit might be imposed (or not...).

The main specifications of the application are:

Create an object oriented model of the problem.
Each player will have a name and they must perform in a concurrent manner, extracting repeatedly tokens from the bag.
Simulate the game using a thread for each player (only the part where the players extract tokens from the bag).
Pay attention to the synchronization of the threads when extracting tokens from the bag.
