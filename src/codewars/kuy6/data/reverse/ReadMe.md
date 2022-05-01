<h1><a href="https://www.codewars.com/kata/569d488d61b812a0f7000015">Data Reverse</a></h1>
<h2>6 Kuy</h2>
<hr>
<p>A stream of data is received and needs to be reversed</p>
<p>Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:</p>
<pre>
11111111  00000000  00001111  10101010
 (byte1)   (byte2)   (byte3)   (byte4)
</pre>
<p>should become:</p>
<pre>
10101010  00001111  00000000  11111111
 (byte4)   (byte3)   (byte2)   (byte1)
</pre>
<p>The total number of bits will always be a multiple of 8.</p>
<p>The data is given in an array as such:</p>
<p>[1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]</p>