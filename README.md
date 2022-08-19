# Chapter-11-Exercise-Project-Reversing-Words

Davis Technical College

You saw an example of recursion to reverse a string using the Scanner in the section named “Converting from an Iterative Method to a Recursive Method”, pp. 481 – 484. Look at the method in Fig 11.7 on p. 483, where it takes the string in the Scanner object and reverses the string recursively. In this project you will use the Scanner to reverse the words in a string. When successful, the project will take “We Are Many” and return “Many Are We”.  

Remember that a recursive method has to have some stopping condition, also called a base case. The recursive method is often an IF structure -- if the base case is true, do nothing or return a value, else do the work for calling the recursive method again. There can be a little or a lot of work to do, before and/or after the recursive call. The example in Fig 11.7 prints out the character at the end of the string, changes the string so it no longer has that last character in it, and calls the recursive method on that changed string. Each time the recursive call is made, the current execution of the method is suspended to wait for the call to complete and control to come back to that point. In Fig 11.7, the string will get shorter and shorter as single last characters are stripped off and printed -- so the phrase is being printed in reverse. When the string is empty, which is the base case, then the recursion stops, and the recursive calls "unravel". The current execution of the method end -- nothing is returned, no other work is done, the method just closes. That returns control to the previous version of the recursive method, which now can complete, which returns control to the previous one, and so on. Since there is nothing to do after the recursive call in the method in Fig 11.7, the "unraveling" of the recursion is simply a bunch of closing or ending the method. In that figure, the work is done when the rightmost letter is printed in each call, so nothing needs to return when the method completes its execution.   

The Scanner has multiple input methods (see a list and discussion on pp. 99 – 100). Here, you will use the next() method to step through the words in the string in the Scanner object. The Boolean method hasNext() looks ahead to see if there is another word in the Scanner object. In a recursive method, retrieve each word from the scanner one at a time to create a string with the words reversed. The base case or stopping point is when there is nothing left in the scanner, and hasNext() can test for that condition. 

You need to add the code that goes in this method. It must be recursive.  

Notice that the recursive method builds a string and returns that string. The figure in the book prints data, does not gather anything together into a variable which is then returned. In this project, you must return data  so that the main method has a single variable containing the reversed string, and it prints out that variable.

Once you have that working, add another method that does the same work of reversing the words in the Scanner object using a loop structure instead of recursion. If you took the Programming Basics course, you might find it useful to review the assignment for reversing names, which used variables to hold the results.  

Note: Remember that as the code gets words or characters or whatever tokens you ask for, they are removed from the Scanner object. It’s like water flowing through a pipe – once you’ve gotten the next token, it’s flowed out of the pipe and cannot be retrieved again. Therefore you will need to “refill” the Scanner to use it in the second part of the project, like this:         

scan = new Scanner(message);  

Take a screenshot of the result.     

Submission: the specified screenshots and the root folder for the project     

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.  

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[email me](bellKevin.me) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)

