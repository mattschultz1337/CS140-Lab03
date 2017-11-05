<div class="post_region_content note" id="view_quesiton_note">
        
<h1 data-pats="title_text" class="post_region_title">lab03 A a54</h1>

<div class="post_region_text" id="questionText"><p>Lab 03 A</p>
<h1>UPDATED: DUE September 8 11:59pm</h1>
<p dir="auto">All packages in&nbsp;<strong>package lab03</strong>.</p>
<p dir="auto"></p>
<h2>Command-line Arguments</h2>
<p dir="auto">When you input the&nbsp;command&nbsp;<code>javac -d . *.java</code>,&nbsp;everything after&nbsp;the&nbsp;<code>javac</code>&nbsp;command&nbsp;is said to be its arguments. Java lets us write programs that accept and handle command-line arguments too, that is exactly&nbsp;what&nbsp;<code>String[] args</code>&nbsp;are&nbsp;in&nbsp;the main methods you write.</p>
<p dir="auto"></p>
<p dir="auto">Create the following class:</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">package</span><span class="pln"> lab03</span><span class="pun">;</span><span class="pln">

</span><span class="kwd">import</span><span class="pln"> java</span><span class="pun">.</span><span class="pln">util</span><span class="pun">.</span><span class="typ">Arrays</span><span class="pun">;</span><span class="pln">

</span><span class="com">/* YOUR ANSWERS HERE:
 * ------------------
 * 1.
 * 2.
 * 3.
 * 4.
 * 5.
 */</span><span class="pln">

</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">class</span><span class="pln"> </span><span class="typ">EchoArgs</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> main</span><span class="pun">(</span><span class="typ">String</span><span class="pun">[]</span><span class="pln"> args</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
        </span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="typ">Arrays</span><span class="pun">.</span><span class="pln">toString</span><span class="pun">(</span><span class="pln">args</span><span class="pun">));</span><span class="pln">
    </span><span class="pun">}</span><span class="pln">
</span><span class="pun">}</span></pre>
<p dir="auto">This program simply prints any arguments you give to it. In the given comment block,&nbsp;<strong>fill in</strong>&nbsp;what gets print out when you execute (copy/paste each command)</p>
<ol><li><code>java -cp . lab03.EchoArgs</code></li><li><code>java -cp . lab03.EchoArgs hello</code></li><li><code>java -cp . lab03.EchoArgs hello world</code></li><li><code>java -cp . lab03.EchoArgs 'hello world'</code></li><li><code>java -cp . lab03.EchoArgs *.java</code></li></ol>
<p dir="auto">Your answers in the comment will be graded.</p>
<h2>Exceptions</h2>
<p dir="auto">You may have encountered&nbsp;<a href="http://cs.binghamton.edu/%7Emhems1/cs140s17/pitfalls/exceptions.html" target="_blank" rel="noreferrer">Exceptions</a>&nbsp;in doing previous assignments but we are now going to formally introduce them. Simply put, exceptions are the way for&nbsp;signalling&nbsp;<strong>and</strong>&nbsp;handling when things go wrong during a program's&nbsp;<strong>runtime</strong>. When working with an array, one exception we could come across&nbsp;is&nbsp;<code>ArrayIndexOutOfBoundsException</code>.&nbsp;This will happen when accessing an element with an index less than zero or an index greater than&nbsp;<strong>or equal to</strong>&nbsp;the array's length. A more common exception&nbsp;is&nbsp;<code>NullPointerException</code>&nbsp;which&nbsp;happens whenever you try to do something with nothing. While primitive (basic) types like int have predefined default values like 0, arrays' and Objects' default value&nbsp;is&nbsp;<code>null</code>.&nbsp;If you don't initialize an Object, it&nbsp;remains&nbsp;<code>null</code>.&nbsp;If you then try and call a method on that Object, you will get a NullPointerException for trying to do something (call a method) on nothing (the&nbsp;<code>null</code>&nbsp;Object). See if you can spot the bug in the following code:</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">class</span><span class="pln"> </span><span class="typ">BadClass</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="kwd">private</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> myArray</span><span class="pun">;</span><span class="pln">

    </span><span class="kwd">public</span><span class="pln"> </span><span class="typ">BadClass</span><span class="pun">()</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
        </span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"There are "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> myArray</span><span class="pun">.</span><span class="pln">length </span><span class="pun">+</span><span class="pln"> </span><span class="str">" elements"</span><span class="pun">);</span><span class="pln">
    </span><span class="pun">}</span><span class="pln">
</span><span class="pun">}</span></pre>
<p dir="auto">Recall exceptions are for&nbsp;signalling&nbsp;and handling errors. To signal an error (i.e. exception)&nbsp;we&nbsp;<code>throw</code>&nbsp;a&nbsp;new Exception object. Once you signal an error, the function caller can choose to either handle or ignore the exception.&nbsp;The&nbsp;<code>IllegalArgumentException</code>&nbsp;class&nbsp;is commonly used to tell the method caller they have provided an illegal argument to the method.</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">double</span><span class="pln"> factorial</span><span class="pun">(</span><span class="kwd">int</span><span class="pln"> num</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="kwd">if</span><span class="pln"> </span><span class="pun">(</span><span class="pln">num </span><span class="pun">&lt;</span><span class="pln"> </span><span class="lit">0</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
        </span><span class="kwd">throw</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">IllegalArgumentException</span><span class="pun">(</span><span class="str">"Cannot take factorial of negative number"</span><span class="pun">);</span><span class="pln">
    </span><span class="pun">}</span><span class="pln">
    </span><span class="com">// ...</span><span class="pln">
</span><span class="pun">}</span></pre>
<p dir="auto">A common error that might occur when doing input/output with files is that the file might not be there. This is what&nbsp;the&nbsp;<code>FileNotFoundException</code>&nbsp;class&nbsp;represents. To handle the possibility of an error,&nbsp;we&nbsp;<code>try</code>&nbsp;to&nbsp;do the dangerous code, and if anything goes wrong&nbsp;we&nbsp;<code>catch</code>&nbsp;it.</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">try</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="typ">File</span><span class="pln"> myFile </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">File</span><span class="pun">(</span><span class="str">"file_that_doesnt_exist.txt"</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span><span class="pln"> </span><span class="kwd">catch</span><span class="pun">(</span><span class="typ">FileNotFoundException</span><span class="pln"> e</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"That file does not exist!"</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span></pre>
<p dir="auto">Armed with&nbsp;knowledge&nbsp;of how to use command-line arguments and exceptions, let's do some coding.</p>
<p dir="auto"></p>
<p dir="auto">Create a class,&nbsp;<code>ArrayFromFile</code>&nbsp;with&nbsp;one&nbsp;<code>private</code>&nbsp;field,&nbsp;an&nbsp;<code>int[]</code>&nbsp;named&nbsp;<code>array</code>.&nbsp;The idea of this class is to hold an array whose elements it reads from a given file.&nbsp;Import&nbsp;<code>java.io.File</code>,&nbsp;<code>java.util.Scanner</code>,&nbsp;and&nbsp;<code>java.util.Arrays</code>.&nbsp;Create a constructor that accepts&nbsp;a&nbsp;<code>String filename</code>.&nbsp;The constructor will&nbsp;populate&nbsp;<code>array</code>&nbsp;with&nbsp;integers read from the file with&nbsp;name&nbsp;<code>filename</code>.&nbsp;The body of your constructor will start off with</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="typ">ArrayFromFile</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> filename</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="com">// try-with-resources block (sc is the resource we are trying to use)</span><span class="pln">
    </span><span class="kwd">try</span><span class="pln"> </span><span class="pun">(</span><span class="typ">Scanner</span><span class="pln"> sc </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">Scanner</span><span class="pun">(</span><span class="kwd">new</span><span class="pln"> </span><span class="typ">File</span><span class="pun">(</span><span class="pln">filename</span><span class="pun">)))</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

    </span><span class="pun">}</span><span class="pln"> </span><span class="kwd">catch</span><span class="pln"> </span><span class="pun">(</span><span class="typ">Exception</span><span class="pln"> e</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

    </span><span class="pun">}</span><span class="pln">
</span><span class="pun">}</span></pre>
<p dir="auto">The&nbsp;<code>Scanner</code>&nbsp;class&nbsp;is for scanning files and reading their data. We will&nbsp;<strong>try</strong>&nbsp;to read integers from it and if anything goes wrong, we will&nbsp;<strong>catch</strong>&nbsp;the error. The format of the files you will be reading from is:</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="pln">N
num_1
num_2
</span><span class="pun">.</span><span class="pln">
</span><span class="pun">.</span><span class="pln">
</span><span class="pun">.</span><span class="pln">
num_N</span></pre>
<p dir="auto">where the first&nbsp;integer&nbsp;<code>N</code>&nbsp;signifies&nbsp;how&nbsp;many&nbsp;more numbers, each on their own line, are to come. With our scanner&nbsp;named&nbsp;<code>sc</code>,&nbsp;we can retrieve the next integer from the file with the&nbsp;method&nbsp;<code>nextInt()</code>.</p>
<p dir="auto">In the try block, determine the&nbsp;length&nbsp;<code>array</code>&nbsp;should&nbsp;be by reading the first int and&nbsp;initialize&nbsp;<code>array</code>&nbsp;to&nbsp;an int array of that length. Then read that many integers, putting each in subsequent indices in the array.</p>
<p dir="auto">In the catch block,&nbsp;assign&nbsp;<code>array</code>&nbsp;to&nbsp;an empty array. If anything wrong occurs, this leaves&nbsp;the&nbsp;<code>array</code>&nbsp;empty&nbsp;and not&nbsp;<strong>null</strong>.</p>
<p dir="auto"></p>
<p dir="auto">In&nbsp;<code>ArrayFromFile</code>,&nbsp;create a getter method&nbsp;for&nbsp;<code>array</code>&nbsp;as&nbsp;well as a&nbsp;<code>toString</code>&nbsp;method that&nbsp;returns&nbsp;<code>Arrays.toString(array)</code>.</p>
<p dir="auto">Now to test your ArrayFromFile implementation, create a class&nbsp;called&nbsp;<code>ArrayTester</code>&nbsp;with&nbsp;a main&nbsp;method. In the main method, check how many arguments you were passed in through the command-line. If you received exactly 1 argument, create a&nbsp;new&nbsp;<code>ArrayFromFile</code>&nbsp;object, passing in that argument to the constructor. Print out a statement detailing what you expect to be printed out (see below). Then print out&nbsp;the&nbsp;<code>ArrayFromFile</code>&nbsp;you&nbsp;created. You can just print the object - since we implemented a toString method, Java will call it automatically for us. If you received anything other than exactly 1 argument, throw an IllegalArgumentException with a message explaining the program requires exactly 1 argument.</p>
<p dir="auto"></p>
<p dir="auto">You can use the following file (call it&nbsp;<code>input.txt</code>):</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="lit">5</span><span class="pln">
</span><span class="lit">20</span><span class="pln">
</span><span class="lit">8</span><span class="pln">
</span><span class="lit">13</span><span class="pln">
</span><span class="lit">46</span><span class="pln">
</span><span class="lit">7</span></pre>
<p dir="auto">Test that your program's output statements match.</p>
<h2>More with the enhanced for loop</h2>
<p dir="auto">In&nbsp;the&nbsp;<code>ArrayFromFile</code>&nbsp;class, create a&nbsp;method&nbsp;<code>public void removeOddElements()</code>.&nbsp;This method has two for loops, they must both be enhanced for loops or no credit.&nbsp;The&nbsp;<code>void</code>&nbsp;means&nbsp;that the method returns nothing. This method will have the effect of removing the odd elements&nbsp;of&nbsp;<code>array</code>,&nbsp;or from another perspective, only keeping the even elements. First, we must know how many even elements are in the array so use an enhanced&nbsp;for-loop&nbsp;to count the number of even ints&nbsp;in&nbsp;<code>array</code>.&nbsp;An int is even if that int divided by 2 has remainder 0, or in Java/C/Python&nbsp;<code>i % 2 == 0</code>.&nbsp;Make a temporary array whose length is the number of even ints&nbsp;in&nbsp;<code>array</code>.&nbsp;Make an&nbsp;int&nbsp;<code>index</code>&nbsp;variable, initialized to 0, to track which index in the temporary array we are at. Use an enhanced for loop to go&nbsp;through&nbsp;<code>array</code>&nbsp;once&nbsp;more. If the current int is even, copy it to&nbsp;the&nbsp;<code>index</code>&nbsp;slot&nbsp;in the temporary array and&nbsp;increment&nbsp;<code>index</code>.&nbsp;After the for loop, we must assign the temporary array&nbsp;to&nbsp;<code>array</code>&nbsp;to&nbsp;make our changes persist after the method.</p>
<p dir="auto"></p>
<p dir="auto">Back in the main method&nbsp;of&nbsp;<code>ArrayTester</code>,&nbsp;after you create&nbsp;the&nbsp;<code>ArrayFromFile</code>&nbsp;object&nbsp;and print it, call&nbsp;the&nbsp;<code>removeOddElements</code>&nbsp;method&nbsp;on it. Print out what you expect to be printed out as well as&nbsp;the&nbsp;<code>ArrayFromFile</code>&nbsp;after&nbsp;removal to verify your method works.</p>
<p dir="auto"></p>
<p dir="auto">Still in this main method, but at the end. declare an int array of length 5. Print it out using&nbsp;<code>Arrays.toString</code>&nbsp;(don't forget to&nbsp;<code>import java.util.Arrays</code>). Note each element gets int's default of 0. Copy/paste the following enhanced for loop code:</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">int</span><span class="pln"> n </span><span class="pun">=</span><span class="pln"> </span><span class="lit">0</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">for</span><span class="pln"> </span><span class="pun">(</span><span class="kwd">int</span><span class="pln"> i </span><span class="pun">:</span><span class="pln"> array</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    i </span><span class="pun">=</span><span class="pln"> n</span><span class="pun">;</span><span class="pln">
    n</span><span class="pun">++;</span><span class="pln"> </span><span class="com">// shorthand to increment by 1</span><span class="pln">
</span><span class="pun">}</span></pre>
<p dir="auto">Print out the array again. What do you see? What&nbsp;you expected? The array still has all zeroes because of how the enhanced for loop works. When we&nbsp;said&nbsp;<code>for (int i : array)</code>,&nbsp;we made&nbsp;i&nbsp;a reference variable (pointer in C-speak) that refers to each element. So when we&nbsp;assign&nbsp;<code>n</code>&nbsp;to&nbsp;<code>i</code>,&nbsp;it is not the array element we are overwriting but the reference to the array element. Regular for loops must be used if you need to assign values to elements.</p>
<p dir="auto"></p>
<p dir="auto">Enhanced for loops are best when you don't care about the indices of the element and you're only reading elements (not writing as we saw above).</p>
<p dir="auto"></p>
<p dir="auto">Make an array of&nbsp;<code>String</code>s with four strings of your choice. Use an enhanced for loop to print out each string and each string's length (number of characters), separated by a space (<code>" "</code>). A&nbsp;<code>String</code>'s length is given by the length&nbsp;<strong>method</strong>&nbsp;(e.g.&nbsp;<code>myString.length()</code>). Make sure what is printed out makes sense.</p><br></div>
<div data-pats="folders" class="post_region_folders">
  <span>
    <span data-pats="folders_item"><a data-pats="link" href="#" class="tag folder" onclick="PEM.fire('filterFeed', {filter:'folder',folder:'lab3'});return false;">lab3</a></span><span data-pats="folders_item"><a data-pats="link" href="#" class="tag folder" onclick="PEM.fire('filterFeed', {filter:'folder',folder:'a54'});return false;">a54</a></span>
  </span>
</div>
<div class="attachments" style="display:none;">
  <div class="attachments_divider"></div>
  <div class="attachments_count">Attachments:</div>
  <table class="attachments_list">
    
  </table>
</div>
<div class="post_region_message_wrapper">
  <div id="endorse_text"></div>
  
  
  

    
