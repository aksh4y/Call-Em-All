My first thought was that it would be pretty simple to somehow get a value which is bigger than 13 and use the modulus operator and return val % 13. The next step was to get the val using rand11(). I ended up adding the results of rand11() 13 times to do a modulo 13 to get a number between 1 and 13. I faced a number of issues with this approach though starting with the fact that 13 % 13 = 0 and that I would get a range from [0, 12] and not [1, 13]. So I made the function return + 1 so as to fit the range.
Second, I ran a loop to get the result of 100,000 randomly generated numbers using my rand13() and plotting it in MS Excel but the probability distribution was not quite even. 
Third, I realized since 11^13 % 13 !=0, the probability distribution with this approach would never be even. So I let my approach stand.

Process: Everything in paper until I came up with the idea of getting val. Converted it to code to check if it works in terms of probability distribution (effectiveness of the algorithm).

Time: Took me quite some time to attempt this problem. I spent about an hour just to think of a better way than what I thought initially. Coding it was straightforward and took 5 mins only. I had to modify the function to return result + 1 due to to [0, 12] range.
I also wrote the program in both Java and JavaScript to test how the randomness differs in both languages but the results were similar for both (didn't expect anything drastic but random functions for both languages 

Final thoughts: Interesting problem, one of a kind, and I think it tests more of logical reasoning than coding.