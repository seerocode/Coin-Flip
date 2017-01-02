# Coin-Flip
(Group project for CMP 167 - Java Programming I)

The goal of this project was to generate a random array of coin flips (heads or tails) whenever we clicked a button in a Java GUI. 

There were a few moving parts to the project and in trying to figure out who should do what, we all agreed we should work on the entire project simultaneously so we can all understand each facet of it and assist each other. This approach worked well for us because we were able to split the project into two parts, the class for the methods and the GUI, to identify what major components required to complete the task.

However, it is important to understand that this approach for a group project and only worked well because the project was small. In other cases, it is best to have each person take one one single part of the project and make sure their part works well so the final integration works smoothly. If we had used this approach we could have had someone do a method to return the random array, another person tackles the head flip method, and another the coin flip method. Finally, another person could work on the GUI while the the last person could assist with the integration and making the buttons work.

In the end, it did sort of work out that way for us as we all slowly moved into certain parts of the project that we were most comfortable with.

## The Methods

In our ```Flips``` class, we have three public fields (public so the CF class for the JFrame can access those variables):
- ```int hCount``` //stores the total index count for heads
- ```int tCount``` //stores the total index count for tails
- ```String[] hAndT``` //stores the resulting random array from the return array method flipCoin

We also have one return method for the random array, and two void methods for the index counts for heads and tails. 

The return method for the random array has a new array of 10 undefined elements, and a random class to later generate those values. We used a for-loop to go through that array and randomly assign head or tail to the 10 array elements. The method returns the resulting random array of head and tail.

Our two void methods prints the indices where tails and heads is in the hAndT array. We used a for-loop to go through the array and find where head or tails is and print the index of it. The method added up the counts for each loop and stored them in the hCount and tCount variables. Now we can print the the array, the indeces, and the total count of heads and tails to the console with the ```Flips``` class.

## The GUI

We extended the ```JFrame``` class in our ```CF``` class and created an icon for the GIF image, three labels, and a button for our GUI. 
The three labels and button are:
- ```flipsLabel``` //to print the random array
- ```tailsLabel``` //to print the count for tails
- ```headsLabel``` //to print the count for heads
- ```clickButton``` //to run the methods in the Flips class when clicked

To integrate our Flips class into the GUI, we added an actionListener to the Jbutton ```clickButton``` and an action event in it. The button listens to a click and then creates a new instance of the Flips class so we can reference it, We used the ```.setText()``` method on the ```flipsLabel``` to print the ```hAndT``` array.

We used the same method on the ```tailsLabel``` and ```headsLabel``` to print the ```tCount``` and the ```hCount``` to those labels. 

## Obstacles

In order to flip again, we found you have to close and reopen the program. We later realized this was because we had made our methods and instance variables static and in doing so, the results kept getting saved to memory so that every time we clicked the button, it would just keep counting up from the last result. 

We fixed it and now it works perfectly!

## Next Steps

We can work on making it the GUI a little more interactive and store the counts in a table to keep track of the heads and tails on each flip. 
