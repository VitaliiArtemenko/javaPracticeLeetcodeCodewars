<h1><a href="https://www.codewars.com/kata/56a4872cbb65f3a610000026">Rotate for a Max</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>Let us begin with an example:</p>
<p>Take a number: <code>56789</code>. Rotate left, you get <code>67895</code>.</p>
<p>Keep the first digit in place and rotate left the other digits: <code>68957</code>.</p>
<p>Keep the first two digits in place and rotate the other ones: <code>68579</code>.</p>
<p>Keep the first three digits and rotate left the rest: <code>68597</code>. 
Now it is over since keeping the first four it remains only one digit which rotated is itself.</p>
<p>You have the following sequence of numbers:</p>
<p><code>56789 -> 67895 -> 68957 -> 68579 -> 68597</code></p>
<p>and you must return the greatest: <code>68957</code>.</p>
<h3>Task:</h3>
<p>Write function <code>maxRot</code> which given a positive integer <code>n</code> 
returns the maximum number you got doing rotations similar to the above example.</p>
<h3>Examples:</h3>
<pre>
maxRot(56789) should return 68957

maxRot(38458215) should return 85821534
</pre>