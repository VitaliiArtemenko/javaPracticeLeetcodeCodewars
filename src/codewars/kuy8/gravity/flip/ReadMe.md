<h1><a href="https://www.codewars.com/kata/5f70c883e10f9e0001c89673/train/javascript">Gravity Flip</a></h1><h2>8 Kuy</h2><hr><div><p>Bob is bored during his physics lessons so he's built himself a toy box to help pass the time. The box is special because it has the ability to change gravity.</p>
<hr>
<p>There are some columns of toy cubes in the box arranged in a line. The <code>i</code>-th column contains <code>a_i</code> cubes. At first, the gravity in the box is pulling the cubes downwards. When Bob switches the gravity, it begins to pull all the cubes to a certain side of the box, <code>d</code>, which can be either <code>'L'</code> or <code>'R'</code> (left or right). Below is an example of what a box of cubes might look like before and after switching gravity.</p>

<div style="background-color: #333333">
<pre><code>
+---+                                       +---+
|   |                                       |   |
+---+                                       +---+
+---++---+     +---+              +---++---++---+
|   ||   |     |   |   -->        |   ||   ||   |
+---++---+     +---+              +---++---++---+
+---++---++---++---+         +---++---++---++---+
|   ||   ||   ||   |         |   ||   ||   ||   |
+---++---++---++---+         +---++---++---++---+
</code>
</pre>
</div>


<p>You can return the answer in any order.</p>
<p><strong>Example 1:</strong></p>

<p>Given the initial configuration of the cubes in the box, find out how many cubes are in each of the <code>n</code> columns after Bob switches the gravity.</p>

<p>Examples:</p>

style="background-color: #333333">
<pre><code><strong>flip</strong>(<span style="color: #f9cd0b">'R'</span>, [<span style="color: darkorange"> 3, 2, 1, 2</span>])     =>  [<span style="color: darkorange"> 1, 2, 2, 3</span>]
flip(<span style="color: #f9cd0b">'L'</span>, [<span style="color: darkorange"> 1, 4, 5, 3, 5</span>])  =>  [<span style="color: darkorange"> 5, 5, 4, 3, 1</span>]</code></pre></div>