<h1><a href="https://www.codewars.com/kata/5436f26c4e3d6c40e5000282">Basic Sequence Practice</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>A <a href="http://world.mathigon.org/Sequences" data-turbolinks="false" target="_blank">sequence or a series</a> 
in mathematics, is a string of objects, like numbers, that follow a particular pattern. 
The individual elements in a sequence are called terms. 
A simple example is <code>3, 6, 9, 12, 15, 18, 21, ...</code>, where the pattern is: <i>"add 3 to the previous term"</i>.</p>
<p>In this kata, we will be using a more complicated sequence: <code>0, 1, 3, 6, 10, 15, 21, 28, ...</code>
This sequence is generated with the pattern: <i>"the nth term is the sum of numbers from 0 to n, inclusive"</i>.</p>
<pre>
[ 0,  1,    3,      6,   ...]
  0  0+1  0+1+2  0+1+2+3
</pre>
<h3>Task</h3>
<p>Complete the function that takes an integer <code>n</code> and returns an array of length <code>abs(n) + 1</code> 
of the arithmetic series explained above. When <code>n < 0</code> return the sequence with negative terms.</p>
<h3>Examples</h3>
<pre>
 5  -->  [0,  1,  3,  6,  10,  15]
-5  -->  [0, -1, -3, -6, -10, -15]
 7  -->  [0,  1,  3,  6,  10,  15,  21,  28]
</pre>