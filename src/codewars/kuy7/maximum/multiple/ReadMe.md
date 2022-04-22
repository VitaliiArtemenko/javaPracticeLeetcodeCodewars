<h1><a href="https://www.codewars.com/kata/5aba780a6a176b029800041c">Maximum Multiple</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>Given a Divisor and a Bound , Find the largest integer N , Such That ,</p>
<h3>Conditions:</h3>
<ul>
<li>N is divisible by divisor</li>
<li>N is less than or equal to bound</li>
<li>N is greater than 0.</li>
</ul><hr>
<h3>Notes:</h3>
<ul>
<li>The parameters (divisor, bound) passed to the function are only positive values .</li>
<li>It's guaranteed that a divisor is Found .</li>
</ul><hr>
<h2>Input >> Output Examples:</h2><h3>Example:</h3><pre>maxMultiple (2,7) ==> return (6)</pre>
<h3>Explanation:</h3><pre>(6) is divisible by (2) , (6) is less than or equal to bound (7) , and (6) is > 0 .</pre><hr>
<h3>Example:</h3><pre>maxMultiple (10,50)  ==> return (50)</pre>
<h3>Explanation:</h3><pre>(50) is divisible by (10) , (50) is less than or equal to bound (50) , and (50) is > 0</pre><hr>
<h3>Example:</h3><pre>maxMultiple (37,200) ==> return (185)</pre>
<h3>Explanation:</h3><pre>(185) is divisible by (37) , (185) is less than or equal to bound (200) , and (185) is > 0 .</pre><hr>
<p><strong>Note:</strong>Java's default return statement can be any int, a divisor will be found.</p>