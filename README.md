# External DSLs

## Getting the code

Follow the assignment workflow: fork to GitHub, then clone to your machine. 

Alternatively, you can [download the code](https://github.com/hmc-cs111-fall2014/external-lab/archive/master.zip) and work locally.

## Working on the lab

Extend the code to implement the following grammar:
```
        n ∈ 𝒵 
e ∈ Expr ::= e + t | e - t | t
t ∈ Term ::= t * f | t / f | f
f ∈ Fact ::= n | ( e )
```

It's best to add features in the following order:
   1. subtraction
   2. multiplication
   3. division
   4. parenthetical expressions

When you add a new feature to a language, extend the implemention in the following order:
   1. Intermediate representation
      1. Data structures
      2. Sugar (if you want)
   2. Parser
      1. Tests
      2. Implementation
   3. Semantics
      1. Tests
      2. Implementation
