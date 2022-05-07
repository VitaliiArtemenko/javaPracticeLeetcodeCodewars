<h1><a href="https://www.codewars.com/kata/58ee4db3e479611e6f000086">Odd March Bits 8 bits</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>Therefore the <code>n</code> bits march from right to left along an <code>8</code> bits path. 
Once the most-significant bit reaches the left their March is done. Each step will be saved as an array of <code>8</code> integers.</p>
<p>Return an array of all the steps.</p>
<p><code>1 <= n <= 8</code></p>
<p>NOTE: <code>n != 0</code>, because <code>n</code> represents the number of <code>1</code>s.</p>
<h3>Examples</h3>
<p>This resembles a simple 8 LED chaser:</p>
<pre>
n = 3

00000111
00001110
00011100
00111000
01110000
11100000
</pre>
<pre>
n = 7

01111111
11111110
</pre>