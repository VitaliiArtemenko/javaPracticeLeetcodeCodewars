<h1><a href="https://www.codewars.com/kata/55b4d87a3766d9873a0000d4">How Much?</a></h1>
<h2>6 Kuy</h2>
<hr>
<p>I always thought that my old friend John was rather richer than he looked, 
but I never knew exactly how much money he actually had. 
One day (as I was plying him with questions) he said:</p>
<ul>
<li>"Imagine I have between <code>m</code> and <code>n</code> Zloty..." (or did he say Quetzal? I can't remember!)</li>
<li>"If I were to buy <strong>9</strong> cars costing <code>c</code> each, I'd only have 1 Zloty (or was it Meticals?) left."</li>
<li>"And if I were to buy <strong>7</strong> boats at <code>b</code> each, I'd only have 2 Ringglets (or was it Zloty?) left."</li>
</ul>
<p>Could you tell me in each possible case:</p>
<ol>
<li>how much money <code>f</code> he could possibly have ?</li>
<li>the cost <code>c</code> of a car?</li>
<li>the cost <code>b</code> of a boat?</li>
</ol>
<p>So, I will have a better idea about his fortune. Note that if <code>m-n</code> is big enough, 
you might have a lot of possible answers.</p>
<p>Each answer should be given as <code>["M: f", "B: b", "C: c"]</code> and all the answers as 
<code>[ ["M: f", "B: b", "C: c"], ... ]</code>. "M" stands for money, "B" for boats, "C" for cars.</p>
<p><strong>Note:</strong> <code>m, n, f, b, c</code> are positive integers, 
where <code>0 <= m <= n</code> or <code>m >= n >= 0</code>. 
<code>m</code> and <code>n</code> are inclusive.</p>
<h3>Examples:</h3>
<pre>
howMuch(1, 100)      => [["M: 37", "B: 5", "C: 4"], ["M: 100", "B: 14", "C: 11"]]
howMuch(1000, 1100)  => [["M: 1045", "B: 149", "C: 116"]]
howMuch(10000, 9950) => [["M: 9991", "B: 1427", "C: 1110"]]
howMuch(0, 200)      => [["M: 37", "B: 5", "C: 4"], ["M: 100", "B: 14", "C: 11"], ["M: 163", "B: 23", "C: 18"]]
</pre>
<p>Explanation of the results for <code>howMuch(1, 100)</code>:</p>
<ul>
<li>In the first answer his possible fortune is <strong>37</strong>:</li>
<li>so he can buy 7 boats each worth 5: <code>37 - 7 * 5 = 2</code></li>
<li>or he can buy 9 cars worth 4 each: <code>37 - 9 * 4 = 1</code></li>
<li>The second possible answer is <strong>100</strong>:</li>
<li>he can buy 7 boats each worth 14: <code>100 - 7 * 14 = 2</code></li>
<li>or he can buy 9 cars worth 11: <code>100 - 9 * 11 = 1</code></li>
</ul>