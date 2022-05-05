<h1><a href="https://www.codewars.com/kata/598d91785d4ce3ec4f000018">Word values</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>Given a string <code>"abc"</code> and assuming that each letter in the string has a value 
equal to its position in the alphabet, our string will have a value of <code>1 + 2 + 3 = 6</code>. 
This means that: <code>a = 1, b = 2, c = 3 ....z = 26</code>.</p>
<p>You will be given a list of strings and your task will be to return the values of the strings 
as explained above multiplied by the position of that string in the list. 
For our purpose, position begins with <code>1</code>.</p>
<p><code>nameValue ["abc","abc abc"]</code> should return <code>[6,24]</code> because of <code>[ 6 * 1, 12 * 2 ]</code>. 
Note how spaces are ignored.</p>
<p><code>"abc"</code> has a value of <code>6</code>, while <code>"abc abc"</code> has a value of <code>12</code>. 
Now, the value at position 1 is multiplied by 1 while the value at position 2 is multiplied by 2.</p>
<p>Input will only contain lowercase characters and spaces.</p>