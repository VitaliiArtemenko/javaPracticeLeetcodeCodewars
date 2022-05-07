<h1><a href="https://www.codewars.com/kata/5a54e796b3bfa8932c0000ed">Jumping Number (Special Numbers Series #4)</a></h1>
<h2>7 Kuy</h2>
<hr>
<h3>Definition</h3>
<p><strong>Jumping number</strong> is the number that All adjacent digits in it differ by 1.</p>
<hr>
<h3>Task</h3>
<p>Given a number, find if it is Jumping or not.</p>
<hr>
<h3>Notes</h3>
<ul>
<li>Number passed is always positive.</li>
<li>Return the result as <code>String</code>.</li>
<li>The difference between <code>9</code> and <code>0</code> is not considered as <code>1</code>.</li>
<li>All single digit numbers are considered as Jumping numbers.</li>
</ul>
<hr>
<h3>Input >> Output Examples</h3>
<hr><hr>
<pre>jumpingNumber(9) ==> return "Jumping!!"</pre>
<h3>Explanation:</h3>
<li>It's single-digit number</li>
<hr>
<pre>jumpingNumber(79) ==> return "Not!!"</pre>
<h3>Explanation:</h3>
<li>Adjacent digits don't differ by 1</li>
<hr>
<pre>jumpingNumber(23) ==> return "Jumping!!"</pre>
<h3>Explanation:</h3>
<li>Adjacent digits differ by 1</li>
<hr>
<pre>jumpingNumber(556847) ==> return "Not!!"</pre>
<h3>Explanation:</h3>
<li>Adjacent digits don't differ by 1</li>
<hr>
<pre>jumpingNumber(4343456) ==> return "Jumping!!"</pre>
<h3>Explanation:</h3>
<li>Adjacent digits differ by 1</li>
<hr>
<pre>jumpingNumber(89098) ==> return "Not!!"</pre>
<h3>Explanation:</h3>
<li>Adjacent digits don't differ by 1</li>
<hr>
<pre>jumpingNumber(32) ==> return "Jumping!!"</pre>
<h3>Explanation:</h3>
<li>Adjacent digits differ by 1</li>
<hr>