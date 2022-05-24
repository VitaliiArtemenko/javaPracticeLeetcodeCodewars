<h1><a href="https://www.codewars.com/kata/5626b561280a42ecc50000d1">Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!</a></h1>
<h2>6 Kuy</h2>
<hr>
<p>The number <code>89</code> is the first integer with more than one digit 
that fulfills the property partially introduced in the title of this kata. 
What's the use of saying "Eureka"? Because this sum gives the same number.</p>
<p>In effect: <code>89 = 8^1 + 9^2</code></p>
<p>he next number in having this property is <code>135</code>.</p>
<p>See this property again: <code>135 = 1^1 + 3^2 + 5^3</code></p>
<p>We need a function to collect these numbers, that may receive two integers <code>a</code>, <code>b</code> 
that defines the range <code>[a, b]</code> (inclusive) and outputs a list of the sorted numbers in the range 
that fulfills the property described above.</p>
<p>Let's see some cases:</p>
<pre>
sumDigPow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]

sumDigPow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
</pre>
<p>If there are no numbers of this kind in the range [a, b] the function should output an empty list.</p>
<pre>sumDigPow(90, 100) == []</pre>