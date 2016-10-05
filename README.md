# Full Tutorial
CBPL shares some syntax features with Python. So for Python programmers, this will be easy!

CBPL programs begin with a syntax version declaration.  
Each CBPL _Beta_ version has a syntax declaration of it's minor version.  
CBPL 1.0 _Beta_ does not support the syntax version declarator.  

    cbpl 1;
After the SVD, here is where you put in your _*codez*_.  
Calling functions in CBPL is the same as calling functions in Python:

    function(arg=value, second=value);
Replace `function` with the function name.

# When to use strings, selectors and JSON.
CBPL has a bug. Putting in JSON as a string (encased with `"`) will cause CBPL to use it as text and not JSON.  
So..  
### NEVER PUT SELECTORS OR JSON MARKUP IN STRINGS.
How to fix this problem? Not encase them in `"`!  
CBPL supports just typing in a selector and JSON without any quotes.

# Supported functions

    say(who=@a,obj="haha.");
Arguments:  

| who      | obj         |
|----------|-------------|
| Selector | JSON/string |

# Compiling
After you have written a program, open up your terminal/cmd and run the compiler using:

    java -jar (CBPL_COMPILER_LOCATION) (CBPL_FILE_LOCATION)
What to replace there is pretty obvious.
You will then get a list of commands prefixed with either `i`, `c` or `r`.
`i` represents Impulse, `c` for Chain and `r` is for Repeat.
