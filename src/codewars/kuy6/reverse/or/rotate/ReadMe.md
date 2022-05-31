<h1><a href="https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991">Reverse or rotate?</a></h1>
<h2>6 Kuy</h2>
<hr>
<p>The input is a string <code>str</code> of digits. 
Cut the string into chunks (a chunk here is a substring of the initial string) 
of size <code>sz</code> (ignore the last chunk if its size is less than <code>sz</code>).</p>
<p>If a chunk represents an integer such as the <strong>sum of the cubes of its digits is divisible by 2</strong>, 
reverse that chunk; otherwise rotate it to the left by one position. 
Put together these modified chunks and return the result as a string.</p>
<p>If:</p>
<ul>
<li><code>sz</code> is <code><= 0</code> or if <code>str</code> is empty return ""</li>
<li><code>sz</code> is greater than the length of <code>str</code> 
it is impossible to take a chunk of size sz hence return "".</li>
</ul>
<h3>Examples:</h3>
<pre>
reverseOrRotate("123456987654", 6) --> "234561876549"
reverseOrRotate("123456987653", 6) --> "234561356789"
reverseOrRotate("66443875", 4) --> "44668753"
reverseOrRotate("66443875", 8) --> "64438756"
reverseOrRotate("664438769", 8) --> "67834466"
reverseOrRotate("123456779", 8) --> "23456771"
reverseOrRotate("", 8) --> ""
reverseOrRotate("123456779", 0) --> "" 
reverseOrRotate("563000655734469485", 4) --> "0365065073456944"
</pre>
<h3>Example of a string rotated to the left by one position:</h3>
<pre>s = "123456" gives "234561"</pre>