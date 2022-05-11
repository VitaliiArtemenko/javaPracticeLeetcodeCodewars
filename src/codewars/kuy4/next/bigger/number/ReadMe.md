<h1><a href="https://www.codewars.com/kata/55983863da40caa2c900004e">Next bigger number with the same digits</a></h1>
<h2>4 Kuy</h2>
<hr>
<p>Create a function that takes a positive integer and returns the next bigger number 
that can be formed by rearranging its digits. For example:</p>
<pre>
12 ==> 21
513 ==> 531
2017 ==> 2071
</pre>
<pre>
nextBiggerNumber(num: 12)   // returns 21
nextBiggerNumber(num: 513)  // returns 531
nextBiggerNumber(num: 2017) // returns 2071
</pre>
<p>If the digits can't be rearranged to form a bigger number, return -1</p>
<pre>
9 ==> -1
111 ==> -1
531 ==> -1
</pre>