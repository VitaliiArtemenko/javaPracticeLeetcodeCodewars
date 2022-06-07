<h1><a href="https://www.codewars.com/kata/5ce399e0047a45001c853c2b">Sums of Parts</a></h1>
<h2>6 Kuy</h2>
<hr>
<p>et us consider this example (array written in general format):</p>
<p><code>ls = [0, 1, 3, 6, 10]</code></p>
<p>Its following parts:</p>
<pre>
ls = [0, 1, 3, 6, 10]
ls = [1, 3, 6, 10]
ls = [3, 6, 10]
ls = [6, 10]
ls = [10]
ls = []
</pre>
<p>The corresponding sums are (put together in a list): <code>[20, 20, 19, 16, 10, 0]</code></p>
<p>The function <code>partsSums</code> will take as parameter a list <code>ls</code> 
and return a list of the sums of its parts as defined above.</p>
<p><strong>Other Examples:</strong></p>
<pre>
ls = [1, 2, 3, 4, 5, 6] 
parts_sums(ls) -> [21, 20, 18, 15, 11, 6, 0]

ls = [744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358]
parts_sums(ls) -> [10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0]
</pre>
<p><strong>Notes:</strong></p>
<ul>
<li>Take a look at performance: some lists have thousands of elements.</li>
</ul>
