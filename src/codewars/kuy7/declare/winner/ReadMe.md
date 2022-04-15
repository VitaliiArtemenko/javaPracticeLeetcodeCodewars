<h1><a href="https://www.codewars.com/kata/577bd8d4ae2807c64b00045b">Two fighters, one winner</a></h1>
<h2>7 Kuy</h2>
<hr>
<p>Create a function that returns the name of the winner in a fight between two fighters.</p>
<p>Each fighter takes turns attacking the other and whoever kills the other first is victorious. 
Death is defined as having <code>health <= 0</code>.</p>
<p>Each fighter will be a <code>Fighter</code> object/instance. See the Fighter class below in your chosen language.</p>
<p>Both <code>health</code> and <code>damagePerAttack</code> will be integers larger than <code>0</code>. 
You can mutate the <code>Fighter</code> objects.</p>
<h3>Example:</h3>
<pre>
declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"

Lew attacks Harry; Harry now has 3 health.
Harry attacks Lew; Lew now has 6 health.
Lew attacks Harry; Harry now has 1 health.
Harry attacks Lew; Lew now has 2 health.
Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
</pre>


