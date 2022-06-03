<h1><a href="https://www.codewars.com/kata/523f5d21c841566fde000009">Array.diff</a></h1>
<h2>6 Kuy</h2>
<hr>
<p>Your goal in this kata is to implement a difference function, 
which subtracts one list from another and returns the result.</p>
<p>It should remove all values from list <code>a</code>, 
which are present in list <code>b</code> keeping their order.</p>
<pre>
arrayDiff([<span style="color: darkorange">1, 2</span>],[<span style="color: darkorange">1</span>]) == [<span style="color: darkorange">2</span>]
</pre>
<p>If a value is present in <code>b</code>, all of its occurrences must be removed from the other:</p>
<pre>
arrayDiff([<span style="color: darkorange">1, 2, 2, 2, 3</span>],[<span style="color: darkorange">2</span>]) == [<span style="color: darkorange">1, 3</span>]
</pre>