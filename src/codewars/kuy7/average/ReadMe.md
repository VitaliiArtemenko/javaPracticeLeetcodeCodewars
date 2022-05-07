<h1><a href="https://www.codewars.com/kata/569b5cec755dd3534d00000f">Looking for a benefactor</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>The accounts of the "Fat to Fit Club (FFC)" association are supervised by John as a volunteered accountant. 
The association is funded through financial donations from generous benefactors. 
John has a list of the first <code>n</code> donations: <code>[14, 30, 5, 7, 9, 11, 15] </code>.
He wants to know how much the next benefactor should give to the association 
so that the average of the first <code>n + 1</code> donations should reach an average of <code>30</code>. 
After doing the math he found <code>149</code>. He thinks that he could have made a mistake.</p>
<p>if <code>dons = [14, 30, 5, 7, 9, 11, 15]</code> then <code>new_avg(dons, 30) --> 149</code></p>
<p>Could you help him?</p>
<h3>Task</h3>
<p>The function <code>newAvg(arr, navg)</code> should return the expected donation 
(rounded up to the next integer) that will permit to reach the average <code>navg</code>.</p>
<p>Should the last donation be a non positive number (<= 0) John wants us to return:</p>
<ul>
<li>IllegalArgumentException() in Java</li>
<li>Error in JavaScript</li>
</ul>
<h3>Notes:</h3>
<ul>
<li>all donations and <code>navg</code> are numbers (integers or floats), <code>arr</code> can be empty.</li>
<li>See examples below and "Sample Tests" to see which return is to be done.</li>
</ul>
<pre>
new_avg([14, 30, 5, 7, 9, 11, 15], 92) should return 645

new_avg([14, 30, 5, 7, 9, 11, 15], 2) 
should raise an error (IllegalArgumentException()) or return empty string depending on the language.
</pre>