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
  
  
  
<div class="post_region_content note" id="view_quesiton_note">
        
<h1 data-pats="title_text" class="post_region_title">lab03 B a54</h1>

<div class="post_region_text" id="questionText"><p>&nbsp;</p><h1><strong>Lab03 B&nbsp;<strong>Due Date: Wednesday, September 13th, at 11:59 PM</strong></strong></h1>
<h1>More practice with arrays and testing</h1>
<p>The only method of the Arrays or System classes you may use is Arrays.toString. You may not use System.arraycopy or Arrays.copyOf.</p>
<p>&nbsp;</p>
<p dir="auto">Create a class&nbsp;<code>ArrayPractice</code>&nbsp;with the following methods (copy/paste):</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="com">/**
 * Determines the average of the elements in a given array.
 * @param array the array to inspect
 * @return 0 if the array is empty
 *         the average otherwise     
 * @throws IllegalArgumentException if array is null 
 */</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">double</span><span class="pln"> average</span><span class="pun">(</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> array</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

</span><span class="pun">}</span><span class="pln">

</span><span class="com">/**
 * Computes an array which only contains the elements stored at even indices of 
 * a given array.
 * e.g. evenIndicesOnly({1,2,4,8,16}) should return {1,4,16}, 
 * the integers at zeroth, second, and fourth indices
 * @param array the array to extract all odd elements from
 * @return the empty array if the array is empty
 *         the null array if the array is null     
 *         otherwise an array holding the elements located at even indices of the given
 *         array
 */</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> evenIndicesOnly</span><span class="pun">(</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> array</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

</span><span class="pun">}</span><span class="pln">

</span><span class="com">/**
 * Determines if an array's elements are in strictly increasing order.
 * The array {1, 2, 3, 4, 5} is in increasing order while
 * the array {1, 2, 2, 4, 5} is not in increasing order as 2 == 2.
 * A null or empty array is by default in increasing order.
 * @param array the array to inspect
 * @return true  if the array's elements are in increasing order,
 *               or the array is null or empty
 *         false otherwise
 */</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">boolean</span><span class="pln"> isIncreasing</span><span class="pun">(</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> array</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

</span><span class="pun">}</span><span class="pln">

</span><span class="com">/**
 * Computes the reverse an array.
 * The reverse of a null array is null.
 * The reverse of an empty array is the empty array.
 * Do NOT use reverseInPlace in the implementation of reverse
 * @param array the array whose elements are to be reversed
 * @return an array holding the contents of array in reverse order
 */</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> reverse</span><span class="pun">(</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> array</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

</span><span class="pun">}</span><span class="pln">

</span><span class="com">/**
 * Computes an array that is all the elements of arr1 in the order they appear,
 * followed by the elements of arr2 in the order they appear.
 * An empty array should contribute no elements to the concatenated
 * array.
 * e.g. concatenate({6, 3, 8}, {10, 1, 7}) should return {6, 3, 8, 10, 1, 7}
 * @param arr1 the first array
 * @param arr2 the second array
 * @return an array that is all the elements of arr1 in order,
 *         followed by the elements of arr2 in order.
 * @throws IllegalArgumentException if arr1 or arr2 is null
 */</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> concatenate</span><span class="pun">(</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> arr1</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> arr2</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

</span><span class="pun">}</span><span class="pln">

</span><span class="com">/**
 * Computes an array that is all the elements of arr1 in the order they appear,
 * followed by the elements of arr2 in the reverse order they appear
 * An empty array should contribute no elements to the resulting
 * array.
 * e.g. endToEnd({6, 3, 8}, {10, 1, 7}) should return {6, 3, 8, 7, 1, 10}
 * HINT: this method can use other methods in this class to assist it.
 *       ideally, this method is one short line of code.
 * @param arr1 the first array
 * @param arr2 the second array
 * @return an array that is all the elements of arr1 in order,
 * followed by the elements of arr2 in reverse order
 * @throws IllegalArgumentException if arr1 or arr2 is null
 */</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> endToEnd</span><span class="pun">(</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> arr1</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> arr2</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

</span><span class="pun">}</span><span class="pln">

</span><span class="com">/**
 * Reverses the given array in-place.
 * Zero credit if another array is made.
 * The reverse of a null array is null.
 * The reverse of an empty array is the empty array.
 * Do NOT use reverse in the implementation of reverseInPlace
 * HINT: since we cannot make another array, we will have to swap certain
 *       elements one-by-one.
 * @param array the array to reverse
 */</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> reverseInPlace</span><span class="pun">(</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> array</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

</span><span class="pun">}</span></pre>
<p dir="auto">It is your job to implement (fill in) each method according to the Javadoc specification. Javadocs are a formatted comment style for commenting Java code. The first few lines of the Javadoc detail what the method does. Next, if there are any parameters, each parameter's name and any notes about it are detailed. If the method returns, the return value is described.</p>
<p dir="auto"></p>
<p dir="auto">Each method's Javadoc details the behavior of the method, including edge cases like null or empty arrays.</p>
<p dir="auto"></p>
<p dir="auto">You may find it helpful to draw diagrams of the arrays and scenarios on paper to draw inspiration on how to implement these methods.</p>
<p dir="auto"></p>
<p dir="auto">Now you must test the methods you have written to make sure they work. While testing may seem tedious, it is in your interest to test your code to know that it works. When you have written thorough tests that pass, you can be confident in your code's correctness. If you make a code change, you simply run the tests to see how if anything has shifted. Some people prefer to write the tests first, that way they always have some way to gauge their code progress.</p>
<p dir="auto"></p>
<p dir="auto">Create a class&nbsp;<code>ArrayPraticeTester</code>&nbsp;that will be used to test the methods you have written.</p>
<p dir="auto"></p>
<p dir="auto">Import&nbsp;<code>java.util.Arrays</code>&nbsp;and copy/paste the following line after importing&nbsp;<code>Arrays</code>:</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">import</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> lab03</span><span class="pun">.</span><span class="typ">ArrayPractice</span><span class="pun">.*;</span></pre>
<p dir="auto">This will let you refer to the methods name without any classname prefix like so</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> reversedArray </span><span class="pun">=</span><span class="pln"> reverse</span><span class="pun">(</span><span class="pln">someArray</span><span class="pun">);</span></pre>
<p dir="auto">instead of having to do</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> reversedArray </span><span class="pun">=</span><span class="pln"> </span><span class="typ">ArrayPractice</span><span class="pun">.</span><span class="pln">reverse</span><span class="pun">(</span><span class="pln">someArray</span><span class="pun">);</span></pre>
<p dir="auto">each time you want to call a method in the&nbsp;<code>ArrayPractice</code>&nbsp;class.</p>
<p dir="auto"></p>
<p dir="auto">Copy/paste the following pre-written convenience methods inside&nbsp;<code>ArrayPracticeTester</code>.</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> test</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> expected</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> actual</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"Expected: "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> expected </span><span class="pun">+</span><span class="pln">
                       </span><span class="str">", received: "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> </span><span class="typ">Arrays</span><span class="pun">.</span><span class="pln">toString</span><span class="pun">(</span><span class="pln">actual</span><span class="pun">));</span><span class="pln">
</span><span class="pun">}</span><span class="pln">

</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> test</span><span class="pun">(</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> expected</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> actual</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"Expected: "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> </span><span class="typ">Arrays</span><span class="pun">.</span><span class="pln">toString</span><span class="pun">(</span><span class="pln">expected</span><span class="pun">)</span><span class="pln"> </span><span class="pun">+</span><span class="pln">
                       </span><span class="str">", received: "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> </span><span class="typ">Arrays</span><span class="pun">.</span><span class="pln">toString</span><span class="pun">(</span><span class="pln">actual</span><span class="pun">));</span><span class="pln">
</span><span class="pun">}</span><span class="pln">

</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> test</span><span class="pun">(</span><span class="kwd">boolean</span><span class="pln"> expected</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">boolean</span><span class="pln"> actual</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"Expected: "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> expected </span><span class="pun">+</span><span class="pln"> </span><span class="str">", received: "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> actual</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span></pre>
<p dir="auto">These methods can be used as helper functions by you to cut down on the repetition in your testing code. Anytime you find yourself repeating code, ask yourself what is the common portion of that code and see if you can extract that commonality into a function.</p>
<p dir="auto"></p>
<p dir="auto">Create a main method in&nbsp;<code>ArrayPracticeTester</code>&nbsp;where all your tests will go.</p>
<p dir="auto"></p>
<p dir="auto">Let's say I want to test if my methods work on a simple array. I could use the helper functions like so:</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> simple </span><span class="pun">=</span><span class="pln"> </span><span class="pun">{</span><span class="lit">1</span><span class="pun">,</span><span class="pln"> </span><span class="lit">2</span><span class="pun">,</span><span class="pln"> </span><span class="lit">3</span><span class="pun">,</span><span class="pln"> </span><span class="lit">4</span><span class="pun">,</span><span class="pln"> </span><span class="lit">5</span><span class="pun">,</span><span class="pln"> </span><span class="lit">6</span><span class="pun">};</span><span class="pln">
</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> reversed </span><span class="pun">=</span><span class="pln"> </span><span class="pun">{</span><span class="lit">6</span><span class="pun">,</span><span class="pln"> </span><span class="lit">5</span><span class="pun">,</span><span class="pln"> </span><span class="lit">4</span><span class="pun">,</span><span class="pln"> </span><span class="lit">3</span><span class="pun">,</span><span class="pln"> </span><span class="lit">2</span><span class="pun">,</span><span class="pln"> </span><span class="lit">1</span><span class="pun">};</span><span class="pln">
test</span><span class="pun">(</span><span class="pln">reversed</span><span class="pun">,</span><span class="pln"> reverse</span><span class="pun">(</span><span class="pln">simple</span><span class="pun">));</span><span class="pln">
test</span><span class="pun">(</span><span class="pln">simple</span><span class="pun">,</span><span class="pln"> reverse</span><span class="pun">(</span><span class="pln">reversed</span><span class="pun">));</span><span class="pln">
test</span><span class="pun">(</span><span class="kwd">true</span><span class="pun">,</span><span class="pln"> isIncreasing</span><span class="pun">(</span><span class="pln">simple</span><span class="pun">));</span><span class="pln">
test</span><span class="pun">(</span><span class="kwd">false</span><span class="pun">,</span><span class="pln"> isIncreasing</span><span class="pun">(</span><span class="pln">reversed</span><span class="pun">));</span><span class="pln">

</span><span class="com">// you could also do</span><span class="pln">
test</span><span class="pun">(</span><span class="str">"{6, 5, 4, 3, 2, 1}"</span><span class="pun">,</span><span class="pln"> reverse</span><span class="pun">(</span><span class="pln">simple</span><span class="pun">));</span><span class="pln">
test</span><span class="pun">(</span><span class="str">"{1, 2, 3, 4, 5, 6}"</span><span class="pun">,</span><span class="pln"> reverse</span><span class="pun">(</span><span class="pln">reversed</span><span class="pun">));</span><span class="pln">
test</span><span class="pun">(</span><span class="str">"true"</span><span class="pun">,</span><span class="pln"> isIncreasing</span><span class="pun">(</span><span class="pln">simple</span><span class="pun">));</span><span class="pln">
test</span><span class="pun">(</span><span class="str">"false"</span><span class="pun">,</span><span class="pln"> isIncreasing</span><span class="pun">(</span><span class="pln">reversed</span><span class="pun">));</span></pre>
<p dir="auto">Each method should have multiple tests where each case outlined in the method's Javadoc is covered by some test (e.g. null, empty, etc...).</p>
<p dir="auto"></p>
<p dir="auto">The additional tests you need are:</p>
<p dir="auto"></p>
<p dir="auto">For&nbsp;<code>average</code>,&nbsp;<code>evenIndicesOnly</code><tt>,&nbsp;</tt><code>isIncreasing</code>,&nbsp;<code>reverse</code>, and&nbsp;<code>reverseInPlace</code>&nbsp;you should test proper handling of null and empty arrays.</p>
<p dir="auto">For&nbsp;<code>concatenate</code>&nbsp;and&nbsp;<code>endToEnd</code>, you should test proper handling of empty arrays. Also test different combinations of array lengths.</p>
<p dir="auto">For&nbsp;<code>reverse</code>&nbsp;and&nbsp;<code>reverseInPlace</code>&nbsp;you should test both even-length and odd-length arrays.</p>
<p dir="auto"><code>reverseInPlace</code>&nbsp;is unique among all the other methods in that it does not return anything, it operates directly on the argument. Thus the use of the given helper test functions will have to change slightly:</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> simple </span><span class="pun">=</span><span class="pln"> </span><span class="pun">{</span><span class="lit">1</span><span class="pun">,</span><span class="pln"> </span><span class="lit">2</span><span class="pun">,</span><span class="pln"> </span><span class="lit">3</span><span class="pun">,</span><span class="pln"> </span><span class="lit">4</span><span class="pun">,</span><span class="pln"> </span><span class="lit">5</span><span class="pun">,</span><span class="pln"> </span><span class="lit">6</span><span class="pun">};</span><span class="pln">
reverseInPlace</span><span class="pun">(</span><span class="pln">simple</span><span class="pun">);</span><span class="pln">
test</span><span class="pun">(</span><span class="str">"{6, 5, 4, 3, 2, 1}"</span><span class="pun">,</span><span class="pln"> simple</span><span class="pun">);</span><span class="pln">

</span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> reversed </span><span class="pun">=</span><span class="pln"> </span><span class="pun">{</span><span class="lit">6</span><span class="pun">,</span><span class="pln"> </span><span class="lit">5</span><span class="pun">,</span><span class="pln"> </span><span class="lit">4</span><span class="pun">,</span><span class="pln"> </span><span class="lit">3</span><span class="pun">,</span><span class="pln"> </span><span class="lit">2</span><span class="pun">,</span><span class="pln"> </span><span class="lit">1</span><span class="pun">};</span><span class="pln">
reverseInPlace</span><span class="pun">(</span><span class="pln">reversed</span><span class="pun">);</span><span class="pln">
test</span><span class="pun">(</span><span class="str">"{1, 2, 3, 4, 5, 6}"</span><span class="pun">,</span><span class="pln"> reversed</span><span class="pun">);</span></pre>
<p dir="auto"></p>
<p dir="auto"><code>average, concatenate</code>&nbsp;and&nbsp;<code>endToEnd</code>&nbsp;are unique in that they may throw an exception if null is passed in as an array argument. We want to test this behavior on&nbsp;<b>all three</b>&nbsp;methods by providing a null argument and ensuring that the method throws an exception. We can do this for&nbsp;<code>concatenate</code>&nbsp;like so:</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">try</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    concatenate</span><span class="pun">(</span><span class="kwd">null</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">null</span><span class="pun">);</span><span class="pln">
    </span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"test failed - exception not thrown"</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span><span class="pln"> </span><span class="kwd">catch</span><span class="pun">(</span><span class="typ">IllegalArgumentException</span><span class="pln"> e</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
    </span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"caught the expected illegal argument exception"</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span></pre>
<p dir="auto">Your grade on this lab will heavily draw from your testing code. Please pay attention to each test case that is being asked for. No need to go overboard, just make sure you're providing all that is asked for. Write the tests for the desired behavior, even if your methods are incorrect and deviate in their behavior, the expected behavior has not changed.</p><br></div>
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
  
  
  

      </div>
    </div>
    
