<h1><a href="https://www.codewars.com/kata/56dbe0e313c2f63be4000b25">Moves in squared strings (I)</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>You are given a string of n lines, each substring being <code>n</code> characters long.<br>
For example:</p>
<p><code>s = "abcd\nefgh\nijkl\nmnop"</code></p>
<p>We will study some transformations of this square of strings.</p>
<ul>
<li>Vertical mirror: vertMirror
<pre>vertMirror(s) => "dcba\nhgfe\nlkji\nponm"</pre></li>
<li>Horizontal mirror: horMirror
<pre>horMirror(s) => "mnop\nijkl\nefgh\nabcd"</pre></li>
<li>or printed:
<pre>
vertMirror        |horMirror   
abcd --> dcba     |abcd --> mnop 
efgh     hgfe     |efgh     ijkl 
ijkl     lkji     |ijkl     efgh 
mnop     ponm     |mnop     abcd 
</pre></li>
</ul>
<h3>Task:</h3>
<ul>
<li>Write these two functions</li>
<p>and</p>
<li>high-order function <code>oper(fct, s)</code> where</li>
<li>fct is the function of one variable <code>f</code> to apply to the string <code>s</code> 
(fct will be one of <code>vertMirror, horMirror</code>)</li>
</ul>
<h3>Examples:</h3>
<pre>
s = "abcd\nefgh\nijkl\nmnop"
oper(vertMirror, s) => "dcba\nhgfe\nlkji\nponm"
oper(horMirror, s) => "mnop\nijkl\nefgh\nabcd"
</pre>