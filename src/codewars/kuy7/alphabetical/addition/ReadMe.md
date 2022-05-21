<h1><a href="https://www.codewars.com/kata/5d50e3914861a500121e1958">Alphabetical Addition</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>Your task is to add up letters to one letter.</p>
<p>The function will be given an array of single character Strings, each one being a letter to add.</p>
<h3>Notes:</h3>
<ul>
<li>Letters will always be lowercase.</li>
<li>Letters can overflow (see second to last example of the description)</li>
<li>If no letters are given, the function should return <code>'z'</code></li>
</ul>
<h3>Examples:</h3>
<pre>
addLetters("a", "b", "c") = "f"
addLetters("a", "b") = "c"
addLetters("z") = "z"
addLetters("z", "a") = "a"
addLetters("y", "c", "b") = "d" // notice the letters overflowing
addLetters() = "z"
</pre>
<p>Confused? Roll your mouse/tap over 
<abbr title="Start by converting the letters to numbers, a => 1, b => 2, etc. Add them up. 
Think about the overflow yourself. Once that's done, convert it back to a letter.">here</abbr>
</p>