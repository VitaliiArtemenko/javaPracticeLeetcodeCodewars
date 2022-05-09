<h1><a href="https://www.codewars.com/kata/55466989aeecab5aac00003e">Rectangle into Squares</a></h1>
<h2>6 Kuy</h2>
<hr>
<p>The drawing below gives an idea of how to cut a given "true" rectangle into squares 
("true" rectangle meaning that the two dimensions are different).</p>
<p><img alt="alternative text" src="https://i.imgur.com/lk5vJ7sm.jpg"></p>
<p>Can you translate this drawing into an algorithm?</p>
<p>You will be given two dimensions</p>
<ul>
<li>a positive integer length</li>
<li>a positive integer width</li>
</ul>
<p>You will return a collection (or array) with the size of each of the squares.</p>
<h3>Examples in general form:</h3>
<pre>
sqInRect(5, 3) should return [3, 2, 1, 1]
sqInRect(3, 5) should return [3, 2, 1, 1]
</pre>
<h3>Notes:</h3>
<ul>
<li><code>lng == wdth</code> as a starting case would be an entirely different problem 
and the drawing is planned to be interpreted with <code>lng != wdth</code>.</li>
<li>When the initial parameters are so that <code>lng == wdth</code>, 
the solution <code>[lng]</code> would be the most obvious but not in the spirit of this kata so, 
in that case, return <code>null</code></li>
</ul>