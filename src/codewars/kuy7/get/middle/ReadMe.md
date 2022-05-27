<h1><a href="https://www.codewars.com/kata/56747fd5cb988479af000028">Get the Middle Character</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>You are going to be given a word. Your job is to return the middle character of the word. 
If the word's length is odd, return the middle character. 
If the word's length is even, return the middle 2 characters.</p>
<h3>Examples:</h3>
<pre>
Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A"
</pre>
<h4>Input:</h4>
<p>A word (string) of length <code>0 < str < 1000</code> 
(In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). 
You do not need to test for this. 
This is only here to tell you that you do not need to worry about your solution timing out.</p>
<h4>Output:</h4>
<p>The middle character(s) of the word represented as a string.</p>