<h1><a href="https://www.codewars.com/kata/59377c53e66267c8f6000027">Alphabet war</a></h1>
<h2>7 Kuy</h2>
<hr>
<h3>Introduction</h3>
<p>There is a war and nobody knows - the alphabet war!<br>
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.</p>
<h3>Task</h3>
<p>Write a function that accepts <code>fight</code> string consists of only small letters and return who wins the fight. 
When the left side wins return <code>Left side wins!</code>, 
when the right side wins return <code>Right side wins!</code>, 
in other case return <code>Let's fight again!</code>.</p>
<p>The left side letters and their power:</p>
<pre>
w - 4
 p - 3
 b - 2
 s - 1
</pre>
<p>The right side letters and their power:</p>
<pre>
 m - 4
 q - 3
 d - 2
 z - 1
</pre>
<p>The other letters don't have power and are only victims.</p>
<h3>Examples:</h3>
<pre>
AlphabetWar("z");        //=> Right side wins!
AlphabetWar("zdqmwpbs"); //=> Let's fight again!
AlphabetWar("zzzzs");    //=> Right side wins!
AlphabetWar("wwwwwwz");  //=> Left side wins!
</pre>