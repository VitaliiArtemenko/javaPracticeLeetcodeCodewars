<h1><a href="https://www.codewars.com/kata/576bb3c4b1abc497ec000065">Compare Strings by Sum of Chars</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>Compare two strings by comparing the sum of their values (ASCII character code).</p>
<ul>
<li>For comparing treat all letters as UpperCase</li>
<li><code>null</code> should be treated as empty strings</li>
<li>If the string contains other characters than letters, treat the whole string as it would be empty</li>
</ul>
<p>Your method should return <code>true</code>, if the strings are equal and <code>false</code> if they are not equal.</p>
<h3>Examples:</h3>
<pre>
"AD", "BC"  -> equal
"AD", "DD"  -> not equal
"gf", "FG"  -> equal
"zz1", ""   -> equal (both are considered empty)
"ZzZz", "ffPFF" -> equal
"kl", "lz"  -> not equal
null, ""    -> equal
</pre>